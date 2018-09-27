package jeuxvie;

public class Bestiole {
	
	public static final String VIVANTE = "vert";
	public static final String MORTE = "rouge";
	public static final String VIRTUELLE = "noire";
	
	private static int NB_BESTIOLE = 0;
	private final int NUM_BESTIOLE;
	
	private int number;
	private String couleur;

	
	
	public Bestiole(String couleur) {
		super();
		this.couleur = couleur;
		NB_BESTIOLE++;
		NUM_BESTIOLE = NB_BESTIOLE;
	}
	
	
	public boolean isVivante() {
		return this.couleur.equals(this.VIVANTE);
	}

	
	public Bestiole() {
		
		NB_BESTIOLE++;
		NUM_BESTIOLE = NB_BESTIOLE;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	@Override
	public String toString() {
		return "bestiole " + this.NUM_BESTIOLE + " (" + (this.isVivante()? "vivante" : "morte") + ") " ;
	}
	
	
	

}
