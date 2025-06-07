public class WhileLoopExample2{
	public static void main(String[] args) {
		int number=3456;
		int sum=0;
		StringBuilder reverse=new StringBuilder("");
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			reverse.append(digit);
			number = number / 10;
			
		}
		System.out.println("sum=" +sum);
		System.out.println("reverse number="+reverse);
	}	
	

}