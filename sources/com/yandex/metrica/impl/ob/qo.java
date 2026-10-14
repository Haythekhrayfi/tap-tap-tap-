package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class qo<T> implements uo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17197a;

    public qo(String str) {
        this.f17197a = str;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(T t10) {
        if (t10 != null) {
            return so.a(this);
        }
        return so.a(this, this.f17197a + " is null.");
    }
}
