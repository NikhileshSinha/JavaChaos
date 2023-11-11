import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int in = sc.nextInt();
		int a = in;
		StringBuilder susu = new StringBuilder();
		while(a>0){
		    int x = a%2;
		    a /= 2;
		    char c=(char)(x+'0');
		    susu.append(c);
		}
		System.out.println(susu.reverse());
	}
}
