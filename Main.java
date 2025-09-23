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

    Rectangle Rect1 = new Rectangle();
    Rectangle Rect2 = new Rectangle();

    Rect1.setLength(lenWid);
    Rect1.setWidth(lenWid);
    Rect2.setLength(len);
    Rect2.setWidth(Wid);

    System.out.println(Rect1.toString());
    System.out.println(Rect2.toString());

    double slength;
    int numsides;
    double slength2;
    int numsides2;


  System.out.println("Type a side length: ");
    slength = sc.nextDouble();
  System.out.println("Type a number of sides: ");
    numsides = sc.nextInt();
  System.out.println("Type a side length 2: ");
   slength2 = sc.nextDouble();
  System.out.println("Type a number of sides 2: ");
    numsides2 = sc.nextInt();

  RegularPolygon poly1 = new RegularPolygon();
  RegularPolygon poly2 = new RegularPolygon();

  poly1.setSideLength(slength);
  poly1.setNumSides(numsides);
  poly2.setSideLength(slength2);
  poly2.setNumSides(numsides2);

  System.out.println(poly1.toString());
  System.out.println(poly2.toString());
  
  }
}
