package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.type.Function;
import ast.type.struct.Struct;
import ast.type.struct.StructField;
import visitor.AbstractVisitor;

public class OffsetVisitor  extends AbstractVisitor<Void,Void> {

    //GLOBAL VARIABLES
    public Void visit(Program node, Void param){
        int offset = 0;
        /*
        I don't need to visit varDefs cause its offset is computed here.
        I'd have to visit them if I had chosen to compute the offset in the VarDefinition node
        with an if like this: if(varDef.scope() == 0) { offset += varDef.getType().numberOfBytes(); }...
         */
        for(VarDefinition var : node.getVarDefinitions()) {
            var.setOffset(offset);
            //number of bytes is not a thing computed in a visitor, it's already set in the type
            offset += var.getType().numberOfBytes();
            var.getType().accept(this, null);
        }
        node.getFunctionDefinitions().forEach(f -> f.accept(this, null));
        return null;
    }

    //LOCAL VARIABLES
    public Void visit(FunctionDefinition node, Void param){
        int offset = 0;
        for(VarDefinition var : node.getBodyVarDefinitions()) {
            var.setOffset(offset);
            offset -= var.getType().numberOfBytes();
            var.getType().accept(this, null);
        }
        node.getType().accept(this, null);
        node.getStatements().forEach(s -> s.accept(this, null));
        return null;
    }

    //PARAMETERS
    public Void visit(Function node, Void param){
        int offset = 4; //First parameter is at offset 4
        for ( int i = node.getParameters().size() -1; i >= 0; i-- ) {
            VarDefinition var = node.getParameters().get(i);
            var.setOffset(offset);
            offset += var.getType().numberOfBytes();
        }
        node.getReturnType().accept(this, null);
        return null;
    }

    //STRUCT FIELDS
    public Void visit(Struct node, Void param){

        int offset = 0;
        for (StructField sF : node.getFields()) {
            sF.setOffset(offset);
            offset += sF.getOf().numberOfBytes();
            sF.getOf().accept(this, null);
        }
        return null;
    }

}
