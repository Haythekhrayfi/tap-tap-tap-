package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tj f25371a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tj f25372b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final tj f25373c = new b(1);

    public class a extends tj {
        public a() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(int i10, int i11) {
            byte b10;
            if (i10 < i11) {
                b10 = -1;
            } else {
                b10 = i10 > i11 ? (byte) 1 : (byte) 0;
            }
            if (b10 < 0) {
                return tj.f25372b;
            }
            return b10 > 0 ? tj.f25373c : tj.f25371a;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(long j10, long j11) {
            byte b10;
            if (j10 < j11) {
                b10 = -1;
            } else {
                b10 = j10 > j11 ? (byte) 1 : (byte) 0;
            }
            if (b10 < 0) {
                return tj.f25372b;
            }
            return b10 > 0 ? tj.f25373c : tj.f25371a;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final <T> tj a(T t10, T t11, Comparator<T> comparator) {
            int iCompare = comparator.compare(t10, t11);
            if (iCompare < 0) {
                return tj.f25372b;
            }
            return iCompare > 0 ? tj.f25373c : tj.f25371a;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(boolean z10, boolean z11) {
            byte b10;
            if (z10 == z11) {
                b10 = 0;
            } else {
                b10 = z10 ? (byte) 1 : (byte) -1;
            }
            if (b10 < 0) {
                return tj.f25372b;
            }
            return b10 > 0 ? tj.f25373c : tj.f25371a;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj b(boolean z10, boolean z11) {
            byte b10;
            if (z11 == z10) {
                b10 = 0;
            } else {
                b10 = z11 ? (byte) 1 : (byte) -1;
            }
            if (b10 < 0) {
                return tj.f25372b;
            }
            return b10 > 0 ? tj.f25373c : tj.f25371a;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final int d() {
            return 0;
        }
    }

    public static final class b extends tj {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f25374d;

        public b(int i10) {
            super(0);
            this.f25374d = i10;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(int i10, int i11) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(long j10, long j11) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final <T> tj a(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj a(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final tj b(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.tj
        public final int d() {
            return this.f25374d;
        }
    }

    private tj() {
    }

    public /* synthetic */ tj(int i10) {
        this();
    }

    public static tj e() {
        return f25371a;
    }

    public abstract tj a(int i10, int i11);

    public abstract tj a(long j10, long j11);

    public abstract <T> tj a(T t10, T t11, Comparator<T> comparator);

    public abstract tj a(boolean z10, boolean z11);

    public abstract tj b(boolean z10, boolean z11);

    public abstract int d();
}
