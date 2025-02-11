package it.nlith.controller;

import java.io.Serializable;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@SessionScoped
@Named("sessionController")
public class GreetingControllerSession implements Serializable {

    private Integer counter;

    private String message;

    @PostConstruct
    public void init() {
        this.counter = 0;
    }

    public GreetingControllerSession() {
    }

    public void incrementCounter() {
        this.counter += 1;
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Incremented Session Counter"));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

}
