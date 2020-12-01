package DAO_Memory;

import ufes.exemplocleancode.entity.Participante;

public interface Estrutura {

    public abstract void insertParticipante(Participante p);

    public abstract Participante getParticipante(String email);

    public abstract void deleteParticipante(Participante p);

}
