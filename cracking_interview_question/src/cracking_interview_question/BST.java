package cracking_interview_question;

public class BST<K extends Comparable<K>> {
    // *** fields ***
    public BSTnode<K> root; // ptr to the root of the BST
 
    // *** constructor ***
    public BST() { root = null; } 
    
    // *** methods ***  
    public void insert(K key) {
        root = insert(root, key);
    }
     
    private BSTnode<K> insert(BSTnode<K> n, K key) {
        if (n == null) {
            return new BSTnode<K>(key, null, null);
        }
        
        if (key.compareTo(n.getKey()) < 0) {
            // add key to the left subtree
            n.setLeft( insert(n.getLeft(), key) );
            return n;
        }
        
        else {
            // add key to the right subtree
            n.setRight( insert(n.getRight(), key) );
            return n;
        }
    }
      
    public void delete(K key) {
        root = delete(root, key);
    }
     
    private BSTnode<K> delete(BSTnode<K> n, K key) {
        if (n == null) {
            return null;
        }
        
        if (key.equals(n.getKey())) {
            // n is the node to be removed
            if (n.getLeft() == null && n.getRight() == null) {
                return null;
            }
            if (n.getLeft() == null) {
                return n.getRight();
            }
            if (n.getRight() == null) {
                return n.getLeft();
            }
           
            // if we get here, then n has 2 children
            K smallVal = smallest(n.getRight());
            n.setKey(smallVal);
            n.setRight( delete(n.getRight(), smallVal) );
            return n; 
        }
        
        else if (key.compareTo(n.getKey()) < 0) {
            n.setLeft( delete(n.getLeft(), key) );
            return n;
        }
        
        else {
            n.setRight( delete(n.getRight(), key) );
            return n;
        }
    }
    
    private K smallest(BSTnode<K> n)
	 {
	     if (n.getLeft() == null) {
	         return n.getKey();
	     } else {
	         return smallest(n.getLeft());
	     }
	 }
}