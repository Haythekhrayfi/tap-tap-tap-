package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class On<T> implements Pn<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pn<T> f14655a;

    public On(Pn<T> pn, T t10) {
        this.f14655a = pn;
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public T a(T t10) {
        return t10 != this.f14655a.a(t10) ? "<truncated data was not sent, see METRIKALIB-4568>" : t10;
    }
}
