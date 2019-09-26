import static javax.swing.JOptionPane.showMessageDialog;

public class Person {
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;

    public static int regnAlder(int fødselsår){
        int alder = 2019 - fødselsår;
        return alder;

    }
    public Person(String navn, String adresse, String telefonnr, int fødselsår){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.fødselsår = fødselsår;
    }
    public String getNavn(String navn){
        return navn;
    }
    public String getAdresse (String adresse){
        return adresse;
    }
    public String getTelefonnr(String telefonnr){
        return telefonnr;
    }

    public void skrivUt(){
        /*
        String ut = navn + " med adresse " + adresse + " med telefonnr " + telefonnr +
                " er " + regnAlder(fødselsår) + " år";
        System.out.println(ut);*/
        String ut = "Navn: " + navn + "\n" +
                    "Adresse: " + adresse + "\n" +
                    "Telefonnr: " + telefonnr + " \n" +
                    "Alder: "  + fødselsår + " år";
        showMessageDialog(null, ut);
    }

}
