package br.com.agromut.model;


public class UsuarioEstufa {
    private Usuario idUsuario;
    private Estufa idEstufa;

    public UsuarioEstufa() {
    }

    public UsuarioEstufa(Usuario idUsuario, Estufa idEstufa) {
        this.idUsuario = idUsuario;
        this.idEstufa = idEstufa;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Estufa getIdEstufa() {
        return idEstufa;
    }

    public void setIdEstufa(Estufa idEstufa) {
        this.idEstufa = idEstufa;
    }
   
    
}
