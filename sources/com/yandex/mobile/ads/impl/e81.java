package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e81 implements wf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e81 f20119b = new e81(com.yandex.mobile.ads.embedded.guava.collect.p.i());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.p<a> f20120a;

    public static final class a implements wf {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final wf.a<a> f20121f = yn1.f26953m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h71 f20123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f20125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f20126e;

        public a(h71 h71Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = h71Var.f21329a;
            this.f20122a = i10;
            boolean z11 = false;
            pa.a(i10 == iArr.length && i10 == zArr.length);
            this.f20123b = h71Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f20124c = z11;
            this.f20125d = (int[]) iArr.clone();
            this.f20126e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            wf.a<h71> aVar = h71.f21328f;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            Objects.requireNonNull(bundle2);
            h71 h71Var = (h71) aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[h71Var.f21329a];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[h71Var.f21329a];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new a(h71Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        public final int a() {
            return this.f20123b.f21331c;
        }

        public final yv a(int i10) {
            return this.f20123b.a(i10);
        }

        public final boolean b() {
            for (boolean z10 : this.f20126e) {
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int i10) {
            return this.f20126e[i10];
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20124c == aVar.f20124c && this.f20123b.equals(aVar.f20123b) && Arrays.equals(this.f20125d, aVar.f20125d) && Arrays.equals(this.f20126e, aVar.f20126e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f20126e) + ((Arrays.hashCode(this.f20125d) + (((this.f20123b.hashCode() * 31) + (this.f20124c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        dp1 dp1Var = dp1.f19953l;
    }

    public e81(com.yandex.mobile.ads.embedded.guava.collect.p pVar) {
        this.f20120a = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e81 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new e81(parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xf.a(a.f20121f, parcelableArrayList));
    }

    public final com.yandex.mobile.ads.embedded.guava.collect.p<a> a() {
        return this.f20120a;
    }

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < this.f20120a.size(); i11++) {
            a aVar = this.f20120a.get(i11);
            if (aVar.b() && aVar.a() == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e81.class != obj.getClass()) {
            return false;
        }
        return this.f20120a.equals(((e81) obj).f20120a);
    }

    public final int hashCode() {
        return this.f20120a.hashCode();
    }
}
