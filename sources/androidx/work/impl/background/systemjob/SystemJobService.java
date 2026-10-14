package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x1.m;
import y1.b;
import y1.d;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3185e = m.e("SystemJobService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f3186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, JobParameters> f3187d = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        JobParameters jobParametersRemove;
        m.c().a(f3185e, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f3187d) {
            jobParametersRemove = this.f3187d.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            k kVarC = k.c(getApplicationContext());
            this.f3186c = kVarC;
            kVarC.f38013f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.c().g(f3185e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        k kVar = this.f3186c;
        if (kVar != null) {
            kVar.f38013f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f3186c == null) {
            m.c().a(f3185e, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            m.c().b(f3185e, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f3187d) {
            if (this.f3187d.containsKey(strA)) {
                m.c().a(f3185e, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                return false;
            }
            m.c().a(f3185e, String.format("onStartJob for %s", strA), new Throwable[0]);
            this.f3187d.put(strA, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            WorkerParameters.a aVar = new WorkerParameters.a();
            if (jobParameters.getTriggeredContentUris() != null) {
                aVar.f3093b = Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                aVar.f3092a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            if (i10 >= 28) {
                aVar.f3094c = jobParameters.getNetwork();
            }
            k kVar = this.f3186c;
            ((j2.b) kVar.f38011d).f31695a.execute(new h2.k(kVar, strA, aVar));
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f3186c == null) {
            m.c().a(f3185e, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            m.c().b(f3185e, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.c().a(f3185e, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f3187d) {
            this.f3187d.remove(strA);
        }
        this.f3186c.h(strA);
        d dVar = this.f3186c.f38013f;
        synchronized (dVar.f37987m) {
            zContains = dVar.f37985k.contains(strA);
        }
        return !zContains;
    }
}
