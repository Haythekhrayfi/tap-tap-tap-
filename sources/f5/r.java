package f5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class r implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f29339e;

    public r(q qVar, long j10, String str) {
        this.f29339e = qVar;
        this.f29337c = j10;
        this.f29338d = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        if (this.f29339e.g()) {
            return null;
        }
        g5.c cVar = this.f29339e.f29326h;
        cVar.f29983b.c(this.f29337c, this.f29338d);
        return null;
    }
}
