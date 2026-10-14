package w8;

import fd.j0;
import p7.d1;
import u9.h;
import vc.g;
import y9.i7;

/* JADX INFO: loaded from: classes2.dex */
public class a extends h<i7> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w9.a<i7> f37163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h.a<i7> f37164e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(u9.e eVar) {
        this(eVar, null, 2, null);
        j0.i(eVar, "logger");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u9.e eVar, w9.a<i7> aVar) {
        super(eVar, aVar);
        j0.i(eVar, "logger");
        j0.i(aVar, "templateProvider");
        this.f37163d = aVar;
        this.f37164e = d1.f34482f;
    }

    public a(u9.e eVar, w9.a aVar, int i10, g gVar) {
        if ((i10 & 2) != 0) {
            w9.b bVar = new w9.b();
            int i11 = w9.e.f37196a;
            aVar = new w9.a(bVar, new w9.c());
        }
        this(eVar, aVar);
    }

    @Override // u9.h, u9.c
    public w9.e b() {
        return this.f37163d;
    }
}
