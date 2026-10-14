package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1570d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC1570d0<T> f15899a;

    public AbstractC1570d0(AbstractC1570d0<T> abstractC1570d0) {
        this.f15899a = abstractC1570d0;
    }

    public void a(T t10) {
        b(t10);
        AbstractC1570d0<T> abstractC1570d0 = this.f15899a;
        if (abstractC1570d0 != null) {
            abstractC1570d0.a(t10);
        }
    }

    public abstract void b(T t10);
}
