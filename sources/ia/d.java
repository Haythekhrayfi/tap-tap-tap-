package ia;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.exitads.ExitAds", f = "ExitAds.kt", l = {405}, m = "loadNativeAppLovinExitAd")
public final class d extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f31528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f31529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f31531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, mc.d<? super d> dVar) {
        super(dVar);
        this.f31531f = aVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f31530e = obj;
        this.f31532g |= Integer.MIN_VALUE;
        a aVar = this.f31531f;
        KProperty<Object>[] kPropertyArr = a.f31508e;
        return aVar.d(null, this);
    }
}
