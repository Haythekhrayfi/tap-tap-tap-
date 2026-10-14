package y1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.inscode.autoclicker.R;
import g2.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x1.t;

/* JADX INFO: loaded from: classes.dex */
public class k extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static k f38005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k f38006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f38007l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.b f38009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkDatabase f38010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2.a f38011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<e> f38012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f38013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h2.h f38014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f38016i;

    static {
        x1.m.e("WorkManagerImpl");
        f38005j = null;
        f38006k = null;
        f38007l = new Object();
    }

    public k(Context context, androidx.work.b bVar, j2.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    public k(Context context, androidx.work.b bVar, j2.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        x1.m.a aVar2 = new x1.m.a(bVar.f3102h);
        synchronized (x1.m.class) {
            x1.m.f37409a = aVar2;
        }
        String str = f.f37991a;
        b2.b bVar2 = new b2.b(applicationContext, this);
        h2.g.a(applicationContext, SystemJobService.class, true);
        x1.m.c().a(f.f37991a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<e> listAsList = Arrays.asList(bVar2, new z1.c(applicationContext, bVar, aVar, this));
        e(context, bVar, aVar, workDatabase, listAsList, new d(context, bVar, aVar, workDatabase, listAsList));
    }

    public k(Context context, androidx.work.b bVar, j2.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        e(context, bVar, aVar, workDatabase, list, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k c(Context context) {
        k kVarC;
        Object obj = f38007l;
        synchronized (obj) {
            synchronized (obj) {
                kVarC = f38005j;
                if (kVarC == null) {
                    kVarC = f38006k;
                }
            }
            return kVarC;
        }
        if (kVarC == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof androidx.work.b.InterfaceC0047b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, ((androidx.work.b.InterfaceC0047b) applicationContext).a());
            kVarC = c(applicationContext);
        }
        return kVarC;
    }

    public static void d(Context context, androidx.work.b bVar) {
        synchronized (f38007l) {
            k kVar = f38005j;
            if (kVar != null && f38006k != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (kVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f38006k == null) {
                    f38006k = new k(applicationContext, bVar, new j2.b(bVar.f3096b));
                }
                f38005j = f38006k;
            }
        }
    }

    public final void e(Context context, androidx.work.b bVar, j2.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f38008a = applicationContext;
        this.f38009b = bVar;
        this.f38011d = aVar;
        this.f38010c = workDatabase;
        this.f38012e = list;
        this.f38013f = dVar;
        this.f38014g = new h2.h(workDatabase);
        this.f38015h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        j2.a aVar2 = this.f38011d;
        ((j2.b) aVar2).f31695a.execute(new ForceStopRunnable(applicationContext, this));
    }

    public void f() {
        synchronized (f38007l) {
            this.f38015h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f38016i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f38016i = null;
            }
        }
    }

    public void g() {
        List<JobInfo> listF;
        Context context = this.f38008a;
        String str = b2.b.f3243g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (listF = b2.b.f(context, jobScheduler)) != null && !listF.isEmpty()) {
            Iterator<JobInfo> it = listF.iterator();
            while (it.hasNext()) {
                b2.b.b(jobScheduler, it.next().getId());
            }
        }
        r rVar = (r) this.f38010c.v();
        rVar.f29760a.b();
        n1.g gVarA = rVar.f29768i.a();
        rVar.f29760a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            rVar.f29760a.p();
            rVar.f29760a.g();
            rVar.f29768i.c(fVar);
            f.a(this.f38009b, this.f38010c, this.f38012e);
        } catch (Throwable th) {
            rVar.f29760a.g();
            rVar.f29768i.c(gVarA);
            throw th;
        }
    }

    public void h(String str) {
        j2.a aVar = this.f38011d;
        ((j2.b) aVar).f31695a.execute(new h2.l(this, str, false));
    }

    public k(Context context, androidx.work.b bVar, j2.a aVar, boolean z10) {
        androidx.room.g.a aVarA;
        Context applicationContext = context.getApplicationContext();
        h2.j jVar = ((j2.b) aVar).f31695a;
        int i10 = WorkDatabase.f3122b;
        if (z10) {
            aVarA = new androidx.room.g.a(applicationContext, WorkDatabase.class, null);
            aVarA.f2868h = true;
        } else {
            String str = j.f38003a;
            aVarA = androidx.room.f.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarA.f2867g = new h(applicationContext);
        }
        aVarA.f2865e = jVar;
        i iVar = new i();
        if (aVarA.f2864d == null) {
            aVarA.f2864d = new ArrayList<>();
        }
        aVarA.f2864d.add(iVar);
        aVarA.a(androidx.work.impl.a.f3132a);
        aVarA.a(new androidx.work.impl.a.h(applicationContext, 2, 3));
        aVarA.a(androidx.work.impl.a.f3133b);
        aVarA.a(androidx.work.impl.a.f3134c);
        aVarA.a(new androidx.work.impl.a.h(applicationContext, 5, 6));
        aVarA.a(androidx.work.impl.a.f3135d);
        aVarA.a(androidx.work.impl.a.f3136e);
        aVarA.a(androidx.work.impl.a.f3137f);
        aVarA.a(new androidx.work.impl.a.i(applicationContext));
        aVarA.a(new androidx.work.impl.a.h(applicationContext, 10, 11));
        aVarA.a(androidx.work.impl.a.f3138g);
        aVarA.f2870j = false;
        aVarA.f2871k = true;
        this(context, bVar, aVar, (WorkDatabase) aVarA.b());
    }
}
