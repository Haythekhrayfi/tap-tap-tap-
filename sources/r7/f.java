package r7;

import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<ContextThemeWrapper> f35265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<Integer> f35266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<Boolean> f35267c;

    public f(ic.a<ContextThemeWrapper> aVar, ic.a<Integer> aVar2, ic.a<Boolean> aVar3) {
        this.f35265a = aVar;
        this.f35266b = aVar2;
        this.f35267c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        ContextThemeWrapper contextThemeWrapper = this.f35265a.get();
        int iIntValue = this.f35266b.get().intValue();
        return this.f35267c.get().booleanValue() ? new b8.a(contextThemeWrapper, iIntValue) : new ContextThemeWrapper(contextThemeWrapper, iIntValue);
    }
}
