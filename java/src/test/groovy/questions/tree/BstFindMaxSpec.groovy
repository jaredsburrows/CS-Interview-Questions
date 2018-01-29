package questions.tree

import api.TreeNode
import questions.BstFindMax
import test.BaseSpec

final class BstFindMaxSpec extends BaseSpec {
    def tree = new TreeNode<>(8)

    //                (8)
    //               /   \
    //            (2)     (21)
    //           /   \     /
    //         (1)   (5) (13)
    //               /
    //             (3)
    def "setup"() {
        tree.right = new TreeNode<>(21)
        tree.right.left = new TreeNode<>(13)

        tree.left = new TreeNode<>(2)
        tree.left.left = new TreeNode<>(1)
        tree.left.right = new TreeNode<>(5)
        tree.left.right.left = new TreeNode<>(3)
    }

    def "findMaxValue"() {
        expect:
        BstFindMax.findMaxValue(tree) == 21
    }
}
