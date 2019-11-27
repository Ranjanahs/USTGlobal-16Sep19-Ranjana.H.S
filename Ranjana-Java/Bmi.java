class Bmi
{
 public static void main(String[] args)
 {
  double weight=30;
  double height=2.7;
  double bmi=weight/(height*height);
  System.out.println("bmi="+bmi);
  
  if(bmi>=18.5 || bmi<=24.9)
  {
   System.out.println("u r healthy");
  }
  else if(bmi>=25 && bmi<=29.9)
  {
   System.out.println("u r overweight");
  }
  else if(bmi>=30 && bmi<=39.9)
  {
   System.out.println("u r obese");
  }
  else if(bmi<18.5)
  {
   System.out.println("u r underweight");
  }
  if(10>20)
  {
   System.out.println("Hi");
   System.out.println("Hello");
  }
}
}