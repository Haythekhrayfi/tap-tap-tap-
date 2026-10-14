package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2145zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Im> f18048a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, C2095xm> f18049b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f18050c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f18051d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18052e = 0;

    public static Im a() {
        return Im.g();
    }

    public static C2095xm a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2095xm.g();
        }
        C2095xm c2095xm = f18049b.get(str);
        if (c2095xm == null) {
            synchronized (f18051d) {
                c2095xm = f18049b.get(str);
                if (c2095xm == null) {
                    c2095xm = new C2095xm(str);
                    f18049b.put(str, c2095xm);
                }
            }
        }
        return c2095xm;
    }

    public static Im b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Im.g();
        }
        Im im = f18048a.get(str);
        if (im == null) {
            synchronized (f18050c) {
                im = f18048a.get(str);
                if (im == null) {
                    im = new Im(str);
                    f18048a.put(str, im);
                }
            }
        }
        return im;
    }
}
