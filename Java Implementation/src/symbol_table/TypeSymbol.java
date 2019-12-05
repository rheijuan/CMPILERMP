package symbol_table;

public class TypeSymbol extends Symbol {

    public TypeSymbol(String n, Object t){
        super(n, t);
    }

    public String toString(){
        return "TypeSymbol";
    }
}
