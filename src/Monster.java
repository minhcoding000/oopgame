
public class Monster {
	private String name;
	private Position pos;
	private int health;
	private int spellPower;
	
	public Monster(String n, Position p, int h, int pow) {
		this.name = n;
		this.pos = p;
		this.health = h;
		this.spellPower = pow;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public String toString() {
		return this.name + " " + this.pos + " // " + "Heath: " + this.health + " // " + "Power: " + this.spellPower;
	}
	
	public int attackPower() {
		return this.spellPower;
	}
	
	public boolean isAlive() {
		return this.health > 0;
	}
	
	public boolean receiveDamage(int damage) {
		this.health -= damage;
		System.out.println(this.name + " Damage taken: " + damage);
		if (this.isAlive()) {
			System.out.println("Health: " + this.health);
			return true;
		} else {
			System.out.println("Dead");
			this.pos = null;
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster jack = new Monster("Jack",new Position(1,1),100,10);
		Monster algernon = new Monster("Algernon", new Position(2,2),200,20);
		System.out.println(jack);
		System.out.println(algernon);
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("\nLoop " + i + "\n");
			int ran = (int) ((Math.random() * 15) + 1);
			jack.receiveDamage(ran);
			algernon.receiveDamage(ran);
			System.out.println(jack);
			System.out.println(algernon);
		}
	}
	
}
