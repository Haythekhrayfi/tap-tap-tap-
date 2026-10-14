package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<pt> f23332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u71> f23333b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<pt> f23334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<u71> f23335b;

        public a() {
            kc.w wVar = kc.w.f32009c;
            this.f23334a = wVar;
            this.f23335b = wVar;
        }

        public final a a(ArrayList arrayList) {
            fd.j0.i(arrayList, "extensions");
            this.f23334a = arrayList;
            return this;
        }

        public final nc1 a() {
            return new nc1(this.f23334a, this.f23335b, 0);
        }

        public final a b(ArrayList arrayList) {
            fd.j0.i(arrayList, "trackingEvents");
            this.f23335b = arrayList;
            return this;
        }
    }

    private nc1(List<pt> list, List<u71> list2) {
        this.f23332a = list;
        this.f23333b = list2;
    }

    public /* synthetic */ nc1(List list, List list2, int i10) {
        this(list, list2);
    }

    public final List<pt> a() {
        return this.f23332a;
    }

    public final List<u71> b() {
        return this.f23333b;
    }
}
