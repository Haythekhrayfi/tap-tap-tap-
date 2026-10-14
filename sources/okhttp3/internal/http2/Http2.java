package okhttp3.internal.http2;

import ed.q;
import fd.j0;
import okhttp3.internal.Util;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final g CONNECTION_PREFACE = g.f34892f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            j0.h(binaryString, "toBinaryString(it)");
            strArr[i11] = q.p(Util.format("%8s", binaryString), ' ', '0', false, 4);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = 0;
        while (i12 < 1) {
            int i13 = iArr[i12];
            i12++;
            String[] strArr3 = FLAGS;
            strArr3[i13 | 8] = j0.p(strArr3[i13], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i14 = 0;
        while (i14 < 3) {
            int i15 = iArr2[i14];
            i14++;
            int i16 = 0;
            while (i16 < 1) {
                int i17 = iArr[i16];
                i16++;
                String[] strArr5 = FLAGS;
                int i18 = i17 | i15;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) strArr5[i17]);
                sb2.append('|');
                sb2.append((Object) strArr5[i15]);
                strArr5[i18] = sb2.toString();
                strArr5[i18 | 8] = ((Object) strArr5[i17]) + '|' + ((Object) strArr5[i15]) + "|PADDED";
            }
        }
        int length = FLAGS.length;
        while (i10 < length) {
            int i19 = i10 + 1;
            String[] strArr6 = FLAGS;
            if (strArr6[i10] == null) {
                strArr6[i10] = BINARY[i10];
            }
            i10 = i19;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i10, int i11) {
        String str;
        String str2;
        String str3;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : BINARY[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = FLAGS;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    j0.f(str);
                } else {
                    str = BINARY[i11];
                }
                if (i10 == 5 && (i11 & 4) != 0) {
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i10 != 0 || (i11 & 32) == 0) {
                        return str;
                    }
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return q.q(str, str2, str3, false, 4);
            }
        }
        return BINARY[i11];
    }

    public final String formattedType$okhttp(int i10) {
        String[] strArr = FRAME_NAMES;
        return i10 < strArr.length ? strArr[i10] : Util.format("0x%02x", Integer.valueOf(i10));
    }

    public final String frameLog(boolean z10, int i10, int i11, int i12, int i13) {
        return Util.format("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), formattedType$okhttp(i12), formatFlags(i12, i13));
    }
}
