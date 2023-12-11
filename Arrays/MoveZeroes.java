import java.util.*;
public class MoveZeroes {

    public static void main(String[] args){
        int nums[]={0,0,1};
        movezero(nums);
    }

    public static void movezero(int nums[]){
       // int i=0;
     /*   int z=0;
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0)
          z++;
          else
          l.add(nums[i]);
      }
      for(int i=0;i<nums.length-z;i++){
          nums[i]=l.get(i);
      }
      for(int i=z;i<nums.length;i++)
      nums[i]=0;*/
      int inc=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
          nums[inc]=nums[i];
          inc++;}
      }
      for(int i=inc;i<nums.length;i++)
      nums[i]=0;
      for(int i=0;i<nums.length;i++){

        System.out.println(nums[i]);
      }

    
}
}
