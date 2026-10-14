package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import com.yandex.metrica.impl.ob.P6;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JobParameters f13509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConfigurationJobService f13510d;

    public b(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f13510d = configurationJobService;
        this.f13509c = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        P6 p10;
        ConfigurationJobService configurationJobService = this.f13510d;
        JobParameters jobParameters = this.f13509c;
        int i10 = ConfigurationJobService.f13438f;
        Objects.requireNonNull(configurationJobService);
        while (true) {
            try {
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return;
                }
                Intent intent = jobWorkItemDequeueWork.getIntent();
                if (intent == null || (p10 = configurationJobService.f13441e.get(intent.getAction())) == null) {
                    jobParameters.completeWork(jobWorkItemDequeueWork);
                } else {
                    configurationJobService.f13439c.a(p10, intent.getExtras(), new androidx.viewpager2.widget.d(configurationJobService, jobParameters, jobWorkItemDequeueWork));
                }
            } catch (Throwable unused) {
                configurationJobService.jobFinished(jobParameters, true);
                return;
            }
        }
    }
}
