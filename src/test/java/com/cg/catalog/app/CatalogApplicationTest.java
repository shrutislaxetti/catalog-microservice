package com.cg.catalog.app;

import org.junit.*;
import springfox.documentation.spring.web.plugins.Docket;
import static org.junit.Assert.*;

/**
 * The class <code>CatalogApplicationTest</code> contains tests for the class <code>{@link CatalogApplication}</code>.
 *
 * @generatedBy CodePro at 2/2/18 5:39 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class CatalogApplicationTest {
	/**
	 * Run the Docket api() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 5:39 PM
	 */
	@Test
	public void testApi_1()
		throws Exception {
		CatalogApplication fixture = new CatalogApplication();

		Docket result = fixture.api();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
		assertEquals("default", result.getGroupName());
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 5:39 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		CatalogApplication.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/2/18 5:39 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/2/18 5:39 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/2/18 5:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CatalogApplicationTest.class);
	}
}