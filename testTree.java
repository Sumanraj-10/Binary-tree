class Tree{
	Object[] array;
	
	public Tree(){
		array = new Object[128];
	}
	
	public boolean empty(){
		return (array[1]==null);
	}
	
	public int left(int i){
		return 2*i;
	}
	
	public int right(int i){
		return 2*i+1;
	}
	
	public int parent(int i){
		return i/2;
	}
	
	public Object getElement(int i){
		if (i <= 0 || i >= array.length){
			return null;
		}
		else{
			return array[i];
		}
	}
	
	public void setElement(int i,Object obj){
		if(i <= 0 || i >= array.length){
			return;
		}
		else{
			if(i == 1 | array[parent(i)] != null){
				array[i] = obj;
			}
		}
	}
	
	public void printPreorder(int i){
		if (getElement(i) == null)return;
		System.out.println(getElement(i));
		printPreorder(left(i));
		printPreorder(right(i));
	}
}

public class testTree{
	public static void main(String arg[]){
		Tree tree = new Tree();
		int root = 1;
		tree.setElement(root,"A");
		tree.setElement(tree.left(root),"B");
		tree.setElement(tree.right(root),"C");
		tree.setElement(tree.left(root+1),"D");
		tree.setElement(tree.right(root+1),"_");
		tree.setElement(tree.left(root+2),"E");
		tree.setElement(tree.right(root+2),"_");
		tree.printPreorder(root);
	}
}