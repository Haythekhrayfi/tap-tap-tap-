package com.applovin.exoplayer2.d;

import android.media.MediaDrm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements MediaDrm.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5051a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5053c;

    public /* synthetic */ a0(o oVar, m.b bVar) {
        this.f5052b = oVar;
        this.f5053c = bVar;
    }

    public /* synthetic */ a0(com.yandex.mobile.ads.exo.drm.n nVar, com.yandex.mobile.ads.exo.drm.m.b bVar) {
        this.f5052b = nVar;
        this.f5053c = bVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        switch (this.f5051a) {
            case 0:
                ((o) this.f5052b).a((m.b) this.f5053c, mediaDrm, bArr, i10, i11, bArr2);
                break;
            default:
                ((com.yandex.mobile.ads.exo.drm.n) this.f5052b).a((com.yandex.mobile.ads.exo.drm.m.b) this.f5053c, mediaDrm, bArr, i10, i11, bArr2);
                break;
        }
    }
}
