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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
 
        if(root==null){
            return result;
        }
 
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        LinkedList<Integer> levelQueue = new LinkedList<>();
 
        nodeQueue.offer(root);
        levelQueue.offer(1);//start from 1
 
        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            int level = levelQueue.poll();

            List<Integer> l=null;
            if(result.size()<level){
                l = new ArrayList<>();
                result.add(l);
            }else{
                l = result.get(level-1);
            }

            l.add(node.val);

            if(node.left!=null){
                nodeQueue.offer(node.left);
                levelQueue.offer(level+1);
            }

            if(node.right!=null){
                nodeQueue.offer(node.right);
                levelQueue.offer(level+1);
            }
        }
        List<List<Integer>> result1 = new ArrayList<>();
        for(int i=result.size()-1;i>=0;i--)
        {
            result1.add(result.get(i));
        }
    return result1;
    }
}