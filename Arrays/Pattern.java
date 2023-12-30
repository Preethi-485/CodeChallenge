import java.util.*;
public class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=r*2;
        for(int i=0;i<r*r;i=i+7){
            for(int k=0;k<i;k++){
                System.out.printf("* ");
            }
            for(int j=1;j<=r;j++)
            System.out.printf("%d ",j);
            System.out.printf("\n");
        }
        //for(int i=)
    }
}