package day_07;

class BinarySearch{
    public int search(int[] arr,int start,int end,int find){
        int mid;
        while(start <= end){
            mid = (start + end)/2;
            
            if(arr[mid] == find){
                return 1;
            }
            
            if(arr[mid]< find){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return 0;
    }
}

public class BinarySearchDemo{
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int start =0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        if(b.search(arr, start, arr.length-1, 11) == 1){
            System.out.println("Search found");
        }
        else{
            System.out.println("Search not found");
        }       
    }
}