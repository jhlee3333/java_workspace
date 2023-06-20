package partB.day14;

import partB.day13.Score;

public class B11ScoreArrays {
	
	public static void main(String[] args) {
		
		Score[] s = new Score[5];
		
		for(int i=0;i<s.length;i++) {
			s[i] = new Score();
			s[i].setName("모모" + i);
			System.out.println(s[i]);
		}
		
	}
}