/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  List<Integer> list;
  public List<Integer> preOrder(TreeNode root) {
    // Write your solution here
    list = new ArrayList<>();
    preOrderHelper(root);
    
    return list;
  }
  
  private void preOrderHelper(TreeNode root) {
    if (root == null) {
      return;
    } 
    
    list.add(root.key);
    preOrderHelper(root.left);
    preOrderHelper(root.right);
  }
}

