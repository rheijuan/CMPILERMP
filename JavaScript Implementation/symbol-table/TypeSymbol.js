const Symbol = require('./Symbol');

class TypeSymbol extends Symbol {
    toString() {
        return `TypeSymbol(${this.getName()})`;
    }

    static create(name) {
        return new this(name);
    }
}

module.exports = TypeSymbol;