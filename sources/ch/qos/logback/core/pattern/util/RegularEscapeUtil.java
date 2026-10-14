package ch.qos.logback.core.pattern.util;

import androidx.activity.k;

/* JADX INFO: loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                int i12 = i11 + 1;
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == 'n') {
                    cCharAt2 = '\n';
                } else if (cCharAt2 == 'r') {
                    cCharAt2 = '\r';
                } else if (cCharAt2 == 't') {
                    cCharAt2 = '\t';
                } else if (cCharAt2 == 'f') {
                    cCharAt2 = '\f';
                }
                char c10 = cCharAt2;
                i11 = i12;
                cCharAt = c10;
            }
            sb2.append(cCharAt);
            i10 = i11;
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c10, int i10) {
        char c11;
        if (str.indexOf(c10) >= 0 || c10 == '\\') {
            stringBuffer.append(c10);
            return;
        }
        if (c10 != '_') {
            if (c10 == 'n') {
                c11 = '\n';
            } else if (c10 == 'r') {
                c11 = '\r';
            } else {
                if (c10 != 't') {
                    String escapeCharsForListing = formatEscapeCharsForListing(str);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal char '");
                    sb2.append(c10);
                    sb2.append(" at column ");
                    sb2.append(i10);
                    sb2.append(". Only \\\\, \\_");
                    throw new IllegalArgumentException(k.a(sb2, escapeCharsForListing, ", \\t, \\n, \\r combinations are allowed as escape characters."));
                }
                c11 = '\t';
            }
            stringBuffer.append(c11);
        }
    }

    public String formatEscapeCharsForListing(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(", \\");
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }
}
