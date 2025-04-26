package solid.interfacesegregationprinciple;

public interface Tree {
    //let's create "fat interfaces"
    //Design smell
    void insert();
    void delete();
    void traverse();
    // methods related to balanced tree
   //void leftRotation();
   //void rightRotation();
}
