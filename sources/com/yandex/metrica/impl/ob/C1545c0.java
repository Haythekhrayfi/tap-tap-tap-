package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1545c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f15863f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C1545c0 f15864g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15865a = Build.MANUFACTURER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15866b = Build.MODEL;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15867c = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15868d = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15869e = String.valueOf(C1920r2.a());

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c0$a */
    public class a extends ArrayList<String> {
        public a(C1545c0 c1545c0) {
            if (C1920r2.b()) {
                add("Superuser.apk");
            }
            if (C1920r2.c()) {
                add("su.so");
            }
        }
    }

    public C1545c0() {
        Collections.unmodifiableList(new a(this));
    }

    public static C1545c0 a() {
        if (f15864g == null) {
            synchronized (f15863f) {
                if (f15864g == null) {
                    f15864g = new C1545c0();
                }
            }
        }
        return f15864g;
    }
}
