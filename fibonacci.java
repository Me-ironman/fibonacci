public class Fibonacci {

	public static int of(int n) { 
		int num1=1;
		int num2=1;
		if(n<=2)
			return 1;
		n-=2;
		while(n>0){
			n-=1;
			num2+=num1;
			num1=num2-num1;
		}
		return num2;

	}

	public static void main(String[] args) {
		int num =1,i=2;
		while(num<=200){
			System.out.println(num);
			num=of(i);
			i+=1;
		}

	}
}