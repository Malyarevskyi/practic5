package practic.practic5;

public class Dzpractic5_3_TreeSearch {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public boolean exist(TreeNode root, int target) {
        TreeNode current = root;
        while (current != null) {
            if (target == current.getValue()) return true;
            if (target > current.getValue()) current = current.getRight();
            else current = current.getLeft();
        }
        return false;
    }

    public void buildTree(int[] array) {
        root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            TreeNode currentNode = root;
            boolean positionFound = false;
            while (!positionFound) {
                if (array[i] > currentNode.getValue()) {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(new TreeNode(array[i]));
                        positionFound = true;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                } else {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(new TreeNode(array[i]));
                        positionFound = true;
                    } else {
                        currentNode = currentNode.getLeft();
                    }

                }
            }
        }
    }

    public class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }


    public static void main(String[] args) {

        Dzpractic5_3_TreeSearch tree = new Dzpractic5_3_TreeSearch();

        int[] array = {12, 45, 23, 47, 8, 19, 33};
        tree.buildTree(array);
        boolean result = tree.exist(tree.getRoot(), 33);
        boolean result2 = tree.exist(tree.getRoot(), 32);
        System.out.println(result);
        System.out.println(result2);
    }
}
