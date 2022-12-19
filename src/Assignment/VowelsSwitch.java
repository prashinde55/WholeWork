package Assignment;

public class VowelsSwitch {

	public static void main(String[] args) {
		
		String name ="a";
		
		switch (name){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println(name+" this is vowels");
			break;
			default:
			System.out.println(" this is consonent");
		}
	}

}
