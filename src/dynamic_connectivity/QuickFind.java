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
        for (int i = 0; i < super.getConnectedComponentsId().length; i++) {
            if (super.getConnectedComponentsId()[i] == firstComponent) {
                super.updateComponent(secondComponent, i);
            }
        }
    }
}
