package b2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g2.g;
import g2.i;
import g2.p;
import g2.r;
import h2.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import x1.c;
import x1.m;
import y1.e;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3243g = m.e("SystemJobScheduler");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobScheduler f3245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f3246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f3247f;

    public b(Context context, k kVar) {
        this(context, kVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, k kVar, JobScheduler jobScheduler, a aVar) {
        this.f3244c = context;
        this.f3246e = kVar;
        this.f3245d = jobScheduler;
        this.f3247f = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            m.c().b(f3243g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listF = f(context, jobScheduler);
        if (listF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listF) {
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.c().b(f3243g, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // y1.e
    public void a(p... pVarArr) {
        int iB;
        WorkDatabase workDatabase = this.f3246e.f38010c;
        f fVar = new f(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p pVarI = ((r) workDatabase.v()).i(pVar.f29740a);
                if (pVarI == null) {
                    m.c().g(f3243g, "Skipping scheduling " + pVar.f29740a + " because it's no longer in the DB", new Throwable[0]);
                } else if (pVarI.f29741b != h.ENQUEUED) {
                    m.c().g(f3243g, "Skipping scheduling " + pVar.f29740a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    g gVarA = ((i) workDatabase.s()).a(pVar.f29740a);
                    if (gVarA != null) {
                        iB = gVarA.f29725b;
                    } else {
                        androidx.work.b bVar = this.f3246e.f38009b;
                        iB = fVar.b(bVar.f3103i, bVar.f3104j);
                    }
                    if (gVarA == null) {
                        ((i) this.f3246e.f38010c.s()).b(new g(pVar.f29740a, iB));
                    }
                    h(pVar, iB);
                }
                workDatabase.p();
                workDatabase.g();
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    @Override // y1.e
    public boolean c() {
        return true;
    }

    @Override // y1.e
    public void e(String str) {
        List<Integer> listD = d(this.f3244c, this.f3245d, str);
        if (listD == null || listD.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listD.iterator();
        while (it.hasNext()) {
            b(this.f3245d, it.next().intValue());
        }
        ((i) this.f3246e.f38010c.s()).c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(p pVar, int i10) {
        int i11;
        a aVar = this.f3247f;
        Objects.requireNonNull(aVar);
        x1.b bVar = pVar.f29749j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f29740a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f3241a).setRequiresCharging(bVar.f37381b).setRequiresDeviceIdle(bVar.f37382c).setExtras(persistableBundle);
        androidx.work.f fVar = bVar.f37380a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || fVar != androidx.work.f.TEMPORARILY_UNMETERED) {
            int i13 = a.C0052a.f3242a[fVar.ordinal()];
            if (i13 == 1) {
                i11 = 0;
            } else if (i13 == 2) {
                i11 = 1;
            } else if (i13 != 3) {
                i11 = 4;
                if (i13 == 4) {
                    i11 = 3;
                } else if (i13 != 5 || i12 < 26) {
                    m.c().a(a.f3240b, String.format("API version too low. Cannot convert network type value %s", fVar), new Throwable[0]);
                    i11 = 1;
                }
            } else {
                i11 = 2;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!bVar.f37382c) {
            extras.setBackoffCriteria(pVar.f29752m, pVar.f29751l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f29756q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.a()) {
            for (c.a aVar2 : bVar.f37387h.f37396a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar2.f37397a, aVar2.f37398b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bVar.f37385f);
            extras.setTriggerContentMaxDelay(bVar.f37386g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f37383d);
            extras.setRequiresStorageNotLow(bVar.f37384e);
        }
        Object[] objArr = pVar.f29750k > 0;
        Object[] objArr2 = jMax > 0;
        if (l0.a.b() && pVar.f29756q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        m mVarC = m.c();
        String str = f3243g;
        mVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f29740a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f3245d.schedule(jobInfoBuild) == 0) {
                m.c().g(str, String.format("Unable to schedule work ID %s", pVar.f29740a), new Throwable[0]);
                if (pVar.f29756q && pVar.f29757r == androidx.work.g.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f29756q = false;
                    m.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f29740a), new Throwable[0]);
                    h(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> listF = f(this.f3244c, this.f3245d);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listF != null ? listF.size() : 0), Integer.valueOf(((ArrayList) ((r) this.f3246e.f38010c.v()).e()).size()), Integer.valueOf(this.f3246e.f38009b.f3105k));
            m.c().b(f3243g, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e10);
        } catch (Throwable th) {
            m.c().b(f3243g, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
