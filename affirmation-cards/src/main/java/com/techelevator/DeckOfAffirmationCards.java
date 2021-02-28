package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DeckOfAffirmationCards {
    //attributes
    public List<AffirmationCard> affirmationDeck;

    //constructors
    public DeckOfAffirmationCards() {
        affirmationDeck = new ArrayList<>();
        File dataFile = new File("cards.txt");
        try (Scanner fileScanner = new Scanner(dataFile)){
            while(fileScanner.hasNext()){
                String lineOfInput = fileScanner.nextLine();
                String[] splitLine = lineOfInput.split("#");
                AffirmationCard card = new AffirmationCard(splitLine[0], splitLine[1]);
                card.setCategory(splitLine[2]);
                affirmationDeck.add(card);
            }

        }catch (IOException e) {
            System.out.println("File could not be found.");
        }
    }

    //getters
    public List<AffirmationCard> getAffirmationDeck() {
        return affirmationDeck;
    }

    //methods
    public void shuffle() {
        Collections.shuffle(affirmationDeck);
    }

    public AffirmationCard drawTopCard() {
        return affirmationDeck.get(0);
    }

    public AffirmationCard drawBottomCard() {
        return affirmationDeck.get(affirmationDeck.size()-1);
    }

    public AffirmationCard drawRandomFromMiddle() {
        Random random = new Random();
        //pick random number, excluding first and last indexes
        int cardDrawn = random.nextInt(affirmationDeck.size()-2) + 1;
        return affirmationDeck.get(cardDrawn);
    }


}
