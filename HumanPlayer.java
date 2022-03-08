import java.util.ArrayList;
import java.util.Scanner;

class HumanPlayer extends player {

	public HumanPlayer(String name, char symbol) {
		super(name, symbol);
	}
	
	public void play(XandOGame game){
	
			Scanner keyboard = new Scanner(System.in);
			// call the checkAvailableCells method to check for available methods
			ArrayList<Integer> availableCells = game.getAvailableCells();
			
			//choose a random cells and pass it to the modify game State method
			
			for (int i = 0; i < availableCells.size(); i++){
				System.out.print(availableCells.get(i) + ", ");
			}
				System.out.println();

			int choosenCell = 0;
			
			while(availableCells.size() > 0 ){
				System.out.println("These are the available cells... please choose one");

				if(keyboard.hasNextInt()){
					keyboard.nextLine();
					choosenCell = keyboard.nextInt();
				}


				while(!availableCells.contains(choosenCell)){
					System.out.println("the cell you've choosen isn't available, please choose another one ");
					if(keyboard.hasNextInt()){
						keyboard.nextLine();
						choosenCell = keyboard.nextInt();
					}
					break;
				}

				break;
			}
			
			int symbolValue = resolveSymbol();

			game.modifyGameState(choosenCell, symbolValue);
	}
	
}	
