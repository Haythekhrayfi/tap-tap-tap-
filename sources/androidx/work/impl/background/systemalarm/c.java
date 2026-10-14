package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import g2.p;
import h2.r;
import java.util.Collections;
import java.util.List;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class c implements c2.c, y1.b, r.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3159l = m.e("DelayMetCommandHandler");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f3163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2.d f3164g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f3167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3168k = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3166i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3165h = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f3160c = context;
        this.f3161d = i10;
        this.f3163f = dVar;
        this.f3162e = str;
        this.f3164g = new c2.d(context, dVar.f3171d, this);
    }

    @Override // h2.r.b
    public void a(String str) {
        m.c().a(f3159l, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // c2.c
    public void b(List<String> list) {
        g();
    }

    public final void c() {
        synchronized (this.f3165h) {
            this.f3164g.c();
            this.f3163f.f3172e.b(this.f3162e);
            PowerManager.WakeLock wakeLock = this.f3167j;
            if (wakeLock != null && wakeLock.isHeld()) {
                m.c().a(f3159l, String.format("Releasing wakelock %s for WorkSpec %s", this.f3167j, this.f3162e), new Throwable[0]);
                this.f3167j.release();
            }
        }
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        m.c().a(f3159l, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent intentC = a.c(this.f3160c, this.f3162e);
            d dVar = this.f3163f;
            dVar.f3176i.post(new d.b(dVar, intentC, this.f3161d));
        }
        if (this.f3168k) {
            Intent intentA = a.a(this.f3160c);
            d dVar2 = this.f3163f;
            dVar2.f3176i.post(new d.b(dVar2, intentA, this.f3161d));
        }
    }

    public void e() {
        this.f3167j = h2.m.a(this.f3160c, String.format("%s (%s)", this.f3162e, Integer.valueOf(this.f3161d)));
        m mVarC = m.c();
        String str = f3159l;
        mVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f3167j, this.f3162e), new Throwable[0]);
        this.f3167j.acquire();
        p pVarI = ((g2.r) this.f3163f.f3174g.f38010c.v()).i(this.f3162e);
        if (pVarI == null) {
            g();
            return;
        }
        boolean zB = pVarI.b();
        this.f3168k = zB;
        if (zB) {
            this.f3164g.b(Collections.singletonList(pVarI));
        } else {
            m.c().a(str, String.format("No constraints for %s", this.f3162e), new Throwable[0]);
            f(Collections.singletonList(this.f3162e));
        }
    }

    @Override // c2.c
    public void f(List<String> list) {
        if (list.contains(this.f3162e)) {
            synchronized (this.f3165h) {
                if (this.f3166i == 0) {
                    this.f3166i = 1;
                    m.c().a(f3159l, String.format("onAllConstraintsMet for %s", this.f3162e), new Throwable[0]);
                    if (this.f3163f.f3173f.g(this.f3162e, null)) {
                        this.f3163f.f3172e.a(this.f3162e, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    m.c().a(f3159l, String.format("Already started work for %s", this.f3162e), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f3165h) {
            if (this.f3166i < 2) {
                this.f3166i = 2;
                m mVarC = m.c();
                String str = f3159l;
                mVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f3162e), new Throwable[0]);
                Context context = this.f3160c;
                String str2 = this.f3162e;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f3163f;
                dVar.f3176i.post(new d.b(dVar, intent, this.f3161d));
                if (this.f3163f.f3173f.c(this.f3162e)) {
                    m.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f3162e), new Throwable[0]);
                    Intent intentC = a.c(this.f3160c, this.f3162e);
                    d dVar2 = this.f3163f;
                    dVar2.f3176i.post(new d.b(dVar2, intentC, this.f3161d));
                } else {
                    m.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f3162e), new Throwable[0]);
                }
            } else {
                m.c().a(f3159l, String.format("Already stopped work for %s", this.f3162e), new Throwable[0]);
            }
        }
    }
}
