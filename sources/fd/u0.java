package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f29626c;

    public u0(t0 t0Var) {
        this.f29626c = t0Var;
    }

    @Override // fd.h
    public void a(Throwable th) {
        this.f29626c.dispose();
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        this.f29626c.dispose();
        return jc.w.f31842a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DisposeOnCancel[");
        sbA.append(this.f29626c);
        sbA.append(']');
        return sbA.toString();
    }
}
