package org.integrallis.nim;

import org.integrallis.drools.junit.BaseDroolsTestCase;
import org.junit.Before;
import org.junit.Test;


public class NimTest extends BaseDroolsTestCase {

	public NimTest() {
		super("ksession-rules");
	}

	@Before
	public void configureGame() {
		Board board = new Board();
		knowledgeSession.insert(board);
	}

	@Test
	public void testWinningGame() {

	}

	@Test
	public void testLosingGame() {
		// YOUR CODE HERE
	}

}
