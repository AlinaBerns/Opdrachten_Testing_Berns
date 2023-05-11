public class WordReverser {

    public WordReverser() {
    }

    //Schrijf een method in de klasse “WordReverser” die een String neemt als parameter en een String teruggeeft.
    //De methode gaat de string omkeren (Boot wordt tooB, Vliegen word negeilV enzovoort).

    public String wordToReverse (String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
