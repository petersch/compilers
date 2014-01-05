/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author pepo
 */
public class VarEntry {
    public String name;
    public int type;
    public String register;
    
    public VarEntry(int type, String name, String register) {
        this.type = type;
        this.name = name;
        this.register = register;
    }
}
