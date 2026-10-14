package v5;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.k;

/* JADX INFO: loaded from: classes2.dex */
public class d implements g, h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36685f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.b<i> f36686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f36687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5.b<g6.g> f36688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<e> f36689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f36690e;

    public d(Context context, String str, Set<e> set, x5.b<g6.g> bVar) {
        u4.c cVar = new u4.c(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: v5.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i10 = d.f36685f;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f36686a = cVar;
        this.f36689d = set;
        this.f36690e = threadPoolExecutor;
        this.f36688c = bVar;
        this.f36687b = context;
    }

    @Override // v5.g
    public Task<String> a() {
        return k.a(this.f36687b) ^ true ? Tasks.forResult("") : Tasks.call(this.f36690e, new b(this, 1));
    }

    @Override // v5.h
    public synchronized h.a b(String str) {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVar = this.f36686a.get();
        synchronized (iVar) {
            zG = iVar.g("fire-global", jCurrentTimeMillis);
        }
        if (!zG) {
            return h.a.NONE;
        }
        synchronized (iVar) {
            String strD = iVar.d(System.currentTimeMillis());
            iVar.f36691a.edit().putString("last-used-date", strD).commit();
            iVar.f(strD);
        }
        return h.a.GLOBAL;
    }

    public Task<Void> c() {
        if (this.f36689d.size() <= 0) {
            return Tasks.forResult(null);
        }
        return k.a(this.f36687b) ^ true ? Tasks.forResult(null) : Tasks.call(this.f36690e, new b(this, 0));
    }
}
