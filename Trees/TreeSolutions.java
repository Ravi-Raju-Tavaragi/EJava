package Trees;

public class TreeSolutions
{
    public static void main(String[] args) 
    {
        TreeNode root = createABinaryTree();

        System.out.println("Pre order travasal tree printing");
        preOrderPrintTree(root);

        System.out.println("\npost order travasal tree printing");
        postOrderPrintTree(root);

        System.out.println("\nin order travasal tree printing");
        inOrderPrintTree(root);
        
    }

    public static TreeNode createABinaryTree()
    {
        TreeNode root = new TreeNode(10);

       /* TreeNode leftChild = new TreeNode(20);
        TreeNode rightChild = new TreeNode(30);    

        root.left = leftChild;
        root.right = rightChild;*/

        //children of root 1st generation first level
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        //second generation  2nd level
        //children of first left child of root
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(60);

        //children of right right child of root
        root.right.left = new TreeNode(90);
        root.right.right = new TreeNode(100);

        return root;
    }

    public static void postOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return ;

        //recurcive call
        postOrderPrintTree(root.left);
        postOrderPrintTree(root.right);
        System.out.print(root.data+" ");
        
    }

    public static void inOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return ;
        
        //recurcive call
        inOrderPrintTree(root.left);
        System.out.print(root.data+" ");
        inOrderPrintTree(root.right);
    }
    
    
    public static void preOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return ;

        System.out.print(root.data+" ");
        
        //recurcive call
        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);

        /*System.out.println(root.data);

        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);

        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);*/
    }
}
