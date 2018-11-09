//package Java;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	GuessGame[] guess=new GuessGame[3];
	public NumberGame() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<guess.length;i++){
			guess[i]=new GuessGame();
			guess[i].startGame();
		}
	if(guess[0].Score<guess[2].Score &&guess[1].Score<guess[2].Score)
		System.out.println("Player3 win the game");
	else if(guess[0].Score<guess[1].Score &&guess[2].Score<guess[1].Score)
		System.out.println("Player2 win the game");
	else if(guess[1].Score<guess[0].Score &&guess[2].Score<guess[0].Score)
		System.out.println("Player1 win the game");
	else if(guess[1].Score==guess[0].Score &&guess[2].Score<guess[0].Score)
		System.out.println("Player1 and player2 win the game");
	else if(guess[1].Score==guess[2].Score &&guess[0].Score<guess[2].Score)
		System.out.println("Player2 and player3 win the game");
	else if(guess[0].Score==guess[2].Score &&guess[1].Score<guess[2].Score)
		System.out.println("Player1 and player3 win the game");
	else if(guess[0].Score==guess[1].Score&&guess[1].Score==guess[2].Score)
		System.out.println("Player1 and player2 and player3 all win the game");
	}

	public static void main(String[] args) {
	    new NumberGame();
	}
}

class GuessGame {
	int Score = 100;
	Player duan = new Player();
	void startGame() {
		duan.Guess();	
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input £º");
			int shuru = sc.nextInt();
			if (duan.number == shuru){
					System.out.println("Congratulations,you got it.   Your score is" + Score);
			break;
			}
			else if (duan.number > shuru) {
				System.out.println("It's a pity that you guess wrong,you should choose a bigger number!");
				Score = Score - 10;
			}
			else if (duan.number < shuru) {
				System.out.println("It's a pity that you guess wrong,you should choose a smaller number!");
				Score = Score - 10;
			}
		}
	}
}

class Player {
	int number;
	void Guess() {
		Random rr=new Random();
		this.number=rr.nextInt(10);
	}
}