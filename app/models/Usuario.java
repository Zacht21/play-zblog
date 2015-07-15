package models;

import com.google.code.morphia.annotations.Entity;
import play.data.validation.Email;
import play.data.validation.Required;
import play.modules.morphia.Model;

/**
 * Created by jhermosillo on 13/07/15.
 */
@Entity
public class Usuario extends Model {
    public String fullname;
    public String password;
    public String email;
    public Boolean isAdmin;

    /**
     * Metodo constructor de un usuario.
     * @param fullname Nombre completo del usuario
     * @param password contrasena del usuario
     * @param email correo electronico del usuario
     */
    public Usuario(String fullname, String password, String email) {
        this.fullname = fullname;
        this.password = password;
        this.email = email;
    }
}
