package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class K implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Um<Intent>> f14328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f14329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1719j0 f14331d;

    public class a implements Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Sm
        public void a(Context context, Intent intent) {
            Intent intent2 = intent;
            synchronized (K.this) {
                K.this.f14329b = intent2;
                K.this.a(intent2);
            }
        }
    }

    public K(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, interfaceExecutorC1966sn, new C1719j0.a());
    }

    public K(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1719j0.a aVar) {
        this.f14328a = new ArrayList();
        this.f14329b = null;
        this.f14330c = context;
        this.f14331d = aVar.a(new C1891pm(new a(), interfaceExecutorC1966sn));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        Iterator<Um<Intent>> it = this.f14328a.iterator();
        while (it.hasNext()) {
            it.next().b(intent);
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void a() {
        Intent intentA = this.f14331d.a(this.f14330c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f14329b = intentA;
        a(intentA);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void b() {
        this.f14329b = null;
        this.f14329b = null;
        this.f14331d.a(this.f14330c);
        a(null);
    }

    public synchronized Intent c(Um<Intent> um) {
        this.f14328a.add(um);
        return this.f14329b;
    }
}
