package com.company;

public class LogicalOperations {

    public void checkNumberInterval(int number){
        if (number >= 2 && number <= 8){
            System.out.println(number);
        }
    }
    
    public String toFastTrackOrNotToFastTrack(String text, int number){
        if (text.equals("FastTrack") && number <= 3){
            return (text+number);
        } else if(!text.equals("FastTrack") && number >=4){
            return (number + text);
        }
        return "";
    }

    public static boolean isEligibleToVote(int age){
        if (age>=18) {
            return true;
        }
                else return false;
        }
}

