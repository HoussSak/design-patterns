package interfacesegregationprinciple;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("Inserting elements in binary tree");
    }

    @Override
    public void delete() {
        System.out.println("Deleting elements in binary tree");
    }

    @Override
    public void traverse() {
        System.out.println("Traversing elements in binary tree");

    }
}
