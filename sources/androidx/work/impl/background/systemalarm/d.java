package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import h2.j;
import h2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class d implements y1.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f3169m = m.e("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2.a f3171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f3172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1.d f3173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f3174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f3175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f3176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Intent> f3177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Intent f3178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3179l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0049d runnableC0049d;
            synchronized (d.this.f3177j) {
                d dVar2 = d.this;
                dVar2.f3178k = dVar2.f3177j.get(0);
            }
            Intent intent = d.this.f3178k;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f3178k.getIntExtra("KEY_START_ID", 0);
                m mVarC = m.c();
                String str = d.f3169m;
                mVarC.a(str, String.format("Processing command %s, %s", d.this.f3178k, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockA = h2.m.a(d.this.f3170c, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    m.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.acquire();
                    d dVar3 = d.this;
                    dVar3.f3175h.e(dVar3.f3178k, intExtra, dVar3);
                    m.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.release();
                    dVar = d.this;
                    runnableC0049d = new RunnableC0049d(dVar);
                } catch (Throwable th) {
                    try {
                        m mVarC2 = m.c();
                        String str2 = d.f3169m;
                        mVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        m.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                        wakeLockA.release();
                        dVar = d.this;
                        runnableC0049d = new RunnableC0049d(dVar);
                    } catch (Throwable th2) {
                        m.c().a(d.f3169m, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                        wakeLockA.release();
                        d dVar4 = d.this;
                        dVar4.f3176i.post(new RunnableC0049d(dVar4));
                        throw th2;
                    }
                }
                dVar.f3176i.post(runnableC0049d);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f3181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Intent f3182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3183e;

        public b(d dVar, Intent intent, int i10) {
            this.f3181c = dVar;
            this.f3182d = intent;
            this.f3183e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3181c.a(this.f3182d, this.f3183e);
        }
    }

    public interface c {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0049d implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f3184c;

        public RunnableC0049d(d dVar) {
            this.f3184c = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            d dVar = this.f3184c;
            Objects.requireNonNull(dVar);
            m mVarC = m.c();
            String str = d.f3169m;
            mVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.b();
            synchronized (dVar.f3177j) {
                boolean z11 = true;
                if (dVar.f3178k != null) {
                    m.c().a(str, String.format("Removing command %s", dVar.f3178k), new Throwable[0]);
                    if (!dVar.f3177j.remove(0).equals(dVar.f3178k)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    dVar.f3178k = null;
                }
                j jVar = ((j2.b) dVar.f3171d).f31695a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.f3175h;
                synchronized (aVar.f3153e) {
                    z10 = !aVar.f3152d.isEmpty();
                }
                if (!z10 && dVar.f3177j.isEmpty()) {
                    synchronized (jVar.f30508e) {
                        if (jVar.f30506c.isEmpty()) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        m.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.f3179l;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).b();
                        }
                    } else if (!dVar.f3177j.isEmpty()) {
                        dVar.e();
                    }
                } else if (!dVar.f3177j.isEmpty()) {
                    dVar.e();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3170c = applicationContext;
        this.f3175h = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f3172e = new r();
        k kVarC = k.c(context);
        this.f3174g = kVarC;
        y1.d dVar = kVarC.f38013f;
        this.f3173f = dVar;
        this.f3171d = kVarC.f38011d;
        dVar.a(this);
        this.f3177j = new ArrayList();
        this.f3178k = null;
        this.f3176i = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i10) {
        boolean z10;
        m mVarC = m.c();
        String str = f3169m;
        mVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.c().g(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f3177j) {
                Iterator<Intent> it = this.f3177j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f3177j) {
            boolean z11 = this.f3177j.isEmpty() ? false : true;
            this.f3177j.add(intent);
            if (!z11) {
                e();
            }
        }
        return true;
    }

    public final void b() {
        if (this.f3176i.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        m.c().a(f3169m, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3173f.e(this);
        r rVar = this.f3172e;
        if (!rVar.f30548a.isShutdown()) {
            rVar.f30548a.shutdownNow();
        }
        this.f3179l = null;
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        Context context = this.f3170c;
        String str2 = androidx.work.impl.background.systemalarm.a.f3150f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        this.f3176i.post(new b(this, intent, 0));
    }

    public final void e() {
        b();
        PowerManager.WakeLock wakeLockA = h2.m.a(this.f3170c, "ProcessCommand");
        try {
            wakeLockA.acquire();
            j2.a aVar = this.f3174g.f38011d;
            ((j2.b) aVar).f31695a.execute(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
