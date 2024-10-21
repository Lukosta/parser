
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_Solar_System_objects_by_size").get();

        var info = doc.body().getElementById("mw-content-text").getElementsByTag("tbody").first();

        for(Element child: info.children()){
            var name = child.getElementsByTag("td").text();
            System.out.println(name);

            String [] names = name.split(" ");
            String str = "";
            for(int i = 0; i < names.length; i++){
                if(i % 10 == 0){
                    String.join(names[i], str);
                }
                if(i % 10 == 1){
                    String.join(names[i], str);
                }
                if(i % 10 == 9){
                    String.join(names[i], str);
                    System.out.println(str);
                    str = "";
                }
            }

        }

    }

}