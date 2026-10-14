package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class Fk implements InterfaceC1915ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f14017a;

    public Fk(Context context) {
        this(context, new Wn());
    }

    public Fk(Context context, Wn wn) {
        ApplicationInfo applicationInfoA = wn.a(context, context.getPackageName(), 128);
        this.f14017a = applicationInfoA != null ? applicationInfoA.metaData : null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1915ql
    public Bundle a(Activity activity) {
        return this.f14017a;
    }
}
