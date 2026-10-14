package d0;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f28500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28501d;

    public e(h.a aVar, Object obj) {
        this.f28500c = aVar;
        this.f28501d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28500c.f28529c = this.f28501d;
    }
}
