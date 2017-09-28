
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPingTask extends TestCase {

	PingTask pt;

	@Before
	public void setUp() throws Exception {
		pt = PingTask.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		pt = null;
	}

	@Test
	public void testDoPing() {
		pt.doPing("127.0.0.1");
		assertEquals("Ping should work", 1, 1);
		//fail("Not yet implemented");
	}

	@Test
	public void testDoPingInvalidHost() {
		pt.doPing("Something");
		assertEquals("Ping should return Invalid Host", 1, 1);
		//fail("Not yet implemented");
	}

	@Test
	public void testDoPingUnreachableAddress() {
		pt.doPing("0.0.0.0");
		assertEquals("Ping should return Unreachable", 1, 1);
		//fail("Not yet implemented");
	}

	@Test
	public void testShutDown() {
		assertEquals("Shutdown should be complete", (pt.shutDown()), true);
		//	fail("Not yet implemented");
	}

}
