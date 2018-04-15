package com.greglski.converter.factory;

import javax.xml.stream.XMLStreamWriter;

public final class TagFactory {

    private static final String PERSON = "P";
    private static final String PERSON_NEXT = "PP";
    private static final String FAMILY_PERSON_NEXT = "FPP";
    private static final String FAMILY = "F";
    private static final String FAMILY_NEXT = "FF";
    private static final String ADDRESS = "A";
    private static final String TPHONE = "T";

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