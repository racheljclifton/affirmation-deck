package com.techelevator;

import com.techelevator.AffirmationCard;

import java.util.*;

public class DeckOfAffirmationCards {
    //attributes
    public List<AffirmationCard> affirmationDeck;

    public static final AffirmationCard CARD1 = new AffirmationCard("The point of power is always in the present moment.", "The past is over and done and has no power over me. I can begin to be free in this moment. Today's thoughts create my future. I am in charge. I now take my own power back. I am safe and I am free", Category.LIFE);
    public static final AffirmationCard CARD2 = new AffirmationCard("I let go of all expectations.", "I flow freely and lovingly with life. I love myself. I know that only good awaits me at every turn.", Category.LIFE);
    public static final AffirmationCard CARD3 = new AffirmationCard("Divine Wisdom guides me.", "I am guided throughout this day in making the right choices. Divine intelligence continuously guides me in the realization of my goals. I am safe.", Category.SELFDOUBT);
    public static final AffirmationCard CARD4 = new AffirmationCard("I trust the process of life.", "There is a rhythm and flow to Life, and I am part of it. Life supports me and brings to me only good and positive experiences. I trust the process of Life to bring me my highest good.", Category.LIFE);
    public static final AffirmationCard CARD5 = new AffirmationCard("I am willing to change.", "I am willing to release old, negative beliefs. They are only thoughts that stand in my way. My new thoughts are positive and fulfilling.", Category.CHANGE);
    public static final AffirmationCard CARD6 = new AffirmationCard("I open new doors to life.", "I rejoice in what I have, and I know that fresh new experiences are always ahead. I greet the new with open arms. I trust Life to be wonderful.", Category.CHANGE);
    public static final AffirmationCard CARD7 = new AffirmationCard("Life is simple and easy.", "All that I need to know at any given moment is revealed to me. I trust myself and I trust Life. All is well.", Category.LIFE);
    public static final AffirmationCard CARD8 = new AffirmationCard("It is safe to look within.", "As I move through the layers of other people's opinions and beliefs, I see within myself a magnificent being, wise and beautiful. I love what I see in me.", Category.SELFDOUBT);
    public static final AffirmationCard CARD9 = new AffirmationCard("I am willing to forgive.", "Forgiveness of myself and others releases me from the past. Forgiveness is the answer to almost every problem. Forgiveness is a gift to myself. I forgive, and I set myself free.", Category.GENERAL);
    public static final AffirmationCard CARD10 = new AffirmationCard("Everything I touch is a success.", "I now establish a new awareness of success. I know I can be as successful as I make up my mind to be. I move into the Winning Circle. Golden opportunities are everywhere for me. Prosperity of every Kind is drawn to me.", Category.SELFDOUBT);
    public static final AffirmationCard CARD11 = new AffirmationCard("I am in the process of positive change.", "I am unfolding in fulfilling ways. Only good can come to me. I now express health, happiness, prosperity, and peace of mind.", Category.CHANGE);




    public static final AffirmationCard[] deckArray = {CARD1, CARD2, CARD3, CARD4, CARD5, CARD6, CARD7, CARD8, CARD9, CARD10, CARD11};
    //constructors
    public DeckOfAffirmationCards() {
        affirmationDeck = new ArrayList<>(Arrays.asList(deckArray));
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
