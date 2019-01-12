package user;

import java.time.LocalDate;
import java.time.Month;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		
		/*encapsulation.setId(1);
		encapsulation.setcivilite("MR");
		encapsulation.setLogin("samoulos");
		encapsulation.setNom("LA TORTUE");
		encapsulation.setPrenom("samy");
		encapsulation.setEmail("samy@latortue.litoral");
		encapsulation.setTelFixe("0467");
		encapsulation.setTelPortable("0630");
		encapsulation.setDate(LocalDate.of(2018, Month.DECEMBER, 10));
		encapsulation.setPw(encapsulation.calculePw()); */
		
		encapsulation.affichage();
		
		encapsulation=null;
		System.gc();
		
		System.out.println("j'ai detruit encapsulation");
		Encapsulation encapsulation2 = new Encapsulation(2,"Mmlle","ginette","LEOPS",
			"Marceline","leops@marceline.fr","0467565656",
			"0658585854",LocalDate.of(2018, Month.DECEMBER, 10));
		//encapsulation2.setPw(encapsulation2.calculePw());
		
		encapsulation2.affichage();
		
		encapsulation2=null;
		System.gc();
		
		Encapsulation encapsulation3 = new Encapsulation();
		
		encapsulation3.setId(5);
		encapsulation3.setcivilite("Mme");
		encapsulation3.setLogin("claudio");
		encapsulation3.setNom("lino");
		encapsulation3.setPrenom("claudio");
		encapsulation3.setEmail("claudio@email.fr");
		encapsulation3.setTelFixe("0456565");
		encapsulation3.setTelPortable("06585858");
		encapsulation3.setDate(LocalDate.of(2018, Month.DECEMBER, 10));
		encapsulation3.setPw(encapsulation3.calculePw());
		
		encapsulation3.affichage();
		
		encapsulation3=null;
		System.gc();
		
		Encapsulation encapsulation4 = new Encapsulation(encapsulation3);
		System.out.println(encapsulation4.getNom());
		encapsulation4.affichage();
	}
	}
