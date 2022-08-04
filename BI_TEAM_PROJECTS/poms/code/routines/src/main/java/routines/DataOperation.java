// ============================================================================
//
// Copyright (c) 2006-2014, Talend SA.
//
// Ce code source a été automatiquement généré par_Talend Cloud Data Management Platform
// CodeGenerator version 8.0.1.20220729_0744-patch
// Vous pouvez trouver plus d'informations sur les produits Talend sur www.talend.com.
// Vous pouvez distribuer ce code sous les termes de la licence GNU LGPL
// (http://www.gnu.org/licenses/lgpl.html).
//
// ============================================================================
package routines;

public class DataOperation {

    /**
     * Converts a numeric value to its ASCII character string equivalent.
     *
     * {talendTypes} char | Character
     *
     * {Category} DataOperation
     *
     * {param} int(1) i: numeric value
     *
     * {example} CHAR(1):int
     *
     */
    public static char CHAR(int i) {
        return Character.forDigit(i, 10);
    }

    /**
     * Converts a decimal integer into its hexadecimal equivalent.
     *
     * {talendTypes} String
     *
     * {Category} DataOperation
     *
     * {param} int(1) i:decimal integer
     *
     * {example} DTX(1)
     *
     */
    public static String DTX(int i) {
        return Integer.toHexString(i);
    }

    /**
     * Rounds a number of type Double to a number of type Long with the precision specified in the PRECISION statement.
     *
     * {talendTypes} long | Long
     *
     * {Category} DataOperation
     *
     * {param} double (0.0) d:double number
     *
     * {example} FIX(3.14)
     *
     */
    public static long FIX(double d) {
        return Math.round(d);
    }

    /**
     * Converts a hexadecimal string into its decimal equivalent.
     *
     * {talendTypes} int | Integer
     *
     * {Category} DataOperation
     *
     * {param} string ("0") text: hexadecimal string
     *
     * {example} XTD(\"1\")
     *
     */
    public static int XTD(String text) {
        return Integer.valueOf(text, 16);
    }
}
