package kadai_018;
	
	//親クラスを継承した
public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	//givenNameを個別に
	public void setGivenName() {
			super.givenName = "一郎";		
		}
		
	public void eachIntroduce() {
		String favorite = "好きな食べ物はリンゴです";
		System.out.println(favorite);
	}
}