package f7;

import android.content.ComponentCallbacks;
import vc.b0;
import z6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends vc.l implements uc.a<r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f29379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f29381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f29382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
        super(0);
        this.f29379c = componentCallbacks;
        this.f29380d = str;
        this.f29381e = aVar;
        this.f29382f = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.r] */
    @Override // uc.a
    public final r invoke() {
        return fd.f.d(this.f29379c).f37311a.c(new yd.h(this.f29380d, b0.a(r.class), this.f29381e, this.f29382f));
    }
}
