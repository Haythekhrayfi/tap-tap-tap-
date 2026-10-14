package ac;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements sb.f<Object> {
    INSTANCE;

    public static void complete(me.b<?> bVar) {
        bVar.c(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, me.b<?> bVar) {
        bVar.c(INSTANCE);
        bVar.a(th);
    }

    @Override // me.c
    public void cancel() {
    }

    @Override // sb.i
    public void clear() {
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
    public Object poll() {
        return null;
    }

    @Override // me.c
    public void request(long j10) {
        g.validate(j10);
    }

    @Override // sb.e
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
