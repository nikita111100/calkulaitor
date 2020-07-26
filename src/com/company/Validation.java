package com.company;

import Exception.divideByZero;

public class Validation {
    public void divideByZero(Double expression) throws divideByZero {
        if(expression == 0){
             throw new divideByZero("Делить на ноль нельзя!");
        }
    }


}
