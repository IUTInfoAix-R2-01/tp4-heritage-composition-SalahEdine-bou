package cycle;
import java.util.Random;

public class Velo {
        private static double DEFAUT_BRAQUET = 13.0;

        private double braquet;
        private double diamRoue;
        private Random genAlea; 
        
        
        public Velo(double braquet, double diamRoue) 
        {
        	this.braquet = braquet;
        	this.diamRoue = diamRoue;
        	this.genAlea = new Random(); 
        }

        public Velo(double braquet) 
        {
        	this(braquet, 0.0);
        }

        public Velo() 
    	{
        	this(DEFAUT_BRAQUET, 0.0);
    	}

        public static double getDEFAUT_BRAQUET() 
        {
        	return DEFAUT_BRAQUET;
        }

        public static void setDEFAUT_BRAQUET(double defautBraquet) 
        {
        	DEFAUT_BRAQUET = defautBraquet;
    	}

    
        public double getBraquet() 
        {
        	return braquet;
        }

        public void setBraquet(double braquet)
        {
        	this.braquet = braquet;
        }

        public double getDiamRoue() 
        {
        	return diamRoue;
        }

        public void setDiamRoue(double diamRoue)
        {
        	this.diamRoue = diamRoue;
        }

    
        public Random getGenAlea()
        {
        	return genAlea;
        }

        public void setGenAlea(Random genAlea) 
        {
        	this.genAlea = genAlea;
        }

    
        public double getPuissance(double FrequenceCoupsDePedale) 
        {
        	return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
        }

        public String toString() 
        {
        	return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
        }
        
        public static void main(String[] args)
        {
            Velo ahTeck = new Velo(10.0, 5.0);
            System.out.println(ahTeck);
            ahTeck.getGenAlea();
            System.out.println(ahTeck);
            System.out.println(ahTeck.getGenAlea().nextDouble());
            System.out.println(ahTeck.getPuissance(DEFAUT_BRAQUET));

            
        }
}