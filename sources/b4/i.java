package b4;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f3304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f3305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f3306c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2) {
        this.f3304a = cls;
        this.f3305b = cls2;
        this.f3306c = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3304a.equals(iVar.f3304a) && this.f3305b.equals(iVar.f3305b) && j.b(this.f3306c, iVar.f3306c);
    }

    public int hashCode() {
        int iHashCode = (this.f3305b.hashCode() + (this.f3304a.hashCode() * 31)) * 31;
        Class<?> cls = this.f3306c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MultiClassKey{first=");
        sbA.append(this.f3304a);
        sbA.append(", second=");
        sbA.append(this.f3305b);
        sbA.append('}');
        return sbA.toString();
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3304a = cls;
        this.f3305b = cls2;
        this.f3306c = cls3;
    }
}
