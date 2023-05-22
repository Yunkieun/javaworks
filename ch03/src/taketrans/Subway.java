package taketrans;

// 지하철 클래스
public class Subway {
	String lineNumber;
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.printf("지하철 %s의 수입은 %d원이고, 승객수는 %d명입니다.\n",
				lineNumber, money, passenger);
	}
}
