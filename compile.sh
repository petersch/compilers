FILE=`readlink -f $0`
DIR=`dirname "$FILE"`
cd $DIR

java -cp build/classes:lib/antlr-4.1-complete.jar compiler.Compiler $1 > $2

