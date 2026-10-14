package a6;

import androidx.activity.k;
import i.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f152g;

        public b() {
        }

        public b(d dVar, C0003a c0003a) {
            a aVar = (a) dVar;
            this.f146a = aVar.f139b;
            this.f147b = aVar.f140c;
            this.f148c = aVar.f141d;
            this.f149d = aVar.f142e;
            this.f150e = Long.valueOf(aVar.f143f);
            this.f151f = Long.valueOf(aVar.f144g);
            this.f152g = aVar.f145h;
        }

        @Override // a6.d.a
        public d a() {
            String strA = this.f147b == null ? " registrationStatus" : "";
            if (this.f150e == null) {
                strA = f.a(strA, " expiresInSecs");
            }
            if (this.f151f == null) {
                strA = f.a(strA, " tokenCreationEpochInSecs");
            }
            if (strA.isEmpty()) {
                return new a(this.f146a, this.f147b, this.f148c, this.f149d, this.f150e.longValue(), this.f151f.longValue(), this.f152g, null);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // a6.d.a
        public d.a b(String str) {
            this.f148c = str;
            return this;
        }

        @Override // a6.d.a
        public d.a c(long j10) {
            this.f150e = Long.valueOf(j10);
            return this;
        }

        @Override // a6.d.a
        public d.a d(String str) {
            this.f146a = str;
            return this;
        }

        @Override // a6.d.a
        public d.a e(String str) {
            this.f152g = str;
            return this;
        }

        @Override // a6.d.a
        public d.a f(String str) {
            this.f149d = str;
            return this;
        }

        @Override // a6.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f147b = aVar;
            return this;
        }

        @Override // a6.d.a
        public d.a h(long j10) {
            this.f151f = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4, C0003a c0003a) {
        this.f139b = str;
        this.f140c = aVar;
        this.f141d = str2;
        this.f142e = str3;
        this.f143f = j10;
        this.f144g = j11;
        this.f145h = str4;
    }

    @Override // a6.d
    public String a() {
        return this.f141d;
    }

    @Override // a6.d
    public long b() {
        return this.f143f;
    }

    @Override // a6.d
    public String c() {
        return this.f139b;
    }

    @Override // a6.d
    public String d() {
        return this.f145h;
    }

    @Override // a6.d
    public String e() {
        return this.f142e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f139b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.f140c.equals(dVar.f()) && ((str = this.f141d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f142e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f143f == dVar.b() && this.f144g == dVar.g()) {
                String str4 = this.f145h;
                String strD = dVar.d();
                if (str4 == null) {
                    if (strD == null) {
                        return true;
                    }
                } else if (str4.equals(strD)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a6.d
    public c.a f() {
        return this.f140c;
    }

    @Override // a6.d
    public long g() {
        return this.f144g;
    }

    public int hashCode() {
        String str = this.f139b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f140c.hashCode()) * 1000003;
        String str2 = this.f141d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f142e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f143f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f144g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f145h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // a6.d
    public d.a k() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PersistedInstallationEntry{firebaseInstallationId=");
        sbA.append(this.f139b);
        sbA.append(", registrationStatus=");
        sbA.append(this.f140c);
        sbA.append(", authToken=");
        sbA.append(this.f141d);
        sbA.append(", refreshToken=");
        sbA.append(this.f142e);
        sbA.append(", expiresInSecs=");
        sbA.append(this.f143f);
        sbA.append(", tokenCreationEpochInSecs=");
        sbA.append(this.f144g);
        sbA.append(", fisError=");
        return k.a(sbA, this.f145h, "}");
    }
}
