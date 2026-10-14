package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class Na<T> implements Ma<T> {
    @Override // com.yandex.metrica.impl.ob.Ma
    public Q9<T> a(Context context) {
        return a(context, c(context));
    }

    public abstract Q9<T> a(Context context, InterfaceC2106y8 interfaceC2106y8);

    @Override // com.yandex.metrica.impl.ob.Ma
    public Q9<T> b(Context context) {
        return a(context, d(context));
    }

    public abstract InterfaceC2106y8 c(Context context);

    public abstract InterfaceC2106y8 d(Context context);
}
