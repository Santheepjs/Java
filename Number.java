package junit1;

public class Number {
	public void findNo(int a) {
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a==0) {
			System.out.println("Zero");
		}
		else if(a<0) {
			System.out.println("Negative");
		}
	}
		public void findPrime(int a) {
			if((a%2==0)||(a%3==0)) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime");
			}
		}
	}
