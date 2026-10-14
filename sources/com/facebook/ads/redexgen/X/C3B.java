package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3B extends AbstractC0816Dj implements Handler.Callback {
    public static String[] A0B = {"0qSWVCRp", "8n", "TBzABSyg8R7UC4ujRNxCq", "jQt0eIY", "v3jD5iBy36", "AYhXU50alurSLkI0yvRIZkZn8z1ow4xX", "qUGfoy2tLuPBRFk8hkXJpZQuwVi5LQ1p", "rA70SaLYISjIKcft86AFQfJkzoYA33nr"};
    public int A00;
    public int A01;
    public DC A02;
    public boolean A03;
    public final Handler A04;
    public final C9V A05;
    public final DE A06;
    public final C0810Cz A07;
    public final DF A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public C3B(DF df, Looper looper) {
        this(df, looper, DE.A00);
    }

    public C3B(DF df, Looper looper, DE de2) {
        super(4);
        this.A08 = (DF) HG.A01(df);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (DE) HG.A01(de2);
        this.A05 = new C9V();
        this.A07 = new C0810Cz();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(0, metadata);
            String[] strArr = A0B;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "HjLXVjnhMu7EB58lvrXa8leW0c4xSFXO";
            strArr2[6] = "qIzVCSliCuvFWhZzcfJ3ccTrGvRVj8IV";
            messageObtainMessage.sendToTarget();
            return;
        }
        A02(metadata);
    }

    private void A02(Metadata metadata) {
        this.A08.ABx(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A15(long j10, boolean z10) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A17(Format[] formatArr, long j10) throws C9I {
        this.A02 = this.A06.A4U(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8p() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8z() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void AEQ(long j10, long j11) throws C9I {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A10(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else {
                    boolean zA03 = this.A07.A03();
                    String[] strArr = A0B;
                    if (strArr[3].length() == strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0B[7] = "LGLHrgLhu9uRK5PVWOv1cuvTksuxgVhV";
                    if (!zA03) {
                        this.A07.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                        try {
                            int index = (this.A01 + this.A00) % 5;
                            this.A0A[index] = this.A02.A4w(this.A07);
                            this.A09[index] = ((X0) this.A07).A00;
                            this.A00++;
                        } catch (DD e10) {
                            throw C9I.A01(e10, A0y());
                        }
                    }
                }
            }
        }
        int i10 = this.A00;
        if (A0B[1].length() == 1) {
            throw new RuntimeException();
        }
        A0B[1] = "3VtXKAcUijLRyWZ1CGRxfS";
        if (i10 > 0) {
            long[] jArr = this.A09;
            int i11 = this.A01;
            if (jArr[i11] <= j10) {
                A01(this.A0A[i11]);
                Metadata[] metadataArr = this.A0A;
                int i12 = this.A01;
                metadataArr[i12] = null;
                this.A01 = (i12 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399q
    public final int AFi(Format format) {
        if (this.A06.AFj(format)) {
            return AbstractC0816Dj.A0x(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A02((Metadata) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
