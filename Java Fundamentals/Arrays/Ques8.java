/*
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

public class Ques8{
    public static int[] s2(int[] arr, int i){
        int[] temp={-1, 0};
        for(; i<arr.length; i++){
            if(arr[i]!=7){
                temp[1]+=arr[i];
                temp[0]=i;
            }
            else{
                temp[1]=0;
                temp[0]=i;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int s1=0;
        int []arr={10,3,6,1,2,7,9};
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]==6){
                int[] temp=s2(arr, i);
                s1+=temp[1];
                i=temp[0];
            }
            else
                s1+=arr[i];
        }
        System.out.println("\n" + s1);
    }
}