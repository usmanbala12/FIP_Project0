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
			game.printGameBoard();
		}
		else {
			System.out.println((char)game.checkGameStatus() + " won the game");
			game.printGameBoard();
		}
	}

	public static void checkStatus2(XandOGame game){
		if (game.checkGameStatus() != 0){
			System.out.println((char)game.checkGameStatus() + " has won the game");
			game.printGameBoard();
		}
	}

	public static void HumanVsHuman(){

		XandOGame game = new XandOGame();

		String player1name = "player1";
		char player1sym = 'x';

		String player2name = "player2";
		char player2sym = 'o';

		Player player1 = new HumanPlayer(player1name, player1sym);
		Player player2 = new HumanPlayer(player2name, player2sym);

		gameplay(game, player1, player2);	

	}

	public static void HumanVsAI(){
		XandOGame game = new XandOGame();

		String aiplayerName = "aiplayer";
		char aiplayersym = 'x';

		String humanPlayerName = "humanplayer";
		char humanplayersym = 'o';

		Player aiplayer = new AiPlayer(aiplayerName, aiplayersym);
		Player humanplayer = new HumanPlayer(humanPlayerName, humanplayersym);
		
		gameplay(game, aiplayer, humanplayer);	

	}

	

	public static void AIsimulation(){

		XandOGame game = new XandOGame();

		String aiplayer1Name = "aiplayer1";
		char aiplayer1sym = 'x';
		
		String aiplayer2Name = "aiplayer2";
		char aiplayer2sym = 'o';

		Player aiplayer1 = new AiPlayer(aiplayer1Name, aiplayer1sym);
		Player aiplayer2 = new AiPlayer(aiplayer2Name, aiplayer2sym);

		gameplay(game, aiplayer1, aiplayer2);
		
	}


	public static void gameplay(XandOGame game, Player player0, Player player1){

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;
		
		int numberOfCellsLeft = cellsLeft.size();
		
		int count = 0;

		while(0 < numberOfCellsLeft){
			
			if(numberOfCellsLeft == 1){
				player0.play(game); 
				numberOfCellsLeft--;
				checkStatus(game);
				break;
			}
			
			
			if (numberOfCellsLeft > 1){
			
				if (game.checkGameStatus() != 0 && count > 4){
					checkStatus2(game);
					break;
				}
					
				player0.play(game);
				count++;
				numberOfCellsLeft--;

				if(game.checkGameStatus() > 0){
					checkStatus2(game);
					break;
				};

				player1.play(game);
				count++;
				numberOfCellsLeft--;

				if(game.checkGameStatus() > 0){
					checkStatus2(game);
					break;
				};
				
				
			}
			
	
		}

	}

}


	





		

