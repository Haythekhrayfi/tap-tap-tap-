package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22604c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile l3 f22605d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f22606a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f22607b = new ArrayList();

    private l3() {
    }

    public static l3 b() {
        if (f22605d == null) {
            synchronized (f22604c) {
                if (f22605d == null) {
                    f22605d = new l3();
                }
            }
        }
        return f22605d;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (f22604c) {
            arrayList = new ArrayList(this.f22607b);
        }
        return arrayList;
    }

    public final void a(String str) {
        synchronized (f22604c) {
            this.f22607b.remove(str);
            this.f22607b.add(str);
        }
    }

    public final void b(String str) {
        synchronized (f22604c) {
            this.f22606a.remove(str);
            this.f22606a.add(str);
        }
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (f22604c) {
            arrayList = new ArrayList(this.f22606a);
        }
        return arrayList;
    }
}
