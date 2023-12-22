package test;

public class Hero {
	String name;
	int serialNo;

	public Hero(String name, int serialNo) {
		this.name = name;
		this.serialNo = serialNo;
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Hero)) {
			return false;
		}
		Hero h = (Hero)o;
		if(!(this.serialNo == h.serialNo)) {
			return false;
		}
		return true;
	}
}
