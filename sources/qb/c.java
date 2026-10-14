package qb;

import lb.h;
import lb.k;
import lb.n;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements sb.d<Object> {
    INSTANCE,
    NEVER;

    public static void complete(lb.b bVar) {
        bVar.b(INSTANCE);
        bVar.onComplete();
    }

    public static void complete(h<?> hVar) {
        hVar.b(INSTANCE);
        hVar.onComplete();
    }

    public static void complete(k<?> kVar) {
        kVar.b(INSTANCE);
        kVar.onComplete();
    }

    public static void error(Throwable th, lb.b bVar) {
        bVar.b(INSTANCE);
        bVar.a(th);
    }

    public static void error(Throwable th, h<?> hVar) {
        hVar.b(INSTANCE);
        hVar.a(th);
    }

    public static void error(Throwable th, k<?> kVar) {
        kVar.b(INSTANCE);
        kVar.a(th);
    }

    public static void error(Throwable th, n<?> nVar) {
        nVar.b(INSTANCE);
        nVar.a(th);
    }

    @Override // sb.i
    public void clear() {
    }

    @Override // nb.b
    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // sb.i
    public boolean isEmpty() {
        return true;
    }

    @Override // sb.i
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // sb.i
    public Object poll() throws Exception {
        return null;
    }

    @Override // sb.e
    public int requestFusion(int i10) {
        return i10 & 2;
    }
}
