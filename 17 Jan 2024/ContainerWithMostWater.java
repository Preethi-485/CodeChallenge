import java.util.*;

class ContainerWithMostWater{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int i, j;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j || i+j==n-1)
            System.out.printf("1");
            else
            System.out.printf("0");

        }
       
        
        System.out.println("\n");
    }
    //Write your code here
    

}
}
