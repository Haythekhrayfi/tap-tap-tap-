package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1965sm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17412c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17414b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(vc.g gVar) {
            this();
        }
    }

    public C1965sm(long j10, int i10) {
        this.f17413a = j10;
        this.f17414b = i10;
    }

    public final int a() {
        return this.f17414b;
    }

    public final long b() {
        return this.f17413a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1965sm)) {
            return false;
        }
        C1965sm c1965sm = (C1965sm) obj;
        return this.f17413a == c1965sm.f17413a && this.f17414b == c1965sm.f17414b;
    }

    public int hashCode() {
        long j10 = this.f17413a;
        return (((int) (j10 ^ (j10 >>> 32))) * 31) + this.f17414b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DecimalProtoModel(mantissa=");
        sbA.append(this.f17413a);
        sbA.append(", exponent=");
        return android.support.v4.media.b.a(sbA, this.f17414b, ")");
    }
}
