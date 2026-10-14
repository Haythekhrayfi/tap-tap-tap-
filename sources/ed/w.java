package ed;

import fd.j0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class w extends v {
    public static final String Z(String str, int i10) {
        j0.i(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final char a0(CharSequence charSequence) {
        j0.i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final String b0(String str, int i10) {
        j0.i(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
