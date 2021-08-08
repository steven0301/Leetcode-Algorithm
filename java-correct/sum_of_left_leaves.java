/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int answer = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode == null) continue;
            if(tempNode.left != null && tempNode.left.left == null && tempNode.left.right == null)
                answer += tempNode.left.val;
            queue.offer(tempNode.left);
            queue.offer(tempNode.right);
        }
        return answer;
    }
}