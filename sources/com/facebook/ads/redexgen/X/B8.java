package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B8 extends Handler {
    public final /* synthetic */ C1311Ww A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public B8(C1311Ww c1311Ww, Looper looper) {
        super(looper);
        this.A00 = c1311Ww;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) msg.obj;
            for (C1312Wx c1312Wx : this.A00.A09) {
                if (c1312Wx.A0N(bArr)) {
                    c1312Wx.A0J(msg.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
