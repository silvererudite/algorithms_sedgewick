package dynamic_connectivity;

public class UnionFIndTester {
    public static void main(String[] args) {
        int[] componentsArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        UnionFind quickFind = new QuickFind(componentsArr);
        System.out.println("=============================");
        quickFind.printComponents();
        System.out.println("=============================");
        System.out.println(quickFind.findComponent(5));
        System.out.println("=============================");
        quickFind.union(0, 5);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(5, 6);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(1, 2);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(2, 7);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(3, 4);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(4, 9);
        System.out.println("After performing union");
        quickFind.printComponents();
        System.out.println("=============================");
        quickFind.union(4, 8);
        System.out.println("After performing union");
        quickFind.printComponents();



    }
}
