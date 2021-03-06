/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretervisitor;

/**
 *
 * @author Mr T.Khine
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Expression two = new Number(2);
        Expression three = new Number(3);
        Expression four = new Number(4);
        Expression plus = new PlusExpression(two, three);
        Expression root = new MinusExpression(plus, four);
        
        SyntaxAnalyzingVisitor visitor = new SyntaxAnalyzingVisitor();
        //root.accept(visitor);
        CodeGenerationVisitor codeGenVisitor = new CodeGenerationVisitor();
        root.accept(codeGenVisitor);
    }
}
