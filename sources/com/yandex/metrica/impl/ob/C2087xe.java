package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2087xe extends AbstractC1932re {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17848f;

    public C2087xe(Context context, String str) {
        super(context, null);
        this.f17848f = new C2112ye("LOCATION_TRACKING_ENABLED");
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_serviceproviderspreferences";
    }

    public boolean f() {
        return this.f17243b.getBoolean(this.f17848f.a(), false);
    }

    public void g() {
        a(this.f17848f.a()).b();
    }
}
