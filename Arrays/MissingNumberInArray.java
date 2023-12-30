import java.util.4ppoo;
class MissingNumberInArray{
    public static int miss(int nums[],int n){
        HashSet<Integer> h =new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!h.contains(i))
            return i;
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums[]={3,0,1};
        System.out.println(miss(nums,nums.length));
    }
}