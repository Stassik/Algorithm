package org.example;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(0);

        System.out.println("У данного дерева " + tree.getChildrenCount() + " детей.");
        System.out.println("У данного дерева максимальный элемент:" + tree.findLast());


    }
}
