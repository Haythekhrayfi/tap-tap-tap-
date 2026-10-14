package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class eu0 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f20323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f20324b = a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eg1.a f20325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f20326b;

        public a(eg1.a aVar, float f10) {
            this.f20325a = aVar;
            this.f20326b = f10;
        }
    }

    public eu0(eg1 eg1Var) {
        this.f20323a = eg1Var;
    }

    private static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(eg1.a.f20247a, 0.25f));
        arrayList.add(new a(eg1.a.f20248b, 0.5f));
        arrayList.add(new a(eg1.a.f20249c, 0.75f));
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f20324b.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f20326b * j10 <= j11) {
                    this.f20323a.a(aVar.f20325a);
                    it.remove();
                }
            }
        }
    }
}
