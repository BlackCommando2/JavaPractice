import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;
public class BReader {
	private final void m() {}
	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("tst.txt");
			BufferedReader br = new BufferedReader(fr);
			String i="";
			while((i=br.readLine())!=null)
			{
				System.out.println(i);
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
