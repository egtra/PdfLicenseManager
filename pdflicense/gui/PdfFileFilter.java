package pdflicense.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PdfFileFilter extends FileFilter {

	public PdfFileFilter() {
	}
	
	public boolean accept(File f) {
		if (f.isDirectory())
			return true;
		if (hasExtension(f, ".pdf"))
			return true;
		return false;
	}

	public String getDescription() {
		return "PDF files";
	}
	
	private boolean hasExtension(File f, String ext) {
		String fName = f.getName();
		int idx = fName.lastIndexOf('.');
		if (idx>=0) {
			String fExt = fName.substring(idx, fName.length());
			if (ext.equalsIgnoreCase(fExt))
				return true;
		}
		return false;
	}

}
