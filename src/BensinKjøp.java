public class BensinKjøp {
    public String sted;
    public String bensin;
    public double liter;
    public double pris;
    public String tid;

    public BensinKjøp (String sted, String bensin, double liter, double pris, String tid){
        this.sted = sted;
        this.bensin = bensin;
        this.liter = liter;
        this.pris = pris;
        this.tid = tid;
    }
    public String getSted (){
        return sted;
    }
    public String getBensin(){
        return bensin;
    }

    public double getLiter() {
        return liter;
    }
    public double getPris(){
        return pris;
    }
    public String getTid(){
        return tid;
    }

    public  double finnTotalPrisen (){
        return  liter *  pris;
    }
}
