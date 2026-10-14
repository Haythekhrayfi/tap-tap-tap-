package g2;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f29721b;

    public d(String str, long j10) {
        this.f29720a = str;
        this.f29721b = Long.valueOf(j10);
    }

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f29720a.equals(dVar.f29720a)) {
            return false;
        }
        Long l10 = this.f29721b;
        Long l11 = dVar.f29721b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        return l11 == null;
    }

    public int hashCode() {
        int iHashCode = this.f29720a.hashCode() * 31;
        Long l10 = this.f29721b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
