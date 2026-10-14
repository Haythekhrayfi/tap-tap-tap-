package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f6135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f6136b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public a(w wVar, w wVar2) {
            this.f6135a = (w) com.applovin.exoplayer2.l.a.b(wVar);
            this.f6136b = (w) com.applovin.exoplayer2.l.a.b(wVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6135a.equals(aVar.f6135a) && this.f6136b.equals(aVar.f6136b);
        }

        public int hashCode() {
            return this.f6136b.hashCode() + (this.f6135a.hashCode() * 31);
        }

        public String toString() {
            String string;
            StringBuilder sbA = defpackage.a.a("[");
            sbA.append(this.f6135a);
            if (this.f6135a.equals(this.f6136b)) {
                string = "";
            } else {
                StringBuilder sbA2 = defpackage.a.a(", ");
                sbA2.append(this.f6136b);
                string = sbA2.toString();
            }
            return androidx.activity.k.a(sbA, string, "]");
        }
    }

    public static class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f6138b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f6137a = j10;
            this.f6138b = new a(j11 == 0 ? w.f6139a : new w(0L, j11));
        }

        @Override // com.applovin.exoplayer2.e.v
        public a a(long j10) {
            return this.f6138b;
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return false;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.f6137a;
        }
    }

    a a(long j10);

    boolean a();

    long b();
}
