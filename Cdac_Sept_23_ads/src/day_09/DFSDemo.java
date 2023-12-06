package day_09;
import java.util.LinkedList;

import java.util.Stack;


public class DFSDemo
{
    int  v=5;
    
    public void dfs(int arr[][],int source){
        Stack<Integer> q=new Stack<>();
        boolean isVisited[]=new boolean[v];
        
        q.add(source);
        isVisited[source]=true;
        
        while(!q.isEmpty()){
            int node=q.pop();
            System.out.println("visited node :"+node);
            
            for(int index=0;index<v;index++){
                if((arr[node][index]==1) && (isVisited[index]==false)){
                    q.push(index);
                    isVisited[index]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={
            {0,1,1,1,0},
            {1,0,0,1,1},
            {1,0,0,1,0},
            {1,1,1,0,1},
            {0,1,0,1,0}
        };
        
        DFSDemo g=new DFSDemo();
        g.dfs(arr, 0);
    }
    
}