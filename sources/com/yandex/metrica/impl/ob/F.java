package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f13950a;

    public F(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public F(LocationManager locationManager) {
        this.f13950a = locationManager;
    }

    public List<String> a() {
        List<String> providers;
        LocationManager locationManager = this.f13950a;
        List<String> listEmptyList = Collections.emptyList();
        if (locationManager != null) {
            try {
                providers = locationManager.getProviders(true);
            } catch (Throwable unused) {
                providers = null;
            }
        } else {
            providers = null;
        }
        return providers == null ? listEmptyList : providers;
    }
}
