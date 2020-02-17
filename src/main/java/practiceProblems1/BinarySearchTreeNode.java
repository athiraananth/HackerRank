package practiceProblems1;


public class BinarySearchTreeNode {
		
		int key;
		BinarySearchTreeNode right;
		BinarySearchTreeNode left;
		
	
	public BinarySearchTreeNode(int value) {
		this.key=value;
	}
	
	
	public BinarySearchTreeNode insertLeft(int leftValue) {
		left=new BinarySearchTreeNode(leftValue);
		return left;
	}
	
	public BinarySearchTreeNode insertRight(int rightValue) {
		right=new BinarySearchTreeNode(rightValue);
		return right;
	}
	
	public int getKey() {
		return key;
	}
	
	public BinarySearchTreeNode getLeft() {
		return left;
	}
	
	public BinarySearchTreeNode getRight() {
		return right;
	}
}
