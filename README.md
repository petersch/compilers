jazzik
======

Description
-----------

**Jazzik** (pronounced \[[d͡ʒɛziːk](http://en.wikipedia.org/wiki/International_Phonetic_Alphabet)\])
is an imperative structured programming language
with support for integers and integer arrays.
It compiles to LLVM.

Contents
--------

* `specs/` contains original language specification
* `grammar/` contains grammar for **Jazzik** used by ANTLR
* `src/parser/` contains generated ANTLR parser source files
* `src/compiler/` contains compiler source files
* `include/` contains C files compiled and linked to final output
* `examples/` contain example programs

Usage
-----

lli binary must be installed

1. `build.sh` builds parser
2. `compile.sh input.jz output.ll` compiles program
3. `run.sh output.ll` runs compiled code


