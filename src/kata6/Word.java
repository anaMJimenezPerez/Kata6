package kata6;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Word {
    @SerializedName("word")
    public String name;
    public List<Phonetic> phonetics;
    
    @XmlRootElement
    static class Phonetic {
        public String text;
        public String audio;
        
        public License license;
    }
    
    static class License {
        @XmlAttribute
        public String name;
        @XmlAttribute
        public String url;
    }
    
}
