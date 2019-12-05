const Symbol = require('./Symbol');

class FunctionSymbol extends Symbol {
    constructor(name, returnType,params = [], ctx) {
        super(name,returnType);
        this.params = params;
        this.ctx = ctx;
    }

    getParams() {
        return this.params;
    }

    toString() {
        return `FunctionSymbol(${this.name}, ${this.params}, ${this.type}, ${this.ctx})`;
    }

    static create(name, returnType, params, ctx) {
        return new this(name, returnType, params, ctx);
    }
}

module.exports = FunctionSymbol;