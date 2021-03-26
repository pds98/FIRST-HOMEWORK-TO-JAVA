/*Saisir une serie de N nombres positif puis determinez la valeur

    1- La valeur min et la valeur max 

    2- les 2 valeurs min et les deux valeurs max

    3- La somme des valeurs premieres

    4- le produit des valeurs parfaites

    5- La valeur min premier et la valeur max parfaite
*/
import java.util.Scanner;
    public class exos5{;
        public static void main(String[]args){;
            Scanner sc=new Scanner(System.in);  
            int max;
            int min;
            int nextmin;
            int nextmax;
            int [] nombre =new int[7];
            System.out.println("saisir");
            for(int n=0 ;n<nombre.length;n++){
                nombre[n] = sc.nextInt();
            }
                min=nombre[0];
                max=nombre[0];
            for (int n=0 ;n<nombre.length;n++) {
                if (nombre[n]<min)
                    min=nombre[n];
                if (nombre[n]>max)
                    max=nombre[n];
                }
                System.out.println("le max est : " +max );
                System.out.println("le min est : " +min);

                nextmax=nombre[0];
                    nextmin=nombre[0];

                for(int n=max ;n<nombre.length;n++){
                    
                    nextmax=n;
                    
                    }
                    System.out.println("le deuxieme max est : "+nextmax);
                    System.out.println("les 2 max sont : "+max+" ,"+nextmax);
                    System.out.println("le deuxieme min est : "+nextmin);
                    System.out.println("les 2 min sont : "+min+" ,"+nextmin);

                
        

        
       


}

}



