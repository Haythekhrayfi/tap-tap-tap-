package com.applovin.exoplayer2.a;

import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.x8;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements com.applovin.exoplayer2.l.p.a, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3963c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3966f;

    public /* synthetic */ j(b.a aVar, int i10, int i11) {
        this.f3964d = aVar;
        this.f3965e = i10;
        this.f3966f = i11;
    }

    public /* synthetic */ j(x8.a aVar, int i10, int i11) {
        this.f3964d = aVar;
        this.f3965e = i10;
        this.f3966f = i11;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3963c) {
            case 0:
                ((b) obj).a((b.a) this.f3964d, this.f3965e, this.f3966f);
                break;
            default:
                int i10 = this.f3965e;
                int i11 = this.f3966f;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
