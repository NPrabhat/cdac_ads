package day_07.sort;


class Bubble{
    
    int[] swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    
    public int[] sort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] a = {5,7,3,8,9,1,2,6,4,0};
        b.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
