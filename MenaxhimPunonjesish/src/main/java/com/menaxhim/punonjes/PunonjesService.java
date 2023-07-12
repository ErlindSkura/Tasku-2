package com.menaxhim.punonjes;

import com.menaxhim.departament.Departament;

import java.util.List;

public interface PunonjesService {
    public Punonjes createPunonjes(Punonjes punonjes);

    public List<Punonjes> getPunonjesit();

    public Punonjes getPunonjes(int id);

    public Punonjes updatePunonjes(Punonjes punonjes, int id);

    public void deletePunonjes(int id);
}
