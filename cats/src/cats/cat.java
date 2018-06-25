package cats;

public class cat {

	public cat(String eyes,String fur, boolean tired) {
	}
	
	public String eat(String food) {
		boolean hungry = true;
		if (food != "tuna") {
			return "I can't eat that!";
		}
		else {
			return "I don't know how people could find this gross!";
		}
	}
	public static void sleep() {
		boolean sleeptalk = true;
	}
	
	public static void main(String [] args) {
		int hoursslept = 0;
		boolean tired = false;
		
		cat Avni = new cat("brown", "green", false);
		if (tired == true) {
			sleep();
		}
		
		while (tired) {
			sleep();
			hoursslept = hoursslept + 1;
			if (hoursslept == 8) {
				break;
			}
		}
		
	}
}
