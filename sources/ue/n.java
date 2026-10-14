package ue;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.i f36423a;

    public n(fd.i iVar) {
        this.f36423a = iVar;
    }

    @Override // ue.d
    public void a(b<Object> bVar, z<Object> zVar) {
        j0.j(bVar, "call");
        j0.j(zVar, "response");
        fd.i iVar = this.f36423a;
        jc.i.a aVar = jc.i.f31813c;
        iVar.resumeWith(zVar);
    }

    @Override // ue.d
    public void b(b<Object> bVar, Throwable th) {
        j0.j(bVar, "call");
        j0.j(th, "t");
        fd.i iVar = this.f36423a;
        jc.i.a aVar = jc.i.f31813c;
        iVar.resumeWith(h9.d.f(th));
    }
}
