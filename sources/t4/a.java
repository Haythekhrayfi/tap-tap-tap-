package t4;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public interface a<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
