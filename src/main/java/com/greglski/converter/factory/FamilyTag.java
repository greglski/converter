package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class FamilyTag implements XmlTask {
    protected XMLStreamWriter xsw;

    public FamilyTag(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeStartElement("family");

            xsw.writeStartElement("name");
            xsw.writeCharacters(line[1]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeStartElement("born");
            xsw.writeCharacters(line[2]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

        } catch (Exception e) {
            System.out.println("Unable to create family tag\n" + e);
        }
    }

}
