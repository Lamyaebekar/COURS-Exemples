package cours.applications;

// Calcul de racines carrees
// La classe Racines utilise la classe Clavier
public class Racines

{ public static void main (String[] args){
    java.util.Scanner Racines =   new java.util.Scanner(System.in);
{ final int NFOIS =5 ;
int i ;
double x ;
double racx ;
System.out.println ("Bonjour") ;
System.out.println ("Je vais vous calculer " + NFOIS + " racines carrees ") ;
for (i =0 ; i<NFOIS ; i++)
{ System.out.print ("Donnez un nombre : ") ;

 x =Racines.nextDouble();
 

if (x < 0.0)
System.out.println (x + " ne possede pas de racine carree") ;
else
{ racx =Math.sqrt(x) ;
System.out.println (x + " a pour racine carree : " + racx) ;
}
}
System.out.println ("Travail termine Au revoir") ;
}
}}

