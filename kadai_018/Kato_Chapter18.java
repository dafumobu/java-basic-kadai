package kadai_018;

abstract public class Kato_Chapter18 {

//定義	
	
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
//コンストラクタ
	public Kato_Chapter18(){
	}
	
//メソッド1
//共通の紹介を出力する	
	public void commonIntroduce(){
		System.out.println("名前は"+ this.familyName + this.givenName + "です");
		System.out.println("住所は"+ this.address + "です");
	}
	
//メソッド2s
//個別の紹介を出力する
	abstract public void eachIntroduce();
	
//メソッド3
//紹介を呼び出しする
	public void execIntroduce(){
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println(" ");
	}
	
}