package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1289Wa implements BY {
    public static byte[] A0p;
    public static String[] A0q = {"WhKu7pkuAeXCsVE8uRhv3EZwgBp9riSc", "wrDeNyGLCWUv14ZggE2zPWUzu5gjoOIg", "xUs1VEgTJlmvEesGlKYim2mGX89Mn6Ap", "W8YnXYO8xf4ClNYvDZVYWX", "B88t6KSt5rHqx0X", "mP1RKkMa67OSAD0gBpbGTYhDs7d4UNMk", "rmkWP1gG3PZnRTV6Vu72xnpKfVt", "q3NSDD9bEbAX3BTi5XmjKvgCV917aeoR"};
    public static final InterfaceC0775Bb A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC0774Ba A0N;
    public C0788Bu A0O;
    public HV A0P;
    public HV A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<C0788Bu> A0c;
    public final InterfaceC0786Bq A0d;
    public final C0789Bx A0e;
    public final C0914Hf A0f;
    public final C0914Hf A0g;
    public final C0914Hf A0h;
    public final C0914Hf A0i;
    public final C0914Hf A0j;
    public final C0914Hf A0k;
    public final C0914Hf A0l;
    public final C0914Hf A0m;
    public final C0914Hf A0n;
    public final boolean A0o;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{65, -113, -112, -107, 65, -108, -106, -111, -111, -112, -109, -107, -122, -123, -98, -87, -86, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, 56, 67, 69, 119, 77, 56, 67, 69, 119, 77, 56, 67, 69, 119, 63, 56, 67, 70, 119, -107, -103, -89, -89, -71, -56, -56, -67, -62, -69, -57, -105, -67, -60, -68, -71, -58, -95, -61, -72, -71, 116, -53, -23, -53, -53, -51, -55, -25, -55, -53, -69, -81, -51, -78, -62, -63, -117, -87, -114, -98, -99, 121, -113, -94, -102, -100, -113, -99, -99, -93, -63, -90, -74, -75, -111, -82, -79, -75, -75, -82, -89, -75, -75, -120, -90, -116, -120, -118, 122, 94, 124, 99, 105, 94, 96, -77, -47, -65, -62, -73, -71, -95, -66, -92, 85, 115, 97, 100, 89, 91, 67, 96, 71, 116, -110, -128, -122, 98, 116, 118, -128, -77, -47, -63, -62, -57, -59, -100, -70, -85, -98, -88, -118, -92, -87, -81, -118, -89, -92, -81, -117, -87, -98, -100, -97, -113, -110, -114, -92, -62, -71, -78, -75, -91, -84, -74, -109, -79, -66, 119, -60, 112, -61, -77, -79, -68, -75, 112, -60, -71, -67, -75, -77, -65, -76, -75, 112, -64, -62, -71, -65, -62, 112, -60, -65, 112, -60, -71, -67, -75, -77, -65, -76, -75, -93, -77, -79, -68, -75, 112, -78, -75, -71, -66, -73, 112, -61, -75, -60, 126, 89, -123, -125, 120, Ascii.DEL, -124, Ascii.DEL, -124, 125, 54, 123, -124, 121, -120, -113, -122, -118, Ascii.DEL, -123, -124, 54, 119, -124, 122, 54, 121, -123, -125, -122, -120, 123, -119, -119, Ascii.DEL, -123, -124, 54, Ascii.DEL, -119, 54, -124, -123, -118, 54, -119, -117, -122, -122, -123, -120, -118, 123, 122, -69, -25, -26, -20, -35, -26, -20, -69, -25, -27, -24, -71, -28, -33, -25, -104, -111, -67, -68, -62, -77, -68, -62, -109, -68, -79, -113, -70, -75, -67, 110, -89, -45, -46, -40, -55, -46, -40, -87, -46, -57, -45, -56, -51, -46, -53, -77, -42, -56, -55, -42, -124, 120, -92, -93, -87, -102, -93, -87, 122, -93, -104, -92, -103, -98, -93, -100, -120, -104, -92, -91, -102, 85, -59, -16, -28, -43, -6, -15, -26, -95, 94, -119, 125, 110, -109, -118, Ascii.DEL, 108, Ascii.DEL, 123, 126, 112, Ascii.DEL, -116, -115, -125, -119, -120, 58, -68, -71, -60, -61, -105, -29, -40, -38, -32, -27, -34, -105, -22, -40, -28, -25, -29, -36, -105, -22, -32, -15, -36, -105, -26, -20, -21, -105, -26, -35, -105, -23, -40, -27, -34, -36, -91, -79, -82, -71, -72, -66, -47, -51, -48, -62, -47, -34, -33, -43, -37, -38, -116, -60, -19, -30, -15, -8, -17, -13, -28, -29, -97, -45, -15, -32, -30, -22, -97, -27, -18, -12, -19, -29, -97, -31, -12, -13, -97, -62, -18, -19, -13, -28, -19, -13, -60, -19, -30, -54, -28, -8, -56, -61, -97, -10, -32, -14, -97, -19, -18, -13, -97, -27, -18, -12, -19, -29, 103, -102, -106, -121, -112, -107, -117, -111, -112, 66, -124, -117, -106, 66, -117, -107, 66, -107, -121, -106, 66, -117, -112, 66, -107, -117, -119, -112, -125, -114, 66, -124, -101, -106, -121, -91, -50, -47, -52, -64, -45, -103, Ascii.DEL, -78, -45, -64, -47, -45, -117, Ascii.DEL, -92, -51, -61, -117, Ascii.DEL, -79, -60, -64, -61, -82, -47, -61, -60, -47, -117, Ascii.DEL, -85, -64, -40, -60, -47, -117, Ascii.DEL, -78, -45, -40, -53, -60, -117, Ascii.DEL, -83, -64, -52, -60, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -85, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -79, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -75, -117, Ascii.DEL, -92, -59, -59, -60, -62, -45, -117, Ascii.DEL, -77, -60, -41, -45, -99, -78, -76, -70, -65, -72, 113, -64, -65, -67, -54, 113, -60, -58, -63, -63, -64, -61, -59, -74, -75, 113, -70, -65, 113, -92, -70, -66, -63, -67, -74, -109, -67, -64, -76, -68, -60, Ascii.DEL, 115, -121, -108, -118, -121, -102, -107, -104, -97, 70, -117, -110, -117, -109, -117, -108, -102, 70, 121, -117, -117, -111, 111, 106, 70, -107, -104, 70, 121, -117, -117, -111, 118, -107, -103, -113, -102, -113, -107, -108, 70, -108, -107, -102, 70, -116, -107, -101, -108, -118, -54, -14, -23, -15, -26, -19, -23, -30, -99, -48, -30, -28, -22, -30, -21, -15, -99, -30, -23, -30, -22, -30, -21, -15, -16, -99, -21, -20, -15, -99, -16, -14, -19, -19, -20, -17, -15, -30, -31, -102, -69, 108, -62, -83, -72, -75, -80, 108, -64, -66, -83, -81, -73, -65, 108, -61, -79, -66, -79, 108, -78, -69, -63, -70, -80, 119, -104, 73, -97, -118, -107, -110, -115, 73, -97, -118, -101, -110, -105, -99, 73, -107, -114, -105, -112, -99, -111, 73, -106, -118, -100, -108, 73, -113, -104, -98, -105, -115, 112, 124, 97, 115, 95, 112, 114, 95, -44, -32, -55, -59, -50, -41, -80, -47, -56, -44, -104, -92, -103, -118, -99, -103, 116, -122, -104, -104, -72, -60, -71, -86, -67, -71, -108, -70, -71, -85, -99, -42, -30, -39, -46, -59, -42, -40, -59, 104, -127, 120, -117, -125, 120, 118, -121, 120, 119, 51, 124, 119, 77, 51, Ascii.DEL, -104, -113, -94, -102, -113, -115, -98, -113, -114, 74, -106, -117, -115, -109, -104, -111, 74, -96, -117, -106, -97, -113, 100, 74, -86, -77, -95, -92, -103, -101, -122, -38, -29, -47, -44, -55, -53, -72, -77, -51, -41, -45, -77, -59, -44, -72, -63, -81, -78, -89, -87, -106, -111, -85, -75, -79, -111, -93, -75, -78, 122, -125, 113, 116, 105, 107, 88, 83, 109, 119, 115, 83, 101, 122, 103, -53, -44, -62, -59, -70, -68, -87, -92, -66, -56, -60, -92, -56, -59, 116, 125, 107, 110, 99, 101, 102, 77, 103, 113, 109, 77, 102, 99, 116, 97, -47, -38, -56, -50, -86, -47, -63, -46, -86, -63, -54, -48, -51, -66, -66, -67, -58, 
        -69, -81, -84, -74, -71, -88, -100, -91, -100, -106, 126, 118, Ascii.DEL, 118, 112, 89, -13, -25, -6, -8, -11, -7, -15, -25, -63, -76, -81, -80, -70, 122, -62, -80, -83, -72, -12, -30, -33, -22};
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02b4 A[EDGE_INSN: B:106:0x02b4->B:99:0x02b4 BREAK  A[LOOP:1: B:95:0x02a8->B:97:0x02ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0234  */
    /* JADX WARN: Code duplicated, block: B:84:0x026c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0291  */
    /* JADX WARN: Code duplicated, block: B:91:0x0295  */
    /* JADX WARN: Code duplicated, block: B:93:0x029d  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ac A[LOOP:1: B:95:0x02a8->B:97:0x02ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x02b2  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A08(BZ bz, C0788Bu c0788Bu, int i10) throws InterruptedException, IOException {
        byte[] bArr;
        int i11;
        int i12;
        String[] strArr;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        if (A03(843, 11, 89).equals(c0788Bu.A0Y)) {
            A09(bz, A0w, i10);
            return;
        }
        if (A03(833, 10, 57).equals(c0788Bu.A0Y)) {
            A09(bz, A0u, i10);
            return;
        }
        InterfaceC0782Bk interfaceC0782Bk = c0788Bu.A0W;
        if (!this.A0S) {
            if (c0788Bu.A0c) {
                this.A01 &= -1073741825;
                if (!this.A0X) {
                    bz.readFully(this.A0k.A00, 0, 1);
                    this.A07++;
                    if ((this.A0k.A00[0] & 128) == 128) {
                        throw new C07249b(A03(504, 35, 22));
                    }
                    this.A00 = this.A0k.A00[0];
                    this.A0X = true;
                }
                byte b10 = this.A00;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.A01 |= 1073741824;
                    if (!this.A0T) {
                        bz.readFully(this.A0f.A00, 0, 8);
                        this.A07 += 8;
                        this.A0T = true;
                        this.A0k.A00[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.A0k.A0Y(0);
                        interfaceC0782Bk.AEg(this.A0k, 1);
                        this.A08++;
                        this.A0f.A0Y(0);
                        interfaceC0782Bk.AEg(this.A0f, 8);
                        this.A08 += 8;
                    }
                    if (z11) {
                        if (!this.A0U) {
                            bz.readFully(this.A0k.A00, 0, 1);
                            this.A07++;
                            this.A0k.A0Y(0);
                            this.A0A = this.A0k.A0E();
                            this.A0U = true;
                        }
                        int i17 = this.A0A * 4;
                        this.A0k.A0W(i17);
                        bz.readFully(this.A0k.A00, 0, i17);
                        this.A07 += i17;
                        short s10 = (short) ((this.A0A / 2) + 1);
                        int i18 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.A0R;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.A0R = ByteBuffer.allocate(i18);
                        }
                        this.A0R.position(0);
                        if (A0q[7].charAt(2) == 'J') {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0q;
                        strArr2[3] = "THDQpgmvr4cFRBgiNMs8PF";
                        strArr2[4] = "1poAoCQZUv3pf1E";
                        this.A0R.putShort(s10);
                        int iA0H = 0;
                        int i19 = 0;
                        while (true) {
                            i16 = this.A0A;
                            if (i19 >= i16) {
                                break;
                            }
                            int i20 = iA0H;
                            iA0H = this.A0k.A0H();
                            if (i19 % 2 == 0) {
                                this.A0R.putShort((short) (iA0H - i20));
                            } else {
                                this.A0R.putInt(iA0H - i20);
                            }
                            i19++;
                        }
                        int i21 = (i10 - this.A07) - iA0H;
                        if (i16 % 2 == 1) {
                            this.A0R.putInt(i21);
                        } else {
                            this.A0R.putShort((short) i21);
                            this.A0R.putInt(0);
                        }
                        this.A0g.A0b(this.A0R.array(), i18);
                        interfaceC0782Bk.AEg(this.A0g, i18);
                        this.A08 += i18;
                    }
                }
            } else if (c0788Bu.A0f != null) {
                this.A0j.A0b(c0788Bu.A0f, c0788Bu.A0f.length);
            }
            this.A0S = true;
        }
        int iA07 = i10 + this.A0j.A07();
        if (!A03(938, 15, 24).equals(c0788Bu.A0Y)) {
            String str = c0788Bu.A0Y;
            String[] strArr3 = A0q;
            if (strArr3[3].length() == strArr3[4].length()) {
                A0q[7] = "sy3uFLetKptIKAzZi5TrivHGyzVJlzFz";
                if (!A03(967, 16, 7).equals(str)) {
                    if (c0788Bu.A0X != null) {
                        if (this.A0j.A07() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        HG.A04(z10);
                        c0788Bu.A0X.A01(bz, this.A01, iA07);
                    }
                    while (true) {
                        i15 = this.A07;
                        if (i15 < iA07) {
                            break;
                            break;
                        }
                        A00(bz, interfaceC0782Bk, iA07 - i15);
                    }
                } else {
                    bArr = this.A0h.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i11 = c0788Bu.A0M;
                    i12 = c0788Bu.A0M;
                    strArr = A0q;
                    if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
                        A0q[7] = "0lM7bagkFlLz8FmVBufdz5xCACjDlG3v";
                        i13 = 4 - i12;
                    } else {
                        i13 = 4 - i12;
                    }
                    while (this.A07 < iA07) {
                        i14 = this.A09;
                        if (A0q[6].length() != 27) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0q;
                        strArr4[3] = "6FvEhwXk7W3hxrnwrmoI06";
                        strArr4[4] = "U5KOwDqTToVhTCu";
                        if (i14 == 0) {
                            A0A(bz, bArr, i13, i11);
                            this.A0h.A0Y(0);
                            this.A09 = this.A0h.A0H();
                            this.A0i.A0Y(0);
                            interfaceC0782Bk.AEg(this.A0i, 4);
                            this.A08 += 4;
                        } else {
                            this.A09 = i14 - A00(bz, interfaceC0782Bk, i14);
                        }
                    }
                }
            } else {
                String[] strArr5 = A0q;
                strArr5[1] = "5KvGwKmSVXSgkcPgzRNIJsu4vgaIOK2b";
                strArr5[5] = "zKZ8kTny4n19sCxg6YTLkMgvo4kJK4kI";
                if (!A03(967, 16, 18).equals(str)) {
                    if (c0788Bu.A0X != null) {
                        if (this.A0j.A07() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        HG.A04(z10);
                        c0788Bu.A0X.A01(bz, this.A01, iA07);
                    }
                    while (true) {
                        i15 = this.A07;
                        if (i15 < iA07) {
                            break;
                        } else {
                            A00(bz, interfaceC0782Bk, iA07 - i15);
                        }
                    }
                } else {
                    bArr = this.A0h.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i11 = c0788Bu.A0M;
                    i12 = c0788Bu.A0M;
                    strArr = A0q;
                    if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
                        A0q[7] = "0lM7bagkFlLz8FmVBufdz5xCACjDlG3v";
                        i13 = 4 - i12;
                    } else {
                        i13 = 4 - i12;
                    }
                    while (this.A07 < iA07) {
                        i14 = this.A09;
                        if (A0q[6].length() != 27) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0q;
                        strArr6[3] = "6FvEhwXk7W3hxrnwrmoI06";
                        strArr6[4] = "U5KOwDqTToVhTCu";
                        if (i14 == 0) {
                            A0A(bz, bArr, i13, i11);
                            this.A0h.A0Y(0);
                            this.A09 = this.A0h.A0H();
                            this.A0i.A0Y(0);
                            interfaceC0782Bk.AEg(this.A0i, 4);
                            this.A08 += 4;
                        } else {
                            this.A09 = i14 - A00(bz, interfaceC0782Bk, i14);
                        }
                    }
                }
            }
        } else {
            bArr = this.A0h.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            i11 = c0788Bu.A0M;
            i12 = c0788Bu.A0M;
            strArr = A0q;
            if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
                A0q[7] = "0lM7bagkFlLz8FmVBufdz5xCACjDlG3v";
                i13 = 4 - i12;
            } else {
                i13 = 4 - i12;
            }
            while (this.A07 < iA07) {
                i14 = this.A09;
                if (A0q[6].length() != 27) {
                    throw new RuntimeException();
                }
                String[] strArr7 = A0q;
                strArr7[3] = "6FvEhwXk7W3hxrnwrmoI06";
                strArr7[4] = "U5KOwDqTToVhTCu";
                if (i14 == 0) {
                    A0A(bz, bArr, i13, i11);
                    this.A0h.A0Y(0);
                    this.A09 = this.A0h.A0H();
                    this.A0i.A0Y(0);
                    interfaceC0782Bk.AEg(this.A0i, 4);
                    this.A08 += 4;
                } else {
                    this.A09 = i14 - A00(bz, interfaceC0782Bk, i14);
                }
            }
        }
        if (A03(181, 8, 87).equals(c0788Bu.A0Y)) {
            this.A0n.A0Y(0);
            interfaceC0782Bk.AEg(this.A0n, 4);
            this.A08 += 4;
        }
    }

    static {
        A06();
        A0r = new C1291Wc();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C0930Hv.A0i(A03(539, 90, 83));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1289Wa() {
        this(0);
    }

    public C1289Wa(int i10) {
        this(new C1292Wd(), i10);
    }

    public C1289Wa(InterfaceC0786Bq interfaceC0786Bq, int i10) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = interfaceC0786Bq;
        interfaceC0786Bq.A8e(new C1290Wb(this, null));
        this.A0o = (i10 & 1) == 0;
        this.A0e = new C0789Bx();
        this.A0c = new SparseArray<>();
        this.A0k = new C0914Hf(4);
        this.A0n = new C0914Hf(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0914Hf(4);
        this.A0i = new C0914Hf(C0910Hb.A03);
        this.A0h = new C0914Hf(4);
        this.A0j = new C0914Hf();
        this.A0m = new C0914Hf();
        this.A0f = new C0914Hf(8);
        this.A0g = new C0914Hf();
    }

    private int A00(BZ bz, InterfaceC0782Bk interfaceC0782Bk, int i10) throws InterruptedException, IOException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = Math.min(i10, strippedBytesLeft);
            interfaceC0782Bk.AEg(this.A0j, bytesRead);
        } else {
            bytesRead = interfaceC0782Bk.AEf(bz, i10, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j10) throws C07249b {
        long j11 = this.A0M;
        if (j11 != -9223372036854775807L) {
            return C0930Hv.A0F(j10, j11, 1000L);
        }
        throw new C07249b(A03(189, 54, 68));
    }

    private InterfaceC0779Bh A02() {
        HV hv;
        HV hv2;
        if (this.A0K == -1 || this.A0H == -9223372036854775807L || (hv = this.A0Q) == null || hv.A02() == 0 || (hv2 = this.A0P) == null || hv2.A02() != this.A0Q.A02()) {
            this.A0Q = null;
            this.A0P = null;
            return new C1301Wm(this.A0H);
        }
        int iA02 = this.A0Q.A02();
        int[] iArr = new int[iA02];
        long[] jArr = new long[iA02];
        long[] timesUs = new long[iA02];
        long[] durationsUs = new long[iA02];
        for (int i10 = 0; i10 < iA02; i10++) {
            durationsUs[i10] = this.A0Q.A03(i10);
            jArr[i10] = this.A0K + this.A0P.A03(i10);
        }
        for (int i11 = 0; i11 < cuePointsSize; i11++) {
            int cuePointsSize = i11 + 1;
            iArr[i11] = (int) (jArr[cuePointsSize] - jArr[i11]);
            int cuePointsSize2 = i11 + 1;
            timesUs[i11] = durationsUs[cuePointsSize2] - durationsUs[i11];
        }
        int cuePointsSize3 = iA02 - 1;
        iArr[iA02 - 1] = (int) ((this.A0K + this.A0L) - jArr[cuePointsSize3]);
        timesUs[iA02 - 1] = this.A0H - durationsUs[iA02 - 1];
        this.A0Q = null;
        this.A0P = null;
        return new C1306Wr(iArr, jArr, timesUs, durationsUs);
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(BZ bz, int i10) throws InterruptedException, IOException {
        if (this.A0k.A07() >= i10) {
            return;
        }
        if (this.A0k.A05() < i10) {
            C0914Hf c0914Hf = this.A0k;
            c0914Hf.A0b(Arrays.copyOf(c0914Hf.A00, Math.max(this.A0k.A00.length * 2, i10)), this.A0k.A07());
        }
        byte[] bArr = this.A0k.A00;
        int iA07 = this.A0k.A07();
        if (A0q[6].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[0] = "ZmQc4cegfKT6TM2j1HdEhTMrEsYvVAK8";
        strArr[2] = "PLs1alOmXmQPSsdSdZUe4T02xUG6CaQT";
        bz.readFully(bArr, iA07, i10 - this.A0k.A07());
        this.A0k.A0X(i10);
    }

    private void A09(BZ bz, byte[] bArr, int i10) throws InterruptedException, IOException {
        int length = bArr.length + i10;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i10;
            this.A0m.A00 = Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        bz.readFully(bArr2, sizeWithPrefix3, i10);
        this.A0m.A0W(length);
    }

    private void A0A(BZ bz, byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iMin = Math.min(i11, this.A0j.A04());
        int pendingStrippedBytes = i11 - iMin;
        bz.readFully(bArr, i10 + iMin, pendingStrippedBytes);
        if (iMin > 0) {
            this.A0j.A0c(bArr, i10, iMin);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i11;
    }

    private void A0B(C0788Bu c0788Bu, long j10) {
        if (c0788Bu.A0X != null) {
            Bv bv = c0788Bu.A0X;
            if (A0q[6].length() != 27) {
                throw new RuntimeException();
            }
            A0q[6] = "nKrIVrdQs7NkqXN01cL0onp1lFd";
            bv.A03(c0788Bu, j10);
        } else {
            if (A03(843, 11, 89).equals(c0788Bu.A0Y)) {
                A0C(c0788Bu, A03(33, 19, 7), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 57).equals(c0788Bu.A0Y)) {
                    A0C(c0788Bu, A03(14, 19, 109), 21, AbstractComponentTracker.LINGERING_TIMEOUT, A0v);
                }
            }
            c0788Bu.A0W.AEh(j10, this.A01, this.A08, 0, c0788Bu.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(C0788Bu c0788Bu, String str, int i10, long j10, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i10, j10, bArr);
        InterfaceC0782Bk interfaceC0782Bk = c0788Bu.A0W;
        C0914Hf c0914Hf = this.A0m;
        interfaceC0782Bk.AEg(c0914Hf, c0914Hf.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j10, String str, int i10, long j11, byte[] bArr2) {
        byte[] bArrA0i;
        if (j10 == -9223372036854775807L) {
            bArrA0i = bArr2;
        } else {
            int i11 = (int) (j10 / 3600000000L);
            long j12 = j10 - (((long) (i11 * DateTimeConstants.SECONDS_PER_HOUR)) * 1000000);
            int i12 = (int) (j12 / 60000000);
            long j13 = j12 - (((long) (i12 * 60)) * 1000000);
            int lastValue = (int) (j13 / 1000000);
            int seconds = (int) ((j13 - (((long) lastValue) * 1000000)) / j11);
            bArrA0i = C0930Hv.A0i(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(lastValue), Integer.valueOf(seconds)));
        }
        System.arraycopy(bArrA0i, 0, bArr, i10, bArr2.length);
    }

    private boolean A0E(C0777Bf c0777Bf, long j10) {
        if (this.A0Y) {
            this.A0J = j10;
            c0777Bf.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        boolean z10 = this.A0a;
        String[] strArr = A0q;
        if (strArr[0].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[1] = "bgcuSmmv9nMD5qNgR1ZnJGCWOsXR4zDF";
        strArr2[5] = "rXrXJdml0w7r8hjghYXvJH5LLiJomjK3";
        if (z10) {
            long j11 = this.A0J;
            if (j11 != -1) {
                c0777Bf.A00 = j11;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    public static boolean A0F(String str) {
        if (!A03(1006, 5, 58).equals(str) && !A03(1011, 5, 20).equals(str) && !A03(902, 7, 72).equals(str)) {
            String strA03 = A03(953, 14, 105);
            String[] strArr = A0q;
            if (strArr[1].charAt(15) == strArr[5].charAt(15)) {
                A0q[7] = "rYhgwmDh4TKBcj4Uwcvshsmah3Wf4ae0";
                if (!strA03.equals(str) && !A03(923, 15, 86).equals(str) && !A03(909, 14, 120).equals(str) && !A03(938, 15, 24).equals(str) && !A03(967, 16, 18).equals(str) && !A03(983, 15, 111).equals(str)) {
                    String[] strArr2 = A0q;
                    if (strArr2[1].charAt(15) != strArr2[5].charAt(15)) {
                        throw new RuntimeException();
                    }
                    A0q[6] = "rlxG2GXYid9bCHwXApke8Gz33sW";
                    if (!A03(998, 8, 91).equals(str) && !A03(154, 6, 102).equals(str) && !A03(181, 8, 87).equals(str) && !A03(74, 5, 126).equals(str) && !A03(128, 9, 102).equals(str) && !A03(137, 9, 8).equals(str) && !A03(79, 5, 124).equals(str) && !A03(116, 6, 59).equals(str) && !A03(173, 8, 62).equals(str) && !A03(84, 5, 98).equals(str) && !A03(89, 13, 62).equals(str) && !A03(102, 14, 86).equals(str) && !A03(122, 6, 17).equals(str) && !A03(146, 8, 39).equals(str) && !A03(SyslogConstants.LOG_LOCAL4, 13, 79).equals(str)) {
                        boolean zEquals = A03(843, 11, 89).equals(str);
                        String[] strArr3 = A0q;
                        if (strArr3[0].charAt(31) != strArr3[2].charAt(31)) {
                            String[] strArr4 = A0q;
                            strArr4[1] = "DfP1dlVZEdoO22ggDOih4DhJX4h9DttB";
                            strArr4[5] = "iPMsbxRLvFu5COzgJWPWeI2fmUuAHT3S";
                            if (!zEquals && !A03(833, 10, 57).equals(str) && !A03(854, 8, 119).equals(str) && !A03(823, 10, 117).equals(str) && !A03(815, 8, 17).equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    public final void A0I(int i10) throws C07249b {
        switch (i10) {
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                if (this.A04 != 2) {
                    return;
                }
                if (!this.A0W) {
                    this.A01 = 1 | this.A01;
                }
                A0B(this.A0c.get(this.A05), this.A0D);
                this.A04 = 0;
                return;
            case 174:
                if (A0F(this.A0O.A0Y)) {
                    C0788Bu c0788Bu = this.A0O;
                    c0788Bu.A09(this.A0N, c0788Bu.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            case 19899:
                int i11 = this.A0B;
                if (i11 != -1) {
                    long j10 = this.A0I;
                    if (j10 != -1) {
                        if (i11 != 475249515) {
                            return;
                        }
                        this.A0F = j10;
                        return;
                    }
                }
                throw new C07249b(A03(667, 50, 26));
            case 25152:
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C9C.A04, A03(1024, 10, 63), this.A0O.A0V.A03));
                    return;
                }
                throw new C07249b(A03(449, 55, 115));
            case 28032:
                if (!this.A0O.A0c || this.A0O.A0f == null) {
                    return;
                } else {
                    throw new C07249b(A03(243, 53, 10));
                }
            case 357149030:
                if (this.A0M == -9223372036854775807L) {
                    this.A0M = 1000000L;
                }
                long j11 = this.A0G;
                if (j11 == -9223372036854775807L) {
                    return;
                }
                this.A0H = A01(j11);
                return;
            case 374648427:
                if (this.A0c.size() != 0) {
                    this.A0N.A5S();
                    return;
                }
                throw new C07249b(A03(756, 26, 64));
            case 475249515:
                if (this.A0a) {
                    return;
                }
                this.A0N.AEm(A02());
                this.A0a = true;
                return;
            default:
                return;
        }
    }

    public final void A0J(int i10, double d10) {
        switch (i10) {
            case 181:
                this.A0O.A0O = (int) d10;
                break;
            case 17545:
                this.A0G = (long) d10;
                break;
            case 21969:
                this.A0O.A06 = (float) d10;
                break;
            case 21970:
                this.A0O.A07 = (float) d10;
                break;
            case 21971:
                this.A0O.A04 = (float) d10;
                break;
            case 21972:
                this.A0O.A05 = (float) d10;
                break;
            case 21973:
                this.A0O.A02 = (float) d10;
                break;
            case 21974:
                this.A0O.A03 = (float) d10;
                break;
            case 21975:
                this.A0O.A08 = (float) d10;
                break;
            case 21976:
                this.A0O.A09 = (float) d10;
                break;
            case 21977:
                this.A0O.A00 = (float) d10;
                break;
            case 21978:
                this.A0O.A01 = (float) d10;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0307  */
    /* JADX WARN: Code duplicated, block: B:123:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x017e A[PHI: r3
  0x017e: PHI (r3v18 int[]) = (r3v10 int[]), (r3v19 int[]) binds: [B:55:0x01a0, B:50:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213  */
    /* JADX WARN: Code duplicated, block: B:77:0x0229  */
    /* JADX WARN: Code duplicated, block: B:79:0x022e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251 A[LOOP:4: B:82:0x024f->B:83:0x0251, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x025f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0282  */
    /* JADX WARN: Code duplicated, block: B:92:0x0293  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c2  */
    public final void A0K(int i10, int headerSize, BZ bz) throws InterruptedException, IOException {
        int[] iArrA0H;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr;
        long j10;
        int sampleIndex;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        String[] strArr2;
        int headerSize2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String[] strArr3;
        int i25 = 0;
        int i26 = 1;
        switch (i10) {
            case 161:
            case 163:
                if (this.A04 == 0) {
                    this.A05 = (int) this.A0e.A05(bz, false, true, 8);
                    this.A06 = this.A0e.A04();
                    this.A0C = -9223372036854775807L;
                    this.A04 = 1;
                    this.A0k.A0V();
                }
                C0788Bu c0788Bu = this.A0c.get(this.A05);
                if (c0788Bu == null) {
                    bz.AFT(headerSize - this.A06);
                    this.A04 = 0;
                    return;
                }
                if (this.A04 == 1) {
                    A07(bz, 3);
                    int i27 = (this.A0k.A00[2] & 6) >> 1;
                    if (i27 == 0) {
                        this.A02 = 1;
                        int[] iArrA0H2 = A0H(this.A0b, 1);
                        this.A0b = iArrA0H2;
                        iArrA0H2[0] = (headerSize - this.A06) - 3;
                    } else if (i10 == 163) {
                        A07(bz, 4);
                        int i28 = (this.A0k.A00[3] & 255) + 1;
                        this.A02 = i28;
                        int[] iArr2 = this.A0b;
                        String[] strArr4 = A0q;
                        if (strArr4[0].charAt(31) != strArr4[2].charAt(31)) {
                            String[] strArr5 = A0q;
                            strArr5[3] = "RwuJZhEYbPwrYhgspkpAZU";
                            strArr5[4] = "DTAVHXJ2rXJnopR";
                            iArrA0H = A0H(iArr2, i28);
                            this.A0b = iArrA0H;
                            if (i27 == 2) {
                                i23 = (headerSize - this.A06) - 4;
                                i24 = this.A02;
                                strArr3 = A0q;
                                if (strArr3[1].charAt(15) == strArr3[5].charAt(15)) {
                                    String[] strArr6 = A0q;
                                    strArr6[1] = "RQftDwpqwbIXAF1g5dDgy2XjM3R9Fufd";
                                    strArr6[5] = "50lzYqnE8by0N6RgVVPD3M33x9kk99sn";
                                    Arrays.fill(iArrA0H, 0, i24, i23 / i24);
                                }
                            } else if (i27 == 1) {
                                if (i27 == 3) {
                                    i11 = 0;
                                    i12 = 4;
                                    i13 = 0;
                                    while (true) {
                                        i14 = this.A02;
                                        if (i13 < i14 - 1) {
                                            this.A0b[i14 - 1] = ((headerSize - this.A06) - i12) - i11;
                                        } else {
                                            this.A0b[i13] = i25;
                                            strArr = A0q;
                                            if (strArr[1].charAt(15) != strArr[5].charAt(15)) {
                                                throw new RuntimeException();
                                            }
                                            A0q[6] = "AJCSp0dPwFu9XZoKvCoy3nlmL9O";
                                            i12++;
                                            A07(bz, i12);
                                            if (this.A0k.A00[i12 - 1] != 0) {
                                                j10 = 0;
                                                sampleIndex = 0;
                                                while (sampleIndex < 8) {
                                                    i16 = i26 << (7 - sampleIndex);
                                                    if ((this.A0k.A00[i12 - 1] & i16) != 0) {
                                                        int i29 = i12 - 1;
                                                        i12 += sampleIndex;
                                                        A07(bz, i12);
                                                        j10 = this.A0k.A00[i29] & 255 & (i16 ^ (-1));
                                                        for (i17 = i29 + 1; i17 < i12; i17++) {
                                                            j10 = (j10 << 8) | ((long) (this.A0k.A00[i17] & 255));
                                                        }
                                                        if (i13 > 0) {
                                                            j10 -= (1 << ((sampleIndex * 7) + 6)) - 1;
                                                        }
                                                        if (j10 < -2147483648L) {
                                                            if (A0q[7].charAt(2) != 'J') {
                                                                String[] strArr7 = A0q;
                                                                strArr7[3] = "iXrhrupjbccuPW1gfooQkR";
                                                                strArr7[4] = "StwCIbMJGGxOC39";
                                                                if (j10 > 2147483647L) {
                                                                }
                                                                i15 = (int) j10;
                                                                iArr = this.A0b;
                                                                if (i13 == 0) {
                                                                    i15 += iArr[i13 - 1];
                                                                }
                                                                iArr[i13] = i15;
                                                                i11 += i15;
                                                                i13++;
                                                                i25 = 0;
                                                                i26 = 1;
                                                            } else {
                                                                if (j10 > 2147483647L) {
                                                                }
                                                                i15 = (int) j10;
                                                                iArr = this.A0b;
                                                                if (i13 == 0) {
                                                                    i15 += iArr[i13 - 1];
                                                                }
                                                                iArr[i13] = i15;
                                                                i11 += i15;
                                                                i13++;
                                                                i25 = 0;
                                                                i26 = 1;
                                                            }
                                                        }
                                                        throw new C07249b(A03(396, 37, 107));
                                                    }
                                                    sampleIndex++;
                                                    strArr2 = A0q;
                                                    if (strArr2[0].charAt(31) != strArr2[2].charAt(31)) {
                                                        A0q[7] = "JvemuAcSz5vc2l4QyutSma8u3cOiXxC4";
                                                        i26 = 1;
                                                    } else {
                                                        i26 = 1;
                                                    }
                                                }
                                                if (j10 < -2147483648L) {
                                                    if (A0q[7].charAt(2) != 'J') {
                                                        String[] strArr8 = A0q;
                                                        strArr8[3] = "iXrhrupjbccuPW1gfooQkR";
                                                        strArr8[4] = "StwCIbMJGGxOC39";
                                                        if (j10 > 2147483647L) {
                                                        }
                                                        i15 = (int) j10;
                                                        iArr = this.A0b;
                                                        if (i13 == 0) {
                                                            i15 += iArr[i13 - 1];
                                                        }
                                                        iArr[i13] = i15;
                                                        i11 += i15;
                                                        i13++;
                                                        i25 = 0;
                                                        i26 = 1;
                                                    } else {
                                                        if (j10 > 2147483647L) {
                                                        }
                                                        i15 = (int) j10;
                                                        iArr = this.A0b;
                                                        if (i13 == 0) {
                                                            i15 += iArr[i13 - 1];
                                                        }
                                                        iArr[i13] = i15;
                                                        i11 += i15;
                                                        i13++;
                                                        i25 = 0;
                                                        i26 = 1;
                                                    }
                                                }
                                                throw new C07249b(A03(396, 37, 107));
                                            }
                                            throw new C07249b(A03(782, 33, 29));
                                        }
                                    }
                                } else {
                                    throw new C07249b(A03(877, 25, 30) + i27);
                                }
                            } else {
                                headerSize2 = 0;
                                i18 = 4;
                                i19 = 0;
                                while (true) {
                                    i20 = this.A02;
                                    if (i19 < i20 - 1) {
                                        this.A0b[i20 - 1] = ((headerSize - this.A06) - i18) - headerSize2;
                                    } else {
                                        this.A0b[i19] = 0;
                                        do {
                                            i18++;
                                            A07(bz, i18);
                                            i21 = this.A0k.A00[i18 - 1] & 255;
                                            int[] iArr3 = this.A0b;
                                            i22 = iArr3[i19] + i21;
                                            iArr3[i19] = i22;
                                        } while (i21 == 255);
                                        headerSize2 += i22;
                                        i19++;
                                    }
                                }
                            }
                        } else {
                            iArrA0H = A0H(iArr2, i28);
                            this.A0b = iArrA0H;
                            if (i27 == 2) {
                                i23 = (headerSize - this.A06) - 4;
                                i24 = this.A02;
                                strArr3 = A0q;
                                if (strArr3[1].charAt(15) == strArr3[5].charAt(15)) {
                                    String[] strArr9 = A0q;
                                    strArr9[1] = "RQftDwpqwbIXAF1g5dDgy2XjM3R9Fufd";
                                    strArr9[5] = "50lzYqnE8by0N6RgVVPD3M33x9kk99sn";
                                    Arrays.fill(iArrA0H, 0, i24, i23 / i24);
                                }
                            } else if (i27 == 1) {
                                if (i27 == 3) {
                                    i11 = 0;
                                    i12 = 4;
                                    i13 = 0;
                                    while (true) {
                                        i14 = this.A02;
                                        if (i13 < i14 - 1) {
                                            this.A0b[i14 - 1] = ((headerSize - this.A06) - i12) - i11;
                                        } else {
                                            this.A0b[i13] = i25;
                                            strArr = A0q;
                                            if (strArr[1].charAt(15) != strArr[5].charAt(15)) {
                                                throw new RuntimeException();
                                            }
                                            A0q[6] = "AJCSp0dPwFu9XZoKvCoy3nlmL9O";
                                            i12++;
                                            A07(bz, i12);
                                            if (this.A0k.A00[i12 - 1] != 0) {
                                                j10 = 0;
                                                sampleIndex = 0;
                                                while (sampleIndex < 8) {
                                                    i16 = i26 << (7 - sampleIndex);
                                                    if ((this.A0k.A00[i12 - 1] & i16) != 0) {
                                                        int i210 = i12 - 1;
                                                        i12 += sampleIndex;
                                                        A07(bz, i12);
                                                        j10 = this.A0k.A00[i210] & 255 & (i16 ^ (-1));
                                                        while (i17 < i12) {
                                                            j10 = (j10 << 8) | ((long) (this.A0k.A00[i17] & 255));
                                                        }
                                                        if (i13 > 0) {
                                                            j10 -= (1 << ((sampleIndex * 7) + 6)) - 1;
                                                        }
                                                        if (j10 < -2147483648L) {
                                                            if (A0q[7].charAt(2) != 'J') {
                                                                String[] strArr10 = A0q;
                                                                strArr10[3] = "iXrhrupjbccuPW1gfooQkR";
                                                                strArr10[4] = "StwCIbMJGGxOC39";
                                                                if (j10 > 2147483647L) {
                                                                }
                                                                i15 = (int) j10;
                                                                iArr = this.A0b;
                                                                if (i13 == 0) {
                                                                    i15 += iArr[i13 - 1];
                                                                }
                                                                iArr[i13] = i15;
                                                                i11 += i15;
                                                                i13++;
                                                                i25 = 0;
                                                                i26 = 1;
                                                            } else {
                                                                if (j10 > 2147483647L) {
                                                                }
                                                                i15 = (int) j10;
                                                                iArr = this.A0b;
                                                                if (i13 == 0) {
                                                                    i15 += iArr[i13 - 1];
                                                                }
                                                                iArr[i13] = i15;
                                                                i11 += i15;
                                                                i13++;
                                                                i25 = 0;
                                                                i26 = 1;
                                                            }
                                                        }
                                                        throw new C07249b(A03(396, 37, 107));
                                                    }
                                                    sampleIndex++;
                                                    strArr2 = A0q;
                                                    if (strArr2[0].charAt(31) != strArr2[2].charAt(31)) {
                                                        A0q[7] = "JvemuAcSz5vc2l4QyutSma8u3cOiXxC4";
                                                        i26 = 1;
                                                    } else {
                                                        i26 = 1;
                                                    }
                                                }
                                                if (j10 < -2147483648L) {
                                                    if (A0q[7].charAt(2) != 'J') {
                                                        String[] strArr11 = A0q;
                                                        strArr11[3] = "iXrhrupjbccuPW1gfooQkR";
                                                        strArr11[4] = "StwCIbMJGGxOC39";
                                                        if (j10 > 2147483647L) {
                                                        }
                                                        i15 = (int) j10;
                                                        iArr = this.A0b;
                                                        if (i13 == 0) {
                                                            i15 += iArr[i13 - 1];
                                                        }
                                                        iArr[i13] = i15;
                                                        i11 += i15;
                                                        i13++;
                                                        i25 = 0;
                                                        i26 = 1;
                                                    } else {
                                                        if (j10 > 2147483647L) {
                                                        }
                                                        i15 = (int) j10;
                                                        iArr = this.A0b;
                                                        if (i13 == 0) {
                                                            i15 += iArr[i13 - 1];
                                                        }
                                                        iArr[i13] = i15;
                                                        i11 += i15;
                                                        i13++;
                                                        i25 = 0;
                                                        i26 = 1;
                                                    }
                                                }
                                                throw new C07249b(A03(396, 37, 107));
                                            }
                                            throw new C07249b(A03(782, 33, 29));
                                        }
                                    }
                                } else {
                                    throw new C07249b(A03(877, 25, 30) + i27);
                                }
                            } else {
                                headerSize2 = 0;
                                i18 = 4;
                                i19 = 0;
                                while (true) {
                                    i20 = this.A02;
                                    if (i19 < i20 - 1) {
                                        this.A0b[i20 - 1] = ((headerSize - this.A06) - i18) - headerSize2;
                                    } else {
                                        this.A0b[i19] = 0;
                                        do {
                                            i18++;
                                            A07(bz, i18);
                                            i21 = this.A0k.A00[i18 - 1] & 255;
                                            int[] iArr4 = this.A0b;
                                            i22 = iArr4[i19] + i21;
                                            iArr4[i19] = i22;
                                        } while (i21 == 255);
                                        headerSize2 += i22;
                                        i19++;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new C07249b(A03(629, 38, 69));
                    }
                    this.A0D = this.A0E + A01((this.A0k.A00[0] << 8) | (this.A0k.A00[1] & 255));
                    this.A01 = (c0788Bu.A0Q == 2 || (i10 == 163 && (this.A0k.A00[2] & 128) == 128) ? 1 : 0) | ((this.A0k.A00[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                    this.A04 = 2;
                    this.A03 = 0;
                }
                if (i10 != 163) {
                    A08(bz, c0788Bu, this.A0b[0]);
                    return;
                }
                while (true) {
                    int i30 = this.A03;
                    if (i30 < this.A02) {
                        A08(bz, c0788Bu, this.A0b[i30]);
                        A0B(c0788Bu, this.A0D + ((long) ((this.A03 * c0788Bu.A0F) / 1000)));
                        int i31 = this.A03;
                        String[] strArr12 = A0q;
                        if (strArr12[3].length() != strArr12[4].length()) {
                            String[] strArr13 = A0q;
                            strArr13[3] = "D8CgfCqU2RyOXDgpSzfJOF";
                            strArr13[4] = "qE8wnFvtme9ZmNp";
                            this.A03 = i31 + 1;
                        } else {
                            String[] strArr14 = A0q;
                            strArr14[0] = "QTaMrDGiQsJaoOEX9JrEklVzvDfFq8um";
                            strArr14[2] = "wfV4ykUdaNXbzihAU76Od3hvCzrHPeln";
                            this.A03 = i31 + 1;
                        }
                    } else {
                        this.A04 = 0;
                        return;
                    }
                }
                break;
            case 16981:
                this.A0O.A0f = new byte[headerSize];
                byte[] bArr = this.A0O.A0f;
                String[] strArr15 = A0q;
                if (strArr15[1].charAt(15) == strArr15[5].charAt(15)) {
                    A0q[6] = "apQqLvL9mVkkZpyD1gGQRufbtxV";
                    bz.readFully(bArr, 0, headerSize);
                    return;
                }
                break;
            case 18402:
                byte[] bArr2 = new byte[headerSize];
                bz.readFully(bArr2, 0, headerSize);
                this.A0O.A0V = new C0781Bj(1, bArr2, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0l.A00, (byte) 0);
                bz.readFully(this.A0l.A00, 4 - headerSize, headerSize);
                this.A0l.A0Y(0);
                this.A0B = (int) this.A0l.A0M();
                return;
            case 25506:
                this.A0O.A0d = new byte[headerSize];
                bz.readFully(this.A0O.A0d, 0, headerSize);
                return;
            case 30322:
                this.A0O.A0e = new byte[headerSize];
                bz.readFully(this.A0O.A0e, 0, headerSize);
                return;
            default:
                throw new C07249b(A03(862, 15, 7) + i10);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public final void A0L(int i10, long j10) throws C07249b {
        boolean z10 = false;
        String strA03 = A03(0, 14, 21);
        switch (i10) {
            case 131:
                this.A0O.A0Q = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                C0788Bu c0788Bu = this.A0O;
                String[] strArr = A0q;
                if (strArr[1].charAt(15) != strArr[5].charAt(15)) {
                    String[] strArr2 = A0q;
                    strArr2[1] = "dnlPxGSMw9IfVDogfualtgwGzOIqKL0v";
                    strArr2[5] = "sfCl2vw1fgJd0VDghIrSAi3kGetUjpNf";
                    if (j10 == 1) {
                        z10 = true;
                    }
                } else {
                    String[] strArr3 = A0q;
                    strArr3[1] = "e8S13q37f3oqi2Xgxg7oDCnYjszKvzMZ";
                    strArr3[5] = "sUUQ807hVNhLoz0ge5jS5NLDJS8BF8yk";
                    if (j10 == 1) {
                        z10 = true;
                    }
                }
                c0788Bu.A0Z = z10;
                return;
            case 155:
                this.A0C = A01(j10);
                return;
            case 159:
                this.A0O.A0B = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                this.A0O.A0R = (int) j10;
                return;
            case 179:
                this.A0Q.A04(A01(j10));
                return;
            case 186:
                this.A0O.A0J = (int) j10;
                return;
            case 215:
                this.A0O.A0N = (int) j10;
                return;
            case 231:
                this.A0E = A01(j10);
                return;
            case 241:
                if (this.A0Z) {
                    return;
                }
                HV hv = this.A0P;
                String[] strArr4 = A0q;
                if (strArr4[0].charAt(31) == strArr4[2].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr5 = A0q;
                strArr5[3] = "PHYzuIxoVCpcvyGp46FNV8";
                strArr5[4] = "jONBlxc6dKLj6ao";
                hv.A04(j10);
                this.A0Z = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                } else {
                    throw new C07249b(A03(296, 16, 108) + j10 + strA03);
                }
            case 17029:
                if (j10 >= 1 && j10 <= 2) {
                    return;
                } else {
                    throw new C07249b(A03(377, 19, 14) + j10 + strA03);
                }
            case 17143:
                if (j10 == 1) {
                    return;
                } else {
                    throw new C07249b(A03(433, 16, 96) + j10 + strA03);
                }
            case 18401:
                if (j10 == 5) {
                    return;
                } else {
                    throw new C07249b(A03(312, 15, 66) + j10 + strA03);
                }
            case 18408:
                if (j10 == 1) {
                    return;
                } else {
                    throw new C07249b(A03(52, 22, 72) + j10 + strA03);
                }
            case 20529:
                if (j10 == 0) {
                    return;
                } else {
                    throw new C07249b(A03(327, 21, 88) + j10 + strA03);
                }
            case 20530:
                if (j10 == 1) {
                    return;
                } else {
                    throw new C07249b(A03(348, 21, 41) + j10 + strA03);
                }
            case 21420:
                this.A0I = this.A0K + j10;
                return;
            case 21432:
                int layout = (int) j10;
                switch (layout) {
                    case 0:
                        this.A0O.A0P = 0;
                        return;
                    case 1:
                        this.A0O.A0P = 2;
                        return;
                    case 3:
                        this.A0O.A0P = 1;
                        return;
                    case 15:
                        this.A0O.A0P = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                int layout2 = (int) j10;
                this.A0O.A0I = layout2;
                return;
            case 21682:
                int layout3 = (int) j10;
                this.A0O.A0H = layout3;
                return;
            case 21690:
                int layout4 = (int) j10;
                this.A0O.A0G = layout4;
                return;
            case 21930:
                C0788Bu c0788Bu2 = this.A0O;
                if (A0q[7].charAt(2) != 'J') {
                    A0q[7] = "jzNtO6nbghsOK2zNzcbiuAHR0hMudXvD";
                    c0788Bu2.A0a = j10 == 1;
                    return;
                }
                break;
            case 21945:
                int layout5 = (int) j10;
                switch (layout5) {
                    case 1:
                        this.A0O.A0C = 2;
                        return;
                    case 2:
                        this.A0O.A0C = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int layout6 = (int) j10;
                switch (layout6) {
                    case 1:
                    case 6:
                    case 7:
                        C0788Bu c0788Bu3 = this.A0O;
                        String[] strArr6 = A0q;
                        String str = strArr6[3];
                        String str2 = strArr6[4];
                        int length = str.length();
                        int layout7 = str2.length();
                        if (length != layout7) {
                            A0q[7] = "mV5wi4RdAtLICzfql5r9CviPSqv5gEzL";
                            c0788Bu3.A0E = 3;
                            return;
                        }
                        break;
                    case 16:
                        this.A0O.A0E = 6;
                        return;
                    case 18:
                        this.A0O.A0E = 7;
                        return;
                    default:
                        return;
                }
                break;
            case 21947:
                this.A0O.A0b = true;
                int layout8 = (int) j10;
                switch (layout8) {
                    case 1:
                        this.A0O.A0D = 1;
                        return;
                    case 2:
                    case 3:
                    case 8:
                    default:
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        C0788Bu c0788Bu4 = this.A0O;
                        if (A0q[6].length() == 27) {
                            String[] strArr7 = A0q;
                            strArr7[0] = "a0uWSiKj3FE77SqtP8skZXqIoOHsVkha";
                            strArr7[2] = "zxuZMYlEoYkqiqBcXObqrQLJbRKLzsvV";
                            c0788Bu4.A0D = 2;
                            return;
                        }
                        break;
                    case 9:
                        this.A0O.A0D = 6;
                        return;
                }
                break;
            case 21948:
                int layout9 = (int) j10;
                this.A0O.A0K = layout9;
                return;
            case 21949:
                C0788Bu c0788Bu5 = this.A0O;
                int i11 = (int) j10;
                if (A0q[6].length() == 27) {
                    A0q[7] = "cRzVQdX7r3sNL6uNWZqYIbMTncmWUqDN";
                    c0788Bu5.A0L = i11;
                    return;
                }
                break;
            case 22186:
                this.A0O.A0S = j10;
                return;
            case 22203:
                this.A0O.A0T = j10;
                return;
            case 25188:
                int layout10 = (int) j10;
                this.A0O.A0A = layout10;
                return;
            case 2352003:
                int layout11 = (int) j10;
                this.A0O.A0F = layout11;
                return;
            case 2807729:
                this.A0M = j10;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    public final void A0M(int i10, long j10, long j11) throws C07249b {
        switch (i10) {
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                this.A0W = false;
                return;
            case 174:
                this.A0O = new C0788Bu(null);
                return;
            case 187:
                this.A0Z = false;
                return;
            case 19899:
                this.A0B = -1;
                this.A0I = -1L;
                return;
            case 20533:
                this.A0O.A0c = true;
                return;
            case 21968:
                this.A0O.A0b = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                long j12 = this.A0K;
                if (j12 == -1 || j12 == j10) {
                    this.A0K = j10;
                    this.A0L = j11;
                    return;
                }
                throw new C07249b(A03(717, 39, 113));
            case 475249515:
                this.A0Q = new HV();
                this.A0P = new HV();
                return;
            case 524531317:
                if (this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                } else {
                    this.A0N.AEm(new C1301Wm(this.A0H));
                    this.A0a = true;
                    return;
                }
        }
    }

    public final void A0N(int i10, String str) throws C07249b {
        switch (i10) {
            case 134:
                this.A0O.A0Y = str;
                return;
            case 17026:
                if (A03(1034, 4, 113).equals(str) || A03(1016, 8, 122).equals(str)) {
                    return;
                } else {
                    throw new C07249b(A03(369, 8, 117) + str + A03(0, 14, 21));
                }
            case 2274716:
                this.A0O.A0g = str;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A0N = interfaceC0774Ba;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        this.A0V = false;
        boolean zAE0 = true;
        while (zAE0 && !this.A0V) {
            zAE0 = this.A0d.AE0(bz);
            if (zAE0 && A0E(c0777Bf, bz.A7Z())) {
                return 1;
            }
        }
        if (zAE0) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            SparseArray<C0788Bu> sparseArray = this.A0c;
            String[] strArr = A0q;
            String str = strArr[0];
            String str2 = strArr[2];
            int iCharAt = str.charAt(31);
            int i11 = str2.charAt(31);
            if (iCharAt == i11) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "Tajypdz7aNAm7FibYO8x24";
            strArr2[4] = "TBunjD0UUDKaUo7";
            int i12 = sparseArray.size();
            if (i10 < i12) {
                this.A0c.valueAt(i10).A07();
                i10++;
            } else {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A0E = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i10 = 0; i10 < i; i10++) {
            this.A0c.valueAt(i10).A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        return new Bw().A01(bz);
    }
}
