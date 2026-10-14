package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2061wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f17778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1523b3 f17779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2118yk f17780c = P0.i().w();

    public C2061wd(Context context) {
        this.f17778a = (LocationManager) context.getSystemService("location");
        this.f17779b = C1523b3.a(context);
    }

    public LocationManager a() {
        return this.f17778a;
    }

    public C2118yk b() {
        return this.f17780c;
    }

    public C1523b3 c() {
        return this.f17779b;
    }
}
