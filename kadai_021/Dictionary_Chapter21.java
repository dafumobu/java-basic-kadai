package kadai_021;

import java.util.HashMap;

//英単語と意味を辞書に追加し、辞書から英単語の意味を調べることができるようにしましょう。調べた英単語の意味をEclipseのコンソールに出力するプログラムを作成しましょう。

public class Dictionary_Chapter21 {
	
	public void meaning(int length) {
		
		HashMap<String,String> i = new HashMap<String,String>();
	
		i.put("apple","りんご");
		i.put("peach","もも");
		i.put("banana","バナナ");
		i.put("lemon","レモン");
		i.put("pear","なし");
		i.put("kiwi","キウイ");
		i.put("strawberry","いちご");
		i.put("grape","ぶどう");
		i.put("muscat","マスカット");
		i.put("cherry","さくらんぼ");
	
		//System.out.println(i.get("apple"));
		
		for(int a=0;a<length;a++) {
			//調べる単語の配列
			String[] check = {"apple","banana","grape","orange"};
			
			if(i.containsKey(check[a])) {
				System.out.println(check[a]+"の意味は"+i.get(check[a]));
			}else {
				System.out.println(check[a]+"は辞書に存在しません");
			}
		}
		
		
		
		
	}}
		
		

