package it.nlith.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ThemeController implements Serializable {
    
    private String selectedTheme;
    private List<String> allThemes;

    @PostConstruct
    public void init() {
        this.allThemes = new ArrayList<String>();
        allThemes.add("saga");
        allThemes.add("arya");

        selectedTheme = "arya";
    }


    public String getSelectedTheme() {
        return selectedTheme;
    }

    public void setSelectedTheme(String selectedTheme) {
        this.selectedTheme = selectedTheme;
    }

    public List<String> getAllThemes() {
        return allThemes;
    }

    public void setAllThemes(List<String> allThemes) {
        this.allThemes = allThemes;
    }
}
