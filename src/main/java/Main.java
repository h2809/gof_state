
public class Main {

	public static void main(String[] args) {
		Human yoshida = new Human("Yoshida");

		yoshida.setState(new BadMoodState());
		yoshida.morningGreet();

		yoshida.setState(new OrdinaryState());
		yoshida.morningGreet();
	}

}
