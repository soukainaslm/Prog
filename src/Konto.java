public class Konto {
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    private String navn;
    private String kontonr;
    private double saldo;

    //  Kontruktør som skal gi startverdier til ALLE attributtene

    public Konto(String navn, String kontonr,double saldo){
        this.navn = navn;
        this.kontonr = kontonr;
        this.saldo = saldo;

    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    public void skrivUt(){
        String ut= " NAVN: " + navn + "\n" +
                    "KONTONUMMER: " + kontonr + "\n" +
                    "SALDO: " + saldo;
        System.out.println(ut);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    public  String settInn(double beløp){
        saldo += beløp;
        return "Nye saldo " + saldo;

    }

    public String taUt(double beløp){
        String ut ="";
        if(beløp <= saldo){
            saldo = saldo - beløp;
            ut= "Den nye saldo er " + saldo;
        }
        else{
            ut= "Ikke dekning";
        }
        return ut;
    }








}
