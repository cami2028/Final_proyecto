package grupo.t4_proyecto.model.entidad;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class vuelo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vuelo_id")
    private Long vuelo_id;

    @Column(name = "vuelo_destino")
    private String vuelo_destino;

    @Column(name = "vuelo_origen")
    private String vuelo_origen;

    @Column (name = "vuelo_precio")
    //BigDecimal para representar valores decimales
    private BigDecimal  vuelo_precio;

    @Column (name = "vuelo_aerolinea")
    private String vuelo_aerolinea;
    
    @Column(name = "vuelo_imagen", columnDefinition = "LONGBLOB")
    private String vuelo_imagen;


    //GETTERS AND SETTERS

    public Long getVuelo_id() {
        return vuelo_id;
    }

    public void setVuelo_id(Long vuelo_id) {
        this.vuelo_id = vuelo_id;
    }

    public String getVuelo_destino() {
        return vuelo_destino;
    }

    public void setVuelo_destino(String vuelo_destino) {
        this.vuelo_destino = vuelo_destino;
    }

    public String getVuelo_origen() {
        return vuelo_origen;
    }

    public void setVuelo_origen(String vuelo_origen) {
        this.vuelo_origen = vuelo_origen;
    }

    public BigDecimal getVuelo_precio() {
        return vuelo_precio;
    }

    public void setVuelo_precio(BigDecimal vuelo_precio) {
        this.vuelo_precio = vuelo_precio;
    }

    public String getVuelo_aerolinea() {
        return vuelo_aerolinea;
    }

    public void setVuelo_aerolinea(String vuelo_aerolinea) {
        this.vuelo_aerolinea = vuelo_aerolinea;
    }

    public String getVuelo_imagen() {
        return vuelo_imagen;
    }

    public void setVuelo_imagen(String vuelo_imagen) {
        this.vuelo_imagen = vuelo_imagen;
    }
}

