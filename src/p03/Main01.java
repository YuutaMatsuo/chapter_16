package p03;

import java.util.HashMap;
import java.util.Map;

public class Main01 {
	public static void main(String[] args) {
		// Map ジェネリクスには<キーの型,値の型>を宣言する
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府",255); // キーと値をペアで格納
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京"); // キーを指定して値を取得する
		System.out.println(tokyo);
		
		int kyoto = prefs.remove("京都府"); // キーを指定してペアを削除する
		
	}
}
