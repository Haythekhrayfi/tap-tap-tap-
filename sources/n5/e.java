package n5;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f33623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f33624d;

    public e(Throwable th, d dVar) {
        this.f33621a = th.getLocalizedMessage();
        this.f33622b = th.getClass().getName();
        this.f33623c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f33624d = cause != null ? new e(cause, dVar) : null;
    }
}
