package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kd.k f29637c;

    public x1(kd.k kVar) {
        this.f29637c = kVar;
    }

    @Override // fd.h
    public void a(Throwable th) {
        this.f29637c.t();
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        this.f29637c.t();
        return jc.w.f31842a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RemoveOnCancel[");
        sbA.append(this.f29637c);
        sbA.append(']');
        return sbA.toString();
    }
}
