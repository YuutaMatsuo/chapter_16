package p04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main01 {
	public static void main(String[] args) {
		// キー：「String型」値：「String 型リスト」
		Map<String, List<String>> rankingMap = new HashMap<>();
		// rankingMapに格納するための「特産物リスト」を生成しておく
		List<String> fukuokaList = new ArrayList<>(Arrays.asList("明太子", "とんこつラーメン", "めんべい", "通りもん", "ひよこ"));

		// 「キー：都道府県名」&「特産物リスト」をペアで格納
		rankingMap.put("福岡県", fukuokaList);

		List<String> nagasakiList = new ArrayList<>(Arrays.asList("カステラ", "ちゃんぽん"));

		List<String> ooitaList = new ArrayList<>(Arrays.asList("かぼす", "とり天"));

		List<String> okinawaList = new ArrayList<>(Arrays.asList("シークワーサー", "ソーキそば"));

		rankingMap.put("大分県", ooitaList);
		rankingMap.put("沖縄県", okinawaList);
		rankingMap.put("長崎県", nagasakiList);

		// 拡張for文のネスト
		// rankingMapからキーの一覧を取得
		for (String localName : rankingMap.keySet()) {
			List<String> localList = rankingMap.get(localName);
			System.out.println("【" + localName + "】の特産物一覧");
			int i = 1;
			for (String local : localList) {
				System.out.println("その" + i + " " + local);
				i++;
			}

		}

	}
}
