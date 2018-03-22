package ComputerPractice1;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testTriangle {
	    private int a;
	    private int b;
	    private int c;
	    private String expected;
	    private String result = null;
	    
	    public testTriangle(int a,int b, int c, String expected){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.expected= expected;
	        
	        }
	    
	    @Parameters
	    public static Collection<Object[]> getData(){
	    return Arrays.asList(new Object[][]{
	    {8,8,8,"equilateral"},
	    {2,3,4,"scalene"},
	    {3,8,8,"isosceles"},
	    {1,1,8,"isosceles"}
	    });
	    }
	    
	    @Test
	    public void test() {
	    assertEquals(this.expected,triangleProblem.triangleshape(a,b,c));
	    }
}
