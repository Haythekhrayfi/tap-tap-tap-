package com.yandex.metrica;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C1941rn;
import com.yandex.metrica.impl.ob.D6;
import com.yandex.metrica.impl.ob.J6;
import com.yandex.metrica.impl.ob.N6;
import com.yandex.metrica.impl.ob.P0;
import com.yandex.metrica.impl.ob.P6;
import com.yandex.metrica.impl.ob.Q6;
import com.yandex.metrica.impl.ob.R6;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class ConfigurationJobService extends JobService {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13438f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J6 f13439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<P6> f13440d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, P6> f13441e = new HashMap();

    public boolean complexJob(int i10) {
        return i10 == 1512302347;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        P0.a(getApplicationContext());
        Context applicationContext = getApplicationContext();
        String.format(Locale.US, "[ConfigurationJobService:%s]", applicationContext.getPackageName());
        this.f13439c = new J6();
        N6 n10 = new N6(getApplicationContext(), this.f13439c.a(), new D6(applicationContext));
        this.f13440d.append(1512302345, new Q6(getApplicationContext(), n10));
        this.f13440d.append(1512302346, new R6(getApplicationContext(), n10));
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        try {
            try {
                if (complexJob(jobParameters.getJobId())) {
                    ((C1941rn) this.f13439c.a()).execute(new b(this, jobParameters));
                } else {
                    P6 p10 = this.f13440d.get(jobParameters.getJobId());
                    if (p10 == null) {
                        return false;
                    }
                    this.f13439c.a(p10, jobParameters.getTransientExtras(), new j1.c(this, jobParameters));
                }
                return true;
            } catch (Throwable unused) {
                jobFinished(jobParameters, false);
                return false;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return jobParameters != null && complexJob(jobParameters.getJobId());
    }
}
