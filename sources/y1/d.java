package y1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, f2.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37976n = x1.m.e("Processor");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f37978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f37979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j2.a f37980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WorkDatabase f37981g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<e> f37984j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, n> f37983i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, n> f37982h = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f37985k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<b> f37986l = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PowerManager.WakeLock f37977c = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f37987m = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f37988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t4.a<Boolean> f37990e;

        public a(b bVar, String str, t4.a<Boolean> aVar) {
            this.f37988c = bVar;
            this.f37989d = str;
            this.f37990e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f37990e.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f37988c.d(this.f37989d, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.b bVar, j2.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f37978d = context;
        this.f37979e = bVar;
        this.f37980f = aVar;
        this.f37981g = workDatabase;
        this.f37984j = list;
    }

    public static boolean b(String str, n nVar) {
        boolean zIsDone;
        if (nVar == null) {
            x1.m.c().a(f37976n, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        nVar.f38042u = true;
        nVar.i();
        t4.a<ListenableWorker.a> aVar = nVar.f38041t;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            nVar.f38041t.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = nVar.f38029h;
        if (listenableWorker == null || zIsDone) {
            x1.m.c().a(n.f38023v, String.format("WorkSpec %s is already done. Not interrupting.", nVar.f38028g), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        x1.m.c().a(f37976n, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public void a(b bVar) {
        synchronized (this.f37987m) {
            this.f37986l.add(bVar);
        }
    }

    public boolean c(String str) {
        boolean z10;
        synchronized (this.f37987m) {
            z10 = this.f37983i.containsKey(str) || this.f37982h.containsKey(str);
        }
        return z10;
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        synchronized (this.f37987m) {
            this.f37983i.remove(str);
            x1.m.c().a(f37976n, String.format("%s %s executed; reschedule = %s", d.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator<b> it = this.f37986l.iterator();
            while (it.hasNext()) {
                it.next().d(str, z10);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f37987m) {
            this.f37986l.remove(bVar);
        }
    }

    public void f(String str, x1.d dVar) {
        synchronized (this.f37987m) {
            x1.m.c().d(f37976n, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            n nVarRemove = this.f37983i.remove(str);
            if (nVarRemove != null) {
                if (this.f37977c == null) {
                    PowerManager.WakeLock wakeLockA = h2.m.a(this.f37978d, "ProcessorForegroundLck");
                    this.f37977c = wakeLockA;
                    wakeLockA.acquire();
                }
                this.f37982h.put(str, nVarRemove);
                Intent intentC = androidx.work.impl.foreground.a.c(this.f37978d, str, dVar);
                Context context = this.f37978d;
                Object obj = e0.a.f28964a;
                if (Build.VERSION.SDK_INT >= 26) {
                    e0.a.f.b(context, intentC);
                } else {
                    context.startService(intentC);
                }
            }
        }
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.f37987m) {
            if (c(str)) {
                x1.m.c().a(f37976n, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            n.a aVar2 = new n.a(this.f37978d, this.f37979e, this.f37980f, this, this.f37981g, str);
            aVar2.f38049g = this.f37984j;
            if (aVar != null) {
                aVar2.f38050h = aVar;
            }
            n nVar = new n(aVar2);
            i2.d<Boolean> dVar = nVar.f38040s;
            dVar.a(new a(this, str, dVar), ((j2.b) this.f37980f).f31697c);
            this.f37983i.put(str, nVar);
            ((j2.b) this.f37980f).f31695a.execute(nVar);
            x1.m.c().a(f37976n, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void h() {
        synchronized (this.f37987m) {
            if (!(!this.f37982h.isEmpty())) {
                Context context = this.f37978d;
                String str = androidx.work.impl.foreground.a.f3198m;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f37978d.startService(intent);
                } catch (Throwable th) {
                    x1.m.c().b(f37976n, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f37977c;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f37977c = null;
                }
            }
        }
    }

    public boolean i(String str) {
        boolean zB;
        synchronized (this.f37987m) {
            x1.m.c().a(f37976n, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zB = b(str, this.f37982h.remove(str));
        }
        return zB;
    }

    public boolean j(String str) {
        boolean zB;
        synchronized (this.f37987m) {
            x1.m.c().a(f37976n, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zB = b(str, this.f37983i.remove(str));
        }
        return zB;
    }
}
