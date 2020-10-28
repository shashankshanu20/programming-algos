package personal.programming.algos.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class CommutableIslands {
//    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
//        boolean []visited = new boolean[A+1];
//        int []totCost = new int[A+1];
//        Arrays.fill(totCost,Integer.MAX_VALUE);
//        totCost[1] = 0;
//        visited[1] = Boolean.TRUE;
//        for(int i= 1;i<=A;i++){
//            for(int j = 0; j<B.size(); j++){
//                int source = B.get(j).get(0);
//                int destination = B.get(j).get(1);
//                int cost = B.get(j).get(2);
//                if(source==i){
//                    if(!visited[destination]&&cost<totCost[destination]+cost){
//                        totCost[destination] = cost;
//                    }
//                }
//            }
//        }
//    }

    class Pair{
        int x;
        int y;
        int cost;
        Pair(int x,int y,int cost){
            this.x=x;
            this.y=y;
            this.cost=cost;
        }
    }
    void union(int x,int y,int[]idx){
        int p = root(x,idx);
        int q= root(y,idx);
        idx[p]=idx[q];
    }
    int root(int x,int[]id){
        while(id[x]!=x){
            x=id[x];
        }
        return x;
    }
    public int solve(int n, ArrayList<ArrayList<Integer>> nEW) {
        int []idx = new int[n+1];
        for(int i=1;i<=n;i++)
            idx[i]=i;
        PriorityQueue<Pair> pq = new PriorityQueue<>((
                (a,b) -> a.cost-b.cost
        ));
        for(ArrayList<Integer> arrList : nEW){
            pq.offer(new Pair(arrList.get(0),arrList.get(1),arrList.get(2)));
        }
        int miniCost = 0;
        while(!pq.isEmpty()){
            Pair pr = pq.poll();
            int x = pr.x;
            int y=pr.y;
            int cost=pr.cost;
            if(root(x,idx)!=root(y,idx)){
                miniCost+=cost;
                union(x,y,idx);
            }
        }
        return miniCost;
    }
}
