package jeuxvie;

public class Principale {

	public Principale() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bestiole b0 = new Bestiole(Bestiole.VIVANTE);
		Bestiole b1= new Bestiole(Bestiole.MORTE);
		Bestiole b2= new Bestiole(Bestiole.VIRTUELLE);
		
		b0.toString();
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
	}

}
