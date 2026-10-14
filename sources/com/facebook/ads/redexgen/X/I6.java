package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I6 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C1A A00;

    public I6(C1A c1a, MediaCodec mediaCodec) {
        this.A00 = c1a;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1R();
    }
}
