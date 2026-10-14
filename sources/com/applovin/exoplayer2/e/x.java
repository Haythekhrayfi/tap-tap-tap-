package com.applovin.exoplayer2.e;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface x {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f6143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6145d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f6142a = i10;
            this.f6143b = bArr;
            this.f6144c = i11;
            this.f6145d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6142a == aVar.f6142a && this.f6144c == aVar.f6144c && this.f6145d == aVar.f6145d && Arrays.equals(this.f6143b, aVar.f6143b);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f6143b) + (this.f6142a * 31)) * 31) + this.f6144c) * 31) + this.f6145d;
        }
    }

    default int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10) throws IOException {
        return a(gVar, i10, z10, 0);
    }

    int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException;

    void a(long j10, int i10, int i11, int i12, a aVar);

    default void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        a(yVar, i10, 0);
    }

    void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11);

    void a(com.applovin.exoplayer2.v vVar);
}
