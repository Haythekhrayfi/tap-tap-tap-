package fd;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class e2<U, T extends U> extends kd.x<T> implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f29564f;

    public e2(long j10, mc.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f29564f = j10;
    }

    @Override // fd.a, fd.o1
    public String k0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.k0());
        sb2.append("(timeMillis=");
        return o2.a.a(sb2, this.f29564f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        G(new d2("Timed out waiting for " + this.f29564f + " ms", this));
    }
}
