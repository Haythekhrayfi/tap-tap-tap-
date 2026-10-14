package com.applovin.exoplayer2.common.a;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f4913a = new n() { // from class: com.applovin.exoplayer2.common.a.n.1
        public n a(int i10) {
            if (i10 < 0) {
                return n.f4914b;
            }
            return i10 > 0 ? n.f4915c : n.f4913a;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(int i10, int i11) {
            return a(com.applovin.exoplayer2.common.b.c.a(i10, i11));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(long j10, long j11) {
            return a(com.applovin.exoplayer2.common.b.d.a(j10, j11));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public <T> n a(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator) {
            return a(comparator.compare(t10, t11));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(boolean z10, boolean z11) {
            return a(com.applovin.exoplayer2.common.b.a.a(z11, z10));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n b(boolean z10, boolean z11) {
            return a(com.applovin.exoplayer2.common.b.a.a(z10, z11));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n f4914b = new a(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n f4915c = new a(1);

    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4916a;

        public a(int i10) {
            super();
            this.f4916a = i10;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(int i10, int i11) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(long j10, long j11) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public <T> n a(@NullableDecl T t10, @NullableDecl T t11, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public int b() {
            return this.f4916a;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n b(boolean z10, boolean z11) {
            return this;
        }
    }

    private n() {
    }

    public static n a() {
        return f4913a;
    }

    public abstract n a(int i10, int i11);

    public abstract n a(long j10, long j11);

    public abstract <T> n a(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator);

    public abstract n a(boolean z10, boolean z11);

    public abstract int b();

    public abstract n b(boolean z10, boolean z11);
}
