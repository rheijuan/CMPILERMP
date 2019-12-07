package model;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, KaonData> variables;
    private Scope parent;

    public Scope() {
        this(null);
    }

    public Scope(Scope p) {
        variables = new HashMap<>();
        parent = p;
    }

    public void assignParam(String var, KaonData data) {
        variables.put(var, data);
    }

    public void assign(String var, KaonData data) {
        if (resolve(var) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, data);
        } else {
            // A newly declared variable
            variables.put(var, data);
        }
    }

    private boolean isGlobalScope() {
        return parent == null;
    }

    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, KaonData value) {
        if (variables.containsKey(identifier)) {
            // The variable is declared in this scope
            variables.put(identifier, value);
        } else if (parent != null) {
            // The variable was not declared in this scope, so let
            // the parent scope re-assign it
            parent.reAssign(identifier, value);
        }
    }

    public KaonData resolve(String var) {
        KaonData data = variables.get(var);
        if (data != null) {
            // The variable resides in this scope
            return data;
        } else if (!isGlobalScope()) {
            // Let the parent scope look for the variable
            return parent.resolve(var);
        } else {
            // Unknown variable
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, KaonData> var : variables.entrySet()) {
            sb.append(var.getKey()).append("->").append(var.getValue()).append(",");
        }
        return sb.toString();
    }
}
