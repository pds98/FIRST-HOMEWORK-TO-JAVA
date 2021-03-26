import java.util.Scanner;
public class exos1{;
    public static void main(String[]args){;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a years : ");
        int N=sc.nextInt();
        while(N<=0){;
            System.out.print("enter years 2 : ");
            int y=sc.nextInt();
            N=y;
        }
    if ((N%4==0 && N%100!=0 ) || (N%400==0))
    {
        System.out.println("this years " +N+ "bissextile");
    }else{  
        System.out.println("this years " +N+ "is not bissextile");
}
}
}