package grupo.t4_proyecto.model.entidad;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tour")
public class tour implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tour_id")
    private Long tour_id;

    @Column(name = "tour_nombre")
    private String tour_nombre;

    @Column(name = "tour_descripcion")
    private String tour_descripcion;

    @Column (name = "tour_destino")
    private String tour_destino;
    
    @Column (name = "tour_precio")
    //BigDecimal para representar valores decimales
    private BigDecimal  tour_precio;

    //Se ingresa Lob ya que en la base de datos se guardó como LONGBLOB
    //se indica con esto que son datos binarios
    @Lob
    @Column(name = "tour_imagen", columnDefinition = "LONGBLOB")
    //byte para almacenar la imagen como un arreglo de bytes
    private String tour_imagen;

    //GETTERS AND SETTERS

    public Long getTour_id() {
        return tour_id;
    }

    public void setTour_id(Long tour_id) {
        this.tour_id = tour_id;
    }

    public String getTour_nombre() {
        return tour_nombre;
    }

    public void setTour_nombre(String tour_nombre) {
        this.tour_nombre = tour_nombre;
    }

    public String getTour_descripcion() {
        return tour_descripcion;
    }

    public void setTour_descripcion(String tour_descripcion) {
        this.tour_descripcion = tour_descripcion;
    }

    public String getTour_destino() {
        return tour_destino;
    }

    public void setTour_destino(String tour_destino) {
        this.tour_destino = tour_destino;
    }

    public BigDecimal getTour_precio() {
        return tour_precio;
    }

    public void setTour_precio(BigDecimal tour_precio) {
        this.tour_precio = tour_precio;
    }

    public String getTour_imagen() {
        return tour_imagen;
    }

    public void setTour_imagen(String tour_imagen) {
        this.tour_imagen = tour_imagen;
    }

    
}
