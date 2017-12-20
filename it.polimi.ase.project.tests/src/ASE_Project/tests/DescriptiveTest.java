/**
 */
package ASE_Project.tests;

import ASE_Project.ASE_ProjectFactory;
import ASE_Project.Descriptive;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Descriptive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptiveTest extends AnalysisOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DescriptiveTest.class);
	}

	/**
	 * Constructs a new Descriptive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Descriptive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Descriptive getFixture() {
		return (Descriptive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASE_ProjectFactory.eINSTANCE.createDescriptive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DescriptiveTest