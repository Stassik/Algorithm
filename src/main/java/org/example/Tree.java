package org.example;

public class Tree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void add(int value) {
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (current.value > value) {
            current.left = appendNode(current.left, value);
        } else if (current.value < value) {
            current.right = appendNode(current.right, value);
        }
        return current;
    }
    // 1. Реализовать поиск максимального элемента в дереве. Метод назвать findLast

    public int findLast() {
        Node last = find(root);
        return last.value;
    }

    private Node find (Node current) {
        if (current.right != null) {
            return find(current.right);
        } else {
            return current;
        }
    }

    // 2. Реализовать подсчет листьев. Листья - это такие узлы дерева, у которых нет дочерних элементов. Метод назвать getChildrenCount



    public int getChildrenCount() {
        int count = getCount(root);
        return count;
    }
    private int getCount(Node current) {
        if (current == null) {
            return 0;
        }
        if (current.left == null && current.right == null) {
            return 1;
        } else {
            return getCount(current.left) + getCount(current.right);
        }
    }



    // 3. *Реализовать проверку, является ли дерево сбалансированным. Метод назвать isBalanced() и он должен возвращать true\false
    // Дерево назвается сбалансированным, если высота левого и правого поддерева отличается не больше, чем на 1
    // Для каждого корня проверить сбалансированность левого и правого подеревьев
    // isBalanced() {
    //   return isBalanced(root.left) && isBalanced(root.right)
    //   && Math.abs(height(root.left) - height(root.right)) <= 1
    // }
    // private int height(Node current) {
    //      // вот это нужно реализовать
    // }

    //             8
    //      6             10
    //  3
    //1


}
