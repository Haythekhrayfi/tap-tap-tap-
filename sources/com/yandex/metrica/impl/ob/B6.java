package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I9 f13711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private A6 f13712c;

    public B6(Context context) {
        this(context.getPackageName(), P0.i().u(), new A6());
    }

    public B6(String str, I9 i10, A6 a10) {
        this.f13710a = str;
        this.f13711b = i10;
        this.f13712c = a10;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        A6 a10 = this.f13712c;
        String str = this.f13710a;
        boolean zF = this.f13711b.f();
        Objects.requireNonNull(a10);
        bundle.putString("package_name", str);
        bundle.putBoolean("clte", zF);
        return bundle;
    }
}
