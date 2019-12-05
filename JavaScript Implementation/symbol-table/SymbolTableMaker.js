const SymbolTable = require('./SymbolTable');
const VariableSymbol = require('./VariableSymbol');

class SymbolTableBuilder {
    constructor() {
        this.scope = SymbolTable.create();
    }

    visit(node) {
        const visitor = this[`on${node.constructor.name}`];
    
        return visitor.call(this, node);
      }

    onBlock(node) {
        node.getDeclarations().forEach(node => this.visit(node));
        this.visit(node.getCompound());
    }
      
    onProgram(node) {
        this.visit(node.getBlock());
    }
    
    onBinaryOperator(node) {
        this.visit(node.getLHS());
        this.visit(node.getRHS());
    }
    
    onNumber(node) {
        return node;
    }
    
    onUnaryOperator(node) {
        this.visit(node.getOperand());
    }
    
    onCompound(node) {
        node.getChildren().forEach(node => this.visit(node));
    }
    
    onNoOperation(node) {
        return node;
    }
    
    onVarDecl(node) {
        const typeName = node.getType().getValue();
        const typeSymbol = this.scope.lookup(typeName);
        const varName = node.getVariable().getName();
        const varSymbol = VariableSymbol.create(varName, typeSymbol);
    
        this.scope.define(varSymbol);
    }
    
    onAssign(node) {
        const varName = node.getVariable().getName();
        const varSymbol = this.scope.lookup(varName);
    
        if (!varSymbol) throw new Error(`Variable ${varName} is not declared`);
    
        return this.visit(node.getExpression());
    }
    
    onVariable(node) {
        const varName = node.getName();
        const varSymbol = this.scope.lookup(varName);
    
        if (!varSymbol) throw new Error(`Variable ${varName} is not declared`);
    }

    onProcedureDecl(node) {
        return node;
    }

    static create() {
        return new this;
    }
}

modeule.exports = SymbolTableMaker;