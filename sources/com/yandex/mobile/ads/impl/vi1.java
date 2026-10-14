package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class vi1 implements com.yandex.mobile.ads.exo.offline.c.InterfaceC0196c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f25985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final List<Integer> f25986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    private static final List<Integer> f25987e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fv0 f25989b;

    static {
        vc.t tVar = new vc.t(vi1.class, "cacheListener", "getCacheListener()Lcom/yandex/mobile/ads/nativeads/video/cache/VideoCacheListener;", 0);
        Objects.requireNonNull(vc.b0.f36991a);
        f25985c = new cd.i[]{tVar};
        List<Integer> listC = kc.l.c(3, 4);
        f25986d = listC;
        f25987e = kc.t.A(kc.t.A(listC, 1), 5);
    }

    public vi1(String str, me1 me1Var) {
        fd.j0.i(str, "requestId");
        fd.j0.i(me1Var, "videoCacheListener");
        this.f25988a = str;
        this.f25989b = gv0.a(me1Var);
    }

    private final me1 a() {
        return (me1) this.f25989b.getValue(this, f25985c[0]);
    }

    @Override // com.yandex.mobile.ads.exo.offline.c.InterfaceC0196c
    public final void a(com.yandex.mobile.ads.exo.offline.c cVar, com.yandex.mobile.ads.exo.offline.b bVar) {
        me1 me1VarA;
        fd.j0.i(cVar, "downloadManager");
        fd.j0.i(bVar, "download");
        if (fd.j0.d(bVar.f18675a.f18651a, this.f25988a)) {
            if (f25986d.contains(Integer.valueOf(bVar.f18676b)) && (me1VarA = a()) != null) {
                me1VarA.a();
            }
            if (f25987e.contains(Integer.valueOf(bVar.f18676b))) {
                cVar.a((com.yandex.mobile.ads.exo.offline.c.InterfaceC0196c) this);
            }
        }
    }
}
