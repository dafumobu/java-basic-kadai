package kadai_018;
	
//親クラスを継承した
public class KatoTaro_Chapter18 extends Kato_Chapter18{
	//givenNameを個別に
	public void setGivenName() {
		super.givenName = "太郎";		
	}
	
	public void eachIntroduce() {
		String favorite = "私はJavaが得意です";
		System.out.println(favorite);
	}
}