package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface j71 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f21979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21981d;

        public a(int i10, int i11, int i12, byte[] bArr) {
            this.f21978a = i10;
            this.f21979b = bArr;
            this.f21980c = i11;
            this.f21981d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21978a == aVar.f21978a && this.f21980c == aVar.f21980c && this.f21981d == aVar.f21981d && Arrays.equals(this.f21979b, aVar.f21979b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f21979b) + (this.f21978a * 31)) * 31) + this.f21980c) * 31) + this.f21981d;
        }
    }

    int a(im imVar, int i10, boolean z10) throws IOException;

    default void a(int i10, mp0 mp0Var) {
        b(i10, mp0Var);
    }

    void a(long j10, int i10, int i11, int i12, a aVar);

    void a(yv yvVar);

    default int b(im imVar, int i10, boolean z10) throws IOException {
        return a(imVar, i10, z10);
    }

    void b(int i10, mp0 mp0Var);
}
