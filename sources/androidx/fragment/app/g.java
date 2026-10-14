package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.e f2036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.e f2037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.a f2039f;

    public g(b bVar, l0.e eVar, l0.e eVar2, boolean z10, q.a aVar) {
        this.f2036c = eVar;
        this.f2037d = eVar2;
        this.f2038e = z10;
        this.f2039f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0.a(this.f2036c.f2090c, this.f2037d.f2090c, this.f2038e, this.f2039f, false);
    }
}
