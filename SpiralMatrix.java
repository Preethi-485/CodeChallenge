import java.util.*;
public class SpiralMatrix {
    public static void spiral(int mat[][],int r,int c, int lefti,int leftj,int righti,int rightj,int topi,int topj,int bottomi,int bottomj,int lasti,int lastj){
        if(r==1 && c==1)
        return;
        //System.out.printf("r: %d c: %d left : %d%d right: %d%d top: %d%d bottom: %d%d\n\n",r,c,lefti,leftj,righti,rightj,topi,topj,bottomi,bottomj);
       // int val;
        int v1=0;
        int v=0;
        
        //for(int i=0;i<r;i++){
            for(int j=lefti;j<=rightj;j++){
                System.out.printf("%d ",mat[lefti][j]);
                
            }
            System.out.printf("\n");

                int j=rightj;
                int i=righti;
               // if(i==righti && j==rightj){
                    for(int i1=i+1;i1<=bottomi;i1++){
                        System.out.printf("%d ",mat[i1][j]);
                        v=i1;
                    }
                    System.out.printf("\n");

                    if(v==bottomi && j==bottomj){
                        //System.out.printf("\n");
                        for(int i2=bottomj-1;i2>=0;i2--)
                        {
                            System.out.printf("%d ",mat[v][i2]);
                            v1=i2;
                        }
                        System.out.printf("\n");
                    }
                    int v3;

                    if(v1==lastj && v==lasti ){
                        for(int i4=lasti+1;i4>=topi;i4--){
                            System.out.printf("%d ",mat[i4][v1]);
                            v3=i4;
                        }
                    }
                    //if(v3==topj && v==){
                       /*  for(int i3=v-1;i3>topi-1;i3--){
                           
                            System.out.printf("%d ",mat[i3][v1]);
                            v3=i3;
                        }*/
                       // System.out.printf("%d ",mat[topi][topj]);
                    
                   // if(){
                       
                    
                        System.out.printf("\n\n");
                        double r1=Math.ceil((double)r/2);
                        double c1=Math.ceil((double)c/2);
                       // System.out.println(r1);
                       //System.out.println(c1);
                       System.out.printf("\n");
                        spiral(mat,(int)r1,(int)c1,lefti+1,leftj+1,righti+1,rightj-1,topi+1,topj+1,bottomi-1,bottomj-1,lasti+1,lastj+1);
                    
                    
                    //break;


                }
            
            
           // }
         //   }
        
                //break;


                
            //}
         //   System.out.printf("\n");

//            break;
  //      }
        

    
    public static void main(String[] args){
        int r=5;
        int c=6;
        int mat[][]={{00,01,02,03,04,05},{10,11,12,13,14,15},{20,21,22,23,24,25},{30,31,32,33,34,35},{40,41,42,43,44,45}};
        spiral(mat,r,c,0,0,0,c-1,1,0,r-1,c-1,r-1,0);


       /* int lefti=0;
        int leftj=0;
        int righti=0;
        int rightj=c-1;
        int topi=1;
        int topj=0;
        int bottomi=r-1;
        int bottomj=c-1;*/
    }
}