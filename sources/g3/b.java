package g3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f29786c;

    public b(a aVar) {
        this.f29786c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f29786c;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.f29780d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
