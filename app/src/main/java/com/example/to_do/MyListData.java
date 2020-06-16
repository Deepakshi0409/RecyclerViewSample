package com.example.to_do;

public class MyListData {
    public static String getViewHolderData(String instanceNum) {
        switch (instanceNum) {
            case "a":
                return "Send an E mail" ;
            case "b":
                return "Pay bills";
            case "c":
                return "Attend function";
            case "d":
                return "Make calls";
            case "e":
                return "Complete presentation";
            case "f":
                return "Follow up";
            case "g":
                return "task 1";
            case "h":
                return "task 2";
            case "i":
                return "task 3";
            case "j":
                return "task 4";
            case "k":
                return "task 5";
            case "l":
                return "task 6";
            case "m":
                return "task 7";
            case "n":
                return "task 8";
            case "o":
                return "task 9";
            default:
                return "nil";
        }
    }

}

