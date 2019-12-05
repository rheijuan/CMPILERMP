const Symbol = require('./Symbol');

class ProcedureSymbol extends Symbol {
    constructor(name, params = []) {
        super(name);
        this.params = params;
    }

    getParams() {
        return this.params;
    }

    toString() {
        return `ProcedureSymbol(${this.name}, ${this.params})`;
    }

    static create(name, params) {
        return new this(name, params);
    }
}

module.exports = ProcedureSymbol;