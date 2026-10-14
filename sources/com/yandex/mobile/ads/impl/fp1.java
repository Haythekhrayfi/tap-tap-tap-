package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fp1 implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20778a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb0.c f20780c;

    public /* synthetic */ fp1(ob obVar, eb0.c cVar) {
        this.f20779b = obVar;
        this.f20780c = cVar;
    }

    public /* synthetic */ fp1(p51 p51Var, eb0.c cVar) {
        this.f20779b = p51Var;
        this.f20780c = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f20778a) {
            case 0:
                ((ob) this.f20779b).a(this.f20780c, mediaCodec, j10, j11);
                break;
            default:
                ((p51) this.f20779b).a(this.f20780c, mediaCodec, j10, j11);
                break;
        }
    }
}
