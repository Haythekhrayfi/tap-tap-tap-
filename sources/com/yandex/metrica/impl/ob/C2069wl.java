package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2069wl implements InterfaceC1715il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Wl> f17809a = new ArrayList();

    @Override // com.yandex.metrica.impl.ob.InterfaceC1715il
    public List<Wl> a() {
        return this.f17809a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1964sl
    public void a(Wl wl) {
        this.f17809a.add(wl);
    }
}
