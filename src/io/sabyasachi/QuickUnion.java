package io.sabyasachi;

public class QuickUnion {
    private int[] arr;
    public QuickUnion(int nodes){
        arr = new int[nodes];
        for(int j = 0;j<nodes;j++){
            arr[j] = j;
        }
    }
    public int[] union(int src,int dest){
        int source = root(src);
        arr[source] = dest;
        return arr;
    }
    private int root(int node){
        int nodeRoot = arr[node];
        while(nodeRoot!=arr[nodeRoot]){
            nodeRoot = arr[nodeRoot];
        }
        return nodeRoot;
    }
    public boolean isConnected(int src, int dest){
        return root(src)==root(dest);
    }

}
