package day_07.sort;

class Selection{
    int swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a[i];
    }
    
    public int[] sort(int[] a){
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length;j++){
                if(a[i] > a[j]){
                    swap(a,i,j);
                }
            }
        }
        return a;
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Selection s = new Selection();
        int[] arr = {5,4,2,1,9,7,3};
        s.sort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
