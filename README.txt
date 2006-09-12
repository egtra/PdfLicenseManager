
PdfLicenseManager README file
-----------------------------

Copyright (C) 2006  Enrico Masala

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

Author: Enrico Masala   < masala _at-symbol_ polito dot it >
Date: Jun 30, 2006
Version: 2.0

Please cite the original author if you extend or modify this program.


INTRODUCTION
------------

This program aims to be a simple tool to manage pdf licensing information.
In particular, it is focused on inserting and managing Creative Commons licensing information.
For more info on Creative Commons, visit http://www.creativecommons.org

Please note that this program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

In short: use it at your own risk.


REQUIREMENTS
------------

To use the program, you need the itext library (which is able to manage pdf
files). The itext library can be downloaded at:
http://www.lowagie.com/iText/
You just need to download the jar file:
http://prdownloads.sourceforge.net/itext/itext-1.4.2.jar

This program has been developed using the itext library v. 1.4.2.
Please use itext v. 1.4.2 or higher.
This program has been developed using Java v. 1.4.2
Please use a Java version equal or higher than 1.4.2 .


LINUX platforms

First, download the itext-1.4.2.jar file into the current dir.

You can then run the program typing from this directory:

java -classpath itext-1.4.2.jar:. pdflicense.gui.MainWin

If the program is run without any parameter, it will show the graphical user
interface (GUI).
The program is still able to run in text mode.
Run it with one parameter (e.g. help) to get the help for textual mode.
Textual mode is useful to automate the process using, e.g., scripts.

In case you need to compile it, type:
javac -classpath itext-1.4.2.jar pdflicense/*.java  pdflicense/gui/*.java


OTHER platforms

This program has not been tested on other platforms.
However, if you have a Java 1.4.2 compliant environment (and you downloaded
the itext library), it should work, since it does not use any external or
particular features other than the itext library.

Note that, if you run java from the text interface of the command interpreter
in Windows, you need to use the ; instead of : in the -classpath argument.


EXAMPLES
--------

Show the XMP licensing info associated with a file.pdf:
Simply run the program without any parameter (to show the GUI) and open the
file.pdf using the File/Open menu

Insert the Creative Commons Attribution license into filein.pdf, creating fileout.pdf:
Once filein.pdf has been opened using the File/Open menu, select the license
and the version you want to insert, press the Update button, and then use the
File/Save as menu to save the file.

To run it in textual mode:

Show the XMP licensing info associated with a file.pdf:
java -classpath itext-1.4.2.jar:. pdflicense.ManagePdfLicense   show file.pdf

Insert the Creative Commons Attribution license into filein.pdf, creating fileout.pdf:
java -classpath itext-1.4.2.jar:. pdflicense.ManagePdfLicense   put filein.pdf fileout.pdf  by


HELP
----

Running the program with one option will show the following help screen:

PdfLicenseManager version 2.0, Copyright (C) 2006 Enrico Masala
PdfLicenseManager comes with ABSOLUTELY NO WARRANTY; for details see the enclosed LICENSE.txt file
This is free software, and you are welcome to redistribute it under certain conditions;
for details see the enclosed LICENSE.txt file

This software is licensed under GPL v.2.0
Please note that you are using it at your own risk

Usage: command  options

Commands:
help
                shows this help screen
showXMP    file.pdf
                shows the raw XMP info
show       file.pdf
                shows XMP licensing info
showToc    file.pdf
                shows pdf Toc (debug purposes only)
put        filein.pdf  fileout.pdf  <license>
                insert or update XMP licensing info, keep other info unchanged. <license> can be:
                by  by-nc  by-nd  by-sa  by-nc-nd  by-nc-sa
putforced  filein.pdf  fileout.pdf  <license>
                insert XMP licensing info removing any XMP info - use to correct corrupt XMP info
putXMP     filein.pdf  fileout.pdf  filein.xmp
                remove existing XMP and insert XMP description from file
                NB: for debug purposes only. Use put command to insert CC license



KNOWN BUGS

Since I am not an expert of XMP, the program may contain bugs or it may not work with certain files.
Always keep a copy of your original files.

Multiple XMP packets into a single pdf file are not managed by this program.

