import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.lang.*;
import java.util.Properties;
public class CS245A1 
{
	public int size;
	//public Node head;
	//public Prefix head2;
	public String lastw;
	public int counter=0;
	private Storage shell;
	private final String dict_name="english.0";
	public CS245A1()
	{
		size=0;
		//head=null;
	}

		//getstore
		public void getStorage()
		{
			//File choice= new File("alproperties.txt");
			Properties props= new Properties();
			try
			{
				FileInputStream in = new FileInputStream("a1properties.txt");
				props.load(in);
				in.close();
			}
			catch(Exception x)
			{
				System.out.println("could not find file.");
			}
			
			if(props.get("storage").equals("tree"))
			{
				shell= new SearchTree();
			}
			else
			{
				shell= new Trie();
			}
		}

		//readfile
		//Scanner scanner= new Scanner(choice);
		public void readDic() throws FileNotFoundException
		{
			ArrayList<String> d=new ArrayList<String>();
			//shell=new SearchTree();
			File dictionary= new File(dict_name);
			Scanner scan = new Scanner(dictionary);
			//while(scan.hasNextLine())
			for(int x=0;x<10;x++)
			{ 
				String line = scan.nextLine();
				int linesz=line.length();
				if (linesz==0)
					continue;
            	System.out.println(line);
            	//test for length
            	d.add(line);
            	//shell.add(line);
        	}
        	arrinsert(d,0,d.size()-1,shell);

		}
		private void arrinsert(ArrayList<String> list, int st, int en, Storage shell)
		{
			if(st<=en)
			{
				int mid=(st+en)/2;
				System.out.println(list.get(mid)+"test");
				shell.add(list.get(mid));
				arrinsert(list, mid+1, en,shell);
				arrinsert(list,st,mid-1,shell);
			}

		}
        //get out put
        //code for search tree.
        public void get_output()
        {
        	System.out.println("Please provide a word: ");
        	Scanner text= new Scanner(System.in);
        	String word=text.nextLine();
        	if(shell.find(word)==true)
        	{
        		System.out.println("Great! No spell check needed!");
        	}
        	else
        	{
        		System.out.println("Did you mean?");
        		String sug1=shell.suggest(word);
        		//shell.sug();
        	}
        }
	/*
	*Main function should the main reas the english.0 file
	*Put the words a search tree. Search should be used to check if the word 
	*recevied is a actually a word.
	*Prefix tree dpes the spell checking, building the word
	*letter by letter.
	*/
	public static void main(String[] args) throws FileNotFoundException
	{
		CS245A1 drive=new CS245A1();
		drive.getStorage();
		drive.readDic();
		drive.get_output();
    }
}