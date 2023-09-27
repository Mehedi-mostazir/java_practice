import java.util.*;

public class areaofcircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    final float PI = 3.14F;

    double area = PI * r *r ;
    System.out.println(area);
  }
}
