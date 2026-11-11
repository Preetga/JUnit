import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest{
	App app=new App();
	
	@Test
	void testArea() {
		assertEquals(78.5,app.area(5),0.001);
		
	}
}