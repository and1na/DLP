package codegenerator;

import ast.definition.FunctionDefinition;

//This visitor is in charge of generating the code for getting the value of R-Values (expressions)

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void> {

    private AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setAddressVisitor(AddressCGVisitor addressVisitor) {
        this.addressVisitor = addressVisitor;
    }

    //
}
