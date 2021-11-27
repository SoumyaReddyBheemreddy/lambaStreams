package com.example.lambda;
interface IMovie{
    public boolean check(int id);
}
public class MethodReference {
    public void  testMovieStaticMethodRef(){
        IMovie m1 = (i) -> i<100?true:false;
        IMovie m2 = MethodReference::isClassic;
    }
    public void testMovieInstanceMethodRef(){
        MethodReference ref = new MethodReference();
        IMovie m1 = (i)->i>10 && i < 100?true:false;
        IMovie m2 = ref::isTop10;
    }
    public boolean isTop10(int movieId){
        return true;
    }
    public static  boolean isClassic(int movieId){
        return true;
    }
    public static void main(String[] args){
        MethodReference client = new MethodReference();
    }
}
