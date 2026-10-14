package f7;

import android.content.ComponentCallbacks;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends vc.l implements uc.a<a7.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f29371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f29373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f29374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
        super(0);
        this.f29371c = componentCallbacks;
        this.f29372d = str;
        this.f29373e = aVar;
        this.f29374f = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a7.a, java.lang.Object] */
    @Override // uc.a
    public final a7.a invoke() {
        return fd.f.d(this.f29371c).f37311a.c(new yd.h(this.f29372d, b0.a(a7.a.class), this.f29373e, this.f29374f));
    }
}
