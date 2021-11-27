package com.example.lambda;

public class TargetType {
    public interface Email{
        String constructEmail(String name);
    }
    Email email = (String name)-> name+"@Soumya.com";
    public String getEmail(String name,Email email){
        return null;
    }
    public static void main(String[] args){
            new TargetType().getEmail("reddy",(String name)->name+"@Soumya.com");
    }
}
