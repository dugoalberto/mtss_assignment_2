////////////////////////////////////////////////////////////////////
// [ALBERTO] [DUGO] [2042382]
// [LORENZO] [BENCIVELLI] [2006428]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Lettera non accettata: " + c);
    }
}