abstract class Hospital
{
	abstract void doctors();
	abstract void patients();
	abstract void beds();
	abstract void equipment();
	
}
public class AnanymousInnerClass2 {

	public static void main(String[] args) {
		Hospital yakuza = new Hospital() {
			void doctors() 
			{
				System.out.println("There are over 20 doctors working in the Yakuza Hospital");
			}

			void patients()
			{
				System.out.println("An average of 200 patients will be treated per day in Yakuza");		
			}

			void beds() 
			{
				System.out.println("There are a total of 300 beds in the hospital");		
			}

			
			void equipment() 
			{
				System.out.println("All types of hospital equipment is available in yakuza");
			}		
		};
		yakuza.doctors();
		yakuza.patients();
		yakuza.beds();
		yakuza.equipment();
	}

}
