package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface p01 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r01 f23940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r01 f23941b;

        public a(r01 r01Var) {
            this(r01Var, r01Var);
        }

        public a(r01 r01Var, r01 r01Var2) {
            this.f23940a = (r01) pa.a(r01Var);
            this.f23941b = (r01) pa.a(r01Var2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23940a.equals(aVar.f23940a) && this.f23941b.equals(aVar.f23941b);
        }

        public final int hashCode() {
            return this.f23941b.hashCode() + (this.f23940a.hashCode() * 31);
        }

        public final String toString() {
            String string;
            StringBuilder sbA = v60.a("[");
            sbA.append(this.f23940a);
            if (this.f23940a.equals(this.f23941b)) {
                string = "";
            } else {
                StringBuilder sbA2 = v60.a(", ");
                sbA2.append(this.f23941b);
                string = sbA2.toString();
            }
            return androidx.activity.k.a(sbA, string, "]");
        }
    }

    public static class b implements p01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f23943b;

        public b() {
            this(-9223372036854775807L, 0L);
        }

        public b(long j10, long j11) {
            this.f23942a = j10;
            this.f23943b = new a(j11 == 0 ? r01.f24582c : new r01(0L, j11));
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final a b(long j10) {
            return this.f23943b;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final boolean b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final long c() {
            return this.f23942a;
        }
    }

    a b(long j10);

    boolean b();

    long c();
}
