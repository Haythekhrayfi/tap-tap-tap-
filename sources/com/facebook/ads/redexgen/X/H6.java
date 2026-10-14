package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H6 {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Ga) STATIC call: com.facebook.ads.redexgen.X.Hv.A0W(com.facebook.ads.redexgen.X.Ga):void A[MD:(com.facebook.ads.redexgen.X.Ga):void (m)], block:B:37:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Ga) STATIC call: com.facebook.ads.redexgen.X.Hv.A0W(com.facebook.ads.redexgen.X.Ga):void A[MD:(com.facebook.ads.redexgen.X.Ga):void (m)], block:B:43:0x00ae */
    public static long A00(C0889Ge c0889Ge, long j10, long j11, InterfaceC0885Ga interfaceC0885Ga, byte[] bArr, C0918Hj c0918Hj, int i10, H5 h10) throws InterruptedException, IOException {
        InterfaceC0885Ga interfaceC0885GaA0W;
        InterfaceC0885Ga interfaceC0885GaA0W2;
        while (true) {
            if (c0918Hj != null) {
                c0918Hj.A01(i10);
            }
            try {
                break;
            } catch (C0917Hi unused) {
                C0930Hv.A0W(interfaceC0885GaA0W2);
            } catch (Throwable th) {
                C0930Hv.A0W(interfaceC0885GaA0W);
                throw th;
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0889Ge c0889Ge2 = new C0889Ge(c0889Ge.A04, c0889Ge.A06, j10, (c0889Ge.A03 + j10) - c0889Ge.A01, -1L, c0889Ge.A05, c0889Ge.A00 | 2);
        long jADQ = interfaceC0885Ga.ADQ(c0889Ge2);
        if (h10.A01 == -1 && jADQ != -1) {
            h10.A01 = c0889Ge2.A01 + jADQ;
        }
        long j12 = 0;
        while (j12 != j11) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i11 = interfaceC0885Ga.read(bArr, 0, j11 != -1 ? (int) Math.min(bArr.length, j11 - j12) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (i11 == -1) {
                if (h10.A01 != -1) {
                    break;
                }
                h10.A01 = c0889Ge2.A01 + j12;
                break;
            }
            j12 += (long) i11;
            h10.A02 += (long) i11;
        }
        C0930Hv.A0W(interfaceC0885Ga);
        return j12;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0889Ge c0889Ge) {
        if (c0889Ge.A05 != null) {
            return c0889Ge.A05;
        }
        Uri uri = c0889Ge.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0889Ge c0889Ge, H0 h10, C1252Um c1252Um, byte[] bArr, C0918Hj c0918Hj, int i10, H5 h11, AtomicBoolean atomicBoolean, boolean z10) throws InterruptedException, IOException {
        long start;
        H5 h12 = h11;
        HG.A01(c1252Um);
        HG.A01(bArr);
        if (h12 != null) {
            A04(c0889Ge, h10, h12);
        } else {
            h12 = new H5();
        }
        String strA02 = A02(c0889Ge);
        long j10 = c0889Ge.A01;
        long start2 = c0889Ge.A02;
        if (start2 != -1) {
            start = c0889Ge.A02;
        } else {
            start = h10.A6P(strA02);
        }
        while (true) {
            long j11 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long jA6A = h10.A6A(strA02, j10, start != -1 ? start : RecyclerView.FOREVER_NS);
                    if (jA6A <= 0) {
                        long j12 = -jA6A;
                        jA6A = j12;
                        if (A00(c0889Ge, j10, j12, c1252Um, bArr, c0918Hj, i10, h12) < jA6A) {
                            if (!z10 || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j10 += jA6A;
                    if (start != -1) {
                        j11 = jA6A;
                    }
                    start -= j11;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0889Ge c0889Ge, H0 h10, H5 h11) {
        long left;
        String strA02 = A02(c0889Ge);
        long j10 = c0889Ge.A01;
        if (c0889Ge.A02 != -1) {
            left = c0889Ge.A02;
        } else {
            left = h10.A6P(strA02);
        }
        h11.A01 = left;
        h11.A00 = 0L;
        h11.A02 = 0L;
        while (left != 0) {
            long jA6A = h10.A6A(strA02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (jA6A > 0) {
                h11.A00 += jA6A;
            } else {
                jA6A = -jA6A;
                if (jA6A == RecyclerView.FOREVER_NS) {
                    return;
                }
            }
            j10 += jA6A;
            if (left == -1) {
                jA6A = 0;
            }
            left -= jA6A;
        }
    }

    public static void A05(H0 h10, String str) {
        Iterator<H4> it = h10.A6B(str).iterator();
        while (it.hasNext()) {
            try {
                h10.AEO(it.next());
            } catch (C0907Gy unused) {
            }
        }
    }
}
