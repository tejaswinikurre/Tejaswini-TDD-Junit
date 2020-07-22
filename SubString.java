package junit;
public class SubString
{
	public String remChar(String s)
	{
		char first=s.charAt(0);
		char second=s.charAt(1);
		if(first=='A')
			if(second=='A')
				return s.substring(2,s.length());
			else
				return s.substring(1,s.length());
		else
			if(second=='A')
				return first+""+s.substring(2,s.length());
		return s;
	}
}