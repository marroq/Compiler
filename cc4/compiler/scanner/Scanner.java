package compiler.scanner;
import compiler.parser.CC4Parser;
import java.util.Hashtable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Scanner
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Hashtable < String, String > inputFileName;
	public int stopStage;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private java.util.ArrayList tokens;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Scanner(Hashtable < String, String > parameter, int stop) {
		super();
		inputFileName=parameter;
		stopStage=stop;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void scan() {
		System.out.println("Ejecutando fase scanner de archivo "+inputFileName.get("-o"));
		if (stopStage>1) {
			CC4Parser parser = new CC4Parser(this);
		}
	}
}
