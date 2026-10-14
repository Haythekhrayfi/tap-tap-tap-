package jc;

import fd.j0;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> implements e<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<j<?>, Object> f31815e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile uc.a<? extends T> f31816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f31817d;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
        f31815e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "d");
    }

    public j(uc.a<? extends T> aVar) {
        j0.i(aVar, "initializer");
        this.f31816c = aVar;
        this.f31817d = s.f31836a;
    }

    @Override // jc.e
    public T getValue() {
        T t10 = (T) this.f31817d;
        s sVar = s.f31836a;
        if (t10 != sVar) {
            return t10;
        }
        uc.a<? extends T> aVar = this.f31816c;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (f31815e.compareAndSet(this, sVar, tInvoke)) {
                this.f31816c = null;
                return tInvoke;
            }
        }
        return (T) this.f31817d;
    }

    public String toString() {
        return this.f31817d != s.f31836a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
