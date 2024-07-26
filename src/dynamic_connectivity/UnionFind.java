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
    public int numComponents() {
        boolean[] uniqueComponents = new boolean[this.connectedComponentsId.length];
        int count = 0;
        for (int id : this.connectedComponentsId) {
            if (!uniqueComponents[id]) {
                uniqueComponents[id] = true;
                count++;
            }
        }
        return count;
    }
    public int findComponent(int elem){
        return this.connectedComponentsId[elem];
    }

    public void printComponents(){
        System.out.println(Arrays.toString(this.connectedComponentsId));
    }
}
