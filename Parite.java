
package cours.applications;

public class Parite
         
{ public static void main (String args[])
{ java.util.Scanner clavier =   new java.util.Scanner(System.in);
    int n ;
 
System.out.println ("donnez un entier : ") ;

 n=clavier.nextInt();
if ((n & 1)==1){
System.out.println (n+ " est impair") ;}
else{
System.out.println (n+ "il est pair") ;
}
}


}