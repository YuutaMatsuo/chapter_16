package test;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Hero> set = new HashSet<>();
		Hero h1 = new Hero("ミナト", 1);

		set.add(h1); // h1（Heroインスタンス）をHashSetに格納

		System.out.println("要素数" + set.size());

		h1 = new Hero("アサカ", 1);

		set.remove(h1);
		System.out.println("要素数" + set.size());
	}
}
