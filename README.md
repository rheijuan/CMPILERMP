# CMPILER-Interpreter-System

A Simple Interpreter system with using antlr4

Things To Do:
-----

 - [ ] Main
    - [ ] Loops
    - [ ] Functions
    - [ ] **SCOPE**
 - [ ] [Semantic Analsysis](https://ruslanspivak.com/lsbasi-part13/).
    - [ ] Variables must be declared before they are used
    - [ ] Variables must have matching types when used in arithmetic expressions (this is a big part of semantic analysis called type checking that we�ll cover separately)
    - [ ] There should be no duplicate declarations (Pascal prohibits, for example, having a local variable in a procedure with the same name as one of the procedure�s formal parameters)
    - [ ] A name reference in a call to a procedure must refer to the actual declared procedure (It doesn�t make sense in Pascal if, in the procedure call foo(), the name foo refers to a variable foo of a primitive type INTEGER)
    - [ ] A procedure call must have the correct number of arguments and the arguments� types must match those of formal parameters in the procedure declaration


DONE
-----

 - [x] Initial Javafx GUI by Rhei
 - [x] Initial Symbol Table Logic
 - [x] Constant Declaration
 - [x] Variable Assignment
 - [x] Assignment
 - [x] Input/Output
 - [x] Conditional
  
 LICENSE
-----

All of our code is MIT licensed. All other content and libraries follow their respective licenses.