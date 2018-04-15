package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public class PersonTag implements XmlTask {
    /*String firstname;
    String lastname;*/
    XMLStreamWriter xsw;

    public PersonTag(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void createTag(String[] line) {
        /*this.firstname = line[1];
        this.lastname = line[2];*/

        try {
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
            System.out.println("Unable to create person tag\n" + e);
        }

    }
}
