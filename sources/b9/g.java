package b9;

import fd.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.a<d9.a> f3378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.a<Executor> f3379c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(uc.a<? extends d9.a> aVar, uc.a<? extends Executor> aVar2) {
        j0.i(aVar, "histogramReporter");
        j0.i(aVar2, "calculateSizeExecutor");
        this.f3378b = aVar;
        this.f3379c = aVar2;
    }
}
