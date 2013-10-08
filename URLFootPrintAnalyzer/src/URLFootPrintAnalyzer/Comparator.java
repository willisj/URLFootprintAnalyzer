package URLFootPrintAnalyzer;

import java.io.File;
import java.util.HashMap;
import java.util.Vector;

public class Comparator {

	static public HashMap<String, String> compareFiles(File fileA, File fileB) {

		
		Vector<Domain> domainAuB = new Vector<Domain>();
		Vector<String> domainExA = new Vector<String>();
		Vector<String> domainExB = new Vector<String>();
		
		// TODO: IMPLEMENT: do all the stuff here
		// TODO: NOTE: make sure to create Domain first
		
		
		
		
		
		
		// --- Compute Results
		HashMap<String, String> resultSet = new HashMap<String, String>();

		// We're just casting everything to string for now
		resultSet.put("fileA", fileA.toString());
		resultSet.put("fileB", fileB.toString());

		return resultSet;
	}
}
