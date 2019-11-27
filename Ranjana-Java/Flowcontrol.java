class Flowcontrol
{
 public static void main(String[] args)
 {
  int age=23;
  if(age>=18)
  {
   System.out.println("eligible to vote");
  }
  else
  {
   System.out.println("not eligible");
  }
  int marks=90;
  if(marks>=70)
  {
    System.out.println("FCD");
  }
  else if(marks>=60)
  {
   System.out.println("FC");
  }
  else if(marks>=35)
  {
   System.out.println("Pass");
  }
  else if(marks<=35)
  {
   System.out.println("Fail");
  }
}
}
