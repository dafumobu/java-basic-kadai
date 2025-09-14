package kadai_028;

import java.util.HashMap;
import java.util.Scanner;


	public class Jyanken_Chapter28 {

	public String getMyChoice() { //じゃんけんの手を入力する
			
			System.out.println("自分のじゃんけんの手を入力しましょう");		
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			Scanner scanner = new Scanner(System.in);	
			String input= scanner.next();
			
			while(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
				System.out.println("rかsかpを入力してください");
				input= scanner.next();
			}
			/*if(input!="r" && input!="s" && input!="p") {
				System.out.println("rかsかpを入力してください");
				input= scanner.next();
			}
			*/
			System.out.println(input);
			scanner.close();
			
			return input;
	}

	
	//対戦相手の手を乱数で選ぶ
	//floorで小数点以下を切り捨てる
	
	public String getRandom() { 
		
		double random = Math.random()*3;
		int num = (int)Math.floor(random);
		
		String comChoice="";
		
		if(num==0) {
			comChoice="r";
		}else if(num==1) {
			comChoice="s";
		}else if(num==2) {
			comChoice="p";
		}
		
		return comChoice;
		}
		
		
//自分と対戦相手のじゃんけんの手を出力する処理は、次のようなHashMapの値を出力しましょう。playGameメソッドの引数をHashMapのキーとしましょう。

	public void playGame() {
		
		HashMap<String,String> hand = new HashMap<String,String>();
		
		hand.put("r","グー");
		hand.put("s","チョキ");
		hand.put("p","パー");
		
		String myChoice = getMyChoice();
		String comChoice = getRandom();
		
		System.out.println("自分の手は"+hand.get(myChoice)+",対戦相手の手は"+hand.get(comChoice));
		
		if(myChoice.equals(comChoice)) {
			System.out.println("あいこです");
		}else if((myChoice.equals("r") && comChoice.equals("s")) || (myChoice.equals("s") && comChoice.equals("p")) || (myChoice.equals("p") && comChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
	
	
	
