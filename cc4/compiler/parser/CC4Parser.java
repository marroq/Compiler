package compiler.parser;
import compiler.scanner.Scanner;
import compiler.semantic.Semantic;

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
	
	private Semantic semantic;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public CC4Parser(Scanner parameter) {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void parse() {
		System.out.println("Analizando estructura");
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
			value=true;
		} else {
			value = false;
		}
		return value;
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
