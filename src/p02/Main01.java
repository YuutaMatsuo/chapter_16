package p02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main01 {
	public static void main(String[] args) {
		// ハッシュセット
		Set<String> memberSet = new HashSet<>();
		Set<String> memberSet2 = new TreeSet<>();
		// 値を追加
		memberSet.add("みなと");
		
		// 値を出力
//		System.out.println(memberSet.get(0)); ※コンパイルエラー get()をもっていないため
		
		// 値を追加 
		memberSet.add("みなと"); // 重複NG！（エラーにならず無視される）インデックスを持たないため
		memberSet.add("あさか");
		memberSet.add("すがわら");
		memberSet.add(null); //HashSetには「null」を格納できる
//		memberSet2.add(null); // treeSetには「null」を格納することができない
//		memberSet.add(0,"おかもと"); // インデックス管理されてないのでエラーになる
		
		// Setはインデックスを持たないため、要素を取り出すには拡張for文か
		// イテレータを使う必要がある。
		
		// 拡張for文を使って要素を取り出す
		for(String member : memberSet) {
			System.out.println(member);
		}
			
		
	}
}
