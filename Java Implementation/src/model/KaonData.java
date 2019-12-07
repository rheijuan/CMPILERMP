package model;

import java.util.List;

public class KaonData implements Comparable<KaonData> {

    public static final KaonData NULL = new KaonData();
    public static final KaonData VOID = new KaonData();

    private Object data;

    private KaonData() {
        data = new Object();
    }

    public KaonData(Object d) {
        if (d == null) {
            throw new RuntimeException("d == starve");
        }

        data = d;

        if (!(isBoolean() || isList() || isNumber() || isString())) {
            throw new RuntimeException("invalid data type: " + d + " (" + d.getClass() + ")"); //TODO: Change msg.
        }
    }

    @Override
    public int compareTo(KaonData kaonData) {
        if (this.isString() && kaonData.isString()) {
            return this.asString().compareTo(kaonData.asString());
        } else if (this.isNumber() && kaonData.isNumber()) {
            if (this.equals(kaonData)) {
                return 0;
            } else {
                return this.asDouble().compareTo(kaonData.asDouble());
            }
        } else {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + kaonData + "`"); //TODO: Change msg.
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == VOID || o == VOID) {
            throw new RuntimeException("can't use VOID: " + this + " ==/!= " + o); //TODO: Change msg.
        }
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        KaonData that = (KaonData) o;
        if (this.isNumber() && that.isNumber()) {
            double diff = Math.abs(this.asDouble() - that.asDouble());
            return diff < 0.00000000001;
        } else {
            return this.data.equals(that.data);
        }
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    public Double asDouble() {
        return ((Number) data).doubleValue();
    }

    public Long asLong() {
        return ((Number) data).longValue();
    }

    public Boolean asBoolean() {
        return (Boolean) data;
    }

    public String asString() {
        return (String) data;
    }

    @SuppressWarnings("unchecked")
    public List<KaonData> asList() {
        return (List<KaonData>) data;
    }

    public boolean isBoolean() {
        return data instanceof Boolean;
    }

    public boolean isNumber() {
        return data instanceof Number;
    }

    public boolean isList() {
        return data instanceof List<?>;
    }

    public boolean isNull() {
        return this == NULL;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    public boolean isString() {
        return data instanceof String;
    }

    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(data);
    }
}
