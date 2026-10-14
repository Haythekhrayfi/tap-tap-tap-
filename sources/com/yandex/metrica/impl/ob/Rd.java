package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Rd implements Ud {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final EnumSet<C1522b2.d> f14870c = EnumSet.of(C1522b2.d.OFFLINE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2070wm f14871a = new C1940rm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14872b;

    public Rd(Context context) {
        this.f14872b = context;
    }

    @Override // com.yandex.metrica.impl.ob.Ud
    public boolean a() {
        InterfaceC2070wm interfaceC2070wm = this.f14871a;
        Context context = this.f14872b;
        Objects.requireNonNull((C1940rm) interfaceC2070wm);
        return !f14870c.contains(C1522b2.a(context));
    }
}
