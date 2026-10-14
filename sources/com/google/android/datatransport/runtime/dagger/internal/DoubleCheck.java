package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import ic.a;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements a<T>, Lazy<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a<T> provider;

    private DoubleCheck(a<T> aVar) {
        this.provider = aVar;
    }

    public static <P extends a<T>, T> Lazy<T> lazy(P p10) {
        return p10 instanceof Lazy ? (Lazy) p10 : new DoubleCheck((a) Preconditions.checkNotNull(p10));
    }

    public static <P extends a<T>, T> a<T> provider(P p10) {
        Preconditions.checkNotNull(p10);
        return p10 instanceof DoubleCheck ? p10 : new DoubleCheck(p10);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (!((obj == UNINITIALIZED || (obj instanceof MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ic.a
    public T get() {
        T t10 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.instance;
                if (t10 == obj) {
                    t10 = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t10);
                    this.provider = null;
                }
            }
        }
        return t10;
    }
}
