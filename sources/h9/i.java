package h9;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements u9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.e<u9.b<?>> f30988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.e f30989b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(w9.e<? extends u9.b<?>> eVar, u9.e eVar2) {
        j0.i(eVar, "templates");
        j0.i(eVar2, "logger");
        this.f30988a = eVar;
        this.f30989b = eVar2;
    }

    @Override // u9.c
    public u9.e a() {
        return this.f30989b;
    }

    @Override // u9.c
    public w9.e<u9.b<?>> b() {
        return this.f30988a;
    }
}
