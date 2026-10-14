package f7;

import android.content.ComponentCallbacks;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends vc.l implements uc.a<d7.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f29375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f29377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f29378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
        super(0);
        this.f29375c = componentCallbacks;
        this.f29376d = str;
        this.f29377e = aVar;
        this.f29378f = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
    @Override // uc.a
    public final d7.g invoke() {
        return fd.f.d(this.f29375c).f37311a.c(new yd.h(this.f29376d, b0.a(d7.g.class), this.f29377e, this.f29378f));
    }
}
