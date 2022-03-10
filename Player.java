public abstract class Player {

	String name;
	char symbol;

	public Player(String name, char symbol){
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName(){
		return name;
	}

	public char getSymbol(){
		return symbol;
	}

	public int resolveSymbol(){
		return (int)symbol;
	}
	
	public abstract void play(XandOGame gamestate);
	
	
}
