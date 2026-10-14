package b9;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface i {
    @Deprecated
    void a(String str, long j10, long j11, long j12, TimeUnit timeUnit, long j13);

    default void b(String str, long j10, long j11, long j12, TimeUnit timeUnit, int i10) {
        a(str, j10, j11, j12, timeUnit, i10);
    }
}
