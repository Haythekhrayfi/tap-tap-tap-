package h9;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements u9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.e f30990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30991c;

    public j(u9.e eVar, String str) {
        j0.i(eVar, "logger");
        j0.i(str, "templateId");
        this.f30990b = eVar;
        this.f30991c = str;
    }

    @Override // u9.e
    public void b(Exception exc) {
        j0.i(exc, "e");
        this.f30990b.c(exc, this.f30991c);
    }
}
