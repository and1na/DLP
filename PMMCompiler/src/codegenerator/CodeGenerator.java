package codegenerator;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter writer;

    private int labelNumber = 0;

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
        writer.println("\n#line " + line + "\n");
    }

    /**
     * Generates a new comment with the text parameter
     * @param text The text to be commented
     */
    public void comment(String text) {
        writer.println("\t' ** " + text);
    }



    /**
     * Pushes a char constant onto the stack
     * @param charConstant The char constant to be pushed
     */
    public void push(char charConstant) {
        this.writer.println("\tpushb\t" + charConstant);
        this.writer.flush();
    }


    /**
     * Pushes an int constant onto the stack
     * @param type type of the constant
     * @param value value of the constant
     */
    public void push(Type type, Object value) {
        this.writer.println("\tpush" + type.suffix() + "\t"+ value);
        this.writer.flush();
    }

    /**
     * Pushes an address onto the stack
     * @param address The address to be pushed
     */
    public void pushA(int address) {
        this.writer.println("\tpusha\t" + address);
        this.writer.flush();
    }

    /**
     * Pushes the base pointer onto the stack
     */
    public void pushBP() {
        this.writer.println("\tpush\tbp");
        this.writer.flush();
    }

    /**
     * Loads a value of a given type from the stack
     * @param type The type of the value to be loaded
     */
    public void load(Type type){
        this.writer.println("\tload" + type.suffix());
        this.writer.flush();
    }

    /**
     * Stores a value of a given type onto the stack
     * @param type The type of the value to be stored
     */
    public void store(Type type) {
        this.writer.println("\tstore" + type.suffix());
        this.writer.flush();
    }

    /**
     * Pops a value of a given type from the stack
     * @param type The type of the value to be popped
     */
    public void pop(Type type) {
        this.writer.println("\tpop" + type.suffix());
        this.writer.flush();
    }

    /**
     * Duplicates the top value of a given type on the stack
     * @param type The type of the value to be duplicated
     */
    public void dup(Type type) {
        this.writer.println("\tdup" + type.suffix());
        this.writer.flush();
    }

    /**
     * Performs an arithmetic operation on the top two values of a given type on the stack
     * @param type The type of the values to be operated on
     * @param operator The operator to be used
     */
    public void arithmetic(Type type, String operator) {
        if(operator.equals("+")) {
            this.writer.println("\tadd" + type.suffix());
        } else if(operator.equals("-")) {
            this.writer.println("\tsub" + type.suffix());
        } else if(operator.equals("*")) {
            this.writer.println("\tmul" + type.suffix());
        } else if(operator.equals("/")) {
            this.writer.println("\tdiv" + type.suffix());
        } else if(operator.equals("%")) {
            this.writer.println("\tmod" + type.suffix());
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
            this.writer.println("\tgt" + type.suffix());
        } else if (operator.equals("<")) {
            this.writer.println("\tlt" + type.suffix());
        } else if (operator.equals(">=")) {
            this.writer.println("\tge" + type.suffix());
        } else if (operator.equals("<=")) {
            this.writer.println("\tle" + type.suffix());
        } else if (operator.equals("==")) {
            this.writer.println("\teq" + type.suffix());
        } else if (operator.equals("!=")) {
            this.writer.println("\tne" + type.suffix());
        }
        this.writer.flush();
    }

    /**
     * Performs a logical operation on the top value on the stack
     * @param operator The operator to be used
     */
    public void logical(String operator) {
        if (operator.equals("&&")) {
            this.writer.println("\tand");
        } else if (operator.equals("||")) {
            this.writer.println("\tor");
        } else if (operator.equals("!")) {
            this.writer.println("\tnot");
        }
        this.writer.flush();
    }

    /**
     * Reads a value of a given type from the input and pushes it onto the stack
     * @param type The type of the value to be read
     */
    public void in(Type type) {
        this.writer.println("\tin" + type.suffix());
        this.writer.flush();
    }

    /**
     * Pops a value of a given type from the stack and writes it to the output
     * @param type The type of the value to be written
     */
    public void out(Type type) {
        this.writer.println("\tout" + type.suffix());
        this.writer.flush();
    }

    /**
     * Converts the top value on the stack from one type to another
     * @param source The original type of the value
     * @param target The type to convert the value to
     */
    public void convert(Type source, Type target) {
        if(source.suffix().equals(target.suffix())) {
            return;
        }
        this.writer.println("\t" + source.suffix() + "2" + target.suffix());
        this.writer.flush();
    }

    /**
     * Unconditionally jumps to a label
     * @param label The label to jump to
     */
    public void jmp(String label) {
        this.writer.println("\tjmp " + label);
        this.writer.flush();
    }

    /**
     * Jumps to a label if the top value on the stack is zero
     * @param label The label to jump to
     */
    public void jz(String label) {
        this.writer.println("\tjz " + label);
        this.writer.flush();
    }

    /**
     * TODO Check where i have to use this instruction
     * Jumps to a label if the top value on the stack is not zero
     * @param label The label to jump to
     */
    public void jnz(String label) {
        this.writer.println("\tjnz " + label);
        this.writer.flush();
    }

    /**
     * Calls a function by its name
     * @param functionName The name of the function to be called
     */
    public void call(String functionName) {
        comment("Call to function " + functionName);
        this.writer.println("\tcall " + functionName);
        this.writer.flush();
    }

    public void printLabel(String label){
        this.writer.println(label + ":");
        this.writer.flush();
    }

    /**
     * Generates a new label
     */
    public void label(String label) {
        writer.println( " " + label +  ":");
    }

    /**
     * Generates a new label
     */
    public String getLabel() {
        labelNumber++;
        return " label" + labelNumber;
    }

    /**
     * Allocates space for local variables
     * @param bytes The number of bytes to allocate
     */
    public void enter(int bytes) {
        this.writer.println("\tenter " + bytes);
        this.writer.flush();
    }

    /**
     * Returns from a function call
     * @param returnedBytes The number of bytes returned by the function
     * @param localsBytes The number of bytes used by local variables
     * @param paramsBytes The number of bytes used by parameters
     */
    public void ret(int returnedBytes, int localsBytes, int paramsBytes) {
        this.writer.println("\tret " + returnedBytes + ", " + localsBytes + ", " + paramsBytes);
        this.writer.flush();
    }

    /**
     * Halts the execution of the program
     */
    public void halt() {
        this.writer.println("\thalt");
        this.writer.flush();
    }
}