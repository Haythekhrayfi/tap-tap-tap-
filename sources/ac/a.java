package ac;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> extends AtomicInteger implements sb.f<T> {
    @Override // sb.i
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
