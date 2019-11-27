class TestH
{
 public static void main(String[] args)
 {
  char grade='A';
  switch(grade)
  {
   case 'A':System.out.println("FCD");
            break;
   case 'B':System.out.println("FC");
            break;
    case 'C':System.out.println("SC");
            break;
     case 'D':System.out.println("jst pass");
            break;
     case 'E':System.out.println("fail");
            break;
     default:System.out.println("invalid");
   }
 System.out.println("----------------------------IfElse--------------------");
 if(grade=='A')System.out.println("FCD");
 else if(grade=='B')System.out.println("FC");
 else if(grade=='C')System.out.println("SC");
 else if(grade=='D')System.out.println("jst pass");
 else if(grade=='E')System.out.println("fail");
 else System.out.println("FCD");
}
}