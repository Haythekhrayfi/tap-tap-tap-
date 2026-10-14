package com.applovin.exoplayer2.f;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6297a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.c f6299c;

    public /* synthetic */ n(a aVar, g.c cVar) {
        this.f6298b = aVar;
        this.f6299c = cVar;
    }

    public /* synthetic */ n(m mVar, g.c cVar) {
        this.f6298b = mVar;
        this.f6299c = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f6297a) {
            case 0:
                ((a) this.f6298b).a(this.f6299c, mediaCodec, j10, j11);
                break;
            default:
                ((m) this.f6298b).a(this.f6299c, mediaCodec, j10, j11);
                break;
        }
    }
}
