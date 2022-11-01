package com.library.Library.Exception;

public class HndbookException extends Exception {

    String msg;

    public HndbookException(String msg){
        this.msg = msg;

    }
    public String getMessage(){
        return this.msg;
    }
}
