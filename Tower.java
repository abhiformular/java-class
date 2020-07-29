package toh_game;

public class Tower {
	private String name;

	Tower(String name){
		this.name = name;
	}

	void draw() {
		drawPole();
		Disc bd = new Disc(3,2);
		bd.draw();
		
		
		Disc md = new Disc(5,1);
		md.draw();

		Disc sd = new Disc(7,0);
		sd.draw();
		
		
		drawBase();
		
		
		
		drawTitle();
	}

	private void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("    |  ");
		}
	}

	private void drawBase() {
		System.out.println("---------");
	}

	private void drawTitle() {
		System.out.println("   " + name);
	}
}