package p03;

import java.util.HashMap;
import java.util.Map;

public class Main01 {
	public static void main(String[] args) {
		// Map ジェネリクスには<キーの型,値の型>を宣言する
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255); // キーと値をペアで格納
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都"); // キーを指定して値を取得する
		System.out.println(tokyo); // 受け取った値を出力

		int kyoto = prefs.remove("京都府"); // キーを指定してペアを削除する
		System.out.println(kyoto); // 削除をした値が戻り値として格納されているため

		// オートボクシングについて
		// 本来ならばこのように記述しなければならないところを
		Integer i = new Integer(10);
		// このようにInteger型にint型を格納しようとすると、オートボクシング機能が働いてInteger型に変換してくれる
		Integer j = 10;

		// 既存のキーを指定した場合は上書きを行う
		prefs.put("熊本県", 182);
	}
}
