////////////////////////////////////////////////////////////////////
// [ALBERTO] [DUGO] [2042382]
// [LORENZO] [BENCIVELLI] [2006428]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}