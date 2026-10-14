package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class J4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, C1922r4> f14275a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, Z3> f14276b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14277c;

    public J4(Context context) {
        this.f14277c = context.getApplicationContext();
    }

    private <T extends InterfaceC1773l4> T a(C1549c4 c1549c4, X3 x10, InterfaceC1674h4<T> interfaceC1674h4, Map<String, T> map) {
        T t10 = map.get(c1549c4.toString());
        if (t10 != null) {
            t10.a(x10);
            return t10;
        }
        T t11 = (T) interfaceC1674h4.a(this.f14277c, c1549c4, x10);
        map.put(c1549c4.toString(), t11);
        return t11;
    }

    public synchronized Z3 a(C1549c4 c1549c4, X3 x10, InterfaceC1674h4<Z3> interfaceC1674h4) {
        return (Z3) a(c1549c4, x10, interfaceC1674h4, this.f14276b);
    }

    public synchronized C1922r4 a(C1549c4 c1549c4) {
        return this.f14275a.get(c1549c4.toString());
    }

    public synchronized C1922r4 b(C1549c4 c1549c4, X3 x10, InterfaceC1674h4<C1922r4> interfaceC1674h4) {
        return (C1922r4) a(c1549c4, x10, interfaceC1674h4, this.f14275a);
    }
}
