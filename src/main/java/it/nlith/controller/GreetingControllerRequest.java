package it.nlith.controller;

import java.io.Serializable;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@RequestScoped
@Named("requestController")
public class GreetingControllerRequest implements Serializable {

    private Integer counter;
    private String message;

    @PostConstruct
    public void init() {
        this.counter = 0;
    }

    public GreetingControllerRequest() {
    }

    public void incrementCounter() {
        this.counter += 1;
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Incremented Request Counter"));
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
