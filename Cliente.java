/*
 * Clase que maneja la información del cliente de la biblioteca
 * @author POO-10
 * @date 29-09-2022
 */
public class Cliente {
    private long dpi;
    private String nombre;
    private String direccion;
    private int cantPubPrestadas;
    private Prestamo[] prestamos;


    public Cliente() {
        dpi = 0;
        nombre = "";
        direccion = "";
        cantPubPrestadas = 0;
        prestamos = new Prestamo[5];
    }


    public Cliente(long dpi, String nombre, String direccion, int cantPubPrestadas) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantPubPrestadas = cantPubPrestadas;
        prestamos = new Prestamo[5];
    }


    
    /** 
     * @return long
     */
    public long getDpi() {
        return this.dpi;
    }

    
    /** 
     * @param dpi
     */
    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getDireccion() {
        return this.direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return int
     */
    public int getCantPubPrestadas() {
        return this.cantPubPrestadas;
    }

    
    /** 
     * @param cantPubPrestadas
     */
    public void setCantPubPrestadas(int cantPubPrestadas) {
        this.cantPubPrestadas = cantPubPrestadas;
    }

    
    /** 
     * @return Prestamo[]
     */
    public Prestamo[] getPrestamos() {
        return this.prestamos;
    }

    
    /** 
     * @param prestamos
     */
    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    /** 
     * Agrega un préstamo a la lista de préstamos del usuario
     * @param tipoPublicacion: 1: Libro, 2: Revista, 3: Artículo
     * @param fechaInicio
     * @param fechaFin
     * @param id
     * @param titulo
     * @param materia
     * @param cantEjemp
     * @param estado
     * @param autor
     * @param editorial
     * @param anio
     * @param numero
     * @param arbitro
     */
    public void agregarPrestamo(int tipoPublicacion, Date fechaInicio, Date fechaFin,
    int id, String titulo, String materia, int cantEjemp, String estado,
    String autor, String editorial,int anio, int numero,String arbitro
    ){
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " dpi='" + getDpi() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", cantPubPrestadas='" + getCantPubPrestadas() + "'" +
            "}";
    }


}
