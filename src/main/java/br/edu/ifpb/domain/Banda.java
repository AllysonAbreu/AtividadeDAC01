package br.edu.ifpb.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banda {

    private Integer id;
    private String localDeOrigem;
    private String nomeFantasia;
    private List<Integrante> integrantes; 

    public Banda(Integer id, String localDeOrigem, String nomeFantasia) {
        this.id = id;
        this.localDeOrigem = localDeOrigem;
        this.nomeFantasia = nomeFantasia;
        this.integrantes = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public static Banda paraTeste() {
        return new Banda(1, "Inexistente", "Inexistente");
    }
    public void adicionarNovoIntegrante(Integrante integrante){
        this.integrantes.add(integrante);
    }

    public void apagarIntegrante(Integrante integrante){
        this.integrantes.remove(integrante);
    }

    public List<Integrante> getIntegrantes(){
        return this.integrantes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banda banda = (Banda) o;
        return Objects.equals(id, banda.id) && Objects.equals(localDeOrigem, banda.localDeOrigem) && Objects.equals(nomeFantasia, banda.nomeFantasia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localDeOrigem, nomeFantasia);
    }

    @Override
    public String toString() {
        return "Banda{" +
                "id=" + id +
                ", localDeOrigem='" + localDeOrigem + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                '}';
    }
}
