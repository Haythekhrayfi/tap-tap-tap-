package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2076x3 {
    public final r a(Context context, Executor executor, Executor executor2, com.yandex.metrica.billing_interface.a aVar, InterfaceC1992u interfaceC1992u, InterfaceC1967t interfaceC1967t) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? new A3() : new ba.k(context, executor, executor2, interfaceC1992u, interfaceC1967t, new C1793m(interfaceC1992u), new C1843o(null, 1));
        }
        return new aa.i(context, executor, executor2, new C1718j(interfaceC1992u), new C1743k(), interfaceC1967t);
    }
}
