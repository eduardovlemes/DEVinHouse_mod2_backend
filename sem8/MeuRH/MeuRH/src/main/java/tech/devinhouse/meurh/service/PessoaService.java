package tech.devinhouse.meurh.service;

import model.PessoaModel;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private static List<PessoaModel> pessoas = new ArrayList<>();

    public List<PessoaModel> getPessoas (){
        return pessoas;
    }
}
