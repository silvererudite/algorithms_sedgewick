package dynamic_connectivity;

import java.util.Arrays;

public class UnionFind {
    private int[] connectedComponentsId;
    UnionFind(int[]  connectedComponentsId){
        this.connectedComponentsId = connectedComponentsId;
    }

    protected int[] getConnectedComponentsId() {
        return this.connectedComponentsId;
    }
    protected void updateComponent(int component, int elem){
        this.connectedComponentsId[elem] = component;
    }

    public void union(int firstElem, int secondElem){}
    public boolean isConnected(int firstElem, int secondElem){
        return this.connectedComponentsId[firstElem] == this.connectedComponentsId[secondElem];
    }

    public int numComponents(){
        return 0;
    }
    public int findComponent(int elem){
        return this.connectedComponentsId[elem];
    }

    public void printComponents(){
        System.out.println(Arrays.toString(this.connectedComponentsId));
    }
}
