package p01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// コレクション名<データ型> 変数名 = new コレクション名<データ型>();
		ArrayList<String> sampleList = new ArrayList<>(); // 右辺のデータ型は省略することが出来る                                                                                                                                                                                                                                                                                                                                                             
		
		// 注意点 (基本データ型は指定できない)
//		ArrayList<int> sampleList = new ArrayList<int>();
		
		sampleList.add("こんにちは"); // 末尾に追加
		sampleList.add(0, "おはよう"); // 割り込み追加 引数にインデックス番号を指定
		sampleList.set(0, "こんばんは"); // 上書き 引数にインデックス番号を必ず指定
		
		System.out.println(sampleList.get(0)); // int番目の要素を取り出す
		System.out.println(sampleList.get(1));
		
		System.out.println("現在の要素数は：" + sampleList.size()); // ArrayListの要素数を取得する（引数はいらない）
		
		// 要素数がゼロであるかを判定
		if(sampleList.isEmpty()) { 
			System.out.println("からっぽです");
		} else {
			System.out.println("要素あり");
		}
		
		// 指定要素が含まれているかを判定
		if(sampleList.contains("おはよう")) {
			System.out.println("含まれています");
		} else {
			System.out.println("含まれていません");
		}
		
		// 指定要素が何番目にあるかを検索
		System.out.println(sampleList.get(0) + "は" + sampleList.indexOf("こんばんは") + "番目");
		// 存在しない要素を検索すると「-1」が返ってくる
		System.out.println(sampleList.get(0) + "は" + sampleList.indexOf("Hello") + "番目");
		
		// int 番目の要素を削除する
		sampleList.remove(0); // インデックスを指定（単体削除）
		System.out.println(sampleList.get(0));
		
		// 要素を全て削除する
		sampleList.clear();
		System.out.println(sampleList.get(0));
	}
}
