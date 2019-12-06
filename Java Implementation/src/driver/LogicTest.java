package driver;

import symbol.SymbolTable;
import symbol.VariableSymbol;

public class LogicTest {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        symbolTable.store(new VariableSymbol("X", "PINT", false, 2));
        symbolTable.store(new VariableSymbol("Y", "MANGO", false, (float) 22.22));

        symbolTable.toString();
    }
}
