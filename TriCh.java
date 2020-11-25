public class TriCh
{ public static void main (String args[])
{ String tabCh []= {"java", "c", "pascal", "c++", "ada","basic", "fortran" } ;
String temp ; // pour l’Échange de deux references
int i, j ;
int nbCh1 =tabCh.length ;
for (i =0 ; i<nbCh1 ; i++){
for (j =i ; j<nbCh1 ; j++){
if ( (tabCh[i].compareTo(tabCh[j])) > 0)
{ temp =tabCh [i] ;
tabCh [i]= tabCh [j] ;
tabCh [j] =temp ;
}
System.out.println ("chaines triees : ");
for (i =0 ; i<nbCh1 ; i++){ System.out.println (tabCh[i]) ;
}
}}}}