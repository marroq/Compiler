package cc4.compiler;
import cc4.compiler.scanner.Scanner;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Compiler
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public static ArrayList<String> flags;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ArrayList<String> debugStages;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Compiler(){
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private boolean existsFile(String parameter) {
		// TODO implement me
		return false;	
	}

	/**
	 * <!-- begin-user-doc -->
	 Método para imprimir el menú de ayuda al usuario
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private static void help() {
		// TODO implement me
		System.out.println("*****	MENU DE AYUDA 	*****");
		System.out.println("-o <outname>\n\tEscribir el output a un archivo de texto llamado <outname>.");
		System.out.println("-target <stage>\n\tDonde <stage> es uno de: scan, parse, ast, semantic, irt, codegen; la compilación debe proceder hasta la etapa indicada.");
		System.out.println("-opt <optimzation>\n\t<optimization> es uno de: constant, algebraic.");
		System.out.println("-debug <stage>\n\tImprimir información de debugging.");
		System.out.println("<stage> tiene las mismas opciones de -target, con la diferencia que se pueden 'debuggear' varias etapas, separandolas con ':' de la forma scan:parse:etc.");
		System.out.println("-h\n\tMuestra esta ayuda al usuario.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public static void main(String[] args) {
		// TODO implement me
		int h=0,o=0,target=0,opt=0,debug=0;
		if (args.length>0) {
			for (int i=0;i<args.length;i++) {
				if (args[i].equals("-h")) {
					if (h>0) {
						h++;	
					} else {
						help();
					}
					h++;
				} else if (args[i].equals("-o")) {
					if (o>0) {
						o++;	
					} else {
						System.out.println("ESTOY EJECUTANDO -o");	
					}
					o++;
				} else if (args[i].equals("-target")) {
					if (target>0) {
						target++;
					} else {
						System.out.println("ESTOY EJECUTANDO -target");	
					}
					target++;
				} else if (args[i].equals("-opt")) {
					if (opt>0) {
						opt++;	
					} else {
						System.out.println("ESTOY EJECUTANDO -opt");
					}
					opt++;
				} else if (args[i].equals("-debug")) {
					if (debug>0) {
						debug++;	
					} else {
						System.out.println("ESTOY EJECUTANDO -debug");
					}
					debug++;	
				}
			}	
		} else {
			help();
		}
	}	
}