package com.menaxhim.departament;

import java.util.List;

public interface DepartamentService {
    public Departament createDepartament(Departament departament);

    public List<Departament> getDepartamentet();

    public Departament getDepartament(int idDep);

    public Departament updateDepartament(Departament departament, int idDep);

    public void deleteDepartament(int idDep);
}
