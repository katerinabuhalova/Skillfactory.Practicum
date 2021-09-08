package com.company.module_10;

class InputException extends Exception {
    String text;
    public InputException(String text){
        this.text = text;
    }
}

