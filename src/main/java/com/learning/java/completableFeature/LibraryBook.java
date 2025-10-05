package com.learning.java.completableFeature;

import java.util.concurrent.Callable;

public class LibraryBook  {
    private  String bookName;
    private int timeOut;

    public LibraryBook(String bookName, int timeOut){
        this.bookName= bookName;
        this.timeOut=timeOut;

    }

    public String call(){
        try {
            Thread.sleep(timeOut);
        }
        catch (Exception e){

        }
        return "ThreadName: "+Thread.currentThread().getName()+"time taken  to fetch book "+bookName+ "is "+timeOut;
    }
}
