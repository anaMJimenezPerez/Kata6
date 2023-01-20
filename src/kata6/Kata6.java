package kata6;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import static java.util.stream.Collectors.joining;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import kata6.ExchangeBoardPojo.Motd;

public class Kata6 {

    public static void main1(String[] args) throws IOException, InstantiationException, IllegalAccessException {
        String json = read("https://api.exchangerate.host/latest");
        Gson gson = new Gson();
      
        ExchangeBoardPojo exchangeBoard = gson.fromJson(json, ExchangeBoardPojo.class);
        System.out.println(exchangeBoard.motd.message);
        System.out.println(exchangeBoard.base);
        System.out.println(exchangeBoard.success);
        System.out.println(exchangeBoard.rates.get("USD"));    
                
        System.out.println(gson.toJson(exchangeBoard));
    }
    
    public static void main(String[] args) throws IOException, JAXBException {
        String json = read("https://api.dictionaryapi.dev/api/v2/entries/en/hello");
        Gson gson = new Gson();
        System.out.println(json);
        Word word = gson.fromJson(gson.fromJson(json, JsonArray.class).get(0), Word.class);
        
        JAXBContext context = JAXBContext.newInstance(Word.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(word, System.out);        
    }
    
    public static void main3(String[] args) {
        byte[] data = new byte[] {30, 20, 5, 10, 12, 64, 20,10};
        String string = Base64.encode(data);
        System.out.println(string);
        byte[] decode = Base64.decode(string);
    }

    private static String read(String url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            return reader.lines().collect(joining(" "));
        }
    }
    
}
