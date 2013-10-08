/**
 *	@filename URLFootPrintAnalyzer.Domain
 *
 * 	To manage subsets of lists within a domain
 */

package URLFootPrintAnalyzer;

/**
 * @author Richard Pyke
 * @author Jordan Willis
 */
public class Domain {

	private String name;

	// <- define the three lists every domain requires (private)

	public Domain(String name) {
		this.setName(name);
	}

	//TODO: IMPLEMENT: add the element to the proper list	
	public void addAuB(String url){
		
	}
	
	//TODO: IMPLEMENT: add the element to the proper list	
	public void addExA(String url){
		
	}
	
	//TODO: IMPLEMENT: add the element to the proper list
	public void addExB(String url){
		
	}
	
	// --- Getters/Setters ----------------------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//TODO: IMPLEMENT: getters (no setters) for the lists
}
