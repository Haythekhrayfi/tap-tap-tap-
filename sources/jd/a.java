package jd;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient id.e<?> f31845c;

    public a(id.e<?> eVar) {
        super("Flow was aborted, no more elements needed");
        this.f31845c = eVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
