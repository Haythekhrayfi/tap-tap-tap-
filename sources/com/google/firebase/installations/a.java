package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12564c;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f12565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f12566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f12567c;
    }

    public a(String str, long j10, long j11, C0159a c0159a) {
        this.f12562a = str;
        this.f12563b = j10;
        this.f12564c = j11;
    }

    @Override // com.google.firebase.installations.e
    public String a() {
        return this.f12562a;
    }

    @Override // com.google.firebase.installations.e
    public long b() {
        return this.f12564c;
    }

    @Override // com.google.firebase.installations.e
    public long c() {
        return this.f12563b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12562a.equals(eVar.a()) && this.f12563b == eVar.c() && this.f12564c == eVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f12562a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f12563b;
        long j11 = this.f12564c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("InstallationTokenResult{token=");
        sbA.append(this.f12562a);
        sbA.append(", tokenExpirationTimestamp=");
        sbA.append(this.f12563b);
        sbA.append(", tokenCreationTimestamp=");
        return android.support.v4.media.session.e.a(sbA, this.f12564c, "}");
    }
}
