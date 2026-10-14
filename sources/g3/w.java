package g3;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class w implements d3.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b4.g<Class<?>, byte[]> f29960j = new b4.g<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.b f29961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3.c f29962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.c f29963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f29966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3.e f29967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d3.g<?> f29968i;

    public w(h3.b bVar, d3.c cVar, d3.c cVar2, int i10, int i11, d3.g<?> gVar, Class<?> cls, d3.e eVar) {
        this.f29961b = bVar;
        this.f29962c = cVar;
        this.f29963d = cVar2;
        this.f29964e = i10;
        this.f29965f = i11;
        this.f29968i = gVar;
        this.f29966g = cls;
        this.f29967h = eVar;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f29961b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f29964e).putInt(this.f29965f).array();
        this.f29963d.a(messageDigest);
        this.f29962c.a(messageDigest);
        messageDigest.update(bArr);
        d3.g<?> gVar = this.f29968i;
        if (gVar != null) {
            gVar.a(messageDigest);
        }
        this.f29967h.a(messageDigest);
        b4.g<Class<?>, byte[]> gVar2 = f29960j;
        byte[] bArrA = gVar2.a(this.f29966g);
        if (bArrA == null) {
            bArrA = this.f29966g.getName().getBytes(d3.c.f28632a);
            gVar2.d(this.f29966g, bArrA);
        }
        messageDigest.update(bArrA);
        this.f29961b.put(bArr);
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f29965f == wVar.f29965f && this.f29964e == wVar.f29964e && b4.j.b(this.f29968i, wVar.f29968i) && this.f29966g.equals(wVar.f29966g) && this.f29962c.equals(wVar.f29962c) && this.f29963d.equals(wVar.f29963d) && this.f29967h.equals(wVar.f29967h);
    }

    @Override // d3.c
    public int hashCode() {
        int iHashCode = ((((this.f29963d.hashCode() + (this.f29962c.hashCode() * 31)) * 31) + this.f29964e) * 31) + this.f29965f;
        d3.g<?> gVar = this.f29968i;
        if (gVar != null) {
            iHashCode = (iHashCode * 31) + gVar.hashCode();
        }
        return this.f29967h.hashCode() + ((this.f29966g.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ResourceCacheKey{sourceKey=");
        sbA.append(this.f29962c);
        sbA.append(", signature=");
        sbA.append(this.f29963d);
        sbA.append(", width=");
        sbA.append(this.f29964e);
        sbA.append(", height=");
        sbA.append(this.f29965f);
        sbA.append(", decodedResourceClass=");
        sbA.append(this.f29966g);
        sbA.append(", transformation='");
        sbA.append(this.f29968i);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append(", options=");
        sbA.append(this.f29967h);
        sbA.append('}');
        return sbA.toString();
    }
}
