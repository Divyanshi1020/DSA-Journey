import java.util.Scanner;
public class forloop {
    public static void main (String[] args){
            //for (int n=0;n<11;n++){
                //System.out.print(n+" ");
          
        
    //Print the sum of first n Natural numbers , n=5
       // int sum=0;
        //for ( int i=1;i<=5;i++){
         //   sum = sum+i;
        //}
        //System.out.println(sum);

// using scanner class


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
            for (int i=0;i<=n;i++){
                sum = sum + i;
}
            System.out.println(sum);*/

//print the table of the number enter by the user


Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum =0;
    for (int i=1;i<=10;i++){
        System.out.print(n*i+" ");
}
      
}
}