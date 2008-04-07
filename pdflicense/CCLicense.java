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

public class CCLicense {

	private String version="3.0";

	private String url;
	private String text;
	private String name;
	private String fullName;
	
	public CCLicense(String name, String version) throws LicenseException {
		this.version = version;
		initFields(name);
	}
	
	public CCLicense(String name) throws LicenseException {
		initFields(name);
	}
		
	private void initFields(String name) throws LicenseException {
		this.name = name;
		if (name.equalsIgnoreCase("by-nc-nd")) {
			fullName = "Attribution-NonCommercial-NoDerivs";	
		} else if (name.equalsIgnoreCase("by-nc-sa")) {
			fullName = "Attribution-NonCommercial-ShareAlike";	
		} else if (name.equalsIgnoreCase("by-nc")) {
			fullName = "Attribution-NonCommercial";	
		} else if (name.equalsIgnoreCase("by-sa")) {
			fullName = "Attribution-ShareAlike";	
		} else if (name.equalsIgnoreCase("by-nd")) {
			fullName = "Attribution-NoDerivs";	
		} else if (name.equalsIgnoreCase("by")) {
			fullName = "Attribution";	
		} else {
			throw new LicenseException("Non existing license selected");
		}
		url = "http://creativecommons.org/licenses/"+name+"/"+version+"/";
		text = "This work is licensed to the public under the Creative Commons "+fullName+" "+version+" License.";
	}

	public String getUrl() { return url; }
	public String getText() { return text; }

	public static String[] getCCLicenseList() {
		String[] list = new String[6];
		list[0]="by";
		list[1]="by-nc";
		list[3]="by-sa";
		list[2]="by-nd";
		list[5]="by-nc-sa";
		list[4]="by-nc-nd";
		return list;
	}

	public static String getLicenseVersionAvail() {
		return "3.0";
	}
	
	public String getShortName() {
		return name;
	}
}


