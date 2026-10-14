package g3;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.c f29796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3.c f29797c;

    public e(d3.c cVar, d3.c cVar2) {
        this.f29796b = cVar;
        this.f29797c = cVar2;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        this.f29796b.a(messageDigest);
        this.f29797c.a(messageDigest);
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f29796b.equals(eVar.f29796b) && this.f29797c.equals(eVar.f29797c);
    }

    @Override // d3.c
    public int hashCode() {
        return this.f29797c.hashCode() + (this.f29796b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DataCacheKey{sourceKey=");
        sbA.append(this.f29796b);
        sbA.append(", signature=");
        sbA.append(this.f29797c);
        sbA.append('}');
        return sbA.toString();
    }
}
