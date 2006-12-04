if [ ! -e itext-1.4.2.jar ]; then
	echo ""
	echo "ERROR: The program cannot be run without the itext library"
	echo "First you must download the itext-1.4.2.jar library (check http://www.lowagie.com/iText/)"
	echo "Please put the file in the current directory"
	echo ""
else
	java  -classpath itext-1.4.2.jar:.  pdflicense/gui/MainWin  $1 $2 $3 $4 $5 $6 $7 $8 $9
fi

