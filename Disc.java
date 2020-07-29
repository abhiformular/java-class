package toh_game;

class Disc {
	private int size;
	private int blank;
	Disc(int size,int blank) {
		this.size = size;
		this.blank = blank;
	}

	
	
	public void draw() {
		for (int s = 0; s < blank; s++) {
			System.out.print(" ");
		}
		System.out.print("<");
		for (int i = 0; i < size; i++) {
			System.out.print("=");
		}
		System.out.print(">");

		System.out.println("");

	}
}
