public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int int1) {
		if (int1 % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";

		}
	}

	public static String teacherOrStudent (String s) {
		if (s == "Kalisz") {
			return "Teacher";
		}
		else {
			return "Student";

		}
		}
	public static int fartherFromZero(int int2) {
		if (int2 > 0) {
			int2 = int2 + 5;
			return int2;
		}
		if (int2 < 0) {
			int2 = int2 - 5;
			return int2;

		}
		else { 
			return 0;
		}
	}
	public static String isFive(int int3) {
		if (int3 == 5) {
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}
	}
	public static String positiveOrNegative(double int1) {
		if (int1 > 0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}

	public static String highOrLow(int int1) {
		if (int1 > 100) {
			return "High";
		}
		else {
			return "Low";
		}
	}

	public static String isHello(String t) {
		if (t == "Hello") {
			return "The word is Hello";
		}
		else {
			return "The word is not Hello";
		}
	}
	}
	

	//Write your functions here
