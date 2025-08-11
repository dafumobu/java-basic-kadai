package kadai_018;

//親クラスを継承した
public class KatoHanako_Chapter18 extends Kato_Chapter18{
//givenNameを個別に
public void setGivenName() {
		super.givenName = "花子";		
	}
	
public void eachIntroduce() {
	String favorite = "趣味は読書です";
	System.out.println(favorite);
	}
}

