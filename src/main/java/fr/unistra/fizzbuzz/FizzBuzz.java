package fr.unistra.fizzbuzz;

public class FizzBuzz {
	
	public String convert(int number) {
		String res = "";
		
		if(number % 3 == 0) {
			res += "Fizz";
		}
		if(number % 5 == 0) {
			res += "Buzz";
		}
		if(res.isEmpty()) {
			res += number;
		}
		
		return res;
	}
}
