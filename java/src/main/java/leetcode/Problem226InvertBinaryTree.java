package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree
 */
public final class Problem226InvertBinaryTree {
    // iterative
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        return root;
    }

    // recursion
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        invert2(root);

        return root;
    }

    private void invert2(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invert2(root.left);
        invert2(root.right);
    }
}
