package codegenerator;

import ast.definition.FunctionDefinition;

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void> {

    private AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setAddressVisitor(AddressCGVisitor addressVisitor) {
        this.addressVisitor = addressVisitor;
    }
}
