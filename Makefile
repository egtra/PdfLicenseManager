all: itext.jar binary
	

itext.jar:
	wget http://internap.dl.sourceforge.net/sourceforge/itext/itext-1.4.2.jar -O itext.jar

binary: itext.jar
	(CLASSPATH=itext.jar javac pdflicense/*.java pdflicense/gui/*.java)
clean:
	(cd pdflicense ; rm -f *.class */*.class)
	rm -fv itext.jar

com_clean:
	rm -rf com

pdflicensemanager.jar: com_clean binary
	unzip itext.jar -x META-INF/MANIFEST.MF
	jar cvf pdflicensemanager.jar pdflicense/gui/*.class \
	pdflicense/*.class  itext.jar META-INF/MANIFEST.MF  com/*
