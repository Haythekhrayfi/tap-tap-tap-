package ch.qos.logback.core.helpers;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Transform {
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final int CDATA_END_LEN = 3;
    private static final String CDATA_PSEUDO_END = "]]&gt;";
    private static final String CDATA_START = "<![CDATA[";
    private static final Pattern UNSAFE_XML_CHARS = Pattern.compile("[\u0000-\b\u000b\f\u000e-\u001f<>&'\"]");

    public static void appendEscapingCDATA(StringBuilder sb2, String str) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(CDATA_END);
        if (iIndexOf < 0) {
            sb2.append(str);
            return;
        }
        int i10 = 0;
        while (iIndexOf > -1) {
            sb2.append(str.substring(i10, iIndexOf));
            sb2.append(CDATA_EMBEDED_END);
            i10 = CDATA_END_LEN + iIndexOf;
            if (i10 >= str.length()) {
                return;
            } else {
                iIndexOf = str.indexOf(CDATA_END, i10);
            }
        }
        sb2.append(str.substring(i10));
    }

    public static String escapeTags(String str) {
        return (str == null || str.length() == 0 || !UNSAFE_XML_CHARS.matcher(str).find()) ? str : escapeTags(new StringBuffer(str));
    }

    public static String escapeTags(StringBuffer stringBuffer) {
        int i10;
        String str;
        for (int i11 = 0; i11 < stringBuffer.length(); i11++) {
            char cCharAt = stringBuffer.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '\"') {
                    i10 = i11 + 1;
                    str = "&quot;";
                } else if (cCharAt == '<') {
                    i10 = i11 + 1;
                    str = "&lt;";
                } else if (cCharAt == '>') {
                    i10 = i11 + 1;
                    str = "&gt;";
                } else if (cCharAt == '&') {
                    i10 = i11 + 1;
                    str = "&amp;";
                } else if (cCharAt == '\'') {
                    i10 = i11 + 1;
                    str = "&#39;";
                } else if (cCharAt < ' ') {
                    i10 = i11 + 1;
                    str = "�";
                }
                stringBuffer.replace(i11, i10, str);
            }
        }
        return stringBuffer.toString();
    }
}
