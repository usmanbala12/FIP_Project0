public abstract class player {

	String name;
	char symbol;

	public player(String name, char symbol){
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName(){
		return name;
	}

	public int resolveSymbol(){
		return (int)symbol;
	}
	
	public abstract void play(XandOGame gamestate);
	
	
}
