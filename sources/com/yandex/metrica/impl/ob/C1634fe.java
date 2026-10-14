package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1634fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1584de f16135a;

    public C1634fe(InterfaceC1584de interfaceC1584de) {
        this.f16135a = interfaceC1584de;
    }

    public void a(InterfaceC1584de interfaceC1584de) {
        this.f16135a = interfaceC1584de;
    }

    public boolean a(Context context) {
        if (this.f16135a.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return C1559ce.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        }
        return false;
    }

    public boolean b(Context context) {
        if (this.f16135a.a("android.permission.READ_PHONE_STATE")) {
            return C1559ce.a(context, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }

    public boolean c(Context context) {
        if (this.f16135a.a("android.permission.ACCESS_WIFI_STATE")) {
            return C1559ce.a(context, "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }
}
