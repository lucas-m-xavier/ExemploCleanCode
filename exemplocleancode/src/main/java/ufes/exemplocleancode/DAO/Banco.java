package DAO;

import ufes.exemplocleancode.entity.Participante;

public abstract class Banco {

    protected String host;
    protected String port;
    protected String user;
    protected String passWord;
    protected String url;
    protected String database;

    public Banco(String host, String port, String user, String passWord, String database) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.passWord = passWord;
    }

    public abstract boolean openConection();

    public abstract boolean CloseConection();

    public abstract boolean insertParticipante(Participante p);

    public abstract Participante getParticipante(String email);

    public abstract boolean deleteParticipante(Participante p);
}
