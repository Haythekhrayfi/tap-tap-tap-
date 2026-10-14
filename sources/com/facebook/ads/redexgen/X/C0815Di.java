package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0815Di implements XF {
    public static byte[] A0M;
    public static String[] A0N = {"m3Tqgcaf5Zwh2KVI4lshI8Y9OWjAyKiW", "grdEJ2UvF2rVdGgR2IFX1R9SZI3Oow9U", "adSXB2DteQqbyu8FZt3lmhGSn0N0giaq", "NRdDTd6ed3Jg0yXdfuAl28VADrUF9IBW", "O75rLRuL5gqpexSF7Nk4cqg8fxEEp65Y", "atjqzip57QIi0KmRPtssGorCsXfOnHh4", "4ftStqMBHRnBf64I9Tdbb6", "F7xqVaNkoKYb3tQw5W1HE7EtQtFRVx9Y"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C9I A05;
    public C07259c A06;
    public C07269d A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0814Dh A0E;
    public final C07439v A0F;
    public final C07449w A0G;
    public final GP A0H;
    public final GQ A0I;
    public final ArrayDeque<C9M> A0J;
    public final CopyOnWriteArraySet<InterfaceC07299g> A0K;
    public final XE[] A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 6);
            if (A0N[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Q2Fud838jOFv6puDYoQ5JAWfmkdvAH2h";
            strArr[3] = "Px66e0ytNEnQno4fNGUkfPLcZSToOlLf";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{121, -76, -93, -42, -51, -82, -54, -65, -41, -61, -48, -89, -53, -50, -54, 116, -89, -98, Ascii.DEL, -101, -112, -88, -108, -95, 123, -104, -111, 94, 97, 93, 103, 93, 99, -125, -88, -93, -82, 90, -107, -88, -81, -88, -92, -74, -88, 99, -97, -101, 94, -103, -14, -28, -28, -22, -45, -18, -97, -24, -26, -19, -18, -15, -28, -29, -97, -31, -28, -30, -32, -12, -14, -28, -97, -32, -19, -97, -32, -29, -97, -24, -14, -97, -17, -21, -32, -8, -24, -19, -26};
    }

    static {
        A03();
    }

    public C0815Di(XE[] xeArr, GP gp, C9X c9x, HJ hj) {
        Log.i(A02(2, 13, 88), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 83) + A02(15, 18, 41) + A02(47, 3, 56) + C0930Hv.A04 + A02(46, 1, 60));
        HG.A04(xeArr.length > 0);
        this.A0L = (XE[]) HG.A01(xeArr);
        this.A0H = (GP) HG.A01(gp);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        GQ gq = new GQ(new C07409r[xeArr.length], new GM[xeArr.length], null);
        this.A0I = gq;
        this.A0G = new C07449w();
        this.A0F = new C07439v();
        this.A07 = C07269d.A04;
        final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        Handler handler = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.9L
            public static String[] A01 = {"n8jOK4TugbxocxEe6zYdC2apb8QBw5B2", "exJ9q2BbStmAElE6QlD9JR4gSu8htBEk", "BGOnc", "fVxwFvnWrEIXSQGXaFTt487unfsGWTNS", "M8AH3IesIZMXIj5TZDcC18mK6a9vd0E5", "EIDq0z1OpkYiciQBrU8tJkkKsNLFcNAn", "GYYw65loVBDf2akXR1DT72AGTz3TCOWc", "b13Ux"};

            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return;
                }
                try {
                    this.A00.A0A(message);
                } catch (Throwable th) {
                    if (A01[3].charAt(19) != 't') {
                        throw new RuntimeException();
                    }
                    A01[6] = "ke6EFi0zu2eoeRmOo8SEy2Wv36xrwBWP";
                    C0979Jw.A00(th, this);
                }
            }
        };
        this.A0C = handler;
        this.A06 = new C07259c(AbstractC07459x.A01, 0L, TrackGroupArray.A04, gq);
        this.A0J = new ArrayDeque<>();
        C0814Dh c0814Dh = new C0814Dh(xeArr, gp, gq, c9x, this.A0A, this.A03, this.A0B, handler, this, hj);
        this.A0E = c0814Dh;
        this.A0D = new Handler(c0814Dh.A0w());
    }

    private long A00(long j10) {
        long jA01 = C9C.A01(j10);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private C07259c A01(boolean z10, boolean z11, int i10) {
        GQ gq;
        if (z10) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6Z();
            this.A00 = A07();
            this.A04 = A6W();
        }
        AbstractC07459x abstractC07459x = z11 ? AbstractC07459x.A01 : this.A06.A03;
        if (A0N[1].charAt(17) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0N;
        strArr[0] = "HCeOoliCNtIhqJVVEoV7ODJTUFyfMCgc";
        strArr[3] = "jOBrxCepwz9IOjYxDZZOtd2HpuVunHZu";
        Object obj = z11 ? null : this.A06.A07;
        EU eu = this.A06.A04;
        long j10 = this.A06.A02;
        long j11 = this.A06.A01;
        TrackGroupArray trackGroupArray = z11 ? TrackGroupArray.A04 : this.A06.A05;
        if (z11) {
            gq = this.A0I;
        } else {
            gq = this.A06.A06;
        }
        return new C07259c(abstractC07459x, obj, eu, j10, j11, i10, false, trackGroupArray, gq);
    }

    private void A04(C07259c c07259c, int i10, boolean z10, int i11) {
        int i12;
        C07259c c07259cA04 = c07259c;
        int i13 = this.A02 - i10;
        this.A02 = i13;
        if (i13 == 0) {
            if (c07259cA04.A02 == -9223372036854775807L) {
                c07259cA04 = c07259cA04.A04(c07259cA04.A04, 0L, c07259cA04.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && c07259cA04.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                this.A04 = 0L;
            }
            if (this.A08) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z11 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c07259cA04, z10, i11, i12, z11, false);
        }
    }

    private void A05(final C07259c c07259c, final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12) {
        boolean z13 = !this.A0J.isEmpty();
        ArrayDeque<C9M> arrayDeque = this.A0J;
        final C07259c c07259c2 = this.A06;
        final CopyOnWriteArraySet<InterfaceC07299g> copyOnWriteArraySet = this.A0K;
        final GP gp = this.A0H;
        final boolean z14 = this.A0A;
        arrayDeque.addLast((C9M) new Object(c07259c, c07259c2, copyOnWriteArraySet, gp, z10, i10, i11, z11, z14, z12) { // from class: com.facebook.ads.redexgen.X.9M
            public static String[] A0C = {"ngVoBp5pr", "xJziJS8oS", "0Acs5KUpAntiIN9SBf", "RdvtHMhhQhD1iGhGKfpT4jwIcRZugl7b", "SwdEOGzegqYmuuXtqS3DnPJA1PQs60Y1", "mjJqNiV5uYYXT5JIaz2mCpImvyi2YwVT", "z", "dC4jFhBSvokHiCeDasSLAsgetwgdiZCj"};
            public final int A00;
            public final int A01;
            public final C07259c A02;
            public final GP A03;
            public final Set<InterfaceC07299g> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c07259c;
                this.A04 = copyOnWriteArraySet;
                this.A03 = gp;
                this.A08 = z10;
                this.A00 = i10;
                this.A01 = i11;
                this.A09 = z11;
                this.A06 = z14;
                this.A07 = z12 || c07259c2.A00 != c07259c.A00;
                this.A0A = (c07259c2.A03 == c07259c.A03 && c07259c2.A07 == c07259c.A07) ? false : true;
                this.A05 = c07259c2.A08 != c07259c.A08;
                this.A0B = c07259c2.A06 != c07259c.A06;
            }

            public final void A00() {
                Iterator<InterfaceC07299g> it;
                if (this.A0A || this.A01 == 0) {
                    Iterator<InterfaceC07299g> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().ACy(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (InterfaceC07299g listener : this.A04) {
                        listener.ACJ(this.A00);
                    }
                }
                boolean z15 = this.A0B;
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[2].length()) {
                    A0C[4] = "kVA7KUftqEYsKKgit7KobnVmlfmelHtP";
                    if (z15) {
                        this.A03.A0U(this.A02.A06.A02);
                        for (InterfaceC07299g interfaceC07299g : this.A04) {
                            C07259c c07259c3 = this.A02;
                            String[] strArr2 = A0C;
                            if (strArr2[0].length() == strArr2[1].length()) {
                                String[] strArr3 = A0C;
                                strArr3[6] = "m";
                                strArr3[2] = "KqMQ2zUn9wEBuYOIrT";
                                interfaceC07299g.AD1(c07259c3.A05, this.A02.A06.A01);
                            }
                        }
                    }
                    boolean z16 = this.A05;
                    if (A0C[5].charAt(4) == 'F') {
                        throw new RuntimeException();
                    }
                    A0C[5] = "SUKzwd9m16qKT5RYTkUj9PT0NEqmu9kE";
                    if (z16) {
                        Iterator<InterfaceC07299g> it3 = this.A04.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            if (A0C[4].charAt(10) == 'Y') {
                                String[] strArr4 = A0C;
                                strArr4[6] = "I";
                                strArr4[2] = "zdEQR0QEwobMnnP3YQ";
                                if (!zHasNext) {
                                    break;
                                }
                                InterfaceC07299g listener2 = it3.next();
                                listener2.ABm(this.A02.A08);
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[0] = "7SswXZjoc";
                                strArr5[1] = "LaiVjvUVk";
                                if (!zHasNext) {
                                    break;
                                }
                                InterfaceC07299g listener3 = it3.next();
                                listener3.ABm(this.A02.A08);
                            }
                        }
                    }
                    if (this.A07) {
                        Set<InterfaceC07299g> set = this.A04;
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() != strArr6[2].length()) {
                            A0C[5] = "xdr5mmXrWjbqVTrxDMPiLI1UYtBVMgU7";
                            it = set.iterator();
                        } else {
                            A0C[5] = "vgNSEPQsIWHaSH2OFiWclNn1gpDCsXwE";
                            it = set.iterator();
                        }
                        while (it.hasNext()) {
                            it.next().ACH(this.A06, this.A02.A00);
                        }
                    }
                    if (this.A09) {
                        Iterator<InterfaceC07299g> it4 = this.A04.iterator();
                        while (it4.hasNext()) {
                            it4.next().ACi();
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c07259c;
        if (z13) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i10) {
        A09(i10, -9223372036854775807L);
    }

    public final void A09(int i10, long j10) {
        long jA00;
        AbstractC07459x abstractC07459x = this.A06.A03;
        if (i10 < 0 || (!abstractC07459x.A0E() && i10 >= abstractC07459x.A01())) {
            throw new C9W(abstractC07459x, i10, j10);
        }
        this.A09 = true;
        this.A02++;
        boolean zA0B = A0B();
        String[] strArr = A0N;
        if (strArr[7].charAt(11) == strArr[2].charAt(11)) {
            String[] strArr2 = A0N;
            strArr2[0] = "5JrPhprFhX8le0yHjhtYDABd6qn7MJv2";
            strArr2[3] = "AcgEDj7anvk4CRi6YuD76A9KphiljDlH";
            if (zA0B) {
                Log.w(A02(2, 13, 88), A02(50, 39, 121));
                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                return;
            }
            this.A01 = i10;
            if (abstractC07459x.A0E()) {
                this.A04 = j10 == -9223372036854775807L ? 0L : j10;
                this.A00 = 0;
            } else {
                if (j10 == -9223372036854775807L) {
                    C07449w c07449w = this.A0G;
                    String[] strArr3 = A0N;
                    if (strArr3[0].charAt(24) != strArr3[3].charAt(24)) {
                        A0N[5] = "nEFnc7B5wfhj7ivnhhzsBLpbkebEETny";
                        jA00 = abstractC07459x.A0B(i10, c07449w).A01();
                    }
                } else {
                    jA00 = C9C.A00(j10);
                    if (A0N[5].charAt(0) == 'S') {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0N;
                    strArr4[0] = "wxFThwrlUUeaJzWEA8zt6g3O6WvT4NEY";
                    strArr4[3] = "Cn8KVFPYAIX7JaaKfRlHGvTkFrF10J5Z";
                }
                Pair<Integer, Long> pairA07 = abstractC07459x.A07(this.A0G, this.A0F, i10, jA00);
                this.A04 = C9C.A01(jA00);
                this.A00 = ((Integer) pairA07.first).intValue();
            }
            this.A0E.A0y(abstractC07459x, i10, C9C.A00(j10));
            Iterator<InterfaceC07299g> it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next().ACJ(1);
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((C07259c) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C07269d c07269d = (C07269d) message.obj;
                C07269d playbackParameters = this.A07;
                if (!playbackParameters.equals(c07269d)) {
                    this.A07 = c07269d;
                    Iterator<InterfaceC07299g> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        it.next().ACD(c07269d);
                    }
                    return;
                }
                return;
            case 2:
                C9I c9i = (C9I) message.obj;
                this.A05 = c9i;
                String[] strArr = A0N;
                if (strArr[0].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                A0N[6] = "4yvjfA5Kw";
                Iterator<InterfaceC07299g> it2 = this.A0K.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    if (A0N[6].length() == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0N;
                    strArr2[0] = "M6bFWga7XOh4Nv4psw4qaL9KmcGoAikz";
                    strArr2[3] = "g5TiVjLanBSgFn2xszzFJfFzrFRrWctq";
                    if (zHasNext) {
                        it2.next().ACF(c9i);
                    } else {
                        return;
                    }
                }
                break;
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void A3L(InterfaceC07299g interfaceC07299g) {
        this.A0K.add(interfaceC07299g);
    }

    @Override // com.facebook.ads.redexgen.X.XF
    public final C07379o A4a(InterfaceC07369n interfaceC07369n) {
        return new C07379o(this.A0E, interfaceC07369n, this.A06.A03, A6Z(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A65() {
        long jA66 = A66();
        long jA6i = A6i();
        if (jA66 == -9223372036854775807L || jA6i == -9223372036854775807L) {
            return 0;
        }
        if (jA6i == 0) {
            return 100;
        }
        return C0930Hv.A06((int) ((100 * jA66) / jA6i), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A66() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6R() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            C07439v c07439v = this.A0F;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[4] = "eLr0wKhVkEyrTiyBT4e5CdZ3SmFaaZ0Y";
            return c07439v.A08() + C9C.A01(this.A06.A01);
        }
        return A6W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6T() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6U() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6W() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final AbstractC07459x A6Y() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6Z() {
        if (A06()) {
            int i10 = this.A01;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[6] = "IPV6VHeKuNfhgMSHvhaXB";
            return i10;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6i() {
        AbstractC07459x abstractC07459x = this.A06.A03;
        if (abstractC07459x.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            EU eu = this.A06.A04;
            abstractC07459x.A09(eu.A02, this.A0F);
            return C9C.A01(this.A0F.A0A(eu.A00, eu.A01));
        }
        return abstractC07459x.A0B(A6Z(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final boolean A7X() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.XF
    public final void ADk(EW ew, boolean z10, boolean z11) {
        this.A05 = null;
        C07259c c07259cA01 = A01(z10, z11, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(ew, z10, z11);
        A05(c07259cA01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AED() {
        StringBuilder sbAppend = new StringBuilder().append(A02(38, 8, 61)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 83)).append(A02(15, 18, 41));
        String strA02 = A02(47, 3, 56);
        Log.i(A02(2, 13, 88), sbAppend.append(strA02).append(C0930Hv.A04).append(strA02).append(C9S.A00()).append(A02(46, 1, 60)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AEn(long j10) {
        A09(A6Z(), j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AEo() {
        A08(A6Z());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AFD(boolean z10) {
        if (this.A0A != z10) {
            this.A0A = z10;
            this.A0E.A10(z10);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AFe(boolean z10) {
        if (z10) {
            this.A05 = null;
        }
        C07259c c07259cA01 = A01(z10, z10, 1);
        this.A02++;
        this.A0E.A11(z10);
        A05(c07259cA01, false, 4, 1, false, false);
    }
}
