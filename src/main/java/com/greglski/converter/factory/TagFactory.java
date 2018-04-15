package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public final class TagFactory {


    public static final String PERSON = "P";
    public static final String PERSON_NEXT = "PP";
    public static final String FAMILY_PERSON_NEXT = "FPP";
    public static final String FAMILY = "F";
    public static final String FAMILY_NEXT = "FF";
    public static final String ADDRESS = "A";
    public static final String TPHONE = "T";

    public final XmlTask makeTag(String factorySwitch, XMLStreamWriter xmlStreamWriter) {
        switch (factorySwitch) {
            case PERSON:
                return new PersonTag(xmlStreamWriter);
            case PERSON_NEXT:
                return new PersonNextTag(xmlStreamWriter);
            case FAMILY_PERSON_NEXT:
                return new FamilyPersonNextTag(xmlStreamWriter);
            case FAMILY:
                return new FamilyTag(xmlStreamWriter);
            case FAMILY_NEXT:
                return new FamilyNextTag(xmlStreamWriter);
            case ADDRESS:
                return new AddressTag(xmlStreamWriter);
            case TPHONE:
                return new TphoneTag(xmlStreamWriter);
            default:
                return null;
        }
    }
}



    /* xmlStreamWriter.writeStartElement("person");
        xmlStreamWriter.writeStartElement("firstname");
        xmlStreamWriter.writeCharacters("John");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("lastname");
        xmlStreamWriter.writeCharacters("Doe");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");*/

