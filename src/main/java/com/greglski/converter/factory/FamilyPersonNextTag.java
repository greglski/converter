package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class FamilyPersonNextTag extends PersonNextTag {

    public FamilyPersonNextTag(XMLStreamWriter xsw) {
        super(xsw);
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

        } catch (Exception e) {
            System.out.println("Unable to create phone tag\n" + e);
        }

        super.createTag(line);
    }
}
