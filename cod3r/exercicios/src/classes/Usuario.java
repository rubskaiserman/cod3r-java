package classes;

public class Usuario{
    public String name;
    public String email;

    public Usuario(String name, String email){
        this.name = name;
        this.email = email;
    }

    public boolean equals(Object object){
        if(object instanceof Usuario){
            Usuario user = (Usuario) object;
            return user.name.equals(this.name) && user.email.equals(this.email);
        }
        else {
            return false;
        }

    }
}