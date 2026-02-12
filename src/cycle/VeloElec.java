package cycle;

public class VeloElec extends Velo
{
	private static double DEFAUT_FACTEUR_PUISSANT_MOTEUR = 15.0;
	private double FacteurPuissanceMoteur;
	
	
	public VeloElec ()
	{
		super();
		this.FacteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANT_MOTEUR;
		
	}
	
	public VeloElec(double diamRoue, double facteurPuissance)
	{
		super(diamRoue);
		this.FacteurPuissanceMoteur = facteurPuissance;	
	}
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissance)
	{
		super(braquet, diamRoue);
		this.FacteurPuissanceMoteur = facteurPuissance;
	}
	
	
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR()
	{
		return DEFAUT_FACTEUR_PUISSANT_MOTEUR ;
	
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR)
	{
		DEFAUT_FACTEUR_PUISSANT_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;	
	}
	
	public double getFacteurPuissanceMoteur()
	{
		return FacteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissance)
	{
		this.FacteurPuissanceMoteur = facteurPuissance;
	}
	
	public double getPuissance(double FrequenceCoupsDePedale)
	{
		return super.getPuissance(FrequenceCoupsDePedale) * fact
	}

	public String toString()
	{
		return "VeloElec [facteurPuissanceMoteur =" + FacteurPuissanceMoteur + "]";
	}
	
	
	public static void main(String[] args)
    {
        VeloElec VE1 = new VeloElec();
        System.out.println(VE1);
        System.out.println("braquet :" + VE1.getBraquet());
        System.out.println("diametre :" + VE1.getDiamRoue() );
        

        
    }
	
}
