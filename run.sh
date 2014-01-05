OLD=`pwd`
FILE=`readlink -f $0`
DIR=`dirname "$FILE"`
cd $DIR

lli -load=include/helper.so $1

cd $OLD
