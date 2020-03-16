import java.util.Scanner;
abstract class Shape
{
Scanner s=new Scanner(System.in);
int l,b;
double area;
void print(){System.out.println("print");}
void get()
{System.out.println("Enter the length");
l=s.nextInt();
System.out.println("Enter the breadth");
b=s.nextInt();
}
abstract void area_calc();
}	
class Circle extends Shape
{
int r;
void get()
{System.out.println("Enter the Radius");
r=s.nextInt();
}
void area_calc() {area=3.14*r*r;}
void print(){System.out.println("area of circle"+area);
}
}
class Rectangle extends Shape
{
void area_calc()
{area=l*b;}
void print()
{
System.out.println("Area of Rectangle"+area);
}
}
class Triangle extends Shape
{
void area_calc()
{area=0.5*l*b;}
void print()
{
System.out.println("Area od Triangle"+area);
}
}
class Inher
{
public static void main(String args[])
{
Shape ref;
Circle ob1=new Circle();
Rectangle ob2=new Rectangle();
Triangle ob3=new Triangle();
ob1.get();
ref=ob1;
ref.area_calc();
ref.print();
ob2.get();
ref=ob2;
ref.area_calc();
ref.print();
ob3.get();
ref=ob3;
ref.area_calc();
ref.print();
}
}


