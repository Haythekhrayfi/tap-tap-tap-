package ld;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f33093j = new c();

    public c() {
        super(l.f33105b, l.f33106c, l.f33107d, "DefaultDispatcher");
    }

    @Override // ld.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // fd.c0
    public String toString() {
        return "Dispatchers.Default";
    }
}
