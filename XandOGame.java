import java.util.ArrayList;

public class XandOGame {

	int[][] gameState;

	public XandOGame(){
		gameState = new int[3][3];
	}
	
	public int[][] getGameState(){
		return gameState;
	}
	
	public ArrayList<Integer> getAvailableCells(){
		// create an array to store available cells
		ArrayList<Integer> availableCells = new ArrayList<Integer>();

		// initiate a double for loop to iterate through the gamestate array to find empty cells
		for (int i = 0; i <= 2; i++){
			for(int j = 0; j <= 2; j++){
			//check wheather a cell is empty
				if (gameState[i][j] == 0){
						//check which row a cell belong to
						if (i == 0){
						//calculate the corresponding decimal position of the cells and add it to the array
							availableCells.add(i+j+1);
						}
						else if (i == 1){
							availableCells.add(i+j+3);
						}
						
						else if (i == 2){
							availableCells.add(i+j+5);
						}
					}
				}
			}
			return availableCells;
		}
		
	
	public void modifyGameState(int cellNumber, int symbolValue){
		switch (cellNumber){
		
			case 1:
			gameState[0][0] = symbolValue;
			break;
			
			case 2: 
			gameState[0][1] = symbolValue;
			break;
			
			case 3:
			gameState[0][2] = symbolValue;
			break;
			
			case 4: 
			gameState[1][0] = symbolValue;
			break;
			
			case 5:
			gameState[1][1] = symbolValue;
			break;
			
			case 6:
			gameState[1][2] = symbolValue;
			break;
			
			case 7:
			gameState[2][0] = symbolValue;
			break;
			
			case 8:
			gameState[2][1] = symbolValue;
			break;
			
			case 9:
			gameState[2][2] = symbolValue;
			break;
		}
		
	}
	
	public int checkGameStatus(){
		if ((gameState[0][0]==gameState[1][0]) && (gameState[0][0]==gameState[2][0]) && (gameState[0][0] != 0)) return gameState[0][0];
		else if ((gameState[0][1]==gameState[1][1]) && (gameState[0][1]==gameState[2][1]) && (gameState[0][1] != 0)) return gameState[0][0];
		else if ((gameState[0][2]==gameState[1][2]) && (gameState[0][2]==gameState[2][2]) && (gameState[0][2] != 0)) return gameState[0][0];
		else if ((gameState[0][0]==gameState[0][1]) && (gameState[0][0]==gameState[0][2]) && (gameState[0][0] != 0)) return gameState[0][0];
		else if ((gameState[1][0]==gameState[1][1]) && (gameState[1][0]==gameState[1][2]) && (gameState[1][0] != 0)) return gameState[0][0];
		else if ((gameState[2][0]==gameState[2][1]) && (gameState[2][0]==gameState[2][2]) && (gameState[2][0] != 0)) return gameState[0][0];
		else if ((gameState[0][0]==gameState[1][1]) && (gameState[0][0]==gameState[2][2]) && (gameState[0][0] != 0)) return gameState[0][0];
		else if ((gameState[2][0]==gameState[1][1]) && (gameState[2][0]==gameState[0][2]) && (gameState[2][0] != 0)) return gameState[0][0];
		else { 
			return 0;
		} 

	}

	public void printGameBoard(){
		System.out.println("----------------------------");
        System.out.printf("%-3s%3c%-3s%-3s%3c%-3s%-3s%3c%-3s%-11s\n", "|",((char)gameState[0][0])," ", "|",((char)gameState[0][1])," ","|",((char)gameState[0][2])," ","|");
        System.out.println("----------------------------");
        System.out.printf("%-3s%3c%-3s%-3s%3c%-3s%-3s%3c%-3s%-11s\n", "|",((char)gameState[1][0])," ", "|",((char)gameState[1][1])," ","|",((char)gameState[1][2])," ","|");
        System.out.println("----------------------------");
        System.out.printf("%-3s%3c%-3s%-3s%3c%-3s%-3s%3c%-3s%-11s\n", "|",((char)gameState[2][0])," ", "|",((char)gameState[2][1])," ","|",((char)gameState[2][2])," ","|");
        System.out.println("----------------------------");
        
	}
	 
}
