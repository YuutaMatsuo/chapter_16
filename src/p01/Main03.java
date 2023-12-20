package p01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main03 {
	public static void main(String[] args) {
		// Listの応用的な使い方(余裕がある人だけ)
//		List<String> list = new ArrayList<>("おはよう","こんにちは");　//このように初期化することはできない

		String[] array = {"おはよう","こんにちは","こんばんは"};
		
		// コンストラクタに「固定長リスト」(asList)を渡す
		// Arrays.asList() 引数で渡された配列を固定長リストに変換してくれるメソッド
		List<String> list =
				new ArrayList<>(Arrays.asList(array));
		
		System.out.println(list.get(0));
		
		// 直接Arrays.asList()に値を渡すこともできる
		List<String> list2 =
				new ArrayList<>(Arrays.asList("おはよう","こんにちは","こんばんは"));
		
		list.remove(0);
		list.remove("こんばんは");
		
		
		// ラッパークラスを使う場合
		// この場合Arrays.asListの戻り値はint型の配列となる
		List<Integer> list3 =
				new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
//		list3.remove(0); // インデックス指定
//		list3.remove(10); // インスタンスを指定（したつもり）　※実行時エラー インデックスの10番目を指定したとみなされたため
		
		// 中の値を直接指定したい場合はInteger.valueOf()メソッドで値をInteger型に変換してあげる
		list3.remove(Integer.valueOf(10)); // Integer型に変換
		
		System.out.println(list3.get(0));
	}
}
