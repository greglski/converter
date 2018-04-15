package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class AddressTag implements XmlTask {
    private XMLStreamWriter xsw;

    public AddressTag(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeStartElement("address");

            xsw.writeStartElement("street");
            xsw.writeCharacters(line[1]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeStartElement("city");
            xsw.writeCharacters(line[2]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            if (line.length > 3) {
                xsw.writeStartElement("post");
                xsw.writeCharacters(line[3]);
                xsw.writeEndElement();
                xsw.writeCharacters("\n");
            }

            xsw.writeEndElement();
            xsw.writeCharacters("\n");
        } catch (Exception e) {
            System.out.println("Unable to create phone tag\n" + e);
        }
    }
}
