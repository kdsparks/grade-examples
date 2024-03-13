
public class Grades {

	// 
	public String findGrade(Grade[] scores) {
		double grade = 0;
		for(int i = 0; i < scores.length; i++) {
			int score = scores[i].getScore();
			int weight = scores[i].getWeight();
			grade += score * ((double)weight / 100);
		}

		if(grade >= 90) {
			return "A";
		}
		else if(grade >= 80) {
			return "B";
		}
		else if(grade >= 70) {
			return "C";
		}
		else if(grade >= 60) {
			return "D";
		}
		else if(grade >= 0) {
			return "F";
		}
		else {
			return "invalid input";
		}
	}
}
