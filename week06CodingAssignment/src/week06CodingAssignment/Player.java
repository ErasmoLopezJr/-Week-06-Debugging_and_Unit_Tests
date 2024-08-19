package week06CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

 List <Card> hand = new ArrayList ();
 int score;
 String name;
 
 
 public List<Card> getHand() {
   return hand;
 }
 public void setHand(List<Card> hand) {
   this.hand = hand;
 }
 
 
 public int getScore() {
   return score;
 }
 public void setScore(int score) {
   this.score = score;
   
   
 }
 public String getName() {
   return name;
 }
 public void setName(String name) {
   this.name = name;
 }
 
 public void describe (String name, List <Card> hand) {
   System.out.println(this.name);
   
   for (Card card : this.hand) {
     card.describe();
     
   }
 }
 
 public Card flip () {
   Card card = this.hand.remove(0);
   return card;
 }
 
 public void draw (Deck deck) {
  
   hand.add(deck.draw());
   
   
   
 }
 
 public void incrementScore() {
   score ++;
 }
}
