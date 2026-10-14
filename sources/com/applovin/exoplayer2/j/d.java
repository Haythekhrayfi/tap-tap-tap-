package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface d extends g {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ac f7252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7254c;

        public a(ac acVar, int... iArr) {
            this(acVar, iArr, 0);
        }

        public a(ac acVar, int[] iArr, int i10) {
            this.f7252a = acVar;
            this.f7253b = iArr;
            this.f7254c = i10;
        }
    }

    public interface b {
        d[] a(a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar);
    }

    void a();

    void a(float f10);

    default void a(boolean z10) {
    }

    void b();

    int c();

    v f();

    default void g() {
    }

    default void h() {
    }
}
