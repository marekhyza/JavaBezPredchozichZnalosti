package KapitolaCtyri;

    public class KlauzuleElseIfiElse {
       public static void main(String[] args) {
           int b = 80, c = 90;
           if (b > 0)
              if (b==c)
                  System.out.println("b a c se rovnají");
           else
               System.out.println("b a c se nerovnají");
       else
           System.out.println("b je menší, nebo rovno 0");
           }
        }