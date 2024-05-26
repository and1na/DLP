package visitor;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.struct.Struct;
import ast.type.struct.StructField;

//TP = Parameter type TR = return type
public interface Visitor<TP,TR> {

    /*PROGRAM*/
     TR visit(Program node, TP param);

    /*EXPRESSION AND STATEMENT*/
     TR visit(FunctionInvocation node, TP param);

    /*EXPRESSIONS*/

     TR visit(ArithmeticComparison node, TP param);
     TR visit(Arithmetic node, TP param);
     TR visit(ArrayAccess node, TP param);
     TR visit(Cast node, TP param);
     TR visit(CharLiteral node, TP param);
     TR visit(FloatLiteral node, TP param);
     TR visit(IntLiteral node, TP param);
     TR visit(Logical node, TP param);
     TR visit(Negation node, TP param);
     TR visit(StructAccess node, TP param);
     TR visit(UnaryMinus node, TP param);
     TR visit(Variable node, TP param);

    /*DEFINITIONS*/
     TR visit(FunctionDefinition node, TP param);
     TR visit(VarDefinition node, TP param);

    /*TYPES*/
     TR visit(Array node, TP param);
     TR visit(CharType node, TP param);
     TR visit(DoubleType node, TP param);
    TR visit(ErrorType node, TP param);
     TR visit(Function node, TP param);
     TR visit( IntType node, TP param);
     TR visit(Struct node, TP param);
     TR visit(VoidType node, TP param);

    /*STRUCT FIELDS*/
     TR visit(StructField node, TP param);

    /*STATEMENTS*/
     TR visit(If_Else node, TP param);
     TR visit(Input node, TP param);
     TR visit(Print node, TP param);
     TR visit(Return node, TP param);
     TR visit(While node, TP param);
     TR visit(Assignment node, TP param);


 TR visit(Increment increment, TP param);
}
