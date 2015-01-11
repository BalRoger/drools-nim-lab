package org.integrallis.nim;

import static org.integrallis.nim.Move.*;
import static org.integrallis.nim.Outcome.OutcomeType.*;
import static org.junit.Assert.assertTrue;

import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
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
    // YOUR CODE HERE
	}

	@Test
	public void testLosingGame() {
		// YOUR CODE HERE
	}

}
