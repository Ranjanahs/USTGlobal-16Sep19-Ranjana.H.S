class Met
{
 static double circle(int r)
 {
  double ans=3.14*(r*r);
  return ans;
 }
 static double circum(double r)
 {
  double c=2*3.14*r;
  return c;
 }
static boolean oddEven(int n)
{
 if(n%2==0)
 {
  return true;
 }else{
 return false;
 }
}

static int factorial(int n)
 {
  int fact=1;
  for(int i=1;i<=n;i++)
  {
   fact=fact*i;
  }
  return fact;
}
 public static void main(String[] args)
 {
   double d=circle(10);
   System.out.println(d);
   
  double ans=circum(10);
  System.out.println(ans);
  
   boolean quo=oddEven(27);
   System.out.println(quo);

  boolean qu=oddEven(28);
   System.out.println(qu);

  int res=factorial(4);
 System.out.println(res);
 }
} 