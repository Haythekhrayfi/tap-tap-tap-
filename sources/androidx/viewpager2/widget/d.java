package androidx.viewpager2.widget;

import aa.h;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.ConfigurationJobService;
import com.yandex.metrica.impl.ob.C1941rn;
import com.yandex.metrica.impl.ob.O6;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d implements O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3052c;

    public d(ViewPager2 viewPager2, f fVar, RecyclerView recyclerView) {
        this.f3050a = viewPager2;
        this.f3051b = fVar;
        this.f3052c = recyclerView;
    }

    @Override // com.yandex.metrica.impl.ob.O6
    public void a() {
        try {
            ((JobParameters) this.f3050a).completeWork((JobWorkItem) this.f3051b);
            ConfigurationJobService configurationJobService = (ConfigurationJobService) this.f3052c;
            JobParameters jobParameters = (JobParameters) this.f3050a;
            ((C1941rn) configurationJobService.f13439c.a()).execute(new com.yandex.metrica.b(configurationJobService, jobParameters));
        } catch (Throwable unused) {
        }
    }

    public void b(Object obj) {
        ((Set) this.f3052c).remove(obj);
        if (((Set) this.f3052c).size() == 0) {
            ((Handler) this.f3050a).post(new h(this));
        }
    }

    public d(com.android.billingclient.api.e eVar, Handler handler) {
        this.f3051b = eVar;
        this.f3052c = new HashSet();
        this.f3050a = handler;
    }

    public d(ConfigurationJobService configurationJobService, JobParameters jobParameters, JobWorkItem jobWorkItem) {
        this.f3052c = configurationJobService;
        this.f3050a = jobParameters;
        this.f3051b = jobWorkItem;
    }
}
