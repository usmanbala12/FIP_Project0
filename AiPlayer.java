import java.util.ArrayList;
import java.util.Random;

class AiPlayer extends Player {

	public AiPlayer(String name, char symbol){
		super(name, symbol);
	}
	
	public void play(XandOGame game){
	
		// call the checkAvailableCells method to check for available methods
		ArrayList<Integer> availableCells = game.getAvailableCells();
		
		Random randomnumbers = new Random();

		//choose a random cells and pass it to the modify game State method
		int random = randomnumbers.nextInt(9-1+1) + 1;
		
		// check wheather a match has been found
		int count = 0;
		for (int i = 0; i < availableCells.size(); i++){
			if(random == availableCells.get(i)){
				count += 1;
			}		
		}
		
		while(count == 0){
			random = randomnumbers.nextInt(9) + 1;
			break;
		}
		
		int symbolValue = resolveSymbol();

		game.modifyGameState(random, symbolValue);
		game.printGameBoard();
		
	}	
}

