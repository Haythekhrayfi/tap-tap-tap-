package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0814Dh implements Handler.Callback, VT, GO, EV, C9F, InterfaceC07359m {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C9R A04;
    public C07259c A05;
    public EW A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public XE[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XH A0G;
    public final XF A0H;
    public final C9X A0J;
    public final C07439v A0L;
    public final C07449w A0M;
    public final GP A0N;
    public final GQ A0O;
    public final HJ A0P;
    public final HT A0Q;
    public final ArrayList<C9P> A0R;
    public final boolean A0S;
    public final XE[] A0T;
    public final InterfaceC07399q[] A0U;
    public final C07239a A0K = new C07239a();
    public C07429t A06 = C07429t.A03;
    public final C9Q A0I = new C9Q();

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A07() throws IOException, C9I {
        long jAFw = this.A0P.AFw();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(jAFw, 10L);
            return;
        }
        C9Y c9yA0G = this.A0K.A0G();
        C0927Hs.A02(A06(150, 10, 20));
        A0J();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        c9yA0G.A08.A54(this.A05.A0A - this.A0D, this.A0S);
        boolean z10 = true;
        boolean z11 = true;
        for (XE xe2 : this.A0C) {
            xe2.AEQ(this.A03, jElapsedRealtime);
            boolean z12 = true;
            z10 = z10 && xe2.A8p();
            boolean z13 = xe2.A8z() || xe2.A8p() || A0s(xe2);
            if (!z13) {
                xe2.A9u();
            }
            if (!z11 || !z13) {
                z12 = false;
            }
            z11 = z12;
        }
        if (!z11) {
            A0B();
        }
        long j10 = c9yA0G.A02.A01;
        if (z10 && ((j10 == -9223372036854775807L || j10 <= this.A05.A0A) && c9yA0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z11)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z11 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (XE xe3 : this.A0C) {
                xe3.A9u();
            }
        }
        boolean z14 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z14 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(jAFw, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AEN(2);
        } else {
            A0R(jAFw, 1000L);
        }
        C0927Hs.A00();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0E() throws C9I {
        C9Y c9yA0G;
        boolean[] zArr;
        long jA0B;
        int i10;
        boolean[] zArr2;
        int i11;
        XE[] xeArr;
        XE xe2;
        boolean z10;
        InterfaceC0850Er interfaceC0850Er;
        long j10;
        if (this.A0K.A0P()) {
            float f10 = this.A0G.A7Y().A01;
            C9Y c9yA0H = this.A0K.A0H();
            if (A0W[6].length() == 17) {
                String[] strArr = A0W;
                strArr[1] = "D9etX6yGBrwjRzOUEpEFU5ER5XUfrbIh";
                strArr[0] = "v3YP09X53VrDeZJkDNiGeietvmwAimn0";
                boolean z11 = true;
                for (C9Y c9yA0G2 = this.A0K.A0G(); c9yA0G2 != null && c9yA0G2.A06; c9yA0G2 = c9yA0G2.A01) {
                    if (c9yA0G2.A0I(f10)) {
                        if (A0W[2].charAt(12) != 'N') {
                            A0W[2] = "qdzsaLeT6GVLLZLLIHWPE1kBVsafqqMr";
                            if (z11) {
                                c9yA0G = this.A0K.A0G();
                                boolean zA0S = this.A0K.A0S(c9yA0G);
                                zArr = new boolean[this.A0T.length];
                                jA0B = c9yA0G.A0B(this.A05.A0A, zA0S, zArr);
                                A0i(c9yA0G.A03, c9yA0G.A04);
                                if (this.A05.A00 != 4 && jA0B != this.A05.A0A) {
                                    C07259c c07259c = this.A05;
                                    this.A05 = c07259c.A04(c07259c.A04, jA0B, this.A05.A01);
                                    this.A0I.A04(4);
                                    A0P(jA0B);
                                }
                                i10 = 0;
                                if (A0W[2].charAt(12) != 'N') {
                                    String[] strArr2 = A0W;
                                    strArr2[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";
                                    strArr2[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";
                                    zArr2 = new boolean[this.A0T.length];
                                    i11 = 0;
                                } else {
                                    A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";
                                    zArr2 = new boolean[this.A0T.length];
                                    i11 = 0;
                                }
                                while (true) {
                                    xeArr = this.A0T;
                                    if (i11 < xeArr.length) {
                                        this.A05 = this.A05.A05(c9yA0G.A03, c9yA0G.A04);
                                        A0p(zArr2, i10);
                                        break;
                                    }
                                    xe2 = xeArr[i11];
                                    if (xe2.A7s() != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zArr2[i11] = z10;
                                    interfaceC0850Er = c9yA0G.A0A[i11];
                                    if (interfaceC0850Er != null) {
                                        i10++;
                                    }
                                    if (!zArr2[i11]) {
                                        if (interfaceC0850Er != xe2.A7v()) {
                                            A0b(xe2);
                                        } else if (zArr[i11]) {
                                            j10 = this.A03;
                                            if (A0W[5].charAt(1) != 'w') {
                                                throw new RuntimeException();
                                            }
                                            A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";
                                            xe2.AEc(j10);
                                        } else {
                                            continue;
                                        }
                                    }
                                    i11++;
                                }
                            } else {
                                this.A0K.A0S(c9yA0G2);
                                if (c9yA0G2.A06) {
                                    c9yA0G2.A0A(Math.max(c9yA0G2.A02.A03, c9yA0G2.A08(this.A03)), false);
                                    A0i(c9yA0G2.A03, c9yA0G2.A04);
                                }
                            }
                        } else {
                            A0W[5] = "7WrBcNkU6uNk4nx5t1RXmqyIgKSjjx3l";
                            if (z11) {
                                c9yA0G = this.A0K.A0G();
                                boolean zA0S2 = this.A0K.A0S(c9yA0G);
                                zArr = new boolean[this.A0T.length];
                                jA0B = c9yA0G.A0B(this.A05.A0A, zA0S2, zArr);
                                A0i(c9yA0G.A03, c9yA0G.A04);
                                if (this.A05.A00 != 4) {
                                    C07259c c07259c2 = this.A05;
                                    this.A05 = c07259c2.A04(c07259c2.A04, jA0B, this.A05.A01);
                                    this.A0I.A04(4);
                                    A0P(jA0B);
                                }
                                i10 = 0;
                                if (A0W[2].charAt(12) != 'N') {
                                    String[] strArr3 = A0W;
                                    strArr3[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";
                                    strArr3[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";
                                    zArr2 = new boolean[this.A0T.length];
                                    i11 = 0;
                                } else {
                                    A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";
                                    zArr2 = new boolean[this.A0T.length];
                                    i11 = 0;
                                }
                                while (true) {
                                    xeArr = this.A0T;
                                    if (i11 < xeArr.length) {
                                        this.A05 = this.A05.A05(c9yA0G.A03, c9yA0G.A04);
                                        A0p(zArr2, i10);
                                        break;
                                    }
                                    xe2 = xeArr[i11];
                                    if (xe2.A7s() != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zArr2[i11] = z10;
                                    interfaceC0850Er = c9yA0G.A0A[i11];
                                    if (interfaceC0850Er != null) {
                                        i10++;
                                    }
                                    if (!zArr2[i11]) {
                                        if (interfaceC0850Er != xe2.A7v()) {
                                            A0b(xe2);
                                        } else if (zArr[i11]) {
                                            j10 = this.A03;
                                            if (A0W[5].charAt(1) != 'w') {
                                                throw new RuntimeException();
                                            }
                                            A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";
                                            xe2.AEc(j10);
                                        } else {
                                            continue;
                                        }
                                    }
                                    i11++;
                                }
                            } else {
                                this.A0K.A0S(c9yA0G2);
                                if (c9yA0G2.A06) {
                                    c9yA0G2.A0A(Math.max(c9yA0G2.A02.A03, c9yA0G2.A08(this.A03)), false);
                                    A0i(c9yA0G2.A03, c9yA0G2.A04);
                                }
                            }
                        }
                        int i12 = this.A05.A00;
                        if (A0W[6].length() == 17) {
                            String[] strArr4 = A0W;
                            strArr4[4] = "GCKjwcvTJfMpQgG8NpKVbaI1H";
                            strArr4[3] = "kOcbaoLdOMGBVdRezVYeBIh2yM";
                            if (i12 == 4) {
                                return;
                            }
                            A09();
                            A0J();
                            HT ht = this.A0Q;
                            if (A0W[6].length() == 17) {
                                A0W[5] = "0v8QL5oJXgBRdj6LoWxDDzyaCLbuPlQC";
                                ht.AEr(2);
                                return;
                            }
                        }
                    } else {
                        if (c9yA0G2 == c9yA0H) {
                            z11 = false;
                        }
                    }
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0I() throws IOException, C9I {
        int i10;
        C0814Dh c0814Dh = this;
        EW ew = c0814Dh.A07;
        if (ew == null) {
            return;
        }
        if (c0814Dh.A01 > 0) {
            ew.A9t();
            return;
        }
        A0C();
        C9Y c9yA0F = c0814Dh.A0K.A0F();
        if (c9yA0F == null || c9yA0F.A0H()) {
            c0814Dh.A0k(false);
        } else if (!c0814Dh.A05.A08) {
            A09();
        }
        if (!c0814Dh.A0K.A0P()) {
            return;
        }
        C9Y c9yA0G = c0814Dh.A0K.A0G();
        C9Y c9yA0H = c0814Dh.A0K.A0H();
        boolean z10 = false;
        while (true) {
            boolean z11 = c0814Dh.A08;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "7VXwhx8w334qXwwhe6EPuoxrs";
            strArr[3] = "i8G0S3EG91lb4Tbi5TJ2bFfoM2";
            if (z11 && c9yA0G != c9yA0H && c0814Dh.A03 >= c9yA0G.A01.A00) {
                if (z10) {
                    A0A();
                }
                boolean z12 = c9yA0G.A02.A06;
                String[] strArr2 = A0W;
                if (strArr2[1].charAt(10) != strArr2[0].charAt(10)) {
                    A0W[7] = "JHuaS3X828K0z1yeMtavkm7JkVnfol1Z";
                    if (z12) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                } else {
                    A0W[5] = "wtrsjVL1JaCAi24uhunV07R35PJNTCvI";
                    if (z12) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                }
                C9Y c9y = c9yA0G;
                c9yA0G = c0814Dh.A0K.A0C();
                c0814Dh.A0V(c9y);
                c0814Dh.A05 = c0814Dh.A05.A04(c9yA0G.A02.A04, c9yA0G.A02.A03, c9yA0G.A02.A00);
                c0814Dh.A0I.A04(i10);
                A0J();
                z10 = true;
            } else if (c9yA0H.A02.A05) {
                int i11 = 0;
                while (true) {
                    XE[] xeArr = c0814Dh.A0T;
                    if (i11 >= xeArr.length) {
                        return;
                    }
                    XE xe2 = xeArr[i11];
                    InterfaceC0850Er interfaceC0850Er = c9yA0H.A0A[i11];
                    if (interfaceC0850Er != null && xe2.A7v() == interfaceC0850Er && xe2.A8P()) {
                        xe2.AF3();
                    }
                    i11++;
                }
            } else {
                if (c9yA0H.A01 == null || !c9yA0H.A01.A06) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    XE[] xeArr2 = c0814Dh.A0T;
                    if (i12 < xeArr2.length) {
                        XE xe3 = xeArr2[i12];
                        InterfaceC0850Er interfaceC0850Er2 = c9yA0H.A0A[i12];
                        InterfaceC0850Er interfaceC0850ErA7v = xe3.A7v();
                        String[] strArr3 = A0W;
                        if (strArr3[1].charAt(10) != strArr3[0].charAt(10)) {
                            A0W[2] = "GzZd6F7lJVp08TeGQitpN19OrvCnG4PK";
                            if (interfaceC0850ErA7v != interfaceC0850Er2) {
                                return;
                            }
                        } else {
                            A0W[5] = "G5Kl7lcZBM87T4fNUwO1IYVdGnNcsgpo";
                            if (interfaceC0850ErA7v != interfaceC0850Er2) {
                                return;
                            }
                        }
                        if (interfaceC0850Er2 != null && !xe3.A8P()) {
                            return;
                        } else {
                            i12++;
                        }
                    } else {
                        GQ gq = c9yA0H.A04;
                        C9Y c9yA0D = c0814Dh.A0K.A0D();
                        GQ gq2 = c9yA0D.A04;
                        boolean z13 = c9yA0D.A08.AE2() != -9223372036854775807L;
                        int i13 = 0;
                        while (true) {
                            XE[] xeArr3 = c0814Dh.A0T;
                            String[] strArr4 = A0W;
                            if (strArr4[1].charAt(10) != strArr4[0].charAt(10)) {
                                A0W[5] = "zgqvIFw9hHXttypZtkJx3efsgqUZ32NO";
                                if (i13 >= xeArr3.length) {
                                    return;
                                }
                            } else if (i13 >= xeArr3.length) {
                                return;
                            }
                            XE xe4 = xeArr3[i13];
                            if (gq.A00(i13)) {
                                if (z13) {
                                    xe4.AF3();
                                } else if (!xe4.A8m()) {
                                    GM gmA00 = gq2.A01.A00(i13);
                                    boolean zA00 = gq2.A00(i13);
                                    boolean z14 = c0814Dh.A0U[i13].A82() == 5;
                                    C07409r c07409r = gq.A03[i13];
                                    C07409r c07409r2 = gq2.A03[i13];
                                    if (zA00 && c07409r2.equals(c07409r) && !z14) {
                                        xe4.AES(A0v(gmA00), c9yA0D.A0A[i13], c9yA0D.A07());
                                    } else {
                                        xe4.AF3();
                                    }
                                }
                            }
                            i13++;
                            c0814Dh = this;
                        }
                    }
                }
            }
        }
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, 16, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, Ascii.DEL, 43, 106, 109, Ascii.DEL, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, Ascii.CAN, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, Ascii.DEL, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0S(C9O c9o) throws C9I {
        if (c9o.A01 != this.A07) {
            return;
        }
        AbstractC07459x abstractC07459x = this.A05.A03;
        AbstractC07459x abstractC07459x2 = c9o.A00;
        Object obj = c9o.A02;
        this.A0K.A0N(abstractC07459x2);
        this.A05 = this.A05.A03(abstractC07459x2, obj);
        A0F();
        int i10 = this.A01;
        if (i10 > 0) {
            this.A0I.A03(i10);
            this.A01 = 0;
            C9R c9r = this.A04;
            if (c9r != null) {
                Pair<Integer, Long> pairA04 = A04(c9r, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                EU euA0L = this.A0K.A0L(iIntValue, jLongValue);
                this.A05 = this.A05.A04(euA0L, euA0L.A01() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 == -9223372036854775807L) {
                if (abstractC07459x2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> pairA05 = A05(abstractC07459x2, abstractC07459x2.A05(this.A0B), -9223372036854775807L);
                int iIntValue2 = ((Integer) pairA05.first).intValue();
                long jLongValue2 = ((Long) pairA05.second).longValue();
                EU euA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
                this.A05 = this.A05.A04(euA0L2, euA0L2.A01() ? 0L : jLongValue2, jLongValue2);
                return;
            }
            return;
        }
        int i11 = this.A05.A04.A02;
        long j10 = this.A05.A01;
        if (abstractC07459x.A0E()) {
            if (abstractC07459x2.A0E()) {
                return;
            }
            EU euA0L3 = this.A0K.A0L(i11, j10);
            this.A05 = this.A05.A04(euA0L3, euA0L3.A01() ? 0L : j10, j10);
            return;
        }
        C9Y c9yA0E = this.A0K.A0E();
        int iA04 = abstractC07459x2.A04(c9yA0E == null ? abstractC07459x.A0A(i11, this.A0L, true).A03 : c9yA0E.A09);
        if (iA04 != -1) {
            if (iA04 != i11) {
                this.A05 = this.A05.A01(iA04);
            }
            EU eu = this.A05.A04;
            if (eu.A01()) {
                EU euA0L4 = this.A0K.A0L(iA04, j10);
                if (!euA0L4.equals(eu)) {
                    this.A05 = this.A05.A04(euA0L4, A02(euA0L4, euA0L4.A01() ? 0L : j10), j10);
                    return;
                }
            }
            if (this.A0K.A0U(eu, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int iA01 = A01(i11, abstractC07459x, abstractC07459x2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (iA01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> pairA06 = A05(abstractC07459x2, abstractC07459x2.A09(iA01, this.A0L).A00, -9223372036854775807L);
        int iIntValue3 = ((Integer) pairA06.first).intValue();
        long jLongValue3 = ((Long) pairA06.second).longValue();
        EU euA0L5 = this.A0K.A0L(iIntValue3, jLongValue3);
        abstractC07459x2.A0A(iIntValue3, this.A0L, true);
        if (c9yA0E != null) {
            Object obj2 = this.A0L.A03;
            c9yA0E.A02 = c9yA0E.A02.A00(-1);
            while (c9yA0E.A01 != null) {
                c9yA0E = c9yA0E.A01;
                if (c9yA0E.A09.equals(obj2)) {
                    C07239a c07239a = this.A0K;
                    C9Z c9z = c9yA0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    c9yA0E.A02 = c07239a.A0J(c9z, iIntValue3);
                } else {
                    c9yA0E.A02 = c9yA0E.A02.A00(-1);
                }
            }
        }
        boolean zA01 = euA0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(euA0L5, A02(euA0L5, zA01 ? 0L : jLongValue3), jLongValue3);
    }

    static {
        A0K();
    }

    public C0814Dh(XE[] xeArr, GP gp, GQ gq, C9X c9x, boolean z10, int i10, boolean z11, Handler handler, XF xf, HJ hj) {
        this.A0T = xeArr;
        this.A0N = gp;
        this.A0O = gq;
        this.A0J = c9x;
        this.A08 = z10;
        this.A02 = i10;
        this.A0B = z11;
        this.A0E = handler;
        this.A0H = xf;
        this.A0P = hj;
        this.A0D = c9x.A5z();
        this.A0S = c9x.AEd();
        this.A05 = new C07259c(AbstractC07459x.A01, -9223372036854775807L, TrackGroupArray.A04, gq);
        this.A0U = new InterfaceC07399q[xeArr.length];
        for (int i11 = 0; i11 < xeArr.length; i11++) {
            xeArr[i11].AF6(i11);
            this.A0U[i11] = xeArr[i11].A6C();
        }
        this.A0G = new XH(this, hj);
        this.A0R = new ArrayList<>();
        this.A0C = new XE[0];
        this.A0M = new C07449w();
        this.A0L = new C07439v();
        gp.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = hj.A4Y(handlerThread.getLooper(), this);
    }

    private int A00() {
        AbstractC07459x abstractC07459x = this.A05.A03;
        if (abstractC07459x.A0E()) {
            return 0;
        }
        return abstractC07459x.A0B(abstractC07459x.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i10, AbstractC07459x abstractC07459x, AbstractC07459x abstractC07459x2) {
        int iA03 = i10;
        int maxIterations = -1;
        int iA00 = abstractC07459x.A00();
        for (int i11 = 0; i11 < iA00 && maxIterations == -1; i11++) {
            iA03 = abstractC07459x.A03(iA03, this.A0L, this.A0M, this.A02, this.A0B);
            if (iA03 == -1) {
                break;
            }
            maxIterations = abstractC07459x2.A04(abstractC07459x.A0A(iA03, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(EU eu, long j10) throws C9I {
        return A03(eu, j10, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    private long A03(EU eu, long j10, boolean z10) throws C9I {
        VS vs;
        long j11;
        boolean z11;
        A0H();
        this.A09 = false;
        A0N(2);
        C9Y c9yA0G = this.A0K.A0G();
        C9Y newPlayingPeriodHolder = c9yA0G;
        while (newPlayingPeriodHolder != null) {
            boolean zA0t = A0t(eu, j10, newPlayingPeriodHolder);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) != strArr[0].charAt(10)) {
                A0W[7] = "3g90ZjAQy8gphAPE4L2ghHg16cmQ019E";
                if (zA0t) {
                    this.A0K.A0S(newPlayingPeriodHolder);
                    break;
                }
                newPlayingPeriodHolder = this.A0K.A0C();
            }
            throw new RuntimeException();
        }
        if (c9yA0G != newPlayingPeriodHolder || z10) {
            for (XE xe2 : this.A0C) {
                A0b(xe2);
            }
            this.A0C = new XE[0];
            c9yA0G = null;
        }
        if (newPlayingPeriodHolder != null) {
            A0V(c9yA0G);
            String[] strArr2 = A0W;
            if (strArr2[1].charAt(10) != strArr2[0].charAt(10)) {
                String[] strArr3 = A0W;
                strArr3[4] = "JYav744H3005gGdd3wHQ67gij";
                strArr3[3] = "FVGbgJ3f5rxs8oy2Mt1O3WpPvx";
                if (newPlayingPeriodHolder.A05) {
                    j10 = newPlayingPeriodHolder.A08.AEp(j10);
                    vs = newPlayingPeriodHolder.A08;
                    j11 = j10 - this.A0D;
                    z11 = this.A0S;
                    if (A0W[7].charAt(9) == '8') {
                        A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";
                        vs.A54(j11, z11);
                    }
                    throw new RuntimeException();
                }
            } else if (newPlayingPeriodHolder.A05) {
                j10 = newPlayingPeriodHolder.A08.AEp(j10);
                vs = newPlayingPeriodHolder.A08;
                j11 = j10 - this.A0D;
                z11 = this.A0S;
                if (A0W[7].charAt(9) == '8') {
                    A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";
                    vs.A54(j11, z11);
                }
                throw new RuntimeException();
            }
            A0P(j10);
            A09();
        } else {
            this.A0K.A0O(true);
            A0P(j10);
        }
        this.A0Q.AEr(2);
        if (A0W[2].charAt(12) != 'N') {
            A0W[2] = "qbdkiXSPlbFYutVyIKxCWSr3uDHCS3n2";
            return j10;
        }
        throw new RuntimeException();
    }

    private Pair<Integer, Long> A04(C9R c9r, boolean z10) {
        int iA01;
        AbstractC07459x abstractC07459x = this.A05.A03;
        AbstractC07459x abstractC07459x2 = c9r.A02;
        if (abstractC07459x.A0E()) {
            return null;
        }
        if (abstractC07459x2.A0E()) {
            abstractC07459x2 = abstractC07459x;
        }
        try {
            Pair<Integer, Long> pairA07 = abstractC07459x2.A07(this.A0M, this.A0L, c9r.A00, c9r.A01);
            if (abstractC07459x == abstractC07459x2) {
                return pairA07;
            }
            int iA04 = abstractC07459x.A04(abstractC07459x2.A0A(((Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                return Pair.create(Integer.valueOf(iA04), (Long) pairA07.second);
            }
            if (!z10 || (iA01 = A01(((Integer) pairA07.first).intValue(), abstractC07459x2, abstractC07459x)) == -1) {
                return null;
            }
            Pair<Integer, Long> pairA05 = A05(abstractC07459x, abstractC07459x.A09(iA01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return pairA05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C9W(abstractC07459x, c9r.A00, c9r.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC07459x abstractC07459x, int i10, long j10) {
        return abstractC07459x.A07(this.A0M, this.A0L, i10, j10);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C9Y c9yA0F = this.A0K.A0F();
        long nextLoadPositionUs = c9yA0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean zAFM = this.A0J.AFM(nextLoadPositionUs - c9yA0F.A08(this.A03), this.A0G.A7Y().A01);
        A0k(zAFM);
        if (zAFM) {
            c9yA0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i10;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i11 = this.A0I.A01;
            if (this.A0I.A03) {
                i10 = this.A0I.A00;
            } else {
                i10 = -1;
            }
            handler.obtainMessage(0, i11, i10, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C9Y c9yA0F = this.A0K.A0F();
        C9Y readingPeriodHolder = this.A0K.A0H();
        if (c9yA0F != null && !c9yA0F.A06) {
            if (readingPeriodHolder != null) {
                C9Y loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != c9yA0F) {
                    return;
                }
            }
            XE[] xeArr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (XE xe2 : xeArr) {
                if (!xe2.A8P()) {
                    return;
                }
            }
            c9yA0F.A08.A9s();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C9Z c9zA0I = this.A0K.A0I(this.A03, this.A05);
            if (c9zA0I == null) {
                this.A07.A9t();
                return;
            }
            VS mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5u(), this.A07, this.A05.A03.A0A(c9zA0I.A04.A02, this.A0L, true).A03, c9zA0I);
            mediaPeriod.ADj(this, c9zA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACV();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C9I {
        this.A09 = false;
        this.A0G.A05();
        for (XE xe2 : this.A0C) {
            xe2.start();
        }
    }

    private void A0H() throws C9I {
        this.A0G.A06();
        for (XE xe2 : this.A0C) {
            A0c(xe2);
        }
    }

    private void A0J() throws C9I {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C9Y c9yA0G = this.A0K.A0G();
        VS vs = c9yA0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long jAE2 = vs.AE2();
        if (jAE2 != -9223372036854775807L) {
            A0P(jAE2);
            if (jAE2 != this.A05.A0A) {
                C07259c c07259c = this.A05;
                EU eu = c07259c.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c07259c.A04(eu, jAE2, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long jA04 = this.A0G.A04();
            this.A03 = jA04;
            long jA08 = c9yA0G.A08(jA04);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        C07259c c07259c2 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c9yA0G.A02.A01;
        } else {
            jA0C = c9yA0G.A0C(true);
        }
        c07259c2.A09 = jA0C;
    }

    private void A0L(float f10) {
        for (C9Y c9yA0E = this.A0K.A0E(); c9yA0E != null; c9yA0E = c9yA0E.A01) {
            GQ gq = c9yA0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (gq != null) {
                for (GM gm : c9yA0E.A04.A01.A01()) {
                    if (gm != null) {
                        gm.ACE(f10);
                    }
                }
            }
        }
    }

    private void A0M(int i10) throws C9I {
        this.A02 = i10;
        if (!this.A0K.A0R(i10)) {
            A0j(true);
        }
    }

    private void A0N(int i10) {
        if (this.A05.A00 != i10) {
            C07259c c07259cA02 = this.A05.A02(i10);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = c07259cA02;
        }
    }

    private void A0O(int i10, boolean playing, int i11) throws C9I {
        C9Y c9yA0G = this.A0K.A0G();
        XE xe2 = this.A0T[i10];
        this.A0C[i11] = xe2;
        if (xe2.A7s() == 0) {
            C07409r c07409r = c9yA0G.A04.A03[i10];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] formatArrA0v = A0v(c9yA0G.A04.A01.A00(i10));
            boolean z10 = this.A08 && this.A05.A00 == 3;
            xe2.A5P(c07409r, formatArrA0v, c9yA0G.A0A[i10], this.A03, !playing && z10, c9yA0G.A07());
            this.A0G.A09(xe2);
            if (z10) {
                xe2.start();
            }
        }
    }

    private void A0P(long j10) throws C9I {
        if (this.A0K.A0P()) {
            j10 = this.A0K.A0G().A09(j10);
        }
        this.A03 = j10;
        this.A0G.A07(j10);
        for (XE xe2 : this.A0C) {
            xe2.AEc(this.A03);
        }
    }

    private void A0Q(long j10, long j11) throws C9I {
        C9P c9p;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j10) {
            j10--;
        }
        C07259c c07259c = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i10 = c07259c.A04.A02;
        int currentPeriodIndex = this.A00;
        C9P c9p2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c9p2 != null) {
            if (c9p2.A00 <= i10) {
                int i11 = c9p2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i11 != i10 || c9p2.A01 <= j10) {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c9p2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c9p = this.A0R.get(this.A00);
        } else {
            c9p = null;
        }
        while (c9p != null && c9p.A02 != null && (c9p.A00 < i10 || (c9p.A00 == i10 && c9p.A01 <= j10))) {
            int i12 = this.A00 + 1;
            this.A00 = i12;
            if (i12 < this.A0R.size()) {
                c9p = this.A0R.get(this.A00);
            } else {
                c9p = null;
            }
        }
        while (c9p != null && c9p.A02 != null && c9p.A00 == i10 && c9p.A01 > j10 && c9p.A01 <= j11) {
            A0Z(c9p.A03);
            if (c9p.A03.A0B() || c9p.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C9P> arrayList = this.A0R;
                int i13 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c9p = arrayList.get(i13);
            } else {
                c9p = null;
            }
        }
    }

    private void A0R(long j10, long j11) {
        this.A0Q.AEN(2);
        this.A0Q.AEs(2, j10 + j11);
    }

    private void A0T(C9R c9r) throws Throwable {
        long jLongValue;
        EU euA0L;
        long jLongValue2;
        boolean seekPositionAdjusted;
        this.A0I.A03(1);
        Pair<Integer, Long> resolvedSeekPosition = A04(c9r, true);
        if (resolvedSeekPosition == null) {
            euA0L = new EU(A00());
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            seekPositionAdjusted = true;
        } else {
            int iIntValue = ((Integer) resolvedSeekPosition.first).intValue();
            jLongValue = ((Long) resolvedSeekPosition.second).longValue();
            euA0L = this.A0K.A0L(iIntValue, jLongValue);
            if (euA0L.A01()) {
                jLongValue2 = 0;
                seekPositionAdjusted = true;
            } else {
                jLongValue2 = ((Long) resolvedSeekPosition.second).longValue();
                seekPositionAdjusted = c9r.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A07 != null && this.A01 <= 0) {
                    if (A0W[5].charAt(1) != 'w') {
                        A0W[5] = "YfoxJXVxtggAgJ3C0qUN5WGXkfVCteCk";
                        try {
                            if (jLongValue2 == -9223372036854775807L) {
                                A0N(4);
                                A0o(false, true, false);
                            } else {
                                long jA5r = jLongValue2;
                                if (euA0L.equals(this.A05.A04)) {
                                    C9Y c9yA0G = this.A0K.A0G();
                                    if (c9yA0G != null && jA5r != 0) {
                                        jA5r = c9yA0G.A08.A5r(jA5r, this.A06);
                                    }
                                    long contentPositionUs = C9C.A01(jA5r);
                                    if (contentPositionUs == C9C.A01(this.A05.A0A)) {
                                        this.A05 = this.A05.A04(euA0L, this.A05.A0A, jLongValue);
                                        if (seekPositionAdjusted) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                long jA02 = A02(euA0L, jA5r);
                                seekPositionAdjusted |= jLongValue2 != jA02;
                                if (A0W[6].length() == 17) {
                                    A0W[7] = "LtwUHLpv08wEzos7LWvR75PA6MqqEvuh";
                                    jLongValue2 = jA02;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.A05 = this.A05.A04(euA0L, jLongValue2, jLongValue);
                            if (seekPositionAdjusted) {
                                this.A0I.A04(2);
                            }
                            throw th;
                        }
                    }
                    throw new RuntimeException();
                }
                this.A04 = c9r;
                this.A05 = this.A05.A04(euA0L, jLongValue2, jLongValue);
                if (seekPositionAdjusted) {
                    C9Q c9q = this.A0I;
                    String[] strArr = A0W;
                    if (strArr[4].length() != strArr[3].length()) {
                        A0W[6] = "NnvGpWmx2ly54VvtA";
                        c9q.A04(2);
                    } else {
                        c9q.A04(2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(C9Y c9y) throws C9I {
        C9Y c9yA0G = this.A0K.A0G();
        if (c9yA0G == null || c9y == c9yA0G) {
            return;
        }
        int i10 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i11 = 0;
        while (true) {
            XE[] xeArr = this.A0T;
            if (i11 < xeArr.length) {
                XE xe2 = xeArr[i11];
                zArr[i11] = xe2.A7s() != 0;
                if (c9yA0G.A04.A00(i11)) {
                    i10++;
                }
                if (zArr[i11] && (!c9yA0G.A04.A00(i11) || (xe2.A8m() && xe2.A7v() == c9y.A0A[i11]))) {
                    A0b(xe2);
                }
                i11++;
            } else {
                this.A05 = this.A05.A05(c9yA0G.A03, c9yA0G.A04);
                A0p(zArr, i10);
                return;
            }
        }
    }

    private void A0W(C07269d c07269d) {
        this.A0G.AFE(c07269d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C07379o c07379o) throws C9I {
        if (c07379o.A0D()) {
            return;
        }
        try {
            c07379o.A04().A8K(c07379o.A00(), c07379o.A09());
            c07379o.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            c07379o.A0A(true);
            throw th;
        }
    }

    private void A0Y(C07379o c07379o) throws C9I {
        if (c07379o.A02() == -9223372036854775807L) {
            A0Z(c07379o);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C9P(c07379o));
            return;
        }
        C9P c9p = new C9P(c07379o);
        if (A0r(c9p)) {
            this.A0R.add(c9p);
            Collections.sort(this.A0R);
        } else {
            c07379o.A0A(false);
        }
    }

    private void A0Z(C07379o c07379o) throws C9I {
        if (c07379o.A03().getLooper() == this.A0Q.A7C()) {
            A0X(c07379o);
            C07259c c07259c = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c07259c.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AEr(2);
                return;
            }
            return;
        }
        this.A0Q.AA6(15, c07379o).sendToTarget();
    }

    private void A0a(final C07379o c07379o) {
        c07379o.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9N
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (C0979Jw.A02(this)) {
                    return;
                }
                try {
                    try {
                        this.A00.A0X(c07379o);
                    } catch (C9I e10) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e10);
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                }
            }
        });
    }

    private void A0b(XE xe2) throws C9I {
        this.A0G.A08(xe2);
        A0c(xe2);
        xe2.A52();
    }

    private void A0c(XE xe2) throws C9I {
        if (xe2.A7s() == 2) {
            xe2.stop();
        }
    }

    private void A0d(C07429t c07429t) {
        this.A06 = c07429t;
    }

    private void A0e(VS vs) {
        if (!this.A0K.A0T(vs)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(VS vs) throws C9I {
        if (!this.A0K.A0T(vs)) {
            return;
        }
        C9Y c9yA0F = this.A0K.A0F();
        c9yA0F.A0E(this.A0G.A7Y().A01);
        A0i(c9yA0F.A03, c9yA0F.A04);
        if (!this.A0K.A0P()) {
            C9Y loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0851Es
    /* JADX INFO: renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void AAm(VS vs) {
        this.A0Q.AA6(10, vs).sendToTarget();
    }

    private void A0h(EW ew, boolean z10, boolean z11) {
        this.A01++;
        A0o(true, z10, z11);
        this.A0J.onPrepared();
        this.A07 = ew;
        A0N(2);
        ew.ADm(this.A0H, true, this);
        this.A0Q.AEr(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, GQ gq) {
        this.A0J.AD2(this.A0T, trackGroupArray, gq.A01);
    }

    private void A0j(boolean z10) throws C9I {
        EU eu = this.A0K.A0G().A02.A04;
        long jA03 = A03(eu, this.A05.A0A, true);
        if (jA03 != this.A05.A0A) {
            C07259c c07259c = this.A05;
            this.A05 = c07259c.A04(eu, jA03, c07259c.A01);
            if (z10) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z10) {
        if (this.A05.A08 != z10) {
            this.A05 = this.A05.A06(z10);
        }
    }

    private void A0l(boolean z10) throws C9I {
        this.A09 = false;
        this.A08 = z10;
        if (!z10) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AEr(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AEr(2);
        }
    }

    private void A0m(boolean z10) throws C9I {
        this.A0B = z10;
        if (!this.A0K.A0V(z10)) {
            A0j(true);
        }
    }

    private void A0n(boolean z10, boolean z11) {
        A0o(true, z10, z10);
        this.A0I.A03(this.A01 + (z11 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACt();
        A0N(1);
    }

    private void A0o(boolean z10, boolean z11, boolean z12) {
        Object obj;
        long j10;
        GQ gq;
        EW ew;
        this.A0Q.AEN(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (XE xe2 : this.A0C) {
            try {
                A0b(xe2);
            } catch (C9I | RuntimeException e10) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e10);
            }
        }
        this.A0C = new XE[0];
        this.A0K.A0O(!z11);
        A0k(false);
        if (z11) {
            this.A04 = null;
        }
        if (z12) {
            this.A0K.A0N(AbstractC07459x.A01);
            Iterator<C9P> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC07459x abstractC07459x = z12 ? AbstractC07459x.A01 : this.A05.A03;
        if (z12) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        EU eu = z11 ? new EU(A00()) : this.A05.A04;
        long j11 = -9223372036854775807L;
        if (z11) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.A05.A0A;
        }
        if (!z11) {
            j11 = this.A05.A01;
        }
        int i10 = this.A05.A00;
        TrackGroupArray trackGroupArray = z12 ? TrackGroupArray.A04 : this.A05.A05;
        if (z12) {
            gq = this.A0O;
        } else {
            gq = this.A05.A06;
        }
        this.A05 = new C07259c(abstractC07459x, obj, eu, j10, j11, i10, false, trackGroupArray, gq);
        if (z10 && (ew = this.A07) != null) {
            ew.AEK(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i10) throws C9I {
        this.A0C = new XE[i10];
        int enabledRendererCount = 0;
        C9Y c9yA0G = this.A0K.A0G();
        for (int i11 = 0; i11 < enabledRendererCount; i11++) {
            if (c9yA0G.A04.A00(i11)) {
                A0O(i11, zArr[i11], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C9Y c9yA0G = this.A0K.A0G();
        long j10 = c9yA0G.A02.A01;
        if (j10 != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j10) {
                C9Y c9y = c9yA0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c9y != null) {
                    C9Y playingPeriodHolder = c9yA0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C9Y playingPeriodHolder2 = c9yA0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C9P c9p) {
        if (c9p.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new C9R(c9p.A03.A08(), c9p.A03.A01(), C9C.A00(c9p.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            int iIntValue = ((Integer) pairA04.first).intValue();
            long jLongValue = ((Long) pairA04.second).longValue();
            AbstractC07459x abstractC07459x = this.A05.A03;
            Integer num = (Integer) pairA04.first;
            String[] strArr = A0W;
            String str = strArr[1];
            String str2 = strArr[0];
            int iCharAt = str.charAt(10);
            int index = str2.charAt(10);
            if (iCharAt == index) {
                throw new RuntimeException();
            }
            A0W[6] = "Qe4SjxIsSBa3x6HAW";
            c9p.A01(iIntValue, jLongValue, abstractC07459x.A0A(num.intValue(), this.A0L, true).A03);
        } else {
            int iA04 = this.A05.A03.A04(c9p.A02);
            if (iA04 == -1) {
                return false;
            }
            c9p.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(XE xe2) {
        C9Y c9yA0H = this.A0K.A0H();
        C9Y readingPeriodHolder = c9yA0H.A01;
        if (readingPeriodHolder != null) {
            C9Y readingPeriodHolder2 = c9yA0H.A01;
            if (readingPeriodHolder2.A06 && xe2.A8P()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(EU eu, long j10, C9Y c9y) {
        if (eu.equals(c9y.A02.A04) && c9y.A06) {
            this.A05.A03.A09(c9y.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j10);
            if (iA04 == -1 || this.A0L.A09(iA04) == c9y.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z10) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z10) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C9Y c9yA0F = this.A0K.A0F();
        long jA0C = c9yA0F.A0C(!c9yA0F.A02.A05);
        return jA0C == Long.MIN_VALUE || this.A0J.AFP(jA0C - c9yA0F.A08(this.A03), this.A0G.A7Y().A01, this.A09);
    }

    public static Format[] A0v(GM gm) {
        int length = gm != null ? gm.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int iCharAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (iCharAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = gm.A6y(i10);
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AEr(7);
        boolean z10 = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(AbstractC07459x abstractC07459x, int i10, long j10) {
        this.A0Q.AA6(3, new C9R(abstractC07459x, i10, j10)).sendToTarget();
    }

    public final void A0z(EW ew, boolean z10, boolean z11) {
        this.A0Q.AA5(0, z10 ? 1 : 0, z11 ? 1 : 0, ew).sendToTarget();
    }

    public final void A10(boolean z10) {
        this.A0Q.AA4(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z10) {
        this.A0Q.AA4(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final void ACD(C07269d c07269d) {
        this.A0E.obtainMessage(1, c07269d).sendToTarget();
        A0L(c07269d.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VT
    public final void ACL(VS vs) {
        this.A0Q.AA6(9, vs).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.EV
    public final void ACo(EW ew, AbstractC07459x abstractC07459x, Object obj) {
        this.A0Q.AA6(8, new C9O(ew, abstractC07459x, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07359m
    public final synchronized void AEt(C07379o c07379o) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            c07379o.A0A(false);
        } else {
            this.A0Q.AA6(14, c07379o).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((EW) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C9R) message.obj);
                    break;
                case 4:
                    A0W((C07269d) message.obj);
                    break;
                case 5:
                    A0d((C07429t) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C9O) message.obj);
                    break;
                case 9:
                    A0f((VS) message.obj);
                    break;
                case 10:
                    A0e((VS) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C07379o) message.obj);
                    break;
                case 15:
                    A0a((C07379o) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C9I e10) {
            Log.e(strA06, A06(110, 15, 98), e10);
            A0n(false, false);
            this.A0E.obtainMessage(2, e10).sendToTarget();
            A0A();
        } catch (IOException e11) {
            Log.e(strA06, A06(125, 13, 51), e11);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9I.A00(e11)).sendToTarget();
            A0A();
        } catch (RuntimeException e12) {
            Log.e(strA06, A06(87, 23, 38), e12);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9I.A02(e12)).sendToTarget();
            A0A();
        }
        return true;
    }
}
