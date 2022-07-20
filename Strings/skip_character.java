// String : Skip the specific character from string

public class Main
{
	public static void main(String[] args) {
		skip("", "bcaccad");
	}
	
	static void skip(String p, String up)
	{
	    if(up.isEmpty())
	    {
	        System.out.println("All done...Processed string is : "+ p);
	        return;
	    }
	    
	    char ch = up.charAt(0);
      // skip 'a' from string
	    if(ch=='a')
	    {
	        skip(p, up.substring(1));
	    }
	    else
	    {
	        skip(p+ch, up.substring(1));
	    }
	}
}
