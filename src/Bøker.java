import static javax.swing.JOptionPane.showMessageDialog;

public class Bøker {

    public String tittel;
    public double pris;
    public String forfatter;
    public String iSBNnr;

    public void skrivUt (){
        String ut = "Tittel: " + tittel + "\n" +
                    "Pris: " + pris + "\n" +
                    "Forfatter: "+ forfatter + "\n" +
                    "iSBN-nummer: " + iSBNnr;
        //System.out.println(ut);
        showMessageDialog(null, ut);
    }
}
