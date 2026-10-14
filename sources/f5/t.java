package f5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class t implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f29345d;

    public t(q qVar, String str) {
        this.f29345d = qVar;
        this.f29344c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        q.a(this.f29345d, this.f29344c);
        return null;
    }
}
