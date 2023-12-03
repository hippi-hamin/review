package firstWeek;

public class If {

	public static void main(String[] args) {
		
		int score = 70;
		String grade = "";
		
		if(score <= 100 && score >= 0) {
			if(score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(grade + "입니다.");
		}else {
			System.out.println("입력범위를 초과하였습니다.");
		}

	}

}
