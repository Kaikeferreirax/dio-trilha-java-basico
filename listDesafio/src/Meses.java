public class Meses {



    private String nomeMes;
    private double temperatura;


    public Meses(String nomeMes, double temperatura) {
        this.nomeMes = nomeMes;
        this.temperatura = temperatura;
    }


    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------\n");
        sb.append("Mês: "+ nomeMes + "\n");
        sb.append("Temperatura: "+ temperatura + "\n");


        return sb.toString();
    }
}
