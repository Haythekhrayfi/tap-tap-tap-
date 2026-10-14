package com.applovin.exoplayer2.a;

import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.x8;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements com.applovin.exoplayer2.l.p.a, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3960c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f3962e;

    public /* synthetic */ i(b.a aVar, float f10) {
        this.f3961d = aVar;
        this.f3962e = f10;
    }

    public /* synthetic */ i(x8.a aVar, float f10) {
        this.f3961d = aVar;
        this.f3962e = f10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3960c) {
            case 0:
                ((b) obj).a((b.a) this.f3961d, this.f3962e);
                break;
            default:
                float f10 = this.f3962e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
