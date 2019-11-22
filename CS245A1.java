/**
*Alejandro Marcovich
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.*;
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
	private String input;
	public String output;
	public int swit;
	private final String dict_name="english.0";
	public CS245A1()
	{
		size=0;
		//head=null;
	}

		/**
		*gets the storage;
		*/
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
				swit=1;
			}
			else
			{
				shell= new Trie();
				swit=2;
			}
		}
		/**
		*sets the input file
		*/
		public void set_input(String line)
		{
			input=line;
		}
		/**
		*sets the output file
		*/
		public void set_output(String line)
		{
			output=line;
		}
		//readfile
		//Scanner scanner= new Scanner(choice);
		/**
		*reads from the dictionary.
		*/
		public void readDic() throws FileNotFoundException
		{
			ArrayList<String> d=new ArrayList<String>();
			//shell=new SearchTree();
			File dictionary= new File(dict_name);
			Scanner scan = new Scanner(dictionary);
			while(scan.hasNextLine())
			{ 
				String line = scan.nextLine();
				int linesz=line.length();
				if (linesz==0)
					continue;
            	//System.out.println(line);
            	//test for length
            	if(swit==1)
            		d.add(line);
            	else
            		shell.add(line);
            	//shell.add(line);
        	}
        	if(swit==1)
        		arrinsert(d,0,d.size()-1,shell);

		}
		/*
		*adds the strings in like a binary tree.
		*/
		private void arrinsert(ArrayList<String> list, int st, int en, Storage shell)
		{
			if(st<=en)
			{
				int mid=(st+en)/2;
				//System.out.println(list.get(mid)+"test");
				shell.add(list.get(mid));
				arrinsert(list, mid+1, en,shell);
				arrinsert(list,st,mid-1,shell);
			}

		}
        //get out put
        //code for search tree.
        /*
        *retrive the output.Get file input.
        *return compenents to output.
        */
        public void get_output()  throws FileNotFoundException, IOException
        {	
        	BufferedWriter writer = new BufferedWriter(new FileWriter(output));
    		//writer.write(fileContent);
    		
        	//PrintStream o = new PrintStream(new File(output));
        	File file= new File(input);
			Scanner text = new Scanner(file);
        	//System.out.println("Please provide a word: ");
        	//Scanner text= new Scanner(System.in);
        	while(text.hasNextLine()){
	        	String word=text.nextLine();
	        	System.out.println(word);
	        	if(shell.find(word)==true)
	        	{
	        		System.out.println("Great! No spell check needed!");
	        		writer.write("Great! No spell check needed!"+"\n");
	        	}
	        	else
	        	{
	        		System.out.println("false");
	        		writer.write("false\n");
	        		System.out.println("Did you mean?");
	        		writer.write("Did you mean?\n");
	        		String sug1=shell.suggest(word);
	        		System.out.println(sug1);
	        		writer.write(sug1+"\n");
	        		String sug2=shell.sug();
	        		System.out.println(sug2);
	        		writer.write(sug2+"\n");
	        		
	        	}
        	}
        	writer.close();
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
		if(args.length>0)
		{
			drive.set_input(args[0]);
			drive.set_output(args[1]);
		}
		drive.getStorage();
		drive.readDic();
		try
		{
			drive.get_output();
		}
		catch(IOException e)
		{
			System.out.println("can't");
		}
    }
}