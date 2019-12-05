class Symbol {
    constructor(name, type=null) {
        this.name = name;
        this.type = type;
    }

    getName() {
        return this.name;
    }

    getType() {
        return this.type;
    }

    toString() {
        return `Symbol(${this.getName()}, ${this.getType()})`;
    }

    static create(name, type) {
        return new this(name, type);
    }
}

module.exports = Symbol;