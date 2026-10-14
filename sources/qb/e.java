package qb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AtomicReference<nb.b> implements nb.b {
    public e() {
    }

    public e(nb.b bVar) {
        lazySet(bVar);
    }

    public boolean a() {
        return b.isDisposed(get());
    }

    @Override // nb.b
    public void dispose() {
        b.dispose(this);
    }
}
