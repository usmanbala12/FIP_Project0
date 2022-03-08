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
		HumanPlayer one = new HumanPlayer(oneName, oneSymbol);
		HumanPlayer two = new HumanPlayer(twoName, twoSymbol);

		ArrayList<Integer> cellsLeft = game.getAvailableCells();
		
		int gameStatus = 0;

		while(cellsLeft.size() != 0){
			int count = 0;
			
			if(cellsLeft.size() == 1){
				one.play(game);
				break;
			}
			else {	
				one.play(game); count++;
				two.play(game); count++;
			} 
			
			if(count > 4){
			gameStatus = game.checkGameStatus();
			}
			if(cellsLeft.size() == 0){
				break;
			}
		}	
		

		// for (Integer integer : cellsLeft) {
		// 	System.out.println(integer);
		// }

		System.out.println("game over; ");
	}

	//public static void HumanVsHuman
}
