package whatsthis;

public class Weapon{
	static Randnum	rn	= new Randnum();

	private String	name;
	private int		high;
	private int		low;
	private double	critmod;
	private double	supercritmod;

	public Weapon(String name, int low, int high, double critmod, double supercritmod){
		this.name = name;
		this.high = high;
		this.low = low;
		this.critmod = critmod;
		this.supercritmod = supercritmod;
	}

	public String getWeaponName() {
		return name;
	}

	public int getDamageLow() {
		return low;
	}

	public int getDamageHigh() {
		return high;
	}

	public double getDamageMod() {
		return critmod;
	}

	public double getDamageModSuper() {
		return supercritmod;
	}

	public double getDamageAvg() {
		double avg = (low + high) / 2.0;
		return avg;
	}

	public double getDamageNormRND() {
		double norm = rn.getRandNum2(low, high);
		return getRound100(norm);
	}

	public double getDamageCritRND() {
		double crit = critmod * rn.getRandNum2(low, high);
		return getRound100(crit);
	}

	public double getDamageSupCritRND() {
		double crit = supercritmod * rn.getRandNum2(low, high);
		return getRound100(crit);
	}

	public double getRound100(double num) {
		double rounded = Math.round(num * 100.0) / 100.0;
		return rounded;
	}
}
