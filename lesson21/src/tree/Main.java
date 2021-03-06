package tree;

public class Main {

    public static void main(String[] args) {
	    BinaryTree<Integer> tree = new BinaryTree<>(Integer::compare);

        tree.add(52);

        tree.add(67);
        tree.add(64);
        tree.add(58);

        tree.add(29); //left
        tree.add(1);   //left
        tree.add(1);//left
        tree.add(1);//none

        tree.add(14); //left
        tree.add(37); //right

        tree.print();
    }
}
