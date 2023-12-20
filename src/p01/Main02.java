package p01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main02 {
	public static void main(String[] args) {
		// コレクションの宣言
		ArrayList<String> memberList = new ArrayList<>();
		// ArrayListに要素を追加
		memberList.add("みなと");
		// 要素の０番目を出力
		System.out.println(memberList.get(0));
		
		// ArrayListは中の要素が重複しても可
		memberList.add("みなと");
		System.out.println(memberList.get(1));
		memberList.add("あさか"); // 追加されるたびに[0][1][2]・・とインデックスが割り当てられる
		System.out.println(memberList.get(2));
		memberList.add("すがわら");
		System.out.println(memberList.get(3));
		// nulを格納することが出来る
		memberList.add(null);
		
		// インデックスを指定して追加する事も出来る
		memberList.add(0, "おかもと");
		System.out.println(memberList.get(0));
		
		System.out.println("----------------------------------------------");
		// ArrayListの中身を全て出力する
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		
		System.out.println("-----------------------------------------------");
		// 要素を上書きする
		// setメソッドを使うと戻り値として、もともと入っていた要素が返ってくる
		// 今回の場合は「みなと」→「minato」に上書きした為、要素を上書きした後に戻り値として「みなと」が返ってくる
		System.out.println(memberList.set(1, "minato"));
		
		System.out.println("------------------------------------------------");
		// ArrayListの中身を全て出力する
		for(String str : memberList) {
			System.out.println(str);
		}
		
		System.out.println("------------------------------------------------");
		// null を削除する（インデックス５）
		// indexOfメソッドを使って要素を検索することもできる
		memberList.remove(memberList.indexOf(null));
		for(String member : memberList) {
			System.out.println(member);
		}
		
		// イテレータを使って「memberList」のデータを繰り返し取得してみる
		// イテレーターを生成する際の右辺ではNewを使わず、コレクションインタフェースがもつiterator()を呼び出す
		Iterator<String> it = memberList.iterator();
		while(it.hasNext()) { // イテレータが次を指すことが出来ればrueが変えるhasNextメソッド
			String member = it.next(); // 次の要素を取得する
			System.out.println(member);
		}
	}
}
