package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2122z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, a> f17948a = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    public boolean a(Activity activity, a aVar) {
        if (activity != null && this.f17948a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f17948a.put(activity, aVar);
        return true;
    }
}
