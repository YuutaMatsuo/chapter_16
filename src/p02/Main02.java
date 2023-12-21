package p02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main02 {
	public static void main(String[] args) {
		// HashSetを使ってみる（ざっくりSetとして捉える）
		Set<String> strSet = new HashSet<>();

		// 要素を追加する
		strSet.add("春");
		strSet.add("夏");
		strSet.add("秋");
		strSet.add("冬");
		strSet.add("冬"); // 重複はNG
		strSet.add(null); // HashSetにnullを格納

		// 拡張for文で全てを取り出す
		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("---------------------------------");
		// イテレータで全要素を取り出す
		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		System.out.println("---------------------------------");
		// Integer型のHashSet
		Set<Integer> intSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));

		// 出力
		Iterator<Integer> it2 = intSet.iterator();
		while (it2.hasNext()) {
			int tmp = it2.next();
			System.out.println(tmp);
		}
		
		System.out.println("---------------------------------");
		// LinkedHashSetを使ってみる
		// データを追加した順序情報を保持する。重複のないセット（集合）
		Character[] array = {'A','B','C','D','E'};
		Set<Character> charSet = new LinkedHashSet<>(Arrays.asList(array));
		for(char c : charSet) {
			System.out.println(c);
		}
		
		// 便利なクラスやインターフェースについて
		
//		// 自分で作成したクラス型をソートする
//		// Comparableインターフェースを実装し
//		// compareTo(Object o) メソッドをオーバーライドする
		
//		例)
//		int serialNo;
//		public int compareTo(Object o) {
//			Hero h = (Hero)o;
//			if(this.serialNo < h.serialNo) {
//				return -1;
//			}
//			if(this.serialNo > h.serialNo) {
//				return -1;
//			}
//			return 0;
//		}
		
		System.out.println("------------------------------");
		String[] strs = {"い","え","あ","お","う"};
		List<String> exampleList = new ArrayList<>(Arrays.asList(strs));
		
		// 自然順序でソートする（Collectionsクラスのsortメソッド）
		Collections.sort(exampleList);
		
		for(String str : exampleList) {
			System.out.println(str);
		}
		
	}
}
