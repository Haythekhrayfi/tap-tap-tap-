package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.39, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass39 extends AbstractC0816Dj implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public VO A03;
    public BM A04;
    public BL A05;
    public BL A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C9V A0A;
    public final FW A0B;
    public final FX A0C;

    public AnonymousClass39(FX fx, Looper looper) {
        this(fx, looper, FW.A00);
    }

    public AnonymousClass39(FX fx, Looper looper, FW fw) {
        super(3);
        this.A0C = (FX) HG.A01(fx);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = fw;
        this.A0A = new C9V();
    }

    private long A00() {
        int i10 = this.A01;
        if (i10 == -1 || i10 >= this.A06.A6t()) {
            return RecyclerView.FOREVER_NS;
        }
        return this.A06.A6s(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        BL bl = this.A06;
        if (bl != null) {
            bl.A08();
            this.A06 = null;
        }
        BL bl2 = this.A05;
        if (bl2 != null) {
            bl2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AED();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4V(this.A02);
    }

    private void A05(List<FT> list) {
        this.A0C.AAp(list);
    }

    private void A06(List<FT> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A15(long j10, boolean z10) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A17(Format[] formatArr, long j10) throws C9I {
        Format format = formatArr[0];
        this.A02 = format;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4V(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8p() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8z() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    @Override // com.facebook.ads.redexgen.X.XE
    public final void AEQ(long j10, long j11) throws Exception {
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AFF(j10);
            try {
                this.A05 = this.A03.A50();
            } catch (FV e10) {
                throw C9I.A01(e10, A0y());
            }
        }
        if (A7s() != 2) {
            return;
        }
        boolean z10 = false;
        if (this.A06 != null) {
            long jA00 = A00();
            while (jA00 <= j10) {
                this.A01++;
                jA00 = A00();
                z10 = true;
            }
        }
        BL bl = this.A05;
        if (A0D[5].length() == 31) {
            throw new RuntimeException();
        }
        A0D[3] = "KD";
        if (bl != null) {
            boolean textRendererNeedsUpdate = bl.A04();
            if (textRendererNeedsUpdate) {
                if (!z10) {
                    long jA01 = A00();
                    String[] strArr = A0D;
                    if (strArr[2].charAt(19) != strArr[6].charAt(19)) {
                        String[] strArr2 = A0D;
                        strArr2[2] = "xJP4O1R5iBehlF3gjm9oxj2d0if1stmE";
                        strArr2[6] = "mrFlrw4gjycn3JZxSawox6A5ZMqGzaMP";
                        if (jA01 == RecyclerView.FOREVER_NS) {
                            if (this.A00 == 2) {
                                A04();
                            } else {
                                A02();
                                this.A08 = true;
                            }
                        }
                    } else {
                        String[] strArr3 = A0D;
                        strArr3[1] = "j9HNvuqeLVtstiy16y9LH7E8URqfplUR";
                        strArr3[0] = "4Jhirnf8T6FRv4glusNGUbVI8l7wWqUm";
                        if (jA01 == RecyclerView.FOREVER_NS) {
                            if (this.A00 == 2) {
                                A04();
                            } else {
                                A02();
                                this.A08 = true;
                            }
                        }
                    }
                }
            } else if (((AbstractC1314Wz) this.A05).A01 <= j10) {
                BL bl2 = this.A06;
                if (bl2 != null) {
                    bl2.A08();
                }
                BL bl3 = this.A05;
                this.A06 = bl3;
                this.A05 = null;
                this.A01 = bl3.A7K(j10);
                z10 = true;
            }
        }
        if (z10) {
            A06(this.A06.A6S(j10));
        }
        if (this.A00 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A07;
                if (!textRendererNeedsUpdate2) {
                    if (this.A04 == null) {
                        BM bmA4z = this.A03.A4z();
                        this.A04 = bmA4z;
                        if (bmA4z == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.ADx(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA10 = A10(this.A0A, this.A04, false);
                    if (A0D[3].length() != 2) {
                        throw new RuntimeException();
                    }
                    A0D[5] = "w0qgeVmaHT9zi92RU59iiGmHeY";
                    if (iA10 == -4) {
                        boolean textRendererNeedsUpdate3 = this.A04.A04();
                        if (textRendererNeedsUpdate3) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.ADx(this.A04);
                        this.A04 = null;
                    } else if (iA10 == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (FV e11) {
                throw C9I.A01(e11, A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399q
    public final int AFi(Format format) {
        if (this.A0B.AFj(format)) {
            return AbstractC0816Dj.A0x(null, format.A0H) ? 4 : 2;
        }
        if (HY.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A05((List) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
