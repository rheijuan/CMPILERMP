package symbol;

public class PrimitiveTypeSymbol extends Symbol {

    public PrimitiveTypeSymbol(String n){
        super(n, null);
    }

    public String toString(){
        return this.getName() + " " + this.getType();
    }
}
