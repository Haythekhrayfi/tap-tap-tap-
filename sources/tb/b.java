package tb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> extends AtomicInteger implements sb.d<T> {
    @Override // sb.i
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
