package jc;

import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> implements e<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uc.a<? extends T> f31818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f31819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31820e;

    public k(uc.a<? extends T> aVar, Object obj) {
        j0.i(aVar, "initializer");
        this.f31818c = aVar;
        this.f31819d = s.f31836a;
        this.f31820e = obj == null ? this : obj;
    }

    public /* synthetic */ k(uc.a aVar, Object obj, int i10, vc.g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    @Override // jc.e
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f31819d;
        s sVar = s.f31836a;
        if (t10 != sVar) {
            return t10;
        }
        synchronized (this.f31820e) {
            tInvoke = (T) this.f31819d;
            if (tInvoke == sVar) {
                uc.a<? extends T> aVar = this.f31818c;
                j0.f(aVar);
                tInvoke = aVar.invoke();
                this.f31819d = tInvoke;
                this.f31818c = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return this.f31819d != s.f31836a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
