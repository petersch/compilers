package compiler;

import java.util.HashMap;
import java.util.Map;
import org.stringtemplate.v4.*;
import parser.jazzikBaseVisitor;

public class CompilerVisitor extends jazzikBaseVisitor<CodeFragment> {
    private Map<String, String> mem = new HashMap<String, String>();
    private int labelIndex = 0;
    private int registerIndex = 0;

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }
    
    //CodeFragment visit
}
