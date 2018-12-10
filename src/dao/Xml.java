
package dao;

import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Xml {

    private static final String caminho = "/home/edilson/Área de Trabalho/estacionamento/";

    public static void gravaXml(String nomeArquivo, Object objeto) throws Exception {
        XStream xstream = new XStream();
        String xml = xstream.toXML(objeto);

        File arquivo = new File(caminho + nomeArquivo);
        try (FileWriter fw = new FileWriter(arquivo)) {
            fw.write(xml);
        }
    }

    public static Object leXml(String nomeArquivo) throws Exception {
        String xml = "";
        try (BufferedReader br = new BufferedReader(new FileReader(caminho + nomeArquivo))) {
            while (br.ready()) {
                xml += br.readLine() + "\n";
            }
        }

        XStream xstream = new XStream();
        return xstream.fromXML(xml);
    }

}