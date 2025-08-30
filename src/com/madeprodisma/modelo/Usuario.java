package com.madeprodisma.modelo;

public class Usuario {
    private int idUsuario;
    private String userName;
    private String passWord;
    private String nombre;
    private String documento;
    private String email;
    private String telefono;

    public Usuario() {}

    public Usuario(int idUsuario, String userName, String passWord, String nombre, String documento, String email, String telefono) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.passWord = passWord;
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
    }

    public Usuario(String userName, String passWord, String nombre, String documento, String email, String telefono) {
        this.userName = userName;
        this.passWord = passWord;
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
