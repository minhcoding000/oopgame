
public class Position {
	private int x;
	private int y;
	public static final int MAX_X = 3;
	public static final int MAX_Y = 3;
	
	//Setting position
	public Position(int a, int b) {
		if (a <= 0) {
			this.x = 1;
		} else if (a > MAX_X) {
			this.x = MAX_X;
		} else {
			this.x = a;
		}
		if (b <= 0) {
			this.y = 1;
		} else if (b > MAX_Y) {
			this.y = MAX_Y;
		} else {
			this.y = b;
		}
	}
	
	//Detecting Collision
	public boolean equals(Position p) {
		if (p == null) {
			return false;
		} else if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	//Printing Position
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public void moveLeftOrRight(int byNum) {
		int x = this.x + byNum;
		if (x > MAX_X) {
			x = x % MAX_X;
		}
		while (x <= 0) {
			x += MAX_X;
		}
		this.x = x;
	}
	
	public void moveUpOrDown(int byNum) {
		int y = this.y + byNum;
		if (y > MAX_Y) {
			y = y % MAX_Y;
		}
		while (y <= 0) {
			y += MAX_Y;
		}
		this.y = y;
	}
	
	
	
	
	
	//Main Method
	public static void main(String[] args) {
		Position me = new Position(-2,7);
		System.out.println(me);
		me.moveUpOrDown(3);
		System.out.println(me);
		me.moveLeftOrRight(1);
		System.out.println(me);
		me.moveUpOrDown(-1);
		System.out.println(me);
		me.moveLeftOrRight(-11);
		System.out.println(me);
		me.moveUpOrDown(-10);
		System.out.println(me);
		me.moveLeftOrRight(8);
		System.out.println(me);
		me.moveUpOrDown(22);
		System.out.println(me);
		System.out.println(me.equals(new Position(2,2)));
		System.out.println(me.equals(null));
	}
}
