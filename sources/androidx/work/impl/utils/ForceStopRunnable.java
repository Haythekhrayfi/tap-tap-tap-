package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import b2.b;
import g2.d;
import g2.i;
import g2.n;
import g2.o;
import g2.p;
import g2.q;
import g2.r;
import j1.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l0.a;
import x1.m;
import y1.j;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3209f = m.e("ForceStopRunnable");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f3210g = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f3212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3213e = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f3214a = m.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            m.c().f(f3214a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.d(context);
        }
    }

    public ForceStopRunnable(Context context, k kVar) {
        this.f3211c = context.getApplicationContext();
        this.f3212d = kVar;
    }

    public static PendingIntent b(Context context, int i10) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentB = b(context, a.b() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3210g;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01d4 A[EDGE_INSN: B:86:0x01d4->B:91:0x01e8 BREAK  A[LOOP:5: B:77:0x01b4->B:82:0x01c9]] */
    public void a() {
        boolean z10;
        boolean z11;
        Context context = this.f3211c;
        k kVar = this.f3212d;
        String str = b.f3243g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listF = b.f(context, jobScheduler);
        i iVar = (i) kVar.f38010c.s();
        Objects.requireNonNull(iVar);
        f fVarC = f.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        iVar.f29726a.b();
        Cursor cursorC = l1.b.c(iVar.f29726a, fVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.getString(0));
            }
            cursorC.close();
            fVarC.release();
            HashSet hashSet = new HashSet(listF != null ? listF.size() : 0);
            if (listF != null && !listF.isEmpty()) {
                for (JobInfo jobInfo : listF) {
                    String strG = b.g(jobInfo);
                    if (TextUtils.isEmpty(strG)) {
                        b.b(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(strG);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                z10 = true;
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        m.c().a(b.f3243g, "Reconciling jobs", new Throwable[0]);
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                WorkDatabase workDatabase = kVar.f38010c;
                workDatabase.c();
                try {
                    q qVarV = workDatabase.v();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((r) qVarV).l((String) it2.next(), -1L);
                    }
                    workDatabase.p();
                    workDatabase.g();
                } catch (Throwable th) {
                    workDatabase.g();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = this.f3212d.f38010c;
            q qVarV2 = workDatabase2.v();
            n nVarU = workDatabase2.u();
            workDatabase2.c();
            try {
                r rVar = (r) qVarV2;
                List<p> listD = rVar.d();
                boolean z12 = !((ArrayList) listD).isEmpty();
                if (z12) {
                    for (p pVar : (ArrayList) listD) {
                        rVar.p(h.ENQUEUED, pVar.f29740a);
                        rVar.l(pVar.f29740a, -1L);
                    }
                }
                ((o) nVarU).b();
                workDatabase2.p();
                workDatabase2.g();
                boolean z13 = z12 || z11;
                Long lA = ((g2.f) this.f3212d.f38014g.f30504a.r()).a("reschedule_needed");
                if (lA != null && lA.longValue() == 1) {
                    m.c().a(f3209f, "Rescheduling Workers.", new Throwable[0]);
                    this.f3212d.g();
                    h2.h hVar = this.f3212d.f38014g;
                    Objects.requireNonNull(hVar);
                    ((g2.f) hVar.f30504a.r()).b(new d("reschedule_needed", false));
                    return;
                }
                try {
                    PendingIntent pendingIntentB = b(this.f3211c, a.b() ? 570425344 : 536870912);
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (pendingIntentB != null) {
                            pendingIntentB.cancel();
                        }
                        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f3211c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        int i10 = 0;
                        while (true) {
                            if (i10 >= historicalProcessExitReasons.size()) {
                                z10 = false;
                                break;
                            } else if (historicalProcessExitReasons.get(i10).getReason() == 10) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } else {
                        if (pendingIntentB != null) {
                            z10 = false;
                            break;
                        }
                        d(this.f3211c);
                    }
                } catch (IllegalArgumentException | SecurityException e10) {
                    m.c().g(f3209f, "Ignoring exception", e10);
                }
                if (z10) {
                    m.c().a(f3209f, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f3212d.g();
                } else if (z13) {
                    m.c().a(f3209f, "Found unfinished work, scheduling it.", new Throwable[0]);
                    k kVar2 = this.f3212d;
                    y1.f.a(kVar2.f38009b, kVar2.f38010c, kVar2.f38012e);
                }
            } catch (Throwable th2) {
                workDatabase2.g();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorC.close();
            fVarC.release();
            throw th3;
        }
    }

    public boolean c() {
        androidx.work.b bVar = this.f3212d.f38009b;
        if (TextUtils.isEmpty(bVar.f3101g)) {
            m.c().a(f3209f, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h2.i.a(this.f3211c, bVar);
        m.c().a(f3209f, String.format("Is default app process = %s", Boolean.valueOf(zA)), new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!c()) {
                this.f3212d.f();
                return;
            }
            while (true) {
                j.a(this.f3211c);
                m.c().a(f3209f, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    break;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f3213e + 1;
                    this.f3213e = i10;
                    if (i10 >= 3) {
                        m mVarC = m.c();
                        String str = f3209f;
                        mVarC.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        x1.f fVar = this.f3212d.f38009b.f3100f;
                        if (fVar == null) {
                            throw illegalStateException;
                        }
                        m.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                        fVar.a(illegalStateException);
                        break;
                    }
                    m.c().a(f3209f, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e10);
                    try {
                        Thread.sleep(((long) this.f3213e) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f3212d.f();
        } catch (Throwable th) {
            this.f3212d.f();
            throw th;
        }
    }
}
