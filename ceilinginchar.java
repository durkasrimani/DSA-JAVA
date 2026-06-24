import java.util.*;
public class ceilinginchar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);
        char ans=ceil(arr,target);
        System.out.print(ans);
    }
    public static char ceil(char arr[],char target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start%arr.length];
    }
}