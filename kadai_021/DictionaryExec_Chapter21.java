package kadai_021;

/*
appleの意味はりんご
bananaの意味はバナナ
grapeの意味はぶどう
orangeは辞書に存在しません
 */

public class DictionaryExec_Chapter21 {
	


	public static void main(String[] args) {
		
	Dictionary_Chapter21 Dictionary = new Dictionary_Chapter21();
	
	//調べる単語の配列
	String[] check = {"apple","banana","grape","orange"};

	//dictionaryメソッドを呼び出し
	Dictionary.meaning(check);
	
		    
	}
}