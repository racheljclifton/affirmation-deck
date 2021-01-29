package com.techelevator;

public class AffirmationCard {
    //attributes
    private final String mantra;
    private final String affirmation;
    private final Category category;


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

    //constructors
    public AffirmationCard (String mantra, String affirmation, Category category) {
        this.mantra = mantra;
        this.affirmation = affirmation;
        this.category = category;
    }


    //methods
//    public String getDescription() {
//        return "Your affirmation is: " + affirmation +
//                "\n Your mantra is: " + mantra;

}
