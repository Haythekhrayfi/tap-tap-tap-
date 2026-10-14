package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1729ja implements InterfaceC1605ea<C2011ui, C1760kg.h> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.h b(C2011ui c2011ui) {
        C1760kg.h hVar = new C1760kg.h();
        hVar.f16626b = c2011ui.c();
        hVar.f16627c = c2011ui.b();
        hVar.f16628d = c2011ui.a();
        hVar.f16630f = c2011ui.e();
        hVar.f16629e = c2011ui.d();
        return hVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C2011ui a(C1760kg.h hVar) {
        String str = hVar.f16626b;
        fd.j0.h(str, "nano.url");
        return new C2011ui(str, hVar.f16627c, hVar.f16628d, hVar.f16629e, hVar.f16630f);
    }
}
