
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Faturamento;

public class DadosFaturamento implements Dados{
    private static List<Faturamento> faturamento = new ArrayList();
    private static final String nomeArquivo = "faturamento.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Faturamento f = (Faturamento) objeto;
        faturamento.add(f);
        Xml.gravaXml(nomeArquivo, faturamento);
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Faturamento veiculo = (Faturamento) objeto;
        faturamento.remove(veiculo);
        Xml.gravaXml(nomeArquivo, faturamento);
    }

    @Override
    public List<Faturamento> getList() throws Exception{
        faturamento = (List<Faturamento>) Xml.leXml(nomeArquivo);
        return faturamento;
    }
    
}