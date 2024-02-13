import java.util.Scanner;

public class covidCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the Information to be displayed");
		String info = sc.next();
		String[] countryName = {"USA","India","France","Germany","Brazil"};
		
		int[][] covidCases = {
				{110316061,1084810,108040186,1191065},
				{45018134,0,0,0},
				{40138560,0,39970918,167642},
				{38780921,359743,38240600,180578},
				{38210864,1253065,36249161,708638}
		};
		
		
		
		//Active Cases
		if(info == "Active Cases") {
			System.out.println("CountryName\tActiveCases");
			for(int i=0;i<covidCases.length;i++) {
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.println(countryName[i]+":"+covidCases[i][1]);
				}
				System.out.println();
			}
		}
		else if(info == "Total Cases") {
			System.out.println("CountryName\tTotalCases");
             for(int i=0;i<covidCases.length;i++) {
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.println(countryName[i]+":"+covidCases[i][0]);
				}
				System.out.println();
			}
		}
		else if(info == "Recovered Cases") {
			System.out.println("CountryName\tRecoveredCases");
                for(int i=0;i<covidCases.length;i++) {
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.println(countryName[i]+":"+covidCases[i][2]);
				}
				System.out.println();
			}
		}
		else if(info == "Diseased"){
			System.out.println("CountryName\tDeaths");
                for(int i=0;i<covidCases.length;i++) {
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.println(countryName[i]+":"+covidCases[i][3]);
				}
				System.out.println();
			}
		}
		else if(info.equalsIgnoreCase("Country")) {
			int idx = -1;
			System.out.println("Enter the Country name");
			String cn = sc.nextLine();
			for(int i=0;i<countryName.length;i++) {
				if(cn.equalsIgnoreCase(countryName[i])) {
					idx = i;
					System.out.println(countryName[idx]);
					for(int elements:covidCases[idx]) {
						System.out.print(elements+"\t");
					}
				}
				else {
					System.out.println("Invalid Country Name");
				}
			}
			//System.out.println("Country Name\tTotal Cases\tActive Cases\tRecovered Cases\tDeaths");	
			//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			/**for(int i=0;i<covidCases.length;i++) {
				System.out.print(countryName[i]);
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.println(covidCases[i][j]+"\t");
				}
				System.out.println();
			}**/
			}
		else {
			System.out.println("Country Name\tTotal Cases\tActive Cases\tRecovered Cases\tDeaths");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			for(int i=0;i<covidCases.length;i++) {
				System.out.println(countryName[i]);
				
				
				for(int j=0;j<covidCases[i].length;j++) {
					System.out.print(covidCases[i][j]+"\t");
					
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
