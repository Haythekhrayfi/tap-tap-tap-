package com.applovin.exoplayer2.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f7537a = new Comparator() { // from class: com.applovin.exoplayer2.k.d0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y.b((y.a) obj, (y.a) obj2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f7538b = new Comparator() { // from class: com.applovin.exoplayer2.k.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y.a((y.a) obj, (y.a) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7539c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7545i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f7541e = new a[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f7540d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7542f = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f7548c;

        private a() {
        }
    }

    public y(int i10) {
        this.f7539c = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return Float.compare(aVar.f7548c, aVar2.f7548c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return aVar.f7546a - aVar2.f7546a;
    }

    private void b() {
        if (this.f7542f != 1) {
            Collections.sort(this.f7540d, f7537a);
            this.f7542f = 1;
        }
    }

    private void c() {
        if (this.f7542f != 0) {
            Collections.sort(this.f7540d, f7538b);
            this.f7542f = 0;
        }
    }

    public float a(float f10) {
        c();
        float f11 = f10 * this.f7544h;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7540d.size(); i11++) {
            a aVar = this.f7540d.get(i11);
            i10 += aVar.f7547b;
            if (i10 >= f11) {
                return aVar.f7548c;
            }
        }
        if (this.f7540d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<a> arrayList = this.f7540d;
        return arrayList.get(arrayList.size() - 1).f7548c;
    }

    public void a() {
        this.f7540d.clear();
        this.f7542f = -1;
        this.f7543g = 0;
        this.f7544h = 0;
    }

    public void a(int i10, float f10) {
        a aVar;
        int i11;
        a aVar2;
        int i12;
        b();
        int i13 = this.f7545i;
        if (i13 > 0) {
            a[] aVarArr = this.f7541e;
            int i14 = i13 - 1;
            this.f7545i = i14;
            aVar = aVarArr[i14];
        } else {
            aVar = new a();
        }
        int i15 = this.f7543g;
        this.f7543g = i15 + 1;
        aVar.f7546a = i15;
        aVar.f7547b = i10;
        aVar.f7548c = f10;
        this.f7540d.add(aVar);
        int i16 = this.f7544h + i10;
        while (true) {
            this.f7544h = i16;
            while (true) {
                int i17 = this.f7544h;
                int i18 = this.f7539c;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                aVar2 = this.f7540d.get(0);
                i12 = aVar2.f7547b;
                if (i12 <= i11) {
                    this.f7544h -= i12;
                    this.f7540d.remove(0);
                    int i19 = this.f7545i;
                    if (i19 < 5) {
                        a[] aVarArr2 = this.f7541e;
                        this.f7545i = i19 + 1;
                        aVarArr2[i19] = aVar2;
                    }
                }
            }
            aVar2.f7547b = i12 - i11;
            i16 = this.f7544h - i11;
        }
    }
}
