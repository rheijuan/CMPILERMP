package symbol;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Symbol> symbols;

    public SymbolTable() {
        System.out.println("Initializing Symbol Table...");

        symbols = new HashMap<String, Symbol>();
    }

    public void store(Symbol s) {
        if (s != null) {
            symbols.put(s.getName(), s);
            System.out.println("Successfully stored symbol object { Name: " + s.getName() + " Type: " + s.getType() + " }");
        } else {
            System.out.println("Error, attempted to store NULL Symbol Object");
        }
    }

    public Symbol retrieve(String name) {
        Symbol sym = null;

        if (symbols.containsKey(name)) {
            sym = symbols.get(name);
        } else {
            System.out.println("Error cannot find " + name + " in the Symbol Table");
        }

        return sym;
    }

    public String toString() {
        System.out.println("SymbolName \t SymbolType \t Value");

        for (HashMap.Entry<String, Symbol> s : symbols.entrySet()) {
            System.out.println(s.getValue().toString());
        }

        return null;
    }
}