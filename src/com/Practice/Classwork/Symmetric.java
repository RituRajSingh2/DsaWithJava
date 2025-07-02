package com.Practice.Classwork;
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
public class Symmetric {
    static boolean isMirror(Node leftSub, Node rightSub) {
        if (leftSub == null && rightSub == null)
            return true;
        if (leftSub == null || rightSub == null
                || leftSub.data != rightSub.data)
            return false;
        return isMirror(leftSub.left, rightSub.right) &&
                isMirror(leftSub.right, rightSub.left);
    }
    static boolean isSymmetric(Node root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(90);
        root.left=new Node(20);
        root.right=new Node(20);
        root.left.left=new Node(30);
        root.left.right=new Node(40);
        root.right.left=new Node(40);
        root.right.left=new Node(30);
        if (isSymmetric(root)) {
            System.out.println("true");
        }
        else{
                System.out.println("false");
            }
    }
    }

