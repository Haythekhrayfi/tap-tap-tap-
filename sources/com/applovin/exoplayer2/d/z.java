package com.applovin.exoplayer2.d;

import com.yandex.mobile.ads.impl.r80;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5179c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5182f;

    public /* synthetic */ z(g.a aVar, g gVar, int i10) {
        this.f5180d = aVar;
        this.f5181e = gVar;
        this.f5182f = i10;
    }

    public /* synthetic */ z(com.yandex.mobile.ads.exo.drm.f.a aVar, com.yandex.mobile.ads.exo.drm.f fVar, int i10) {
        this.f5180d = aVar;
        this.f5181e = fVar;
        this.f5182f = i10;
    }

    public /* synthetic */ z(CopyOnWriteArraySet copyOnWriteArraySet, int i10, com.applovin.exoplayer2.l.p.a aVar) {
        this.f5180d = copyOnWriteArraySet;
        this.f5182f = i10;
        this.f5181e = aVar;
    }

    public /* synthetic */ z(CopyOnWriteArraySet copyOnWriteArraySet, int i10, r80.a aVar) {
        this.f5180d = copyOnWriteArraySet;
        this.f5182f = i10;
        this.f5181e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5179c) {
            case 0:
                ((g.a) this.f5180d).a((g) this.f5181e, this.f5182f);
                break;
            case 1:
                com.applovin.exoplayer2.l.p.a((CopyOnWriteArraySet) this.f5180d, this.f5182f, (com.applovin.exoplayer2.l.p.a) this.f5181e);
                break;
            case 2:
                ((com.yandex.mobile.ads.exo.drm.f.a) this.f5180d).a((com.yandex.mobile.ads.exo.drm.f) this.f5181e, this.f5182f);
                break;
            default:
                r80.a((CopyOnWriteArraySet) this.f5180d, this.f5182f, (r80.a) this.f5181e);
                break;
        }
    }
}
