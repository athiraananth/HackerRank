package practiceProblems1;



public class LowestCommonAncestor {
	
	public static BinarySearchTreeNode findLCA(BinarySearchTreeNode n1,BinarySearchTreeNode n2,BinarySearchTreeNode root) {
		
		BinarySearchTreeNode lca = null;
		if(root==null||n1.key== root.key || n2.key ==root.key) {
			throw new IllegalArgumentException("Invalid input Node !!");
		}
		else {
			if(n1.key < root.key && n2.key<root.key) {
				lca=findLCA(n1,n2,root.left);
			}
			else if(n1.key > root.key && n2.key>root.key) {
				lca=findLCA(n1,n2,root.right);
			}
			else if(n1.key<root.key && n2.key>root.key) {
				lca=root;
			}
		}
		return lca;
	}

}
