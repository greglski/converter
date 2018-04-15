package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class TphoneTag implements XmlTask {
    private XMLStreamWriter xsw;

    public TphoneTag(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeStartElement("phone");

            xsw.writeStartElement("mobile");
            xsw.writeCharacters(line[1]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeStartElement("fixed");
            xsw.writeCharacters(line[2]);
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

            xsw.writeEndElement();
            xsw.writeCharacters("\n");

        } catch (Exception e) {
            System.out.println("Unable to create phone tag\n" + e);
        }
    }
}
