package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E2 f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C2> f13786c = new HashMap();

    public D2(Context context, E2 e10) {
        this.f13785b = context;
        this.f13784a = e10;
    }

    public synchronized C2 a(String str, CounterConfiguration.b bVar) {
        C2 c10;
        c10 = this.f13786c.get(str);
        if (c10 == null) {
            c10 = new C2(str, this.f13785b, bVar, this.f13784a);
            this.f13786c.put(str, c10);
        }
        return c10;
    }
}
