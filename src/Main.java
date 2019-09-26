import javax.swing.*;
import  static javax.swing.JOptionPane.*;



public class Main {

    public static void main(String[] args) {
/*
        // Variabler 1
        String navn = showInputDialog("Skriv inn navn: ");
        String etternavn = showInputDialog("Skriv inn etternavn: ");
        String alder = showInputDialog("Skriv inn alder: ");
        String adresse = showInputDialog("Skriv inn adresse: ");
        String postSted = showInputDialog("Skriv inn postSted: ");
        String postnr = showInputDialog("Skriv inn postnr: ");

        //String ut = "Alderen til " + navn + " " + etternavn + " er "+ alder + " år";
        String ut = "Navn: " + navn + " " + etternavn + "\n"+
                    "Adresse: " + adresse + "\n" +
                    "Postnummer: " + postnr+ "\n" +
                    "Poststed: " + postSted + "\n"+
                    "Alder: " + alder + " år";

        showMessageDialog(null,ut);

        // Varibler  2

        String inntall1 = showInputDialog("Skriv inn tall1: ");
        String inntall2 = showInputDialog("Skriv inn tall2: ");
        String inntall3 = showInputDialog("Skriv inn tall3: ");

        try {

            double tall1 = Double.parseDouble(inntall1);
            double tall2 = Double.parseDouble(inntall2);
            double tall3 = Double.parseDouble(inntall3);

            double sum = tall1 + tall2 + tall3;
            double gjennomsnitt = sum / 3;

            System.out.println("Summen: " + sum + "\n" + "Gjennomsnitt: " + gjennomsnitt);
        }
        catch (Exception e){
            System.out.println(e);

        }

        // Oppgaver aritmetikk
        String navn = showInputDialog("Skriv inn navn: ");
        String innalder = showInputDialog("Skriv inn alder: ");

        int alder = Integer.parseInt(innalder);

        int fødselsår = 2019- alder;
        int pensjonist = fødselsår + 67;

        String ut = navn + " er i dag " + alder + " år. Han er født i " + fødselsår
                    + ". I " + pensjonist + " er han 67 år og da vil han være pensjonist.";
        showMessageDialog(null, ut);


        int antall = 0;
        antall = +2;


        System.out.print(antall + " , " );
        antall = antall +2;
        System.out.print(antall + " , ");
        antall +=2;
        System.out.print(antall+ " , ");
        antall +=2;
        System.out.print(antall);



        String innlengde = showInputDialog("Skriv inn lengde: ");
        String innbredde = showInputDialog("Skriv inn bredde: ");

        double lengde = Double.parseDouble(innlengde);
        double bredde = Double.parseDouble(innbredde);

        double areal = lengde * bredde;

        String ut = "Et rektangel med bredde " + bredde + " cm og lengde " + lengde
                    + " cm har et areal på " + areal + " cm^2";

        System.out.println(ut);


        String innradius = showInputDialog("Skriv inn radius: ");
        double radius = Double.parseDouble(innradius);

        double omkrets = 2 * 3.14 * radius;

        String omkretsMedToDesimaler = String.format("%.2f",omkrets);
        String ut = "Omkretsen av en sirkel med " + radius + " som radius blir " + omkretsMedToDesimaler  +" cm.";
        System.out.println(ut);


        String innFahrenheit = showInputDialog("Skriv inn verdien for fahrenheit: ");
        double fahrenheit = Double.parseDouble(innFahrenheit);

        double celsius = (fahrenheit - 32)/1.8;

        String ut = fahrenheit + "  F blir " + celsius + " C";

        System.out.println(ut);



    String innPizza = showInputDialog("Skriv inn antall pizza: ");
    String innPersoner = showInputDialog("Skriv inn antall personer: ");
    String innAntallSlices = showInputDialog("Skriv inn antall slices per pizza");

    int pizza = Integer.parseInt(innPizza);
    int personer = Integer.parseInt(innPersoner);
    int slices = Integer.parseInt(innAntallSlices);

    int slicesprpers = (pizza * slices) / personer;
    int rest = (pizza * slices) % personer;

    String ut = "Dersom man er " + personer + " og har " + pizza + " pizzaer får hver person " +
                slicesprpers + " slices og " + rest + " blir til overs";

        System.out.println(ut);


        double tall1=1;
        double tall2=2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        System.out.println(resultat);


        String innAlder = showInputDialog("Skriv inn alder: ");

        int alder = Integer.parseInt(innAlder);

        if (alder >= 18){
            System.out.println("Du kan ta førerkort for bil");
        }
        if (alder < 18){
            System.out.println("Du er for ung til å ta førerkort");
        }

        String innTall = showInputDialog("Skriv inn et tall mellom 0 og 1000");

        int tall = Integer.parseInt(innTall);

        int tvrsum = tall % 10;
        int tversum = tall /10;
        int tvrs = tversum /10;
        int sum = tversum %10;
        int resultat = tvrs + sum + tvrsum;

        System.out.println(resultat);


    Bøker bok1 = new Bøker();
    bok1.tittel = "Boka";
    bok1.pris = 123;
    bok1.forfatter = "Bjørn bjørnsen";
    bok1.iSBNnr ="12345678";
    bok1.skrivUt();

    Person person1 = new Person();
    person1.navn ="Peter Hansen";
    person1.adresse = "Osloveien 82";
    person1.telefonnr = "12234555";
    person1.fødselsår = 1998;
    person1.skrivUt();

    Person  person2 = new Person();
    person2.navn =showInputDialog("Skriv inn navn:");
    person2.adresse = showInputDialog("Skriv inn adresse:");
    person2.telefonnr = showInputDialog("Skriv inn telefonnr: ");
    String alder = showInputDialog("Skriv inn alder: ");
    person2.fødselsår = Integer.parseInt(alder);
    person2.skrivUt();

        Kalkulator kalkulator1 = new Kalkulator();
        System.out.println(kalkulator1.addere(1,3));
        System.out.println(kalkulator1.substrahere(4,2));
        System.out.println(kalkulator1.multiplisere(3,2));
        System.out.println(kalkulator1.dividere(4,2));


      Person nyperson = new Person("Per Hansen", "Osloveien 23", "1223445", 1998);
      nyperson.skrivUt();



    BensinKjøp kjøp1 = new BensinKjøp("Grorud", "Diesel", 12.30,43.20, "12:30");
    System.out.println(kjøp1.finnTotalPrisen());


    Klokke klokke1 = new Klokke(12, 12,55);
    klokke1.visTiden();
*/


    Konto konto1 = new Konto("Per", "12345",232.30);
        System.out.println(konto1.settInn(100));
        System.out.println(konto1.taUt(300));
        konto1.skrivUt();



    }
}
