package vc;

import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a implements i, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f36981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f36982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36987i;

    public a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, c.NO_RECEIVER, cls, str, str2, i11);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f36981c = obj;
        this.f36982d = cls;
        this.f36983e = str;
        this.f36984f = str2;
        this.f36985g = (i11 & 1) == 1;
        this.f36986h = i10;
        this.f36987i = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36985g == aVar.f36985g && this.f36986h == aVar.f36986h && this.f36987i == aVar.f36987i && j0.d(this.f36981c, aVar.f36981c) && j0.d(this.f36982d, aVar.f36982d) && this.f36983e.equals(aVar.f36983e) && this.f36984f.equals(aVar.f36984f);
    }

    @Override // vc.i
    public int getArity() {
        return this.f36986h;
    }

    public int hashCode() {
        Object obj = this.f36981c;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f36982d;
        return ((((l1.e.a(this.f36984f, l1.e.a(this.f36983e, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f36985g ? 1231 : 1237)) * 31) + this.f36986h) * 31) + this.f36987i;
    }

    public String toString() {
        return b0.f36991a.a(this);
    }
}
