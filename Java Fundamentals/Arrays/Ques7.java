/*
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

public class Ques7{
    public static void printArray(int []arr){
        if(arr[0]!=-1)
            System.out.print(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=-1)
                System.out.print(", "+arr[i]);
        }
    }
    public static void main(String[] args){
        int []arr={13, 25, 8, 21, 8, 25, 14, 13, 13, 55};
        System.out.println("Initial Array:\n13, 25, 8, 21, 8, 25, 14, 13, 13, 55\n");
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=-1){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        arr[j]=-1;
                        break;
                    }
                }
            }
        }
        System.out.println("Final Array:");
        printArray(arr);
    }
}