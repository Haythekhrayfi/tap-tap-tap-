package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface x8 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v61 f26434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final nc0.b f26436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f26437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final v61 f26438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f26439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final nc0.b f26440h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f26441i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f26442j;

        public a(long j10, v61 v61Var, int i10, nc0.b bVar, long j11, v61 v61Var2, int i11, nc0.b bVar2, long j12, long j13) {
            this.f26433a = j10;
            this.f26434b = v61Var;
            this.f26435c = i10;
            this.f26436d = bVar;
            this.f26437e = j11;
            this.f26438f = v61Var2;
            this.f26439g = i11;
            this.f26440h = bVar2;
            this.f26441i = j12;
            this.f26442j = j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26433a == aVar.f26433a && this.f26435c == aVar.f26435c && this.f26437e == aVar.f26437e && this.f26439g == aVar.f26439g && this.f26441i == aVar.f26441i && this.f26442j == aVar.f26442j && sn0.a(this.f26434b, aVar.f26434b) && sn0.a(this.f26436d, aVar.f26436d) && sn0.a(this.f26438f, aVar.f26438f) && sn0.a(this.f26440h, aVar.f26440h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f26433a), this.f26434b, Integer.valueOf(this.f26435c), this.f26436d, Long.valueOf(this.f26437e), this.f26438f, Integer.valueOf(this.f26439g), this.f26440h, Long.valueOf(this.f26441i), Long.valueOf(this.f26442j)});
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qv f26443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f26444b;

        public b(qv qvVar, SparseArray<a> sparseArray) {
            this.f26443a = qvVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(qvVar.a());
            for (int i10 = 0; i10 < qvVar.a(); i10++) {
                int iB = qvVar.b(i10);
                sparseArray2.append(iB, (a) pa.a(sparseArray.get(iB)));
            }
            this.f26444b = sparseArray2;
        }

        public final int a() {
            return this.f26443a.a();
        }

        public final boolean a(int i10) {
            return this.f26443a.a(i10);
        }

        public final int b(int i10) {
            return this.f26443a.b(i10);
        }

        public final a c(int i10) {
            a aVar = this.f26444b.get(i10);
            Objects.requireNonNull(aVar);
            return aVar;
        }
    }
}
