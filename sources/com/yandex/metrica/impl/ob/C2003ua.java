package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2003ua implements Object<Ed, C1760kg.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1904qa f17519a;

    public C2003ua() {
        this(new C1904qa());
    }

    public C2003ua(C1904qa c1904qa) {
        this.f17519a = c1904qa;
    }

    public Ed a(C1760kg.y yVar) {
        return new Ed(yVar.f16754b, yVar.f16755c, U2.a((Object[]) yVar.f16756d) ? null : this.f17519a.a(yVar.f16756d));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.y b(Ed ed2) {
        C1760kg.y yVar = new C1760kg.y();
        yVar.f16754b = ed2.f13904a;
        yVar.f16755c = ed2.f13905b;
        List<Nc> list = ed2.f13906c;
        yVar.f16756d = list == null ? new C1760kg.y.a[0] : this.f17519a.b(list);
        return yVar;
    }
}
