package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationJobService;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class D6 implements H6, E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f13798b;

    public D6(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    public D6(Context context, JobScheduler jobScheduler) {
        this.f13797a = context;
        this.f13798b = jobScheduler;
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a() {
        JobScheduler jobScheduler = this.f13798b;
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(1512302345);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a(long j10, boolean z10) {
        JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.f13797a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j10);
        if (z10) {
            minimumLatency.setOverrideDeadline(j10);
        }
        JobScheduler jobScheduler = this.f13798b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(minimumLatency.build());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.E6
    public void a(Bundle bundle) {
        JobInfo jobInfoBuild = new JobInfo.Builder(1512302346, new ComponentName(this.f13797a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10L).build();
        JobScheduler jobScheduler = this.f13798b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(jobInfoBuild);
            } catch (Throwable unused) {
            }
        }
    }
}
