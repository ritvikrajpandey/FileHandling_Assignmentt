import java.io.*;
import java.util.*;

public class ReadWritefile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice , choose 1 for write or append file , Type 2 to read");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			try {
				FileWriter fw=new FileWriter("f1.txt",true);
				PrintWriter pw=new PrintWriter(fw);
				System.out.println("Enter String to be added");
				String str=sc.nextLine();
				pw.print(str);
				pw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;
			
		case 2:
			File fname=new File("f1.txt");
			try {
				Scanner fscan = new Scanner(fname);
				while(fscan.hasNext())
				{
				System.out.println(fscan.nextLine());
				}
				fscan.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
		}
		

	}

}
