package week06CodingAssignment;

public class App {

 public static void main(String[] args) {
  
  Deck deck = new Deck ();
  
  
  Player player1 = new Player ();
    
  Player player2 = new Player();
  
  deck.shuffle();
  
  for (int index = 0; index <52; index++ )
      if (index % 2 == 0) {
        player1.draw(deck);
      } else {
        player2.draw(deck);
      }
      
  for (int index = 0; index < 26; index++) {
      Card card1 = player1.flip();
      Card card2 = player2.flip();
      System.out.println(card1.getValue());
      System.out.println(card2.getValue());
    
    if (card1.getValue() > card2.getValue()) {
        System.out.println("Player 1 wins 1 point");
        player1.incrementScore();
      } else if (card1.getValue() < card2.getValue()) {
        System.out.println("Player 2 wins 1 point");
        player2.incrementScore();
      } else {
        System.out.println("There's no winner this round");
      }
   
  }
  
  System.out.println();
  
  System.out.println("***************************************************");
 
  int scorePlayer1 = player1.getScore();
    System.out.println("Player 1 score is: " + scorePlayer1);
  int scorePlayer2 = player2.getScore();
    System.out.println("Player 2 score is: " + scorePlayer2);
  
  if (scorePlayer1 > scorePlayer2) {
      System.out.println("The winner is: Player1");
  } else if (scorePlayer1 < scorePlayer2) {
      System.out.println("The winner is: Player2");

  }else {
      System.out.println("There is no winner");
  }
 }

}