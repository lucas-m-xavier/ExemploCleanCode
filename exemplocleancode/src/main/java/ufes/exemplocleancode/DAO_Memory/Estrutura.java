package ufes.exemplocleancode.DAO_Memory;

import java.util.ArrayList;
import ufes.exemplocleancode.entity.Participante;

public interface Estrutura {
    
    public abstract ArrayList<Participante> getAllParticipantes();

    public abstract void insertParticipante(Participante p);

    public abstract Participante getParticipante(String email);

    public abstract void deleteParticipante(Participante p);

}
