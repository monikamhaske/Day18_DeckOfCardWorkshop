package Day14;
import java.util.Random;
public class DeckOfCard1 {
static String[] Clubs = {"C2","C3","C4","C5","C6","C7","C8","C9","C10","Cjack","CQueen","CKing","CAce"};
static String[] Diamonds = {"D2","D3","D4","D5","D6","D7","D8","D9","D10","Djack","DQueen","DKing","DAce"};
static String[] Hearts = {"H2","H3","H4","H5","H6","H7","H8","H9","H10","Hjack","HQueen","HKing","HAce"};
static String[] Spades = {"S2","S3","S4","S5","S6","S7","S8","S9","S10","Sjack","SQueen","SKing","SAce"};
static String[][]deck= {Clubs,Diamonds,Hearts,Spades};


public static void main(String[] args) {
	System.out.println("Welcome To Deck Of Card Game");
	distribute();
}
private static void distribute() {
	for(int i=1;i<5;i++) {
		System.out.println("for player"+i);
		for(int j=1;j<10;j++) {
			selectCard();
		}
		System.out.println();
	}
}
	public static void selectCard() {
		Random r=new Random();
		int suit = r.nextInt(4);
		int rank = r.nextInt(13);
		
		if(deck[suit][rank]==null) {
			selectCard();
		}
		else {
			System.out.println(deck[suit][rank]);
		}
		
	}
		
		
		
		
		
		
	}


