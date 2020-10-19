package shelf;

import org.junit.Test;
import static org.junit.Assert.*;

public class ToolTest {
	
	@Test
	public void testTool_Constructor() {
		var tool = new Tool("Hammer");
		
		assertEquals(tool.getName(), "Hammer");
	}
	
	@Test
	public void testTool_toString() {
		var tool = new Tool("Hammer");
		
		assertEquals(tool.toString(), "Tool [name=" + "Hammer" + "]");
	}
}
