 /**
 * 
 * 
 * 
 */
public class hijo3 extends padre {
    private String dormir;

    public hijo3() {
        super();
    }

    public hijo3(int id, String nombre, String apellidos, int edad, String dormir ) {
        super(id, nombre, apellidos, edad);
        this.dormir = dormir;
    }

    public String getDormir() {
        return dormir;
    }

    public void setDormir(String Dormir) {
        this.dormir = dormir;
    }

    public void dirirseCama() {
        System.out.println("Dirigerse a la cama");
    }
}