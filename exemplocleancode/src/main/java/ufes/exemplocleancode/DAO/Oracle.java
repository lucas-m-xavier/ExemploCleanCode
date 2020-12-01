package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ufes.exemplocleancode.entity.Participante;

public class Oracle extends Banco {

    private Connection conn;

    public Oracle(String host, String port, String user, String passWord, String database) {
        super(host, port, user, passWord, database);
        this.conn = null;
    }

    @Override
    public boolean openConection() {

        this.url = "jdbc:oracle:oci:" + this.user + "/" + this.passWord + "@" + this.host + ":" + this.port + ":" + this.database;
        try {
            this.conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    @Override
    public boolean CloseConection() {

        try {
            if (this.conn.isClosed()) {
                this.conn.close();

            }
        } catch (SQLException ex) {
            return false;
        }

        return true;
    }

    @Override
    public boolean insertParticipante(Participante p) {
        try {
            Statement a = this.conn.createStatement();
            PreparedStatement stmt = this.conn.prepareStatement("insert into participante (nome,email,pontuacao) values (?,?,?)");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getPontuacao());
            stmt.executeQuery();
        } catch (SQLException ex) {
            return false;
        }

        return true;
    }

    @Override
    public Participante getParticipante(String email) {
        Participante p = null;

        try {
            Statement a = this.conn.createStatement();

            PreparedStatement stmt = this.conn.prepareStatement("select * from participante where email = ?");

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            String nomeParticipante = rs.getString(1);
            String emailParticipante = rs.getString(2);
            int pontuacaoParticipante = rs.getInt(3);

            p = new Participante(nomeParticipante, emailParticipante, pontuacaoParticipante);
        } catch (SQLException ex) {
            System.out.println("Participante Nao Encontrado");
        }

        return p;
    }

    @Override
    public boolean deleteParticipante(Participante p) {

        try {
            Statement a = this.conn.createStatement();

            PreparedStatement stmt = this.conn.prepareStatement("delete from participante where name = ? and email = ?");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.executeQuery();

        } catch (SQLException ex) {
            return false;
        }

        return true;

    }

}
