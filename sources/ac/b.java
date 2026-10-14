package ac;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> extends AtomicLong implements sb.f<T> {
    @Override // sb.i
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
