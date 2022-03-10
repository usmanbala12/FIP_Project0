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
		int random = 0;
		
		while(availableCells.size() > 0 ){

			random = randomnumbers.nextInt(9-1+1) + 1;

			while(!availableCells.contains(random)){

				random = randomnumbers.nextInt(9-1+1) + 1;
				break;
			}
			break;
		}

		
		int symbolValue = resolveSymbol();

		if(random != 0){
			game.modifyGameState(random, symbolValue);
		};

		System.out.println(getSymbol() + " just played...");
		game.printGameBoard();

		
	}	
}
