package ufes.exemplocleancode.DAO_Memory;

import java.util.ArrayList;
import ufes.exemplocleancode.entity.Participante;

public class Oracle implements Banco {

    private ArrayList<Participante> array = new ArrayList<Participante>();

    public Oracle() {
    }
    
    @Override
    public ArrayList<Participante> getAllParticipantes() {
        return this.array;
    }
    
    @Override
    public void insertParticipante(Participante p) {
        array.add(p);
    }

    @Override
    public Participante getParticipante(String email) {
        Participante p = null;
        for (Participante participante : array) {
            if (participante.getEmail().equals(email)) {
                p = participante;
            }
        }
        return p;
    }

    @Override
    public void deleteParticipante(Participante p) {
        array.remove(p);
    }

}
