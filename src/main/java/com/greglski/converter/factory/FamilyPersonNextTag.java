package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class FamilyPersonNextTag implements XmlTask {
    private XMLStreamWriter xsw;

    public FamilyPersonNextTag(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeStartElement("person");

            xsw.writeStartElement("firstname");
            xsw.writeCharacters(line[1]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeStartElement("lastname");
            xsw.writeCharacters(line[2]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

        } catch (Exception e) {
            System.out.println("Unable to create phone tag\n" + e);
        }
    }
}
