package marsrover;

public class Plateau {
	
	private static int x;
	private static int y;
	
	public Plateau(int x, int y) {
		this.x = x;
		this.y= y;
	}
	
	public int getMaxX() {
		return x;
	}
	
	public int getMaxY() {
		return y;
	}

	@Override
	public String toString() {
		return "Plateau [Tamanho x: " + getMaxX() + ", Tamanho y: " + getMaxY() + "]";
	}
	
	

}
