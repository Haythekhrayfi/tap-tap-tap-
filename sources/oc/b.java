package oc;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements mc.d<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34224c = new b();

    @Override // mc.d
    public mc.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // mc.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
