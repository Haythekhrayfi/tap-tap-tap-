package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc.f f29607c;

    public p0(mc.f fVar) {
        this.f29607c = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f29607c.toString();
    }
}
