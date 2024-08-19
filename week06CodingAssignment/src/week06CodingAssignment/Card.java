package week06CodingAssignment;

public class Card {
	 
	 int value;
	 String name;
	 String suit;
	 
	 Card(String name, String suit, int value){
	   this.name = name;
	   this.suit = suit;
	   this.value = value;
	   
	 }
	 
	 
	 public String getSuit() {
	   return suit;
	 }



	 public void setSuit(String suit) {
	   this.suit = suit;
	 }



	 public int getValue() {
	   return value;
	 }
	 
	 public void setValue(int value) {
	   this.value = value;
	 }
	 
	 public String getName() {
	   return name;
	 }
	 
	 public void setName(String name) {
	   this.name = name;
	 }
	 
	 public void describe () {
	   System.out.println(this.name + " of " + this.suit + "--" + this.value);
	 }
	 

	}
