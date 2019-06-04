import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    private String expression;
    private static final Pattern pattern = Pattern.compile("(\\b\\w*[\\.]?\\w+\\b|[\\(\\)\\+\\*\\-\\/])");

    public Tokenizer(String expression){
        this.expression = expression;
    }

    public ArrayList<String> tokenize() throws TokenizeException {
        Matcher m = pattern.matcher(this.expression);
        ArrayList<String> tokens = new ArrayList<>();
        while(m.find()){
            int count = m.groupCount();
            for(int i=0;i<count;i++){
                tokens.add(m.group(i));
            }
        }

        if(tokens.isEmpty()){
            throw new TokenizeException("Not Found");
        }else {
            return tokens;
        }
    }
}
