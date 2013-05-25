package whatsthis;

public class Battlemath{
	static Randnum	rn	= new Randnum();

	public static int getDamageLow() {
		int low = 1 * 5;
		return low;
	}

	public static int getDamageHigh() {
		int high = 2 * 5;
		return high;
	}

	public static double getDamageCrit() {
		double critMod = 1.0;
		double crit = critMod * rn.getRandNum2(5, 10);
		return crit;
	}
}
