package com.company;

public class Calculator {

    public  int sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }
    public  int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public  int getTemperatureCelsius(float f){
        return (int)(5f/9 *(f-32));
    }
}
