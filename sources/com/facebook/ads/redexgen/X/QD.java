package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QD {
    public static QD A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0829Dw A00;
    public H0 A01;
    public File A02;
    public boolean A03;
    public final C1336Xv A06;
    public final InterfaceC0822Dp A07;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<QB> A05 = new SparseArray<>();
    public final Runnable A08 = new QA(this);

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, Ascii.ESC, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, Ascii.CAN, 5, Ascii.CAN, 9, -34, -60, Ascii.ESC, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C1267Vb.A03};
    }

    public QD(C1336Xv c1336Xv, C0829Dw c0829Dw) {
        JJ jj = new JJ(this);
        this.A07 = jj;
        this.A06 = c1336Xv;
        if (c0829Dw != null) {
            this.A00 = c0829Dw;
            c0829Dw.A0Q(jj);
        }
        A01().A0P();
    }

    private synchronized C0829Dw A01() {
        if (this.A00 == null) {
            C0829Dw c0829Dw = new C0829Dw(new E1(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00 = c0829Dw;
            c0829Dw.A0Q(this.A07);
        }
        return this.A00;
    }

    private C2N A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized H0 A03() {
        if (this.A01 == null) {
            this.A01 = new C1248Ui(new File(A06(), A07(64, 14, 16)), new C0758Ak(IN.A0P(this.A06)));
        }
        return this.A01;
    }

    public static C1251Ul A04(V2 v10, H0 h10) {
        return new C1251Ul(h10, v10, new C1264Uy(), null, 2, null);
    }

    public static synchronized QD A05(C1336Xv c1336Xv) {
        if (A09 == null) {
            A09 = new QD(c1336Xv, null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(C1336Xv c1336Xv, Uri uri) {
        try {
            if (!IN.A1T(c1336Xv)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c1336Xv.A07().A9K(A07(81, 5, 14), C06937v.A0u, new C06947w(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (C0828Dv c0828Dv : A01().A0S()) {
            int taskId = c0828Dv.A02;
            QB qb2 = this.A05.get(taskId);
            if (qb2 != null) {
                int i10 = c0828Dv.A01;
                if (i10 == 2 || c0828Dv.A03 > qb2.A00) {
                    String str = A07(15, 19, 61) + i10 + A07(0, 8, 18) + c0828Dv.A03;
                    qb2.A01.AAw(qb2.A02);
                    this.A05.remove(taskId);
                } else if (i10 == 4 || i10 == 3) {
                    String str2 = A07(34, 14, 111) + i10;
                    qb2.A01.AB8(c0828Dv.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + c0828Dv.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C1251Ul A0F(Context context) {
        return A04(new V2(context, (InterfaceC0905Gw<? super InterfaceC0885Ga>) null, A02()), A03());
    }

    public final void A0G(Uri uri, QC qc2, long j10) {
        String strA08 = A08(this.A06, uri);
        if (strA08 == null) {
            strA08 = uri.toString();
        }
        boolean zA0H = A0H(strA08);
        this.A05.put(A01().A0O(new C1267Vb(uri, false, null, strA08)), new QB(qc2, j10, zA0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6A(str, 0L, 1L) > 0;
    }
}
