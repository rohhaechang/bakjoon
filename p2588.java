package bakjoon;

import java.util.Scanner;
public class p2588 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = b%10;
    int c1 = b/10;
    int d = c1%10;
    int d1 = c1/10;
    int e = d1%10;

    System.out.println(a*c);
    System.out.println(a*d);
    System.out.println(a*e);
    System.out.println(a*c+a*d*10+a*e*100);

    sc.close();
  }
}
