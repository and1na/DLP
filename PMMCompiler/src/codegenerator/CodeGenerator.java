package codegenerator;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter writer;

    public CodeGenerator(String in, String out) throws FileNotFoundException {
        this.writer = new PrintWriter(out);
        sourceFileComment(in);
    }

    /**
     * Generates a new comment with the in filename
     * @param in The input filename
     */
    public void sourceFileComment(String in){
        writer.println("#source \""+in+"\"");
    }

    /**
     * Generates a new comment with the current line
     * @param line The current line number
     */
    public void lineComment(int line) {
        writer.println("#line " + line);
    }

    /**
     * Generates a new comment with the text parameter
     * @param text The text to be commented
     */
    public void comment(String text) {
        writer.println("' ** " + text);
    }

    /**
     * Generates a new label
     */
    public void label(String label) {
        writer.println( label +  ":");
    }

    /**
     * Pushes a char constant onto the stack
     * @param charConstant The char constant to be pushed
     */
    public void push(char charConstant) {
        this.writer.println("pushb" + charConstant);
        this.writer.flush();
    }

    /**
     * Pushes an int constant onto the stack
     * @param intConstant The int constant to be pushed
     */
    public void push(int intConstant) {
        this.writer.println("pushi " + intConstant);
        this.writer.flush();
    }

    /**
     * Pushes a double constant onto the stack
     * @param floatConstant The double constant to be pushed
     */
    public void push(double floatConstant) {
        this.writer.println("pushf " + floatConstant);
        this.writer.flush();
    }

    /**
     * Pushes an address onto the stack
     * @param address The address to be pushed
     */
    public void pushA(int address) {
        this.writer.println("pusha " + address);
        this.writer.flush();
    }

    /**
     * Pushes the base pointer onto the stack
     */
    public void pushBP() {
        this.writer.println("push bp");
        this.writer.flush();
    }

    /**
     * Loads a value of a given type from the stack
     * @param type The type of the value to be loaded
     */
    public void load(Type type){
        this.writer.println("load" + type.suffix());
        this.writer.flush();
    }

    /**
     * Stores a value of a given type onto the stack
     * @param type The type of the value to be stored
     */
    public void store(Type type) {
        this.writer.println("store" + type.suffix());
        this.writer.flush();
    }

    /**
     * Pops a value of a given type from the stack
     * @param type The type of the value to be popped
     */
    public void pop(Type type) {
        this.writer.println("pop" + type.suffix());
        this.writer.flush();
    }

    /**
     * Duplicates the top value of a given type on the stack
     * @param type The type of the value to be duplicated
     */
    public void dup(Type type) {
        this.writer.println("dup" + type.suffix());
        this.writer.flush();
    }

    /**
     * Performs an arithmetic operation on the top two values of a given type on the stack
     * @param type The type of the values to be operated on
     * @param operator The operator to be used
     */
    public void arithmetic(Type type, String operator) {
        if(operator.equals("+")) {
            this.writer.println("add" + type.suffix());
        } else if(operator.equals("-")) {
            this.writer.println("sub" + type.suffix());
        } else if(operator.equals("*")) {
            this.writer.println("mul" + type.suffix());
        } else if(operator.equals("/")) {
            this.writer.println("div" + type.suffix());
        } else if(operator.equals("%")) {
            this.writer.println("mod" + type.suffix());
        }
        this.writer.flush();
    }

    /**
     * Performs a comparison operation on the top two values of a given type on the stack
     * @param type The type of the values to be compared
     * @param operator The operator to be used
     */
    public void comparison(Type type, String operator) {
        if (operator.equals(">")) {
            this.writer.println("gt" + type.suffix());
        } else if (operator.equals("<")) {
            this.writer.println("lt" + type.suffix());
        } else if (operator.equals(">=")) {
            this.writer.println("ge" + type.suffix());
        } else if (operator.equals("<=")) {
            this.writer.println("le" + type.suffix());
        } else if (operator.equals("==")) {
            this.writer.println("eq" + type.suffix());
        } else if (operator.equals("!=")) {
            this.writer.println("ne" + type.suffix());
        }
        this.writer.flush();
    }

    /**
     * Performs a logical operation on the top value on the stack
     * @param operator The operator to be used
     */
    public void logical(String operator) {
        if (operator.equals("&&")) {
            this.writer.println("and");
        } else if (operator.equals("||")) {
            this.writer.println("or");
        } else if (operator.equals("!")) {
            this.writer.println("not");
        }
        this.writer.flush();
    }

    /**
     * Reads a value of a given type from the input and pushes it onto the stack
     * @param type The type of the value to be read
     */
    public void in(Type type) {
        this.writer.println("in" + type.suffix());
        this.writer.flush();
    }

    /**
     * Pops a value of a given type from the stack and writes it to the output
     * @param type The type of the value to be written
     */
    public void out(Type type) {
        this.writer.println("out" + type.suffix());
        this.writer.flush();
    }

    /**
     * Converts the top value on the stack from one type to another
     * @param source The original type of the value
     * @param target The type to convert the value to
     */
    public void convert(Type source, Type target) {
        this.writer.println(source.suffix() + "2" + target.suffix());
        this.writer.flush();
    }

    /**
     * Unconditionally jumps to a label
     * @param label The label to jump to
     */
    public void jmp(int label) {
        this.writer.println("jmp " + label);
        this.writer.flush();
    }

    /**
     * Jumps to a label if the top value on the stack is zero
     * @param label The label to jump to
     */
    public void jz(int label) {
        this.writer.println("jz " + label);
        this.writer.flush();
    }

    /**
     * Jumps to a label if the top value on the stack is not zero
     * @param label The label to jump to
     */
    public void jnz(int label) {
        this.writer.println("jnz " + label);
        this.writer.flush();
    }

    /**
     * Calls a function by its name
     * @param functionName The name of the function to be called
     */
    public void call(String functionName) {
        comment("Call to function " + functionName);
        this.writer.println("call " + functionName);
        this.writer.flush();
    }

    /**
     * Allocates space for local variables
     * @param bytes The number of bytes to allocate
     */
    public void enter(int bytes) {
        this.writer.println("enter " + bytes);
        this.writer.flush();
    }

    /**
     * Returns from a function call
     * @param returnedBytes The number of bytes returned by the function
     * @param localsBytes The number of bytes used by local variables
     * @param paramsBytes The number of bytes used by parameters
     */
    public void ret(int returnedBytes, int localsBytes, int paramsBytes) {
        this.writer.println("ret " + returnedBytes + ", " + localsBytes + ", " + paramsBytes);
        this.writer.flush();
    }

    /**
     * Halts the execution of the program
     */
    public void halt() {
        this.writer.println("halt");
        this.writer.flush();
    }
}