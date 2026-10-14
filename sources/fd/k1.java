package fd;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends CancellationException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j1 f29589c;

    public k1(String str, Throwable th, j1 j1Var) {
        super(str);
        this.f29589c = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (!j0.d(k1Var.getMessage(), getMessage()) || !j0.d(k1Var.f29589c, this.f29589c) || !j0.d(k1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        j0.f(message);
        int iHashCode = (this.f29589c.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f29589c;
    }
}
