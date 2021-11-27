package com.example.lambda;

public class FunctionalInterfaceDemo {
    @java.lang.FunctionalInterface
    interface  Cruncher{
        int crunch(int i,int j);
    }
    public int cruncherService(int i,int j,Cruncher cruncher){
        return cruncher.crunch(i,j);
    }
    public static void main(String[] args){
        FunctionalInterfaceDemo client = new FunctionalInterfaceDemo();
        //client 1
        int result = client.cruncherService(5,4,(p,q)->p*q);
        System.out.println(result);
        //client 2
        result = client.cruncherService(5,4,(p,q)->p+q);
        System.out.println(result);
    }
}
