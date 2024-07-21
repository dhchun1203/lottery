package lottery;

//import harrypotter.PersonalData;

public class Lottery {
	String randomNum = "";
	String[] randomNumbers = new String[6];
	
//	램덤으로 로또번호가 생성되게 한다.
//	범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	public static int random(int min, int max) {
		int num = (int)((Math.random() * (max - min + 1)) + min);
		return num;
	}
	
	public void randomLotteryNum() {
		for(int i = 0; i < 6; i++) {
//			randomNum += PersonalData
		}
	}
}
