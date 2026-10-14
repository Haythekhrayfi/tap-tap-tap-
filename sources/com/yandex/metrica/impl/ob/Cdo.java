package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.do, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cdo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f15980a;

    public Cdo(T t10) {
        this.f15980a = t10;
    }

    public abstract boolean a(Cdo<T> cdo);

    public boolean equals(Object obj) {
        if (obj instanceof Cdo) {
            try {
                return a((Cdo) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
