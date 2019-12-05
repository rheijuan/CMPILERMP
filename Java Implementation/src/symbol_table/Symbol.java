package symbol_table;

public class Symbol {
    private String name;
    private Object type;

    public Symbol(String name, Object type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Object getType() {
        return type;
    }
}
