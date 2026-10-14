package g3;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o implements d3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f29921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f29922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3.c f29923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Class<?>, d3.g<?>> f29924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d3.e f29925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29926j;

    public o(Object obj, d3.c cVar, int i10, int i11, Map<Class<?>, d3.g<?>> map, Class<?> cls, Class<?> cls2, d3.e eVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f29918b = obj;
        Objects.requireNonNull(cVar, "Signature must not be null");
        this.f29923g = cVar;
        this.f29919c = i10;
        this.f29920d = i11;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f29924h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f29921e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f29922f = cls2;
        Objects.requireNonNull(eVar, "Argument must not be null");
        this.f29925i = eVar;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f29918b.equals(oVar.f29918b) && this.f29923g.equals(oVar.f29923g) && this.f29920d == oVar.f29920d && this.f29919c == oVar.f29919c && this.f29924h.equals(oVar.f29924h) && this.f29921e.equals(oVar.f29921e) && this.f29922f.equals(oVar.f29922f) && this.f29925i.equals(oVar.f29925i);
    }

    @Override // d3.c
    public int hashCode() {
        if (this.f29926j == 0) {
            int iHashCode = this.f29918b.hashCode();
            this.f29926j = iHashCode;
            int iHashCode2 = this.f29923g.hashCode() + (iHashCode * 31);
            this.f29926j = iHashCode2;
            int i10 = (iHashCode2 * 31) + this.f29919c;
            this.f29926j = i10;
            int i11 = (i10 * 31) + this.f29920d;
            this.f29926j = i11;
            int iHashCode3 = this.f29924h.hashCode() + (i11 * 31);
            this.f29926j = iHashCode3;
            int iHashCode4 = this.f29921e.hashCode() + (iHashCode3 * 31);
            this.f29926j = iHashCode4;
            int iHashCode5 = this.f29922f.hashCode() + (iHashCode4 * 31);
            this.f29926j = iHashCode5;
            this.f29926j = this.f29925i.hashCode() + (iHashCode5 * 31);
        }
        return this.f29926j;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EngineKey{model=");
        sbA.append(this.f29918b);
        sbA.append(", width=");
        sbA.append(this.f29919c);
        sbA.append(", height=");
        sbA.append(this.f29920d);
        sbA.append(", resourceClass=");
        sbA.append(this.f29921e);
        sbA.append(", transcodeClass=");
        sbA.append(this.f29922f);
        sbA.append(", signature=");
        sbA.append(this.f29923g);
        sbA.append(", hashCode=");
        sbA.append(this.f29926j);
        sbA.append(", transformations=");
        sbA.append(this.f29924h);
        sbA.append(", options=");
        sbA.append(this.f29925i);
        sbA.append('}');
        return sbA.toString();
    }
}
