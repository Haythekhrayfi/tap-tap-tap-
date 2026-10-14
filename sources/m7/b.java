package m7;

import fd.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f33235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f33236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f33237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f33238e;

    public b(Executor executor, g gVar, l lVar, e eVar, String str) {
        j0.i(executor, "executor");
        j0.i(gVar, "requestExecutor");
        j0.i(lVar, "workerScheduler");
        j0.i(eVar, "perWorkerLogger");
        j0.i(str, "databaseName");
        this.f33234a = executor;
        this.f33235b = gVar;
        this.f33236c = lVar;
        this.f33237d = eVar;
        this.f33238e = str;
    }
}
