package com.techelevator.affirmationcards;

public class AffirmationCard {
    //attributes
    private final String mantra;
    private final String affirmation;
    private Category category;


    //getters
    public String getMantra() {
        return "Your mantra is: \n" + mantra;
    }

    public String getAffirmation() {
        return "Your affirmation is: \n" + affirmation;
    }

    public Category getCategory() {
        return category;
    }

    //setters

    public void setCategory(String category) {


        if (category.equals("LIFE")) {
            this.category = Category.LIFE;
        } else if (category.equals("CHANGE")) {
            this.category = Category.CHANGE;
        } else if (category.equals("SELFLOVE")) {
            this.category = Category.SELFLOVE;
        } else if (category.equals("POSITIVETHINKING")) {
            this.category = Category.POSITIVETHINKING;
        } else {
            this.category = Category.GENERAL;
        }
    }

    //constructors
    public AffirmationCard(String mantra, String affirmation, Category category) {
        this.mantra = mantra;
        this.affirmation = affirmation;
        this.category = category;
    }

    public AffirmationCard(String mantra, String affirmation) {
        this.mantra = mantra;
        this.affirmation = affirmation;
    }

}
