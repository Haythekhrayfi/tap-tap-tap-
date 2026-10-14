package com.google.android.datatransport.runtime.dagger.internal;

import ic.a;

/* JADX INFO: loaded from: classes.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private a<T> delegate;

    public static <T> void setDelegate(a<T> aVar, a<T> aVar2) {
        Preconditions.checkNotNull(aVar2);
        DelegateFactory delegateFactory = (DelegateFactory) aVar;
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = aVar2;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public T get() {
        a<T> aVar = this.delegate;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }

    public a<T> getDelegate() {
        return (a) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(a<T> aVar) {
        setDelegate(this, aVar);
    }
}
