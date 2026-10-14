package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1244Ue implements HT {
    public final Handler A00;

    public C1244Ue(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final Looper A7C() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final Message AA4(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final Message AA5(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final Message AA6(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final void AEN(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final boolean AEr(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final boolean AEs(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }
}
