package junit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TDDProgram
{
	SubString mainclass;
	@Before
	public void setup()
	{
		mainclass=new Main2();
	}
	@Test
	public void first()
	{
		assertEquals("BCD",mainclass.remChar("ABCD"));
	}
	@Test
	public void firstTwo()
	{
		assertEquals("CD",mainclass.remChar("AACDIJ"));
	}
	@Test
	public void second()
	{
		assertEquals("BCD",mainclass.remChar("BACDEF"));
	}
	@Test
	public void noChar()
	{
		assertEquals("BBAA",mainclass.remChar("BBAABB"));
	}
	@Test
	public void nextChar()
	{
		assertEquals("BAA",mainclass.remChar("AABBB"));
	}

}