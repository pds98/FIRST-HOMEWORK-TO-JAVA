/*
  Saisir une date puis determiner la date suivante puis la date precedente 

    1- pas de classe de java 

    2- Faire avec les classes Java

*/
import java.util.Scanner;
public class exos4{
    public static void main(String[]args){;
        Scanner sc=new Scanner(System.in);
        int add;
        int decrease;
        System.out.println("Please to input the date  ");
        System.out.print("INPUT THIS DAYS : ");
        int jours=sc.nextInt();
        System.out.print("INPUT THIS MONTH : ");
        int mois=sc.nextInt();
        System.out.print("INPUT THIS YEARS : ");
        int annee=sc.nextInt();
        if ((jours>31 || jours<1) || (mois>12 || mois<1) || (annee<1000 || annee>10000)){;
        System.out.println("THIS INPUT IS INCORRECT");
    }
    else{
        System.out.println("THE DATE ENTERED IS : " +jours+":"+mois+":"+annee);
        add =jours+1;
        System.out.println("THE NEXT DATE IS : "+add+":"+mois+":"+annee);
        decrease =jours-1;
        System.out.println("THE PREVIOUS DATE IS : "+decrease+":"+mois+":"+annee);
    }

        
        
        
    
}
}
