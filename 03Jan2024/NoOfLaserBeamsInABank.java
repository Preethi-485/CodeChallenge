import java.util.*;
class NoOfLaserBeamsInABank{
        public int numberOfBeams(String[] bank) {
            int n=bank[0].length();
            int m=bank.length;
            int val=0;
    
            int arr[]=new int[m];
            for(int i=0;i<m;i++){
                int c=0;
                for(int j=0;j<n;j++){
                  if(bank[i].charAt(j)=='1')
                    c++;
                }
                if(c!=0)
                arr[val++]=c;
               }
         int c=0;
            for(int i=0;i<m-1;i++){
                if(arr[i]!=0){
                    if(arr[i+1]!=0){
                        c=c+(arr[i]*arr[i+1]);
                    }
                    else
                    continue;
                }
                else
                continue;
    
                }
    
            
    
    
    
                    return c;
            
        }
    }
