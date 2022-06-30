
package Model;


public class Producto {
    private int id_producto;
    private String nom_producto;
    private int categoria_id;
    private int stock;
    private int precio;
    private String unidadMedida;
    private int estado;
    private Categoria categoria;
    
    public Producto() {
         this.id_producto = 0;
         this.nom_producto = "";
         this.categoria = new Categoria();
         this.precio = 0;
         this.unidadMedida = "";
    }

    public Producto(int id_producto) {
        this.id_producto = 0;
    }
    
    public Producto(int id_producto, String nom_producto, int categoria_id, int stock, int precio, String unidadMedida, int estado, Categoria categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.categoria_id = categoria_id;
        this.stock = stock;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
        this.categoria = categoria;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
