/**
 * 
 * 
 * 
 */
public class hijo1 extends padre {
    private int correr;
    private String comer;

    public hijo1() {
        super();
    }

    public hijo1(int id, String nombre, String apellidos, int edad, int correr, String comer) {
        super(id, nombre, apellidos, edad);
        this.correr = correr;
        this.comer = comer;
    }

    public int getCorrer() {
        return correr;
    }

    public void setCorrerl(int correr) {
        this.correr = correr;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String demarcacion) {
        this.comer = comer;
    }

    public void preparaComida() {
        System.out.println("Prepara la comida");
    }

    public void entrenar() {
        System.out.println("Entrena");
    }

}