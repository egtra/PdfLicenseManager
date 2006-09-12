/*
 * This file is part of PdfLicenseManager.
 *
 * Copyright (C) 2006  Enrico Masala
 *
 * PdfLicenseManager is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * PdfLicenseManager is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *
 * Author: Enrico Masala   < masala _at-symbol_ polito dot it >
 * Date: Jun 30, 2006
 *
 * Please cite the original author if you extend or modify this program
 */

package pdflicense;

/**
 * Generic info about a license
 */
public class License {

	private String ccLicense;
	private String mark;
	private String webStatement;
	private String rightsText;

	public License() throws LicenseException {
		ccLicense = "";
		mark = "";
		webStatement = "";
		rightsText = "";
	}

	public String toString() {
		return "Marked: "+mark+"\nWebStatement: "+webStatement+"\nrightsText: "+rightsText+"\nCCLicense: "+ccLicense+"\n";
	}
	public String toHtmlString() {
		return "<font color=\"blue\">Marked:</font> "+mark+
			"<br><font color=\"blue\">WebStatement: </font>"+webStatement+
			"<br><font color=\"blue\">rightsText: </font>"+rightsText+
			"<br><font color=\"blue\">CCLicense: </font>"+ccLicense+"<br>";
	}

	public void setCCLicense(String s) { ccLicense = s; }
	public void setLicenseMark(String s) { mark = s; }
	public void setLicenseWebStatement(String s) { webStatement = s; }
	public void setRightsText(String s) { rightsText = s; }

	public String getCCLicense() { return ccLicense; }
	public String getLicenseMark() { return mark; }
	public String getLicenseWebStatement() { return webStatement; }
	public String getRightsText() { return rightsText; }

}

