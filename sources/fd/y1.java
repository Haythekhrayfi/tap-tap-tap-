package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class y1<T> extends n1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k<T> f29646g;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(k<? super T> kVar) {
        this.f29646g = kVar;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
        w(th);
        return jc.w.f31842a;
    }

    @Override // fd.x
    public void w(Throwable th) {
        k<T> kVar;
        Object objA;
        Object objE0 = x().e0();
        if (objE0 instanceof v) {
            kVar = this.f29646g;
            jc.i.a aVar = jc.i.f31813c;
            objA = h9.d.f(((v) objE0).f29629a);
        } else {
            kVar = this.f29646g;
            jc.i.a aVar2 = jc.i.f31813c;
            objA = p1.a(objE0);
        }
        kVar.resumeWith(objA);
    }
}
