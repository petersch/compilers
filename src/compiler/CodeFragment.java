package compiler;

public class CodeFragment {
    private String code;
    private String global;
    private String register;
    private String funcargs;

    public CodeFragment() {
        this.code = "";
        this.global = "";
        this.funcargs = "";
        this.register = null;
    }

    public void addCode(String code) {
        this.code += code;
    }

    public void addCode(CodeFragment fragment) {
        this.code += fragment.code;
    }

    public void addGlobal(String code) {
        this.global += code;
    }

    public void addGlobal(CodeFragment fragment) {
        this.global += fragment.global;
    }

    public void addFragment(CodeFragment fragment) {
        this.global += fragment.global;
        this.code += fragment.code;
        addFuncArg(fragment.funcargs);
    }

    public String toString() {
        return this.global + this.code;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getRegister() {
        return this.register;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getGlobal() {
        return global;
    }
    
    public void addFuncArg(String arg) {
        if (!this.funcargs.isEmpty())
            this.funcargs += ", ";
        this.funcargs += arg;
    }
    
    public String getFuncArgs() {
        return funcargs;
    }
}
