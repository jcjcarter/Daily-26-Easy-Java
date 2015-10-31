
public class aDuplicate implements iDuplicate {

    public StringBuilder wordTrimmed = new StringBuilder("");
    public StringBuilder wordLeftovers = new StringBuilder("");


    /**
     * Takes a string and removes the
     * duplicate following letters.
     *
     * @param wordDup taking the duplicate letters.
     */
    @Override
    public void trimDuplicate(String wordDup) {
        char previousChar = wordDup.charAt(0), currentChar;

        wordTrimmed.append(previousChar);

        for (int i = 1; i < wordDup.length(); i++) {
            if (wordDup.charAt(i) == previousChar){
                wordLeftovers.append(wordDup.charAt(i));
            }else{
                previousChar = wordDup.charAt(i);
                wordTrimmed.append(wordDup.charAt(i));
            }
        }
    }
}
