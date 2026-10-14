package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2007ue extends AbstractC1932re {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C2112ye f17528h = new C2112ye("SERVICE_API_LEVEL", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2112ye f17529i = new C2112ye("CLIENT_API_LEVEL", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2112ye f17531g;

    public C2007ue(Context context) {
        super(context, null);
        this.f17530f = new C2112ye(f17528h.b());
        this.f17531g = new C2112ye(f17529i.b());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_migrationpreferences";
    }

    public int f() {
        return this.f17243b.getInt(this.f17530f.a(), -1);
    }

    public C2007ue g() {
        a(this.f17531g.a());
        return this;
    }

    @Deprecated
    public C2007ue h() {
        a(this.f17530f.a());
        return this;
    }
}
