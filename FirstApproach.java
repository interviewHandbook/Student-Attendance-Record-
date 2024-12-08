package com.interviewprep.leetcode.easy.studentattendancerecord;

public class FirstApproach {

	public static void main(String[] args) {
		
		FirstApproach fa = new FirstApproach();
		Boolean isAward = fa.checkRecord("PPALLP");
		
		System.out.println(isAward);
	}

	
	public boolean checkRecord(String s) {

		Boolean isAward = false;
		Boolean neverLate = true;
		int count = 0;

		for(int i=0; i<s.length(); i++) {

			// check for first condition
			if(s.charAt(i) == 'A') {

				count = count+1;
			}

			// check for second condition
			if(s.charAt(i) == 'L'  && i < (s.length()-2) ) {

				if((s.charAt(i+1) == 'L'  && (s.charAt(i+2) == 'L'))) {

					neverLate = false;
				}

			}

		} // endFor

		// check if both conditions satisfy
		if(count < 2   && neverLate == true) {

			isAward =  true;

		}

		return isAward;
	} 
		 
	
		
}
