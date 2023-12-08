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
@Table(name = "hotel")
public class hotel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long hotel_id;

    @Column(name = "hotel_nombre")
    private String hotel_nombre;

    @Column(name = "hotel_capacidad")
    private String hotel_capacidad;

    @Column (name = "hotel_precio")
    //BigDecimal para representar valores decimales
    private BigDecimal hotel_precio;

    //Se ingresa Lob ya que en la base de datos se guardó como LONGBLOB
    //se indica con esto que son datos binarios
    @Lob
    @Column(name = "hotel_imagen", columnDefinition = "LONGBLOB")
    //byte para almacenar la imagen como un arreglo de bytes
    private String hotel_imagen;
    //GETTERS AND SETTERS


    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_nombre() {
        return hotel_nombre;
    }

    public void setHotel_nombre(String hotel_nombre) {
        this.hotel_nombre = hotel_nombre;
    }

    public String getHotel_capacidad() {
        return hotel_capacidad;
    }

    public void setHotel_capacidad(String hotel_capacidad) {
        this.hotel_capacidad = hotel_capacidad;
    }

    public BigDecimal getHotel_precio() {
        return hotel_precio;
    }

    public void setHotel_precio(BigDecimal hotel_precio) {
        this.hotel_precio = hotel_precio;
    }

    public String getHotel_imagen() {
        return hotel_imagen;
    }

    public void setHotel_imagen(String hotel_imagen) {
        this.hotel_imagen = hotel_imagen;
    }


}
