package sw9;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Kundenmanager kMan = new Kundenmanager();
		Offertenmanager oMan = new Offertenmanager(kMan);

		String cmdInput = "";
		Scanner keyScan = new Scanner(System.in);
		while (!cmdInput.equals("exit")) {
			System.out.print("\nCMD>");
			cmdInput = keyScan.nextLine();
			if (cmdInput.equals("addKunde")) {
				System.out.print("Name>");
				String name = keyScan.nextLine();
				System.out.print("Adresse>");
				String adresse = keyScan.nextLine();
				System.out.print("UID>");
				String uid = keyScan.nextLine();
				kMan.addKunde(name, adresse, uid);
			} else if (cmdInput.equals("setMarge")) {
				try {
					System.out.print("Kundennummer>");
					int kundenNo = keyScan.nextInt();
					keyScan.nextLine();
					System.out.print("Marge>");
					double marge = keyScan.nextDouble();
					keyScan.nextLine();
					kMan.getKunde(kundenNo).setMarge(marge);
				}
				catch (Exception es) {
					System.out.print("Marge konnte nicht gesetzt werden");
				}
			} else if (cmdInput.equals("printKunden")) {
				kMan.printAllKunden();
			} else if (cmdInput.equals("addOfferte")) {
				try {
					System.out.print("Kundennummer>");
					int kundenNo = keyScan.nextInt();
					keyScan.nextLine();
					System.out.print("Beschreibung>");
					String beschreibung = keyScan.nextLine();
					oMan.addOfferte(kundenNo, beschreibung);
				}
				catch (Exception es) {
					System.out.print("Beschreibung konnte nicht gesetzt werden");
				}

			} else if (cmdInput.equals("setLieferzeit")) {
				try{
					System.out.print("Offerten-Nummer>");
					int oNumber = keyScan.nextInt();
					keyScan.nextLine();
					System.out.print("Lieferzeit>");
					String lieferzeit = keyScan.nextLine();
					oMan.getOfferte(oNumber).setLieferzeit(lieferzeit);
				}
				catch (Exception es) {
					System.out.print("Lieferzeit konnte nicht gesetzt werden");
				}
			} else if (cmdInput.equals("setEinkaufspreis")) {
				System.out.print("Offerten-Nummer>");
				int oNumber = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Einkaufspreis>");
				double preis = keyScan.nextDouble();
				keyScan.nextLine();
				oMan.getOfferte(oNumber).setEinkaufspreis(preis);

			} else if (cmdInput.equals("printOfferten")) {
				oMan.printAllOfferten();
				
			}
		}
		keyScan.close();
	}
}
