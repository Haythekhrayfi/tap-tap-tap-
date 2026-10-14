package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<Throwable, jc.w> f29571c;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(uc.l<? super Throwable, jc.w> lVar) {
        this.f29571c = lVar;
    }

    @Override // fd.h
    public void a(Throwable th) {
        this.f29571c.invoke(th);
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        this.f29571c.invoke(th);
        return jc.w.f31842a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("InvokeOnCancel[");
        sbA.append(j0.m(this.f29571c));
        sbA.append('@');
        sbA.append(j0.n(this));
        sbA.append(']');
        return sbA.toString();
    }
}
