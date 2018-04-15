package com.greglski.converter;

import com.greglski.converter.factory.TagFactory;
import com.greglski.converter.factory.XmlTask;
import com.greglski.converter.io.SequenceChecker;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterMain {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(args[0]);

        TagFactory tagFactory = new TagFactory();
        SequenceChecker sequenceChecker = new SequenceChecker();
        XMLOutputFactory xmlOutputFactory =  XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter(args[1]));

        xmlStreamWriter.writeStartDocument();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("people");

        try {
            Files.lines(path)
                    .map(line -> line.split("\\|"))
                    .forEach(line -> {
                        XmlTask xmlTask = tagFactory.makeTag(sequenceChecker.checkSequence(line[0]), xmlStreamWriter);
                        xmlTask.createTag(line);
                    });
        } catch (IOException e) {
            System.out.println("No such a file\n" + e );
        }

        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();

        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }
}
