    
const Symbol = require('./Symbol');

class ArraySymbol extends Symbol {
    constructor(name, type, startIndex, endIndex) {
        super(name,type);
        this.startIndex = startIndex
        this.endIndex = endIndex;
        this.arrayValues = []
        for(var i = startIndex; i <= endIndex; i++)
          this.arrayValues.push(0)
    }

    toString() {
      return `ArraySymbol(${this.getName()}, ${this.getType()}, ${this.startIndex}, ${this.endIndex})`;
    }

    static create(name, type, startIndex, endIndex) {
      return new this(name, type, startIndex, endIndex);
    }
  }
  
  module.exports = ArraySymbol;