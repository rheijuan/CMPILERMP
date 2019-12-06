package driver;

import symbol.SymbolTable;
import symbol.VariableSymbol;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        int INT = 2;

        // Keep type small case since, int != INT
        symbolTable.store(new VariableSymbol("X", "pint", false, 2));
        symbolTable.store(new VariableSymbol("Y", "mango", false, (float) 22.22));
        symbolTable.store(new VariableSymbol("Z", "adobo", false, (double) 22.22));
        symbolTable.store(new VariableSymbol("C", "chicharon", false, 'a'));

        symbolTable.toString();
    }
}
