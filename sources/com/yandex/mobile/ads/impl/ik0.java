package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3 f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jb f21739b = new jb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o20 f21740c = new o20();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q20 f21741d = new q20();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a20 f21742e;

    public interface a {
    }

    public ik0(Context context, w3 w3Var) {
        this.f21738a = w3Var;
        this.f21742e = new a20(context);
    }

    public final void a(wh0 wh0Var, eq0 eq0Var, nk0.b bVar) {
        cj0 cj0VarC = wh0Var.c();
        LinkedHashSet linkedHashSetA = this.f21741d.a(cj0VarC.d());
        Objects.requireNonNull(this.f21742e);
        HashSet hashSet = new HashSet();
        List<yp> listC = cj0VarC.c();
        if (listC != null) {
            Iterator<yp> it = listC.iterator();
            while (it.hasNext()) {
                List<j20> listB = it.next().b();
                if (listB != null) {
                    hashSet.addAll(listB);
                }
            }
        }
        linkedHashSetA.addAll(hashSet);
        this.f21738a.b(v3.f25805h);
        this.f21742e.a(linkedHashSetA, new hk0(this, wh0Var, eq0Var, bVar));
    }
}
