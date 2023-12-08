package grupo.t4_proyecto.model.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
public class contacto  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contacto_id")
    private Long contacto_id;

    @Column(name="contacto_nombre")
    private String contacto_nombre;

    @Column(name="contacto_apellido")
    private String contacto_apellido;

    @Column(name="contacto_dni")
    private String contacto_dni;
    
    @Column(name="contacto_numero")
    private String contacto_numero;

    @Column(name="contacto_correo")
    private String contacto_correo;

    @Column(name="contacto_asunto")
    private String contacto_asunto;

    //GETTERS AND SETTERS


    public Long getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(Long contacto_id) {
        this.contacto_id = contacto_id;
    }

    public String getContacto_nombre() {
        return contacto_nombre;
    }

    public void setContacto_nombre(String contacto_nombre) {
        this.contacto_nombre = contacto_nombre;
    }

    public String getContacto_apellido() {
        return contacto_apellido;
    }

    public void setContacto_apellido(String contacto_apellido) {
        this.contacto_apellido = contacto_apellido;
    }

    public String getContacto_dni() {
        return contacto_dni;
    }

    public void setContacto_dni(String contacto_dni) {
        this.contacto_dni = contacto_dni;
    }

    public String getContacto_numero() {
        return contacto_numero;
    }

    public void setContacto_numero(String contacto_numero) {
        this.contacto_numero = contacto_numero;
    }

    public String getContacto_correo() {
        return contacto_correo;
    }

    public void setContacto_correo(String contacto_correo) {
        this.contacto_correo = contacto_correo;
    }

    public String getContacto_asunto() {
        return contacto_asunto;
    }

    public void setContacto_asunto(String contacto_asunto) {
        this.contacto_asunto = contacto_asunto;
    }



}
