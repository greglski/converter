package com.greglski.converter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;

public class ConverterMain {
    public static void main(String[] args) throws Exception {

        XMLOutputFactory xmlOutputFactory =  XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter(args[1]));

        xmlStreamWriter.writeStartDocument();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("people");

        xmlStreamWriter.writeStartElement("person");
        xmlStreamWriter.writeStartElement("firstname");
        xmlStreamWriter.writeCharacters("John");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("lastname");
        xmlStreamWriter.writeCharacters("Doe");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();

        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }
}
