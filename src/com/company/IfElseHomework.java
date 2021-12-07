package com.company;

import java.util.Enumeration;
import java.util.Scanner;

public class IfElseHomework {
    
    
//    6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. 
//    Daca numarul este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. 
//    Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    
    public static String compareNumber(int number){
        String string="";
        if (number>8 || number==6){
            string = "The amount of snow this winter was(cm): "+number;
        }
        else string = "The forecast snow is(cm):" + number;
        return  string;
    }
  
//    7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar. 
//    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. 
//    Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    
    public  static String compareNumberToThree(int number){
        String string="";
        if (number>3 && number!=4) {
            string = "The number is greater than 3 and not equal to 4";
        }
        else if (number==4){
            string = "The number is 4";
        }
        else if (number<3){
            string = "The number is lower than 3";
        }
        return string;
    }
    
//    8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. 
//    Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
//    Apelati metoda in main() pentru a verifica daca functioneaza
    
    public static void switchForGivenNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick an int number from 1 to 3");
        int number = scan.nextInt();
        switch (number){
            case 1:
                System.out.println("The number is: 1 ");
                break; 
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("You have picked a wrong number");
       }
    }
    
//    9. Creati o metoda care sa se numeasca isNumberEven.
//    Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals. 
//    Daca numarul e par sa returneze true iar daca e impar sa returnese false. 
//    Apelati metoda in main() pentru a verifica daca functioneaza.
    
    public static void inputIsEvenNumber(){
        System.out.println("The given number is:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isEvenNumber(number));
    }
    public static boolean isEvenNumber(int number){
        if ( number % 2 == 0 ) return true;
        else return false;
    }
//    10. Creati o metoda care sa se numeasca isEligibleToVote.
//    Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
//    Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
    
    public static void inputIsEligibleForVote(){
        System.out.println("Age is:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("The person with age " + age + " is eligible to vote: " + isEligibleToVote(age));
    }
    
    public static boolean isEligibleToVote(int age){
        if (age>=18) {
            return true;
        }
        else return false;
    }
    
//    11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar. 
//    Apelati metoda in main() pentru a verifica daca functioneaza.
    
    public static void inputNumbersForMax(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = scan.nextInt();
        System.out.println("Enter value b:");
        int b = scan.nextInt();
        System.out.println("Enter value c:");
        int c = scan.nextInt();
        System.out.println("Maximum is: "+ max(a,b,c));
    }

    public static int max(int a, int b, int c){
        int m;
        if (a>=b && a>=c){
            m = a; }
        else if (b>=a && b>=c){
            m =b;
        }
        else {
            m = c;
        }
        return m;
        }
    
}
