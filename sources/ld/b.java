package ld;

import fd.b1;
import fd.c0;
import fd.z;
import java.util.Objects;
import java.util.concurrent.Executor;
import kd.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends b1 implements Executor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f33091e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f33092f;

    static {
        m mVar = m.f33111e;
        int i10 = a0.f32017a;
        int iP = z.P("kotlinx.coroutines.io.parallelism", 64 < i10 ? i10 : 64, 0, 0, 12, null);
        Objects.requireNonNull(mVar);
        if (!(iP >= 1)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected positive parallelism level, but got ", iP).toString());
        }
        f33092f = new kd.h(mVar, iP);
    }

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        f33092f.c0(fVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f33092f.c0(mc.h.f33539c, runnable);
    }

    @Override // fd.c0
    public String toString() {
        return "Dispatchers.IO";
    }
}
