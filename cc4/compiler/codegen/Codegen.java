package compiler.codegen;
import compiler.irt.Irt;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Codegen
{
	/**
	 * <!-- begin-user-doc -->
	 * Objeto para generar arhivo para nuevo código.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	File create;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Codegen(Irt parameter) {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void generate() {
		create = new File("/home/dfer/Escritorio/Compiler/cc4/programa.txt");
		FileWriter archive = null;
        PrintWriter writer = null;
		try {
			create.createNewFile();
			archive = new FileWriter("/home/dfer/Escritorio/Compiler/cc4/programa.txt");
            writer = new PrintWriter(archive);
            writer.println("CODIGO GENERADO EXITOSAMENTE");
		} catch (IOException ex) {
			System.err.println("Archivo no creado"+ex);
		} finally {
			try {
				if (null != archive)
              		archive.close();
           	} catch (Exception ex2) {
              	ex2.printStackTrace();
           	}
        }
	}
}
