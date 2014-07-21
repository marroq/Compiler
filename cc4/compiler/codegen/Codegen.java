package compiler.codegen;
import compiler.lib.Debug;
import compiler.irt.Irt;
import compiler.scanner.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Codegen {
	

	File create;	
	
	public Codegen(Irt parameter) {

		System.out.println("stage: CODEGEN");
        if (Debug.debugEnabled("codegen")) System.out.println("debugging: CODEGEN");		
	}
			
	public void generate() {
		// TODO implement me
	}
}
