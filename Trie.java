public class Trie implements Storage
{
	List<String> list=new ArrayList<>();
	int word_sz;
	char array[];
	char array2[];
	char array3[];
	int counter;
	int count;
	int counter2;
	boolean check;
	String sugg;
	Prefix head=null;
	Character next;
	Character next2;
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
		Prefix x;
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
			x=null;
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
        if(head==null)
        {
        	head=new Prefix("*");
        }
        add(head,"*"+x,0);
	}
	private Prefix add(Prefix node,String word,int size)
	{
		size++;
		if(size>=word.length())
		{
			return node.sp=new Prefix("*");
		}
		
		//System.out.println(size);
		//System.out.println(word.length());
		next=word.charAt(size);
       	//System.out.println(next);
		if(next=='A')
		{
        		if(node.a==null)
        			node.a=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.a,word,size);
        }
		if(next=='B')
		{
        		if(node.b==null)
        			node.b=new Prefix(next);
        		return add(node.b,word,size);
        }
		if(next=='C')
		{
        		if(node.c==null)
        			node.c=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.c,word,size);
        }
		if(next=='D')
		{
        		if(node.d==null)
        			node.d=new Prefix(next);
        		return add(node.d,word,size);
        }
		if(next=='E')
		{
        		if(node.e==null)
        			node.e=new Prefix(next);
        		return add(node.e,word,size);
        }
		if(next=='F')
		{
        		if(node.f==null)
        			node.f=new Prefix(next);
        		return add(node.f,word,size);
        }
		if(next=='G')
		{
        		if(node.g==null)
        			node.g=new Prefix(next);
        		return add(node.g,word,size);
        }
		if(next=='H')
		{
        		if(node.h==null)
        			node.h=new Prefix(next);
        		return add(node.h,word,size);
        }
		if(next=='I')
		{
        		if(node.i==null)
        			node.i=new Prefix(next);
        		return add(node.i,word,size);
        }
		if(next=='J')
		{
        		if(node.j==null)
        			node.j=new Prefix(next);
        		return add(node.j,word,size);
        }
		if(next=='K')
		{
        		if(node.k==null)
        			node.k=new Prefix(next);
        		return add(node.k,word,size);
        }
		if(next=='L')
		{
        		if(node.l==null)
        			node.l=new Prefix(next);
        		return add(node.l,word,size);
        }
		if(next=='M')
		{
        		if(node.m==null)
        			node.m=new Prefix(next);
        		return add(node.m,word,size);
        }

		if(next=='N')
		{
        		if(node.n==null)
        			node.n=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.n,word,size);
        }
		if(next=='O')
		{
        		if(node.o==null)
        			node.o=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.o,word,size);
        }
		if(next=='P')
		{
        		if(node.s==null)
        			node.s=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.s,word,size);
        }
		if(next=='Q')
		{
        		if(node.q==null)
        			node.q=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.q,word,size);
        }
		if(next=='R')
		{
        		if(node.r==null)
        			node.r=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.r,word,size);
        }
		if(next=='S')
		{
        		if(node.s==null)
        			node.s=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.s,word,size);
        }
		if(next=='T')
		{
        		if(node.t==null)
        			node.t=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.t,word,size);
        }
		if(next=='U')
		{
        		if(node.u==null)
        			node.u=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.u,word,size);
        }
		if(next=='V')
		{
        		if(node.v==null)
        			node.v=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.v,word,size);
        }
		if(next=='W')
		{
        		if(node.w==null)
        			node.w=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.w,word,size);
        }
		if(next=='X')
		{
        		if(node.x==null)
        			node.x=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.x,word,size);
        }
		if(next=='Y')
		{
        		if(node.y==null)
        			node.y=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.y,word,size);
        }
		if(next=='Z')
		{
        		if(node.z==null)
        			node.z=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.z,word,size);
        }
		if(next=='\'')
		{
        		if(node.ap==null)
        			node.ap=new Prefix(next);
        		//System.out.println("atest");
        		return add(node.ap,word,size);
        }
        return null;
    }
        //return null;
	public boolean find(String x)
	{
		//return find(head,"*"+x,0);
		return find(head,"*"+x,0);
		//return false;
	}
	private boolean find(Prefix node,String word,int size)
	{
		size=size+1;
		if(size+1>word.length()){
			if(node.sp!=null)
			{
				System.out.println(true);
			}
			else
				System.out.println(false);
			return node.sp!=null; //|| node.data.equals("*");
		}
		//System.out.println(size);
		next2=word.charAt(size);
		//System.out.println(next2);
		if(next2=='a')
		{
			if(node.a==null)
				return false;
			return find(node.a,word,size);
        }
		if(next2=='b')
		{
			if(node.b==null){
				//System.out.println(false);
				return false;
			}
			return find(node.a,word,size);
        }
		if(next2=='c')
		{
			if(node.c==null)
				return false;
			return find(node.c,word,size);
        }
		if(next2=='d')
		{
			if(node.d==null)
				return false;
			return find(node.d,word,size);
        }
		if(next2=='e')
		{
			if(node.e==null)
				return false;
			return find(node.e,word,size);
        }
		if(next2=='f')
		{
			if(node.f==null)
				return false;
			return find(node.f,word,size);
        }
		if(next2=='g')
		{
			if(node.g==null)
				return false;
			return find(node.g,word,size);
        }
		if(next2=='h')
		{
			if(node.h==null)
				return false;
			return find(node.h,word,size);
        }
		if(next2=='i')
		{
			if(node.i==null)
				return false;
			return find(node.i,word,size);
        }
		if(next2=='j')
		{
			if(node.j==null)
				return false;
			return find(node.j,word,size);
        }
		if(next2=='k')
		{
			if(node.k==null)
				return false;
			return find(node.k,word,size);
        }
		if(next2=='l')
		{
			if(node.l==null)
				return false;
			return find(node.l,word,size);
        }
		if(next2=='m')
		{
        		if(node.m==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.m,word,size);
        }
		if(next2=='n')
		{
        		if(node.n==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.n,word,size);
        }
		if(next2=='o')
		{
        		if(node.o==null)
        			return false;
        		return find(node.o,word,size);
        }
		if(next2=='p')
		{
        		if(node.p==null)
        			return false;
        		return find(node.p,word,size);
        }
		if(next2=='q')
		{
        		if(node.q==null)
        			return false;
        		return find(node.q,word,size);
        }
		if(next2=='r')
		{
        		if(node.r==null)
        			return false;
        		return find(node.r,word,size);
        }
		if(next2=='s')
		{
        		if(node.s==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.s,word,size);
        }
		if(next2=='t')
		{
        		if(node.t==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.t,word,size);
        }
		if(next2=='u')
		{
        		if(node.u==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.u,word,size);
        }
		if(next2=='v')
		{
        		if(node.v==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.v,word,size);
        }
		if(next2=='w')
		{
        		if(node.w==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.w,word,size);
        }
		if(next2=='x')
		{
        		if(node.x==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.x,word,size);
        }
		if(next2=='y')
		{
        		if(node.y==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.y,word,size);
        }
		if(next2=='z')
		{
        		if(node.z==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.z,word,size);
        }
		if(next2=='\'')
		{
        		if(node.ap==null)
        			return false;
        		//System.out.println("atest");
        		return find(node.ap,word,size);
        }
		return false;
	}

	private void dfs(Prefix root, StringBuilder sb)
	{
		if(list.size()==2)
		return;
		if(root.sp!=null)
			list.add(sb.toString());
		if(root.a!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.a.data);
			dfs(root.a,strb);
        }
		if(root.b!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.b.data);
			dfs(root.b,strb);
        }
		if(root.c!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.c.data);
			dfs(root.c,strb);
        }
		if(root.d!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.d.data);
			dfs(root.d,strb);
        }
		if(root.e!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.e.data);
			dfs(root.e,strb);
        }
		if(root.f!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.f.data);
			dfs(root.f,strb);
        }
		if(root.g!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.g.data);
			dfs(root.g,strb);
        }
		if(root.h!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.h.data);
			dfs(root.h,strb);
        }
		if(root.i!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.i.data);
			dfs(root.i,strb);
        }
		if(root.j!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.j.data);
			dfs(root.j,strb);
        }
		if(root.k!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.k.data);
			dfs(root.k,strb);
        }
		if(root.l!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.l.data);
			dfs(root.l,strb);
        }
		if(root.m!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.m.data);
			dfs(root.m,strb);
        }
		if(root.n!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.n.data);
			dfs(root.n,strb);
        }
		if(root.o!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.o.data);
			dfs(root.o,strb);
        }
		if(root.p!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.p.data);
			dfs(root.p,strb);
        }
		if(root.q!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.q.data);
			dfs(root.q,strb);
        }
		if(root.r!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.r.data);
			dfs(root.r,strb);
        }
		if(root.s!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.s.data);
			dfs(root.s,strb);
        }
		if(root.t!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.t.data);
			dfs(root.t,strb);
        }
		if(root.u!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.u.data);
			dfs(root.u,strb);
        }
		if(root.v!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.v.data);
			dfs(root.v,strb);
        }
		if(root.w!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.w.data);
			dfs(root.w,strb);
        }
		if(root.x!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.x.data);
			dfs(root.x,strb);
        }
		if(root.y!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.y.data);
			dfs(root.y,strb);
        }
		if(root.z!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.z.data);
			dfs(root.z,strb);
        }
		if(root.ap!=null)
		{
			StringBuilder strb=new StringBuilder(sb.toString());
			strb.append(root.ap.data);
			dfs(root.ap,strb);
        }
	}
	public String suggest(String x)
	{
		StringBuilder st= new StringBuilder();
		dfs(head,st);
		return list.get(0);
	}
	public String sug()
	{
		return list.get(1);
	}
}