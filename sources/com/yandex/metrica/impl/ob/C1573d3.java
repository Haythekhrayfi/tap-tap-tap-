package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1573d3 implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Tm<Context, Intent, Void>> f15905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f15908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1719j0 f15909e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d3$a */
    public class a implements Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Sm
        public void a(Context context, Intent intent) {
            C1573d3.a(C1573d3.this, context, intent);
        }
    }

    public C1573d3(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, interfaceExecutorC1966sn, new C1719j0.a());
    }

    public C1573d3(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1719j0.a aVar) {
        this.f15905a = new ArrayList();
        this.f15906b = false;
        this.f15907c = false;
        this.f15908d = context;
        this.f15909e = aVar.a(new C1891pm(new a(), interfaceExecutorC1966sn));
    }

    public static void a(C1573d3 c1573d3, Context context, Intent intent) {
        synchronized (c1573d3) {
            Iterator<Tm<Context, Intent, Void>> it = c1573d3.f15905a.iterator();
            while (it.hasNext()) {
                it.next().a(context, intent);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void a() {
        this.f15907c = true;
        if (!this.f15905a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f15909e.a(this.f15908d, intentFilter);
            this.f15906b = true;
        }
    }

    public synchronized void a(Tm<Context, Intent, Void> tm) {
        this.f15905a.add(tm);
        if (this.f15907c && !this.f15906b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f15909e.a(this.f15908d, intentFilter);
            this.f15906b = true;
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void b() {
        this.f15907c = false;
        if (this.f15906b) {
            this.f15909e.a(this.f15908d);
            this.f15906b = false;
        }
    }

    public synchronized void b(Tm<Context, Intent, Void> tm) {
        this.f15905a.remove(tm);
        if (this.f15905a.isEmpty() && this.f15906b) {
            this.f15909e.a(this.f15908d);
            this.f15906b = false;
        }
    }
}
