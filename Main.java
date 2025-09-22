import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

  Scanner sc = new Scanner(System.in);

  Circle circ1 = new Circle();
  Circle circ2 = new Circle();
  Circle circ3 = new Circle();

  circ1.setRadius(10.1);
  circ2.setRadius(14.5);
  circ3.setRadius(20.5);

  System.out.println(circ1.toString());
   System.out.println(circ2.toString());
    System.out.println(circ3.toString());

    double lenWid;
    double len;
     double Wid;
    System.out.println("Type a number for length and width: ");
    lenWid = sc.nextDouble();
    System.out.println("Type a number for length: ");
    len = sc.nextDouble();
    System.out.println("Type a number for width: ");
    Wid = sc.nextDouble();




  


  }
}
