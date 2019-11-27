class TestA
{
 public static void main(String[] args)
 {
  int a=10;
  int b=20;
  int c=a++ +b;
  int d=++a +b;
  int e=--a +b;
  int f=a-- +b;
  System.out.println("c is "+c);
  System.out.println("d is "+d);
  System.out.println("e is "+e);
  System.out.println("f is "+f);
 }
}