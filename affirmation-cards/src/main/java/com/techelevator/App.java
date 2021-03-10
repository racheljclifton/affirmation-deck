package com.techelevator;

import com.techelevator.affirmationcards.AffirmationCard;
import com.techelevator.affirmationcards.Category;
import com.techelevator.affirmationcards.DeckOfAffirmationCards;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        DeckOfAffirmationCards deck = new DeckOfAffirmationCards();
        List<AffirmationCard> deckList = deck.getAffirmationDeck();
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Virtual Affirmation Card Deck!");

        //prompt user to pick a category
        System.out.println("\nWould you like to pick an Affirmation Card from a deck with a specific category in mind?" +
                "\n[1] Life" +
                "\n[2] Self-Love" +
                "\n[3] Change" +
                "\n[4] Positive Thinking" +
                "\n[5] No Category");
        int choice = Integer.parseInt(input.nextLine());


        //create remove wrong category cards from deck
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            Category categoryChoice;
            if (choice == 1) {
                categoryChoice = Category.LIFE;
            } else if (choice == 2) {
                categoryChoice = Category.SELFLOVE;
            } else if (choice == 3){
                categoryChoice = Category.CHANGE;
            } else {
                categoryChoice = Category.POSITIVETHINKING;
            }
            deckList.removeIf(card -> card.getCategory() != categoryChoice);
        }

        //prompt user to shuffle the deck
        System.out.print("\nHow many times would you like to shuffle the deck (1-10)? ");
        int numberOfShuffles = Integer.parseInt(input.nextLine());
        if (numberOfShuffles > 10) {
            numberOfShuffles = 10;
        }

        for (int i = 1; i <= numberOfShuffles; i++){
            deck.shuffle();
            System.out.println("Shuffling...");
        }

//        boolean finished = false;
//        while(!finished) {

            //prompt user to pick if they want to draw from top, middle, or random in middle
            System.out.print("\nFrom where in the deck would you like to draw your Affirmation Card?" +
                    "\n[1] Top of the deck" +
                    "\n[2] Bottom of the deck" +
                    "\n[3] Randomly from the middle of the deck" +
                    "\n");
            choice = Integer.parseInt(input.nextLine());
            AffirmationCard chosenCard;

            //print out the affirmation from card that was drawn
            if (choice == 1) {
                chosenCard = deck.drawTopCard();
                System.out.println("\n" + chosenCard.getAffirmation());
            } else if (choice == 2) {
                chosenCard = deck.drawBottomCard();
                System.out.println("\n" + chosenCard.getAffirmation());
            } else if (choice == 3) {
                chosenCard = deck.drawRandomFromMiddle();
                System.out.println("\n" + chosenCard.getAffirmation());
            } else {
                System.out.println("We weren't sure where you wanted to pick from, so a random card was chosen from the middle of the deck." +
                        "\nNext time, please type \"1\" to pick from the top, \"2\" to pick from the bottom, or \"3\" to pick from a random card from the middle of the deck.");
                chosenCard = deck.drawRandomFromMiddle();
                System.out.println("\n" + chosenCard.getAffirmation());
            }

            //ask user if they would like a mantra that goes with their affirmation
            System.out.print("\nWould you like a Mantra that goes with your Affirmation (y,n)? ");
            String response = input.nextLine();

            //print out the mantra
            if (response.equals("y")) {
                System.out.println("\n" + chosenCard.getMantra());
            } else if (!response.equals("n")) {
                System.out.println("We weren't sure what to do, so we here is your Mantra just in case." +
                        "\n(Next time, type \"y\" for yes or \"n\" for no.)" +
                        "\n\n" + chosenCard.getMantra());
            }

//            //ask user if they would like to draw another card
//            System.out.print("\nWould you like to draw another Affirmation from your deck (y,n)? ");
//            response = input.nextLine();
//            if (response.equals("n")){
//                finished = true;
//            }
//
//
//        }
        System.out.println("\nThank you for using the Virtual Affirmation Card Deck!" +
                "\nWe hope that it brought some light into your day." +
                "\n\nNamaste");

    }

}
