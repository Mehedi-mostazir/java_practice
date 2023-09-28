import java.util.Scanner;

public class calucator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("choose operation 1. + 2. - 3. * 4. / 5. %");

    int operation = sc.nextInt();

    System.out.println("Please Enter Two Number");

    int a = sc.nextInt();
    int b = sc.nextInt();
    

    switch(operation){
      case 1 :System.out.println(a + b);
      break;
      case 2 : System.out.println( a - b);
      break;
      case 3 : System.out.println(a * b);
      break;
      case 4 : System.out.println(a / b);
      break;
      case 5 : System.out.println(a % b);
      break;
    }
  }
}
