package Modelo;

import java.util.Date;

public class Usuarios {
    private String  codigoEmpleado;
    private String  identificacion;
    private String  nombre;
    private String  celular;
    private String  fechaContrato;
    private String  salario;
    private String  multiplex;
    private char    rol;
    private char    cargo;
    private String  contrasena;

    public Usuarios() {
    }

    public Usuarios(String codigoEmpleado, String identificacion, String nombre, String celular, String fechaContrato, String salario, String multiplex, char rol, char cargo, String contrasena) {
        this.codigoEmpleado = codigoEmpleado;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.celular = celular;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
        this.multiplex = multiplex;
        this.rol = rol;
        this.cargo = cargo;
        this.contrasena = contrasena;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getMultiplex() {
        return multiplex;
    }

    public void setMultiplex(String multiplex) {
        this.multiplex = multiplex;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public char getCargo() {
        return cargo;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static char randomCharacter() {
        //We multiply Math.random() by 62 because there are 26 lowercase letters, 26 uppercase letters, and 10 numbers, and 26 + 26 + 10 = 62
        //This random number has values between 0 (inclusive) and 62 (exclusive)
        int rand = (int)(Math.random()*62);

        //0-61 inclusive = all possible values of rand
        //0-9 inclusive = 10 possible numbers/digits
        //10-35 inclusive = 26 possible uppercase letters
        //36-61 inclusive = 26 possible lowercase letters
        //If rand is between 0 (inclusive) and 9 (inclusive), we can say it's a number/digit
        //If rand is between 10 (inclusive) and 35 (inclusive), we can say it's an uppercase letter
        //If rand is between 36 (inclusive) and 61 (inclusive), we can say it's a lowercase letter
        if(rand <= 9) {
            //Number (48-57 in ASCII)
            //To convert from 0-9 to 48-57, we can add 48 to rand because 48-0 = 48
            int number = rand + 48;
            //This way, rand = 0 => number = 48 => '0'
            //Remember to cast our int value to a char!
            return (char)(number);
        } else if(rand <= 35) {
            //Uppercase letter (65-90 in ASCII)
            //To convert from 10-35 to 65-90, we can add 55 to rand because 65-10 = 55
            int uppercase = rand + 55;
            //This way, rand = 10 => uppercase = 65 => 'A'
            //Remember to cast our int value to a char!
            return (char)(uppercase);
        } else {
            //Lowercase letter (97-122 in ASCII)
            //To convert from 36-61 to 97-122, we can add 61 to rand because 97-36 = 61
            int lowercase = rand + 61;
            //This way, rand = 36 => lowercase = 97 => 'a'
            //Remember to cast our int value to a char!
            return (char)(lowercase);
        }
    }
}
