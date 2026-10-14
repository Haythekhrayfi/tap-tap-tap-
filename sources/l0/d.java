package l0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f32090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32091c;

    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.f32089a) {
                return;
            }
            this.f32089a = true;
            this.f32091c = true;
            a aVar = this.f32090b;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f32091c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f32091c = false;
                notifyAll();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            while (this.f32091c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f32090b == aVar) {
                return;
            }
            this.f32090b = aVar;
            if (this.f32089a) {
                aVar.a();
            }
        }
    }
}
