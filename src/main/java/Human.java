// context
public class Human {

	public String name;
	// state
	private State state = null;

	public Human(String name) {
		this.name = name;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void morningGreet() {
    	// 委譲
    	this.state.morningGreet();
    }

}
