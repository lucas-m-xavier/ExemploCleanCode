package ufes.exemplocleancode.DAO_Memory;

import java.util.HashMap;
import java.util.Map;
import ufes.exemplocleancode.entity.Participante;

public class Mapa implements Estrutura {

    private HashMap<Integer, Participante> map = new HashMap<Integer, Participante>();
    private int i = 1;

    @Override
    public void insertParticipante(Participante p) {
        map.put(p.getPontuacao(), p);
    }

    @Override
    public Participante getParticipante(String email) {
        Participante p = null;
        for (Map.Entry<Integer, Participante> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Participante value = entry.getValue();
            if (value.getEmail().equals(email)) {
                p = value;
            }

        }
        return p;
    }

    @Override
    public void deleteParticipante(Participante p) {
        map.remove(p.getPontuacao(), p);
    }

}
