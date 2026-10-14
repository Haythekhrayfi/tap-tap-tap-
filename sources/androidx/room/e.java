package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.room.d f2846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.room.d.c f2847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.room.c f2848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f2849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.room.b f2850g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f2851h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f2852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2853j;

    public class a extends androidx.room.b.a {

        /* JADX INFO: renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        public class RunnableC0044a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String[] f2855c;

            public RunnableC0044a(String[] strArr) {
                this.f2855c = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.room.d dVar = e.this.f2846c;
                String[] strArr = this.f2855c;
                synchronized (dVar.f2831i) {
                    Iterator<Map.Entry<androidx.room.d.c, androidx.room.d.C0043d>> it = dVar.f2831i.iterator();
                    while (true) {
                        l.b.e eVar = (l.b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            androidx.room.d.c cVar = (androidx.room.d.c) entry.getKey();
                            Objects.requireNonNull(cVar);
                            if (!(cVar instanceof C0045e)) {
                                ((androidx.room.d.C0043d) entry.getValue()).a(strArr);
                            }
                        }
                    }
                }
            }
        }

        public a() {
        }

        @Override // androidx.room.b
        public void b(String[] strArr) {
            e.this.f2849f.execute(new RunnableC0044a(strArr));
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            androidx.room.c c0042a;
            e eVar = e.this;
            int i10 = androidx.room.c.a.f2820c;
            if (iBinder == null) {
                c0042a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                c0042a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.c)) ? new androidx.room.c.a.C0042a(iBinder) : (androidx.room.c) iInterfaceQueryLocalInterface;
            }
            eVar.f2848e = c0042a;
            e eVar2 = e.this;
            eVar2.f2849f.execute(eVar2.f2852i);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            e eVar = e.this;
            eVar.f2849f.execute(eVar.f2853j);
            e.this.f2848e = null;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                androidx.room.c cVar = eVar.f2848e;
                if (cVar != null) {
                    eVar.f2845b = cVar.c(eVar.f2850g, eVar.f2844a);
                    e eVar2 = e.this;
                    eVar2.f2846c.a(eVar2.f2847d);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f2846c.c(eVar.f2847d);
        }
    }

    /* JADX INFO: renamed from: androidx.room.e$e, reason: collision with other inner class name */
    public class C0045e extends androidx.room.d.c {
        public C0045e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.d.c
        public void a(Set<String> set) {
            if (e.this.f2851h.get()) {
                return;
            }
            try {
                e eVar = e.this;
                androidx.room.c cVar = eVar.f2848e;
                if (cVar != null) {
                    cVar.c0(eVar.f2845b, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public e(Context context, String str, androidx.room.d dVar, Executor executor) {
        b bVar = new b();
        this.f2852i = new c();
        this.f2853j = new d();
        Context applicationContext = context.getApplicationContext();
        this.f2844a = str;
        this.f2846c = dVar;
        this.f2849f = executor;
        this.f2847d = new C0045e((String[]) dVar.f2823a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
