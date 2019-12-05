package symbol_table;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Symbol> symbols = new HashMap<String, Symbol>();
    private String scopeName;
    private int scopeLevel;
    private Object enclosingScope;

    public SymbolTable(String scopeName, int scopeLevel, Object enclosingScope){
        this.scopeName = scopeName;
        this.scopeLevel = scopeLevel;
        this.enclosingScope = enclosingScope;
        this.symbols = new HashMap<String, Symbol>();

        init();
    }

    public SymbolTable init(){
        this.define(new TypeSymbol("INTEGER", null));
        this.define(new TypeSymbol("BOOLEAN", null));
        this.define(new TypeSymbol("STRING", null));
        this.define(new TypeSymbol("CHAR", null));

        return this;
    }

    public void define(Symbol s){
        this.symbols.put(s.getName(), s);
    }
}