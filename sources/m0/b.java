package m0;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f33121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33122d;

    public b(c cVar, n nVar, int i10) {
        this.f33121c = nVar;
        this.f33122d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33121c.a(this.f33122d);
    }
}
