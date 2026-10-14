package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ValidationException;

/* JADX INFO: loaded from: classes.dex */
public class ro<T> implements uo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uo<T> f17256a;

    public ro(uo<T> uoVar) {
        this.f17256a = uoVar;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(T t10) {
        so soVarA = this.f17256a.a(t10);
        if (soVarA.b()) {
            return soVarA;
        }
        throw new ValidationException(soVarA.a());
    }
}
