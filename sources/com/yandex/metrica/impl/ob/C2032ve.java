package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2032ve extends AbstractC1932re {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C2112ye f17629g = new C2112ye("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17630f;

    public C2032ve(Context context, String str) {
        super(context, str);
        this.f17630f = new C2112ye(f17629g.b(), null);
    }

    public long a(int i10) {
        return this.f17243b.getLong(this.f17630f.a(), i10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_servertimeoffset";
    }

    public void f() {
        a(this.f17630f.a()).b();
    }
}
