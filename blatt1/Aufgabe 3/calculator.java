public class calculator {
	public static void main(String[] args) {
		String number1 = args[0];
		double numberOneFormatted = Double.parseDouble(number1);
		String matOperator =args[1];
		String number2 = args[2];
		double numberTwoFormatted = Double.parseDouble(number2);
		double result =0.0;
		if (matOperator.equals("+")) {
			result = numberTwoFormatted+numberOneFormatted;

		} else if (matOperator.equals("-")) {
			result = numberOneFormatted - numberTwoFormatted;
		} else {
			System.out.println("Unknown Math Operator Please Just Use + or - !");
		}
		System.out.println("The Result is "+result);
	}
}
	
