package re;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35383f;

    public n(long j10, long j11, long j12, long j13) {
        this.f35380c = j10;
        this.f35381d = j11;
        this.f35382e = j12;
        this.f35383f = j13;
    }

    public static n c(long j10, long j11) {
        if (j10 <= j11) {
            return new n(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static n d(long j10, long j11, long j12) {
        return e(j10, j10, j11, j12);
    }

    public static n e(long j10, long j11, long j12, long j13) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j12 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 <= j13) {
            return new n(j10, j11, j12, j13);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    public int a(long j10, i iVar) {
        boolean z10;
        long j11 = this.f35380c;
        if (j11 >= -2147483648L && this.f35383f <= 2147483647L) {
            z10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1)) >= 0 && (j10 > this.f35383f ? 1 : (j10 == this.f35383f ? 0 : -1)) <= 0;
        }
        if (z10) {
            return (int) j10;
        }
        throw new ne.a("Invalid int value for " + iVar + ": " + j10);
    }

    public long b(long j10, i iVar) {
        if (j10 >= this.f35380c && j10 <= this.f35383f) {
            return j10;
        }
        if (iVar == null) {
            throw new ne.a("Invalid value (valid values " + this + "): " + j10);
        }
        throw new ne.a("Invalid value for " + iVar + " (valid values " + this + "): " + j10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f35380c == nVar.f35380c && this.f35381d == nVar.f35381d && this.f35382e == nVar.f35382e && this.f35383f == nVar.f35383f;
    }

    public int hashCode() {
        long j10 = this.f35380c;
        long j11 = this.f35381d;
        long j12 = (j10 + j11) << ((int) (j11 + 16));
        long j13 = this.f35382e;
        long j14 = (j12 >> ((int) (j13 + 48))) << ((int) (j13 + 32));
        long j15 = this.f35383f;
        long j16 = ((j14 >> ((int) (32 + j15))) << ((int) (j15 + 48))) >> 16;
        return (int) (j16 ^ (j16 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35380c);
        if (this.f35380c != this.f35381d) {
            sb2.append('/');
            sb2.append(this.f35381d);
        }
        sb2.append(" - ");
        sb2.append(this.f35382e);
        if (this.f35382e != this.f35383f) {
            sb2.append('/');
            sb2.append(this.f35383f);
        }
        return sb2.toString();
    }
}
