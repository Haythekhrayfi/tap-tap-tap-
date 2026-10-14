package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes2.dex */
final class dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12159e;

    public dq() {
    }

    public dq(int i10, String str, long j10, long j11, int i11) {
        this();
        this.f12155a = i10;
        this.f12156b = str;
        this.f12157c = j10;
        this.f12158d = j11;
        this.f12159e = i11;
    }

    public int a() {
        return this.f12155a;
    }

    public String b() {
        return this.f12156b;
    }

    public long c() {
        return this.f12157c;
    }

    public long d() {
        return this.f12158d;
    }

    public int e() {
        return this.f12159e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dq) {
            dq dqVar = (dq) obj;
            if (this.f12155a == dqVar.a() && ((str = this.f12156b) != null ? str.equals(dqVar.b()) : dqVar.b() == null) && this.f12157c == dqVar.c() && this.f12158d == dqVar.d() && this.f12159e == dqVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f12155a ^ 1000003) * 1000003;
        String str = this.f12156b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f12157c;
        long j11 = this.f12158d;
        return ((((((i10 ^ iHashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12159e;
    }

    public String toString() {
        int i10 = this.f12155a;
        String str = this.f12156b;
        long j10 = this.f12157c;
        long j11 = this.f12158d;
        int i11 = this.f12159e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        r.e.a(sb2, ", fileOffset=", j10, ", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
