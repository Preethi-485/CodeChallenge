import java.util.* ;
import java.io.*; 
public class RockPaperScissor{
    public static void main(String[] args) {
        int k=10;
        String n="PPRSSPRSS";
        String z="PPRRPPP";
        int arr[]=rockPaperScissor(k, n, z);
        for(int val:arr)
        System.out.printf("%d ",val);

    }
	public static char check(char ch,char st){
		if((ch=='R'&& st=='S')||(ch=='S'&& st=='R'))
		return 'R';
		else if((ch=='S'&& st=='P')||(ch=='P'&& st=='S'))
		return 'S';
		else if((ch=='P'&& st=='R')||(ch=='R'&& st=='P'))
		return 'P';
		return 'E';
	}
	public static int[] rockPaperScissor(int k, String n, String z) {

		// Write your code here.
		int f=0;
		int s=0;
		int val=0;
		int left1=0;
		int left2=0;
		//System.out.println("start");
		while(val<k){
            

			if(left1==n.length()){
			left1=0;
			//System.out.println("l1 : "+left1);
			
			}
			else if(left2==z.length()){
			left2=0;//System.out.println("l2 : "+left2);
			}
			else{
				char ch=check(n.charAt(left1),z.charAt(left2));
              //  System.out.println(ch);
				if(ch==n.charAt(left1))
				f++;
				else if(ch==z.charAt(left2))
				s++;
                           //     System.out.println("f : "+f+" s : "+s);

			left1++;
			left2++;
            			val++;

			//("l1 : "+left1);
			}
			

			
			
			
                        		



		}
	//	System.out.println("end");
		int ar[]=new int[2];
		ar[0]=f;
	ar[1]=s;
		//System.out.println(n1+" "+z1);
		return ar;

	}
}