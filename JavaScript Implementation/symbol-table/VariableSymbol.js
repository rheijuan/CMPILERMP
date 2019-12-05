const Symbol = require('./Symbol');

class VariableSymbol extends Symbol {
  constructor(name, type, isConstant = false, value=null) {
    super(name,type);
    if(value != null) 
      this.value = value
    else if(type.name === "INTEGER")
      this.value = 0
    else if(type.name === "STRING" || type.name === "CHAR")
      this.value = ''
    else if(type.name === "BOOLEAN")
      this.value = false
    else if(type.name === "FLOAT" || type.name === "DOUBLE") 
      this.value = 0.0 
    this.isConstant = isConstant;
    }

    setValue(value) {
      this.value = value;
    }
    
    toString() {
      return `VariableSymbol(${this.getName()}, ${this.getType()},${this.value})`;
    }

    static create(name, type, isConstant, value) {
      return new this(name, type, isConstant, value);
    }
  }
  
  module.exports = VariableSymbol;