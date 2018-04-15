package com.greglski.converter.io;


import java.util.LinkedList;
import java.util.List;

public class SequenceChecker {
    private List<String> checkList;

    public SequenceChecker() {
        this.checkList = new LinkedList<>();
    }

    public String checkSequence(String mark) {
        String factorySwitch = "";

        if (mark.equals("P")) {
            if (checkList.contains("F")) {
                factorySwitch += "F";
            }
            if (checkList.contains(mark)) {
                factorySwitch += "PP";
                checkList.clear();
                checkList.add(mark);
            } else {
                factorySwitch += "P";
                checkList.add(mark);
            }
        }

        if (mark.equals("A")) {
            factorySwitch = "A";
        }

        if (mark.equals("T")) {
            factorySwitch = "T";
        }

        if (mark.equals("F")) {
            if (checkList.contains(mark)) {
                factorySwitch += "FF";
            } else {
                factorySwitch = "F";
                checkList.add(mark);
            }
        }
        return factorySwitch;
    }

    public List<String> getCheckList() {
        return checkList;
    }
}
