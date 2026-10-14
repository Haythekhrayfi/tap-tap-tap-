package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.yandex.metrica.IMetricaService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2074x1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f17820j = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f17824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IMetricaService f17825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f17826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L1 f17827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f17828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ServiceConnection f17829i;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2074x1.a(C2074x1.this);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x1$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMetricaService c0170a;
            synchronized (C2074x1.this) {
                C2074x1 c2074x1 = C2074x1.this;
                int i10 = IMetricaService.a.f13454c;
                if (iBinder == null) {
                    c0170a = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
                    c0170a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMetricaService)) ? new IMetricaService.a.C0170a(iBinder) : (IMetricaService) iInterfaceQueryLocalInterface;
                }
                c2074x1.f17825e = c0170a;
            }
            C2074x1.b(C2074x1.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C2074x1.this) {
                C2074x1.this.f17825e = null;
            }
            C2074x1.c(C2074x1.this);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x1$c */
    public interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C2074x1(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, interfaceExecutorC1966sn, Y.g().i());
    }

    public C2074x1(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, L1 l10) {
        this.f17824d = new CopyOnWriteArrayList();
        this.f17825e = null;
        this.f17826f = new Object();
        this.f17828h = new a();
        this.f17829i = new b();
        this.f17821a = context.getApplicationContext();
        this.f17822b = interfaceExecutorC1966sn;
        this.f17823c = false;
        this.f17827g = l10;
    }

    public static void a(C2074x1 c2074x1) {
        synchronized (c2074x1) {
            if (c2074x1.f17821a != null && c2074x1.e()) {
                try {
                    c2074x1.f17825e = null;
                    c2074x1.f17821a.unbindService(c2074x1.f17829i);
                } catch (Throwable unused) {
                }
            }
            c2074x1.f17825e = null;
            Iterator<c> it = c2074x1.f17824d.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected();
            }
        }
    }

    public static void b(C2074x1 c2074x1) {
        Iterator<c> it = c2074x1.f17824d.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected();
        }
    }

    public static void c(C2074x1 c2074x1) {
        Iterator<c> it = c2074x1.f17824d.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    public void a() {
        synchronized (this.f17826f) {
            this.f17823c = false;
            g();
        }
    }

    public void a(c cVar) {
        this.f17824d.add(cVar);
    }

    public synchronized void b() {
        if (this.f17825e == null) {
            Intent intentB = H2.b(this.f17821a);
            try {
                this.f17827g.a(this.f17821a);
                this.f17821a.bindService(intentB, this.f17829i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        synchronized (this.f17826f) {
            this.f17823c = true;
            f();
        }
    }

    public synchronized IMetricaService d() {
        return this.f17825e;
    }

    public synchronized boolean e() {
        return this.f17825e != null;
    }

    public void f() {
        synchronized (this.f17826f) {
            ((C1941rn) this.f17822b).a(this.f17828h);
        }
    }

    public void g() {
        InterfaceExecutorC1966sn interfaceExecutorC1966sn = this.f17822b;
        synchronized (this.f17826f) {
            C1941rn c1941rn = (C1941rn) interfaceExecutorC1966sn;
            c1941rn.a(this.f17828h);
            if (!this.f17823c) {
                c1941rn.a(this.f17828h, f17820j);
            }
        }
    }
}
