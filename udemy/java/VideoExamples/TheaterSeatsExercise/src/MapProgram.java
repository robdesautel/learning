import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, Object-oriented, platform independent language");
        languages.put("Python", "and interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java", "this course is about java.");
        }

        System.out.println("=======================================================");

        languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
