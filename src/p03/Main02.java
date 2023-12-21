package p03;

import java.util.HashMap;
import java.util.Map;

public class Main02 {
	public static void main(String[] args) {
		// HashMap（キー：String 値：Integer）をざっくりMapとして格納
		Map<String, Integer> map = new HashMap<>();
		// 値を格納する
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 同じキーを指定すると値を上書きする
		map.put("A", 500);
		map.put("Å", 1000); // 「キー」の全角・半角には注意する（識別される）

		// mapからすべての値を出力する 拡張for文を使う
		// KeySet() で「キーの一覧」を「Set」として取得
		// 「Set」（キーの一覧）から１つずつランダムにキーを取り出していく
		for (String key : map.keySet()) {
			System.out.printf("現在のキー：%1s\n", key);
			// 取り出したキーをget()の引数に渡してあげると値を出力することが出来る
			System.out.printf("%-5d\n", map.get(key));
		}

		map.remove("Å"); // 削除する

		System.out.println("---------------------------------");
		// containsKey() キーがあるか確認する
		if (map.containsKey("Å")) {
			System.out.println("含まれている");
		} else {
			System.out.println("含まれていない");
		}

		// containsValue() 値があるか確認する
		if (map.containsValue(1000)) {
			System.out.println("含まれている");
		} else {
			System.out.println("含まれていない");
		}

		map.put(null, null); // キーも値もnullを格納できる
		System.out.println(map.get(null)); // キーをnullにして値を取得する事も出来る

		map.put("D", null); // 値にnullを格納することもできる
		Integer i = map.get("D");
		System.out.println(i);

		// nullチェック
		if (i != null) {
			System.out.println(i);
		} else {
			System.out.println("キーは格納済みだが、値がnullである");
		}

		// 存在しないキーを指定してもエラーは起きない（無視される）
		Integer j = map.get("E");
		// jの中身はInteger型の初期値であるnullが格納されている
		System.out.println(j);
	}
}
