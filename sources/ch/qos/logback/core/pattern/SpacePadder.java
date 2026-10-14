package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes.dex */
public class SpacePadder {
    public static final String[] SPACES = {" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb2, String str, int i10) {
        int length = str != null ? str.length() : 0;
        if (length < i10) {
            spacePad(sb2, i10 - length);
        }
        if (str != null) {
            sb2.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb2, String str, int i10) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb2.append(str);
        }
        if (length < i10) {
            spacePad(sb2, i10 - length);
        }
    }

    public static final void spacePad(StringBuilder sb2, int i10) {
        while (i10 >= 32) {
            sb2.append(SPACES[5]);
            i10 -= 32;
        }
        for (int i11 = 4; i11 >= 0; i11--) {
            if (((1 << i11) & i10) != 0) {
                sb2.append(SPACES[i11]);
            }
        }
    }
}
