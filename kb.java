public class kb{
    String term;
    String sentence;
    String confidencelvl;

    public kb(String term, String sentence, String confidencelvl){
        this.term = term;
        this.sentence = sentence; 
        this.confidencelvl = confidencelvl;
    }

    public String getTerm(){
        return this.term; 
    }
    public String getSentence() {
        return this.sentence;
    }
    public String getConfidencelvl(){
        return this.confidencelvl;
    } 
    public String toString() {
        return this.term + "\t" + this.sentence + "\t" + this.confidencelvl; 
    }
}