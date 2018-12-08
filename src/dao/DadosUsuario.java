
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class DadosUsuario implements Dados{
    private static List<Usuario> usuarios = new ArrayList();
    private static final String nomeArquivo = "usuarios.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Usuario usuario = (Usuario) objeto;
        usuarios.add(usuario);
        Xml.gravaXml(nomeArquivo, usuarios);
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Usuario usuario = (Usuario) objeto;
        usuarios.remove(usuario);
        Xml.gravaXml(nomeArquivo, usuarios);
    }

    @Override
    public List<Usuario> getList() throws Exception{
        usuarios = (List<Usuario>) Xml.leXml(nomeArquivo);
        return usuarios;
    }
    
}