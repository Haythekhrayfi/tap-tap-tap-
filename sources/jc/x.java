package jc;

import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class x<T> implements e<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uc.a<? extends T> f31843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f31844d;

    public x(uc.a<? extends T> aVar) {
        j0.i(aVar, "initializer");
        this.f31843c = aVar;
        this.f31844d = s.f31836a;
    }

    @Override // jc.e
    public T getValue() {
        if (this.f31844d == s.f31836a) {
            uc.a<? extends T> aVar = this.f31843c;
            j0.f(aVar);
            this.f31844d = aVar.invoke();
            this.f31843c = null;
        }
        return (T) this.f31844d;
    }

    public String toString() {
        return this.f31844d != s.f31836a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
