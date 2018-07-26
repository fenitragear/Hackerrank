package stephan.r.practise.algorithm;

public class GradingStudents {

	/**
	 * @param val
	 * @return
	 */
	static int nextMultipleOfFive(int val) {
		String valStr = String.valueOf(val);
		int last = Integer.parseInt(valStr.substring(valStr.length() - 1, valStr.length()));
		
		return (last < 5) ? val + (5 - last) : val + (10 - last);
	}
	
	/**
	 * @param grades
	 * @return
	 */
	static int[] gradingStudents(int[] grades) {
		for(int i = 0; i < grades.length; i++) {
			int rounded = nextMultipleOfFive(grades[i]);
			
			if(rounded >= 38) {				
				grades[i] = (rounded - grades[i] < 3) ? rounded : grades[i];
			}			
		}
		
		return grades;
    }
	
	public static void main(String[] args) {
		int[] grades = new int[] { 73, 67, 38, 33 };
		int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(String.valueOf(result[resultItr]));
        }
	}
}
