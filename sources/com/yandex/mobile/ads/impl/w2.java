package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e3> f26135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26136b;

    public w2(ArrayList arrayList) {
        fd.j0.i(arrayList, "adGroupPlaybackItems");
        this.f26135a = arrayList;
    }

    private final e3 a(int i10) {
        return (e3) kc.t.t(this.f26135a, i10);
    }

    public final e3 a(sc1<VideoAd> sc1Var) {
        Object next;
        fd.j0.i(sc1Var, "videoAdInfo");
        Iterator<T> it = this.f26135a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fd.j0.d(((e3) next).c(), sc1Var)) {
                return (e3) next;
            }
        }
        next = null;
        return (e3) next;
    }

    public final void a() {
        this.f26136b = this.f26135a.size();
    }

    public final sc1<VideoAd> b() {
        e3 e3VarA = a(this.f26136b);
        if (e3VarA != null) {
            return e3VarA.c();
        }
        return null;
    }

    public final s50 c() {
        e3 e3VarA = a(this.f26136b);
        if (e3VarA != null) {
            return e3VarA.a();
        }
        return null;
    }

    public final eg1 d() {
        e3 e3VarA = a(this.f26136b);
        if (e3VarA != null) {
            return e3VarA.d();
        }
        return null;
    }

    public final e3 e() {
        return a(this.f26136b + 1);
    }

    public final e3 f() {
        int i10 = this.f26136b + 1;
        this.f26136b = i10;
        return a(i10);
    }
}
