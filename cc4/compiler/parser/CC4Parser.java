package cc4.compiler.parser;
import cc4.compiler.scanner.Scanner;
import cc4.compiler.semantic.Semantic;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CC4Parser
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public Scanner scannerA;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Semantic semantic;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public CC4Parser(Scanner parameter) {
		// TODO construct me
		super();
		scannerA = parameter;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void parse() {
		// TODO implement me	
		System.out.println("Analizando estructura de "+scannerA.inputFile);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private boolean validateTokens() {
		// TODO implement me
		return false;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void makeSintaxisTree() {
		// TODO implement me	
	}
	
}

