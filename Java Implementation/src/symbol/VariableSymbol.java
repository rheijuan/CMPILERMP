package symbol;

public class VariableSymbol extends Symbol {

    private boolean isConstant = false;
    private Object value = null;

    public VariableSymbol(String name, String type, Boolean isConstant, Object value) {
        super(name, type);

        this.isConstant = isConstant;
    }

    public String toString() {
        return this.getName() + " " + this.getType() + " " + this.value;
    }
}
