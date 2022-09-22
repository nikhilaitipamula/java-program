import java.util.*;

public class swap
{
	public static void main(String[] args) {
		try (Scanner r = new Scanner(System.in)) {
                              System.out.println("Enter any two values:");
                              int a=r.nextInt();
                              int b=r.nextInt();
                              System.out.println("The values before swapping:\n"+"a="+a+" b="+b);
                              int c;
                              c=a;
                              a=b;
                              b=c;
                              System.out.println("The values after swapping:\n"+"a="+a+" b="+b);
                    }
	}
}
