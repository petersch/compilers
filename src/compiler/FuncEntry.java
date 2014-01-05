/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author pepo
 */
public class FuncEntry {
    public String name;
    public int type;
    
    public FuncEntry(int type, String name) {
        this.type = type;
        this.name = name;
    }
}

