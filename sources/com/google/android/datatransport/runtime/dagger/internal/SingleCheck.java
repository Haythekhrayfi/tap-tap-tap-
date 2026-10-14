package com.google.android.datatransport.runtime.dagger.internal;

import ic.a;

/* JADX INFO: loaded from: classes.dex */
public final class SingleCheck<T> implements a<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a<T> provider;

    private SingleCheck(a<T> aVar) {
        this.provider = aVar;
    }

    public static <P extends a<T>, T> a<T> provider(P p10) {
        return ((p10 instanceof SingleCheck) || (p10 instanceof DoubleCheck)) ? p10 : new SingleCheck((a) Preconditions.checkNotNull(p10));
    }

    @Override // ic.a
    public T get() {
        T t10 = (T) this.instance;
        if (t10 != UNINITIALIZED) {
            return t10;
        }
        a<T> aVar = this.provider;
        if (aVar == null) {
            return (T) this.instance;
        }
        T t11 = aVar.get();
        this.instance = t11;
        this.provider = null;
        return t11;
    }
}
