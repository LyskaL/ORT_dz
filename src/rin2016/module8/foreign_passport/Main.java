package rin2016.module8.foreign_passport;

public class Main {

	public static void main(final String[] args) {
		
		Passport p = null;
		if(ReaderValidator.isValidPassport("Lyska", "Lyuda", "Yuriivna", "13.02.1993", "Ukraine, Dnepr, Topol-2", "ukrainian")) {
			p = new Passport("Lyska", "Lyuda", "Yuriivna", "13.02.1993", "Ukraine, Dnepr, Topol-2", "ukrainian");
		}
		//System.out.println(p.toString());
		
		ForeingPassport fp = new ForeingPassport(null);
		System.out.println(fp.toStringForeingPassport());
	}

}