package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29633c;

    public w0(boolean z10) {
        this.f29633c = z10;
    }

    @Override // fd.e1
    public boolean a() {
        return this.f29633c;
    }

    @Override // fd.e1
    public t1 f() {
        return null;
    }

    public String toString() {
        return s.a.a(defpackage.a.a("Empty{"), this.f29633c ? "Active" : "New", '}');
    }
}
