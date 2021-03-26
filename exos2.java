///Saisir une année et un mois 
///puis determiner le nombre de jour de ce mois  dans l'année
///   1- pas de classe de java 
///   2- Faire avec les classes Java 
import java.util.Scanner;
public class exos2{
    public static void main(String[] args){;
    Scanner sc=new Scanner(System.in);
    int jours;
    int i;
    int j=31;
    int y=30;
    int x=28;
    System.out.print("veuillez saisir annee : ");
    int annee=sc.nextInt();
    System.out.println("l annee est : \t"+annee);
    System.out.println("veuillez saisir le mois : ");
    String mois=sc.next();
    String mois2=mois;
    System.out.println("le mois est : "+mois);
    switch (mois) {
        case "Janvier" :
            System.out.println("THIS MONTH EQUAL TO: "+j+"days"); 
        break;
        case "Mars" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Mai" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Juillet" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Aout" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Octobre" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Decembre" :
            System.out.println("THIS MONTH EQUAL TO: "+j"days"); 
        break;
        case "Fevrier" :
            System.out.println("THIS MONTH EQUAL TO: "+x"days"); 
        break;
        default:System.out.println("THIS MONTH EQUAL TO "+y"days");
}
}
}




