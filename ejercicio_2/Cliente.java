package ejercicio_2;

public class Cliente
{
    private String nombre;
    private String apellido;
    private String email;
    private String cbu;

    public Cliente(String nombre, String apellido, String email, String cbu)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cbu = cbu;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setCbu(String cbu)
    {
        this.cbu = cbu;
    }
    public String getCbu()
    {
        return cbu;
    }
}