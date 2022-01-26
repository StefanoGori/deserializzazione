package com.example;

import java.io.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        File file=new File("src/main/resources/classe.xml");
        XmlMapper xmlMapper=new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        try{
            root value=xmlMapper.readValue(file, root.class);
            System.out.println("la classe "+value.getClasse()+" si trova nell'aula "+value.getAula().getNome());
        } catch(JsonParseException e){
            e.printStackTrace();
        } catch(JsonMappingException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
