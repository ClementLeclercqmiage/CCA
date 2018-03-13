
public class Abr {
	private int valeur;
	private Abr sag ;
	private Abr sad;
	protected static int compteur=0;
	
	public Abr() {
	}


	public Abr(int valeur, Abr sag, Abr sad) {
		this.valeur = valeur;
		this.sag = sag;
		this.sad = sad;
	}

	
	public static Abr insert(Abr a, int nb) {
		
		if(a==null) {
			return new Abr (nb,null,null);
		}
		
		if(nb>a.valeur) {
			a.sad = insert(a.sad,nb);
		}
		else {
			a.sag = insert(a.sag,nb);
		}
		
		return a;
	}
	
	
	public static void parcoursInf(Abr a) {
		if(a != null) {
			parcoursInf(a.sad);
			System.out.println(a.valeur);
			parcoursInf(a.sag);
		}
		
	}
	
	
	
	public static void parcoursPref(Abr a) {
		if(a != null) {
			System.out.println(a.valeur);
			parcoursPref(a.sad);
			parcoursPref(a.sag);
		}
		
	}
	
	
	public static void parcoursPost(Abr a) {
		if(a != null) {
			parcoursPost(a.sad);
			parcoursPost(a.sag);
			System.out.println(a.valeur);
		}
		
	}

	public static int profondeur(Abr a) {
		if(a != null) {
			Abr.compteur++;
			profondeur(a.sad);
			profondeur(a.sag);
		}
		return (int)(Abr.compteur/2);
	}
	
	public static Abr creeAbr(int n, int p) {
		Abr a = new Abr();
		int nb= 1 + (int)(Math.random() * ((n - 1) + 1));
				insert(a,nb);
		return a;}
	
	
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Abr getSag() {
		return sag;
	}

	public void setSag(Abr sag) {
		this.sag = sag;
	}

	public Abr getSad() {
		return sad;
	}

	public void setSad(Abr sad) {
		this.sad = sad;
	}

}
