package p02;

import java.util.HashSet;
import java.util.Set;

public class Main01 {
	public static void main(String[] args) {
		// ハッシュセット
		Set<String> memberSet = new HashSet<>();
		// 値を追加
		memberSet.add("みなと");
		
		// 値を出力
//		System.out.println(memberSet.get(0)); ※コンパイルエラー get()をもっていないため
		
		// 値を追加 
		memberSet.add("みなと"); // 重複NG！（エラーにならず無視される）インデックスを持たないため
		memberSet.add("あさか");
		memberSet.add("すがわら");
		memberSet.add(null); //HashSetには「null」を格納できる
//		memberSet.add(0,"おかもと"); // インデックス管理されてないのでエラーになる
	}
}
