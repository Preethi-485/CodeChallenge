import java.util.*;
public class Pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.printf(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
}
