package kata6;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class ExchangeBoardPojo {
    public Motd motd;
    public boolean success;
    public String base;
    public String date;
    public Map<String, Double> rates;
    
    
    public static class Motd {
        @SerializedName("msg")
        public String message;
        public String url;

        
        
    }
    
}
