package com.durgasoft.beans;

public class Hello {
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String sayHello(){
        return "Hello "+name+", "+message;
    }
}
