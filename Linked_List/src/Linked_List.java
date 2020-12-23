import  java.util.Random;


public class Linked_List {
	
	public static void main(String[] Args) {
		createNodes();
		//connectNodes();
	}
	static void createNodes() {
		 Node node[] = new Node[5];
		int x = 5;
		Random rand = new Random();
		
		for(int i=0;i<5;i++) {
			 int n= rand.nextInt(x);
			 node[i] = new Node(n);
			 
		}
            for(int s=0;s<(node.length)-1;s++) {
				 
				 node[s].next = node[s+1];
				 
            }
		
			for(int r=0;r<(node.length);r++) {
			
				System.out.print("node is " + node[r].data);
				System.out.print("\n");
				 if(node[r].next == null) {
					 System.out.print("next does not exist,thus your list has ended ");
						System.out.print("\n");
						break;
				 }
				System.out.print("next is " + node[r].next.data);
				System.out.print("\n");
				 
				 
		
			 
	}

			
			
			
			
}
	}
