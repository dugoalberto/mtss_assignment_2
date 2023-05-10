////////////////////////////////////////////////////////////////////
// [ALBERTO] [DUGO] [2042382]
// [LORENZO] [BENCIVELLI] [2006428]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberOverThousand extends Exception {
    public NumberOverThousand() {
        super("non riesco a contare sopra mille");
    }
}