/* chapitre 4) 6.3.2) Quelques conséquences*/
package cours.applications;
public class ErrConv
{ public static void main (String args[])
{ int n ;
float x ;
n =1234 ;
x =n ;
System.out.println ("n : " + n + " x : " + x) ;
n =123456789 ;
x =n ;
System.out.println ("n : " + n + " x : " + x) ;
}
}