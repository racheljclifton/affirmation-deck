package com.techelevator;

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

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setCategory(String category) {
        switch (category) {
            case "LIFE":
                this.category = Category.LIFE;
            case "CHANGE":
                this.category = Category.CHANGE;
            case "SELFLOVE":
                this.category = Category.SELFLOVE;
            case "POSITIVETHINKING":
                this.category = Category.POSITIVETHINKING;
            default:
                this.category = Category.GENERAL;
        }
    }

    //constructors
    public AffirmationCard (String mantra, String affirmation, Category category) {
        this.mantra = mantra;
        this.affirmation = affirmation;
        this.category = category;
    }

    public AffirmationCard (String mantra, String affirmation) {
        this.mantra = mantra;
        this.affirmation = affirmation;
        this.category = category;
    }

    //methods
    public Category createCategory(String category){
        switch (category) {
            case "LIFE":
                return Category.LIFE;
            case "CHANGE":
                return Category.CHANGE;
            case "SELFLOVE":
                return Category.SELFLOVE;
            case "POSITIVETHINKING":
                return Category.POSITIVETHINKING;
            default:
                return Category.GENERAL;
        }
    }


    //methods
//    public String getDescription() {
//        return "Your affirmation is: " + affirmation +
//                "\n Your mantra is: " + mantra;

}
