package y1;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t4.a f38017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.d f38018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f38019e;

    public l(n nVar, t4.a aVar, i2.d dVar) {
        this.f38019e = nVar;
        this.f38017c = aVar;
        this.f38018d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f38017c.get();
            x1.m.c().a(n.f38023v, String.format("Starting work for %s", this.f38019e.f38028g.f29742c), new Throwable[0]);
            n nVar = this.f38019e;
            nVar.f38041t = nVar.f38029h.startWork();
            this.f38018d.l(this.f38019e.f38041t);
        } catch (Throwable th) {
            this.f38018d.k(th);
        }
    }
}
