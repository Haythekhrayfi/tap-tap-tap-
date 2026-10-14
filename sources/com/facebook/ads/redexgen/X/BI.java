package com.facebook.ads.redexgen.X;

import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BJ;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface BI<T extends BJ> {
    BH<T> A2W(Looper looper, DrmInitData drmInitData);

    boolean A45(DrmInitData drmInitData);

    void AEJ(BH<T> bh);
}
