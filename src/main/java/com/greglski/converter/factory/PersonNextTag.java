package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class PersonNextTag extends PersonTag {

    public PersonNextTag(XMLStreamWriter xsw) {
        super(xsw);
    }

    @Override
    public void createTag(String[] line) {
        try {
            xsw.writeEndElement();
            xsw.writeCharacters("\n");

        } catch (Exception e) {
            System.out.println("Unable to create personNext tag\n" + e);
        }

        super.createTag(line);
    }
}
