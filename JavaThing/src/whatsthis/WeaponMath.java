package whatsthis;

public class WeaponMath{
	static Randnum	rn	= new Randnum();

	private String	name;
	private int		high;
	private int		low;
	private double	critmod;

	public WeaponMath(String name, int low, int high, double critmod){
		this.name = name;
		this.high = high;
		this.low = low;
		this.critmod = critmod;
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

	public double getRound100(double num) {
		double rounded = Math.round(num * 100.0) / 100.0;;
		return rounded;
	}
}
