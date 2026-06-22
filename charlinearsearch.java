import java.util.Scanner;
public class charlinearsearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);
        boolean a=linearsearch(arr,target);
        System.out.print(a);
    }
    public static boolean linearsearch(char arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}