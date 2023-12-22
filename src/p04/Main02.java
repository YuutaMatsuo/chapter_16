package p04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main02 {
	public static void main(String[] args) {
		Random random = new Random();
		Map<String, List<String>> marketMap = new HashMap<>();
		// 各売り場の「商品リスト」を作る
		List<String> meatList = new ArrayList<>(Arrays.asList("牛肉", "豚肉", "鶏肉"));
		List<String> vegetableList = new ArrayList<>(Arrays.asList("じゃがいも", "にんじん", "玉ねぎ", "ピーマン", "かぼちゃ"));
		List<String> fruitList = new ArrayList<>(Arrays.asList("りんご", "みかん", "いちご", "ぶどう", "もも"));

		// 「売り場名」をキーとし、各売り場が持つ「商品リスト」を値としてペアで格納していく
		// (例）キー：精肉売り場,鍵：meatList
		marketMap.put("精肉売り場", meatList);
		marketMap.put("野菜売り場", vegetableList);
		marketMap.put("果物売り馬", fruitList);

		// 各売り場の名前と、その商品リストを出力する
		// (出力例）【精肉売り場の商品一覧】精肉 牛肉 _
		for (String salesFloor : marketMap.keySet()) {
			System.out.println("【" + salesFloor + "】");
			List<String> list = marketMap.get(salesFloor);
			for (String item : list) {
				int price = random.nextInt(100, 800);
				System.out.printf("商品:%-7s 価格:%-5d\n", item, price);
			}
			System.out.println();
		}
	}
}
