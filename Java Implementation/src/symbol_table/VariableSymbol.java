package symbol_table;

public class VariableSymbol extends Symbol {

    private boolean isConstant = false;
    private Object value = null;

    public VariableSymbol(String name, String type, Boolean isConstant, String value){
        super(name, type);

        if(value != "") {
            this.value = value;
        }
        else if(type == "INTEGER") {
            this.value = 0;
        }
        else if(type == "STRING" || type == "CHAR") {
            this.value = "";
        }
        else if(type == "BOOLEAN") {
            this.value = false;
        }
        this.isConstant = isConstant;
    }

    public String toString(){
        return this.getName() + " " + this.getType() + " " + this.value;
    }
}
