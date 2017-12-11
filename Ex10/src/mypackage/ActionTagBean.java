package mypackage;
import java.io.Serializable;

public class ActionTagBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	public ActionTagBean() {
		
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
