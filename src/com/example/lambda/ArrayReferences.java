package com.example.lambda;

public class ArrayReferences {
    interface  StringArray{
        String[] create(int size);
    }
    private  void  testArrayConstructorReference(){
        StringArray sArray = (size) -> new String[size];
        StringArray sArray2 = String[]::new;
    }
    public static void main(String[] args){

    }
}
