/*Saisir une date (jj-mm-aaaa) puis determiner si la date 
  est valide ou pas 
1- pas de classe de java 
2- Faire avec les classes Java
*/
import java.util.Scanner;
public class exos3{
    public static void main(String[] args){;
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT THIS DAYS");
        int jours=sc.nextInt();
        System.out.print("INPUT THIS MONTH");
        int mois=sc.nextInt();
        System.out.print("INPUT THIS YEARS");
        int annee=sc.nextInt();
        if ((jours>31 || jours<1) || (mois>12 || mois<1) || (annee<1000 || annee>10000)){;
        System.out.println("THIS INPUT IS INCORRECT");
    }
        else{ 
            System.out.println("THIS INPUT IS ALLOW '...' ");
            System.out.println((jours)+"-"+(mois)+"-"+(annee));

        }
       


    
}
}