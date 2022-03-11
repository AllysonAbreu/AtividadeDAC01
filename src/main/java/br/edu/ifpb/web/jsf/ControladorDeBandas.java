package br.edu.ifpb.web.jsf;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.domain.Bandas;

import br.edu.ifpb.infra.persistence.database.BandasJDBC;


@Named
@SessionScoped
public class ControladorDeBandas implements Serializable{ 

    private Banda banda;
    private Bandas bandas = new BandasJDBC();



    public String adicionar(){
        bandas.nova(banda);
        return "list?faces-redirect=true";
    }
    
    public List<Banda> todasAsBandas(){
        return bandas.todas();
    }
    
    public Banda getBanda() {
        return banda;
    }
    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    
    
    
    
    
}
