public class Substring {
    String sentence;

    public Substring(String sentence) {
        this.sentence = sentence;
    }

    int counter() {
        int count = 0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }

    String firstCharacters(int x) {
        return sentence.substring(0,x);
    }

    boolean endTest(String x) {
        if(sentence.endsWith(x)) {
            return true;
        }
        else return false;
    }

    boolean isEmpty() {
        return !sentence.isEmpty();
    }

    String replace() {
        return sentence.replace(' ','-');
    }

    String upper() {
        return sentence.toUpperCase();
    }
}
