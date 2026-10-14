package e8;

import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x7 f29099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f29100e;

    public g(d dVar, x7 x7Var, i8.k kVar) {
        this.f29098c = dVar;
        this.f29099d = x7Var;
        this.f29100e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29098c.c(this.f29099d.f44178e, this.f29100e);
    }
}
