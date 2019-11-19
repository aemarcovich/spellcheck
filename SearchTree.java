public class SearchTree implements Storage
{
	Node head=null;
	int size;
	int mem=0;
	String lastw;
	String lastw2=null;
	public class Node
	{
		String data; 
		Node right;
		Node left;
		Node(String i)
		{
			size=0;
			data=i;
			right=null;
			left=null;
		}
	}
	/*This function adds a node to the search tree
	*/
	//check the add.
	public void add(String x)
	{
		head=add(x, head);
	}
	private Node add(String x,Node root)
	{
		int test;
		// Node n=root;
		if (root==null)
			return new Node(x);
		if(root.data.compareToIgnoreCase(x)>0)
		{
			//System.out.println(root.data+"r");
			//test=root.data.compareTo(x);
			//System.out.println(test);
			root.right=add(x,root.right);
			return root;
		}
		else
		{
			//System.out.println(root.data);
			//test=root.data.compareTo(x);
			//System.out.println(test);
			//System.out.println("less");
			root.left=add(x,root.left);
			return root;
		}
	}
	/*
	Function finds a node with the given value in the binary search tree.
	*If the word is not found than return the closest word as a sugesstion.
	*/
	public boolean find(String x)
	{
		return find(x, head);
	}
	private boolean find(String x,Node root)
	//alter find to return info of last node.
	{
		if (root==null)
			return false;
		if(root.data.compareToIgnoreCase(x)==0)
			return true;
		else if(root.data.compareToIgnoreCase(x)>0)
		{
			//System.out.println(root.data);
			return find(x,root.right);
		}
		else
		{
			//System.out.println(root.data);
			return find(x,root.left);
		}
	}
	public String suggest(String x)
	{
		return suggest(x,head);
	}
	private String suggest(String x,Node root)
	{
		if (root==null)
			return lastw;
		else if(root.data.compareToIgnoreCase(x)==0)
			return root.data;
		else if(root.data.compareToIgnoreCase(x)<0)
		{
			if(mem==1)
			{
				lastw=root.data;
				mem=2;
			}
			else
			{
				lastw2=root.data;
				mem=1;
			}
			lastw=root.data;
			System.out.println(lastw);
			return suggest(x,root.right);
		}
		else
		{
			if(mem==1)
			{
				lastw=root.data;
				mem=2;
			}
			else
			{
				lastw2=root.data;
				mem=1;
			}
			lastw=root.data;
			System.out.println(lastw);
			return suggest(x,root.left);
		}
	}
	public void sug()
	{
		System.out.println(lastw2);
	}
}