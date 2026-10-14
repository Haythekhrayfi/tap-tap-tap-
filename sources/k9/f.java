package k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31940c;

    public f(String str) {
        this.f31940c = str;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sbA = android.support.v4.media.c.a(name, "-");
        sbA.append(this.f31940c);
        threadCurrentThread.setName(sbA.toString());
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
