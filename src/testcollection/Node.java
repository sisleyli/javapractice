package testcollection;

public class Node {
    public Node right;
    public Node left;
    public int val;

    public Node(int val) {
        this.val = val;
        right = null;
        left = null;
    }

    public void add(int val){
        if(this.val == -1) this.val = val;
        else {
            if(this.val <= val){
                if(right == null){
                    right = new Node(val);
                }
                else right.add(val);
            }
            else {
                if(left == null){
                    left = new Node(val);
                }
                else left.add(val);
            }
        }
    }
    public void printNodeIn(){
        if(this.val == -1){
            System.out.println("二叉树为空");
        }
        else {
            if(left != null)
                left.printNodeIn();
            System.out.printf("%d ",this.val);
            if(right != null)
                right.printNodeIn();
        }
    }
    public static void main(String[] args){
        Node head = new Node(-1);
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        for (int number : randoms) {
            head.add(number);
        }
        head.printNodeIn();
    }
}
