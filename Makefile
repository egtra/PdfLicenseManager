all: itext.jar binary
	

itext.jar:
	wget http://internap.dl.sourceforge.net/sourceforge/itext/itext-1.4.2.jar -O itext.jar

binary:
	(CLASSPATH=itext.jar javac pdflicense/*.java pdflicense/gui/*.java)
clean:
	(cd pdflicense ; rm -f *.class */*.class)
	rm -fv itext.jar
