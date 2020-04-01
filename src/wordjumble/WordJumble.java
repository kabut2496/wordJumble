/**
 * Karl Butler
 * 4/1/2020
 * Word Jumble
 * This program finds every possible combination of letters from what you input
 */
package wordjumble;
import javax.swing.JOptionPane;
/**
 *
 * @author Dean
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //letters gets what the user inputs
    String letters = JOptionPane.showInputDialog("Please enter a word");
    jumbleWords(letters, "");
  }

    //used to find all of the combinations for letters inputed
    
  public static void jumbleWords(String word, String jumbLet) {
    int pos;
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
      System.out.println(jumbLet + word);
    } else {
      for (pos = 0; pos < origWord.length(); pos++) {
        remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        //recursive call to jumbleWords()
        jumbleWords(remainingLetters, 
          origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}
