package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class p21 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<a> f23957h = zn1.f27377e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<a> f23958i = fo1.f20765f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23959a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23965g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a[] f23961c = new a[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f23960b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23962d = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f23968c;

        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }
    }

    public p21(int i10) {
        this.f23959a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f23966a - aVar2.f23966a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.f23968c, aVar2.f23968c);
    }

    public final float a() {
        if (this.f23962d != 0) {
            Collections.sort(this.f23960b, f23958i);
            this.f23962d = 0;
        }
        float f10 = 0.5f * this.f23964f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23960b.size(); i11++) {
            a aVar = this.f23960b.get(i11);
            i10 += aVar.f23967b;
            if (i10 >= f10) {
                return aVar.f23968c;
            }
        }
        if (this.f23960b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<a> arrayList = this.f23960b;
        return arrayList.get(arrayList.size() - 1).f23968c;
    }

    public final void a(int i10, float f10) {
        a aVar;
        int i11;
        a aVar2;
        int i12;
        if (this.f23962d != 1) {
            Collections.sort(this.f23960b, f23957h);
            this.f23962d = 1;
        }
        int i13 = this.f23965g;
        int i14 = 0;
        if (i13 > 0) {
            a[] aVarArr = this.f23961c;
            int i15 = i13 - 1;
            this.f23965g = i15;
            aVar = aVarArr[i15];
        } else {
            aVar = new a(i14);
        }
        int i16 = this.f23963e;
        this.f23963e = i16 + 1;
        aVar.f23966a = i16;
        aVar.f23967b = i10;
        aVar.f23968c = f10;
        this.f23960b.add(aVar);
        int i17 = this.f23964f + i10;
        while (true) {
            this.f23964f = i17;
            while (true) {
                int i18 = this.f23964f;
                int i19 = this.f23959a;
                if (i18 <= i19) {
                    return;
                }
                i11 = i18 - i19;
                aVar2 = this.f23960b.get(0);
                i12 = aVar2.f23967b;
                if (i12 <= i11) {
                    this.f23964f -= i12;
                    this.f23960b.remove(0);
                    int i20 = this.f23965g;
                    if (i20 < 5) {
                        a[] aVarArr2 = this.f23961c;
                        this.f23965g = i20 + 1;
                        aVarArr2[i20] = aVar2;
                    }
                }
            }
            aVar2.f23967b = i12 - i11;
            i17 = this.f23964f - i11;
        }
    }

    public final void b() {
        this.f23960b.clear();
        this.f23962d = -1;
        this.f23963e = 0;
        this.f23964f = 0;
    }
}
