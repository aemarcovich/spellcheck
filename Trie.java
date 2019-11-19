public class Trie implements Storage
{
	int word_sz;
	char array[];
	char array2[];
	char array3[];
	int counter;
	int count;
	int counter2;
	String sugg;
	Prefix head=null;
	char next;
	public class Prefix
	{
		Comparable data;
		Prefix a;
		Prefix b;
		Prefix c;
		Prefix d;
		Prefix e;
		Prefix f;
		Prefix g;
		Prefix h;
		Prefix i;
		Prefix j;
		Prefix k;
		Prefix l;
		Prefix m;
		Prefix n;
		Prefix o;
		Prefix p;
		Prefix q;
		Prefix r;
		Prefix s;
		Prefix t;
		Prefix u;
		Prefix v;
		Prefix w;
		Prefix y;
		Prefix z;
		Prefix ap;
		Prefix sp;
		Prefix(Comparable i)
		{
			data=i;
			a=null;
			b=null;
			c=null;
			d=null;
			e=null;
			f=null;
			g=null;
			h=null;
			i=null;
			j=null;
			k=null;
			l=null;
			m=null;
			n=null;
			o=null;
			p=null;
			q=null;
			r=null;
			s=null;
			t=null;
			u=null;
			v=null;
			w=null;
			y=null;
			z=null;
			ap=null;
			sp=null;
		}
	}
	/*
	* This adds a word to the prefix tree
	* letter by letter.
	*/
	public void add(String x)
	{
		//int counter2;
		//counter=0;
		word_sz=x.length();
        array= new char[word_sz+2];
        array[0]='*';
        for(int i=0;i<word_sz;i++)
        {
        	array[i+1]=x.charAt(i);
        }
        array[word_sz+1]='*';
        //Sting new_word="*"+word+"*";
        while(counter!=word_sz+2)
        {
        	counter2=0;
        	head=add(array[counter2],head);
        	//counter2++;
        }
	}
	private Prefix add(char i,Prefix root)
	{
        if (root==null)
        {
        	counter++;
        	return new Prefix(i);
        }
        else if(root.data.compareTo(i)==0)
        {
        	//counter++;
        	next=array[counter2++];
        	if(next=='a')
        	{
        	root.a=add(next,root.a);
        	return root;
        	//enum
        	// "'"
        	}
        	else if(next=='c')
        	{
        		root.c=add(i,root.c);
        		return root;
        	}
        	else if(next=='m')
        	{
        		root.m=add(i,root.m);
        		return root;
        	}
        	else if(next=='s')
        	{
        		root.s=add(i,root.s);
        		return root;
        	}
        	else if(next=='t')
        	{
        		root.t=add(i,root.t);
        		return root;
        	}
        	else if(next=='i')
        	{
        		root.i=add(i,root.i);
        		return root;
        	}
        	else if(next==39)
        	{
        		root.ap=add(i,root.ap);
        		return root;
        	}
        	else if(next=='n')
        	{
        		root.n=add(i,root.n);
        		return root;
        	}
        	else if(next=='*')
        	{ 
        		root.sp=add(i,root.sp);
        		return root;
        	}
        	else
        	{
        		root.z=add(i,root.z);
        		return root;
        	}
        }
        return null;
    }
	public boolean find(String x)
	{
		word_sz=x.length();
        array2= new char[word_sz+2];
        array2[0]='*';
        for(int s=0;s<word_sz;s++)
        {
        	array2[s+1]=x.charAt(s);
        }
        array2[word_sz+1]='*';
        //Sting new_word="*"+word+"*";
        return find(array2,head,word_sz+2);
	}
	private boolean find(char[]arr,Prefix root,int size)
	{
		if(root==null)
			return false;
		if (count==size)
		{
			return true;
		}
		if(root.data.compareTo(arr[count])==0)
		{
			count++;
			sugg=sugg+root.data;
        	if(arr[count]=='a')
        	{
        		return find(arr,root.a,size);
        		//enum
        		// "'"
        	}
        	else if(arr[count]=='c')
        	{
        		return find(arr,root.c,size);
        	}
        	else if(arr[count]=='m')
        	{
        		return find(arr,root.a,size);
        	}
        	else if(arr[count]=='s')
        	{
        		return find(arr,root.s,size);
        	}
        	else if(arr[count]=='i')
        	{
        		return find(arr,root.i,size);
        	}
        	else if(arr[count]=='n')
        	{
        		return find(arr,root.n,size);
        	}
        	else if(arr[count]==39)
        	{
        		return find(arr,root.ap,size);
        	}
        	else if(arr[count]=='*')
        	{
        		return find(arr,root.sp,size);
        	}
        	else
        	{
        		System.out.println("do not know what you are looking for.");
        	}
		}
		return true;
	}
/*	public String suggest(String x)
	{
		int st_size;
		Sting pie=sugg;
		st_size=pie.length();
		word_sz=x.length();
        array3= new char[word_sz+2];
        array3[0]='*';
        for(int s=0;s<word_sz;s++)
        {
        	array3[s+1]=x.charAt(s);
        }
        array3[word_sz+1]='*';
        //Sting new_word="*"+word+"*";
		return suggest(x,head,array3,st_size);
	}
	private String suggest(String pie,Prefix root,char[]arr,int size)
	{
		if(root.data.compareTo(arr[count])==0)
		{
			count++;
			sugg=sugg+root.data;
        	if(arr[count]=='a')
        	{
        		return find(arr,root.a,size);
        		//enum
        		// "'"
        	}
        	else if(arr[count]=='c')
        	{
        		return find(arr,root.c,size);
        	}
        	else if(arr[count]=='m')
        	{
        		return find(arr,root.a,size);
        	}
        	else if(arr[count]=='s')
        	{
        		return find(arr,root.s,size);
        	}
        	else if(arr[count]=='i')
        	{
        		return find(arr,root.i,size);
        	}
        	else if(arr[count]=='n')
        	{
        		return find(arr,root.n,size);
        	}
        	else if(arr[count]==39)
        	{
        		return find(arr,root.ap,size);
        	}
        	else if(arr[count]=='*')
        	{
        		return find(arr,root.sp,size);
        	}
        	else
        	{
        		System.out.println("do not know what you are looking for.");
        	}
		}
	}*/
}