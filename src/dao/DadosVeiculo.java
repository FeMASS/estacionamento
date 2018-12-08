
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

public class DadosVeiculo implements Dados{
    private static List<Veiculo> veiculos = new ArrayList();
    private static final String nomeArquivo = "veiculos.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Veiculo veiculo = (Veiculo) objeto;
        veiculos.add(veiculo);
        Xml.gravaXml(nomeArquivo, veiculos);
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Veiculo veiculo = (Veiculo) objeto;
        veiculos.remove(veiculo);
        Xml.gravaXml(nomeArquivo, veiculos);
    }

    @Override
    public List<Veiculo> getList() throws Exception{
        veiculos = (List<Veiculo>) Xml.leXml(nomeArquivo);
        return veiculos;
    }
    
}