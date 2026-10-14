package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e00 f20014a = new e00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qd.g f20015b = qd.g.f34892f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f20016c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f20017d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f20018e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            fd.j0.h(binaryString, "toBinaryString(it)");
            strArr[i10] = ed.q.p(ea1.a("%8s", binaryString), ' ', '0', false, 4);
        }
        f20018e = strArr;
        String[] strArr2 = f20017d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f20017d;
            strArr3[i12 | 8] = androidx.activity.k.a(new StringBuilder(), strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f20017d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f20017d;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + '|' + strArr5[i14];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i16]);
                sb2.append('|');
                strArr5[i17 | 8] = androidx.activity.k.a(sb2, strArr5[i14], "|PADDED");
            }
        }
        int length = f20017d.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f20017d;
            if (strArr6[i18] == null) {
                strArr6[i18] = f20018e[i18];
            }
        }
    }

    private e00() {
    }

    public static String a(int i10) {
        String[] strArr = f20016c;
        return i10 < strArr.length ? strArr[i10] : ea1.a("0x%02x", Integer.valueOf(i10));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    public static String a(boolean z10, int i10, int i11, int i12, int i13) {
        String strQ;
        String str;
        String str2;
        String str3;
        String strA = a(i12);
        if (i13 == 0) {
            strQ = "";
        } else if (i12 == 2 || i12 == 3) {
            strQ = f20018e[i13];
        } else if (i12 == 4 || i12 == 6) {
            strQ = i13 == 1 ? "ACK" : f20018e[i13];
        } else if (i12 == 7 || i12 == 8) {
            strQ = f20018e[i13];
        } else {
            String[] strArr = f20017d;
            if (i13 < strArr.length) {
                str = strArr[i13];
                fd.j0.f(str);
            } else {
                str = f20018e[i13];
            }
            if (i12 == 5 && (i13 & 4) != 0) {
                str2 = "HEADERS";
                str3 = "PUSH_PROMISE";
            } else if (i12 != 0 || (i13 & 32) == 0) {
                strQ = str;
            } else {
                str2 = "PRIORITY";
                str3 = "COMPRESSED";
            }
            strQ = ed.q.q(str, str2, str3, false, 4);
        }
        return ea1.a("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strA, strQ);
    }
}
