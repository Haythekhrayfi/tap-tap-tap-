package com.yandex.metrica.impl.ob;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class oo<T> implements uo<Collection<T>> {
    public oo(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Object obj) {
        return U2.b((Collection) obj) ? so.a(this, "Stacktrace is null or empty.") : so.a(this);
    }
}
