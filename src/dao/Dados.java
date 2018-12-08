
package dao;

import java.util.List;

public interface Dados {
    public void incluir (Object objeto) throws Exception;
    public void excluir (Object objeto) throws Exception;
    public List getList() throws Exception;
}
