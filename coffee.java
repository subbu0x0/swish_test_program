import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t =0;
		int x = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		    while(x>1){
        t= t+x;
        x = x- (x*p/100);
    }
    if(x==1){
        t=t+x;
    }

      System.out.println(t+"\n");
    }
}
