package programs;
import java.io.*;

public class IO_filetime extends Thread
{
	private static final String FOLDER_PATH = "C:\\\\Users\\\\snaga\\\\OneDrive\\\\Documents";
	private File file ;
	
	public void run()
	{
		FileReader fr = null;
		try
		{
			fr = new FileReader(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(fr != null)
		{
			LineNumberReader lnr = new LineNumberReader(fr);
			try
			{
				lnr.skip(Long.MAX_VALUE);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
			System.out.println(file.getName()+ " " + lnr.getLineNumber() );
		}
			
	}
	public IO_filetime(File file){
		super();
		this.file = file;
	}
	
	
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		File folder = new File(FOLDER_PATH);
		IO_filetime lc;
		for(File file : folder.listFiles())
		{
			if(file.isFile())
			{
				lc = new IO_filetime(file);
				lc.run();
			}
		}
		System.out.println("Lapse = " +(System.currentTimeMillis() - start)+ "ms");
	}
	

}
