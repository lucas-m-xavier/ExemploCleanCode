package DAO_Memory;

import java.util.ArrayList;
import ufes.exemplocleancode.entity.Participante;

public class Vetor implements Estrutura {

    private ArrayList<Participante> array = new ArrayList<Participante>();

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
