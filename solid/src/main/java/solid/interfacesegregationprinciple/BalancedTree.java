package solid.interfacesegregationprinciple;

public class BalancedTree implements RotationTree{
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

    @Override
    public void leftRotation() {
        System.out.println("Left rotation operation");
    }

    @Override
    public void rightRotation() {
        System.out.println("Right rotation operation");
    }
}
