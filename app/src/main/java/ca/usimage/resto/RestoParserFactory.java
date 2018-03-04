package ca.usimage.resto;

import ca.usimage.resto.AndroidSaxParser;




public abstract class RestoParserFactory {

//	static String feedUrl = "http://ville.montreal.qc.ca/pls/portal/portalcon.contrevenants_recherche?p_mot_recherche=,tous.2011";
//	static String feedUrl = "http://depot.ville.montreal.qc.ca/inspection-aliments-contrevenants/data.xml";
	static String feedUrl =  "http://donnees.ville.montreal.qc.ca/dataset/a5c1f0b9-261f-4247-99d8-f28da5000688/resource/92719d9b-8bf2-4dfd-b8e0-1021ffcaee2f/download/inspection-aliments-contrevenants.xml";
//	static String feedUrl = "http://jbagdoo.crabdance.com";
	public static RestoParser getParser() {
		
				return new AndroidSaxParser(feedUrl);
	
		
		}
	}


