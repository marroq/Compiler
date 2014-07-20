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
		System.out.println("Analizando estructura de "+scannerA.inputFile);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private boolean validateTokens(String tokens) {
		/*Simulacion de token*/
		boolean value;
		if (tokens.length()>0) {
			value=true
		} else {
			value = false
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void makeSintaxisTree() {
		System.out.println("Creando arbol de sintaxis");
	}
	
}

