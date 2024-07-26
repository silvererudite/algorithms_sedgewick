package dynamic_connectivity;

public class QuickFind extends UnionFind{

    QuickFind(int[] connectedComponentsId) {
        super(connectedComponentsId);
    }

    @Override
    public void union(int firstElem, int secondElem) {
       if(super.isConnected(firstElem, secondElem)){
           return;
       }
       int firstComponent = super.getConnectedComponentsId()[firstElem];
       int secondComponent = super.getConnectedComponentsId()[secondElem];
       int requiredComponentId = Math.min(firstComponent, secondComponent);

       super.updateComponent(requiredComponentId, secondElem);



    }
}
