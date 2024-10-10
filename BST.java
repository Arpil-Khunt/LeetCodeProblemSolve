public class BST {
    public BST(){

    }
     class Node {
        private int value;
        Node left;
        Node right;
        int height;

       public Node(int  value){
           this.value = value;
       }

       public int getValue(){
           return this.value;
       }

    }

    private Node root;

    //height
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    //check is tree isEmpty
    public boolean isEmpty(){
        return root == null;
    }


    //create a BST ...... insert value in BST
    public void insert(int value){
//        root = new Node(value);
//        insert(value,root);

        root = insert(this.root,value);
    }

    //insert multiple item
    public void populate(int[] val){
        for(int i = 0; i < val.length; i++){
            this.insert(val[i]);
        }
    }
    //populate for sorted array
    public void populateSorted(int[] val){
        populateSorted(val,0,val.length-1);
    }
    private void populateSorted(int[] val, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(val[mid]);
        populateSorted(val,start,mid);
        populateSorted(val,mid+1,end);
    }
    private void insert(int value, Node node){
        if(value < node.getValue()){
            if(node.left != null){
                insert(value,node.left);
            }else{
                node.left = new Node(value);
            }
        }else{
            if(node.right != null){
                insert(value,node.right);
            }else{
                node.right = new Node(value);
            }
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
    }

    //second method to insert an element
    private Node insert (Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(node.left,value);
        }
        if(value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    //check if the tree is  balanced or not
    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    //display
    public void display(){
        display(this.root,"Root node: ");
    }
    private void display(Node node , String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        //print left child
        display(node.left,"Left child of "+node.getValue()+" : ");

        //print right child
        display(node.right,"Right child of "+node.getValue()+" : ");
    }

    //pretty display
    public void prettyDisplay(){
        if(root != null) prettyDisplay(this.root,0);
    }
    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level != 0){
            for(int i = 0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    //traversal of tree

    //preOrder traversal
    public void preOrder(){
       if(root != null) preOrder(root);
       else System.out.println("tree is empty!");
        System.out.println();
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    //inOrder traversal
    public void inOrder(){
        if(root != null) inOrder(root);
        else System.out.println("tree is empty!");
        System.out.println();
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    //postOrder traversal
    public void postOrder(){
        if(root != null) postOrder(root);
        else System.out.println("tree is empty!");
        System.out.println();
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

}
