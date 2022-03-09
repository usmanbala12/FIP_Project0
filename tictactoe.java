import java.util.ArrayList;

public class tictactoe {
	public static void main(String[] args){
		XandOGame game = new XandOGame();
		
		// game.printGameBoard();

		System.out.println("welcome to tick tictactoe game: ");
		System.out.println("AI player simulation ");

		String oneName = "one";
		char oneSymbol = 'x';

		String twoName = "two";
		char twoSymbol = 'y';

		// String threeName = "three";
		// char threeSymbol = 'y';

		// HumanPlayer three = new HumanPlayer(threeName, threeSymbol);
		AiPlayer one = new AiPlayer(oneName, oneSymbol);
		AiPlayer two = new AiPlayer(twoName, twoSymbol);

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;
		
		int numberOfCellsLeft = cellsLeft.size();
		
		int count = 0;

		while(0 < numberOfCellsLeft){
			
			if(cellsLeft.size() == 1){
				one.play(game); numberOfCellsLeft--;
				
				if (game.checkGameStatus() != 0){
					System.out.println((char)game.checkGameStatus() + " has won the game");
					break;
				}
				
				System.out.println(one.getName() + " is playing");
				System.out.println("cells left is one;");
				gameStatus = game.checkGameStatus();
			}
			
			
			if (cellsLeft.size() > 1){
			
				if (game.checkGameStatus() != 0){
					System.out.println((char)game.checkGameStatus() + " has won the game");
					break;
				}
				
				System.out.println("there are " + cellsLeft.size() + " left");	
				one.play(game); count++; numberOfCellsLeft--;
				
				if (game.checkGameStatus() != 0){
					System.out.println((char)game.checkGameStatus() + " has won the game");
					break;
				}
				System.out.println(one.getName() + " is playing");
				two.play(game); count++; numberOfCellsLeft--;
				
				if (game.checkGameStatus() != 0){
					System.out.println((char)game.checkGameStatus() + " has won the game");
					break;
				}
				
				System.out.println(two.getName() + " is playing");
			}
			
			//if (cellsLeft.size() == 0) break;
			System.out.println("while loop in main is causing this");
		}	
		

		// for (Integer integer : cellsLeft) {
		// 	System.out.println(integer);
		// }

		System.out.println("game over; ");
		if(gameStatus == 0){
			System.out.println("the game is a draw ");
		}
		else {
			System.out.println((char)gameStatus + "won the game");
		}
	}

	//public static void HumanVsHuman
}
