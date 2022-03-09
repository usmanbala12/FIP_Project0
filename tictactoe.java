import java.util.ArrayList;
import java.util.Scanner;

public class tictactoe {
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Select a game mode; ");
		System.out.println("1. Human Vs Human ");
		System.out.println("2. Human Vs Computer ");
		System.out.println("3. Simulate AI players ");

		int gameMode =  keyboard.nextInt();

		switch (gameMode){
			case 1:
			HumanVsHuman();
			break;

			case 2:
			HumanVsAI();
			break;

			case 3:
			AIsimulation();
		}

		keyboard.close();

	}

	public static void checkStatus(XandOGame game){
		if(game.checkGameStatus() == 0){
			System.out.println("the game is a draw ");
		}
		else {
			System.out.println((char)game.checkGameStatus() + "won the game");
		}
	}

	public static void checkStatus2(XandOGame game){
		if (game.checkGameStatus() != 0){
			System.out.println((char)game.checkGameStatus() + " has won the game");
		}
	}

	public static void HumanVsHuman(){

		XandOGame game = new XandOGame();

		String player1name = "player1";
		char player1sym = 'x';

		String player2name = "player2";
		char player2sym = 'y';

		HumanPlayer player1 = new HumanPlayer(player1name, player1sym);
		HumanPlayer player2 = new HumanPlayer(player2name, player2sym);

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;
		
		int numberOfCellsLeft = cellsLeft.size();
		
		int count = 0;

		while(0 < numberOfCellsLeft){
			
			if(numberOfCellsLeft == 1){
				player1.play(game); 
				numberOfCellsLeft--;
				checkStatus(game);
				break;
			}
			
			
			if (numberOfCellsLeft > 1){
			
				if (game.checkGameStatus() != 0 && count > 4){
					checkStatus(game);
					break;
				}
					
				player1.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);

				player2.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);
				
			}
			
	
		}	

	}

	public static void HumanVsAI(){
		XandOGame game = new XandOGame();

		String aiplayerName = "aiplayer";
		char aiplayersym = 'x';

		String humanPlayerName = "humanplayer";
		char humanplayersym = 'y';

		AiPlayer aiplayer = new AiPlayer(aiplayerName, aiplayersym);
		HumanPlayer humanplayer = new HumanPlayer(humanPlayerName, humanplayersym);

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;
		
		int numberOfCellsLeft = cellsLeft.size();
		
		int count = 0;

		while(0 < numberOfCellsLeft){
			
			if(numberOfCellsLeft == 1){
				humanplayer.play(game); 
				numberOfCellsLeft--;
				checkStatus(game);
				break;
			}
			
			
			if (numberOfCellsLeft > 1){
			
				if (game.checkGameStatus() != 0 && count > 4){
					checkStatus(game);
					break;
				}
					
				humanplayer.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);

				aiplayer.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);
				
			}
			
	
		}	

	}

	public static void AIsimulation(){

		XandOGame game = new XandOGame();

		String aiplayer1Name = "aiplayer1";
		char aiplayer1sym = 'x';

		String aiplayer2Name = "aiplayer2";
		char aiplayer2sym = 'y';

		AiPlayer aiplayer1 = new AiPlayer(aiplayer1Name, aiplayer1sym);
		AiPlayer aiplayer2 = new AiPlayer(aiplayer2Name, aiplayer2sym);

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;
		
		int numberOfCellsLeft = cellsLeft.size();
		
		int count = 0;

		while(0 < numberOfCellsLeft){
			
			if(numberOfCellsLeft == 1){
				aiplayer1.play(game); 
				numberOfCellsLeft--;
				checkStatus(game);
				break;
			}
			
			
			if (numberOfCellsLeft > 1){
			
				if (game.checkGameStatus() != 0 && count > 4){
					checkStatus(game);
					break;
				}
					
				aiplayer1.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);

				aiplayer2.play(game);
				count++;
				numberOfCellsLeft--;
				
				checkStatus2(game);
				
			}
			
	
		}
	}

}
	





		


