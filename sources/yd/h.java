package yd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd.c<?> f44913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.a f44914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.a<ae.a> f44915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, cd.c<?> cVar, de.a aVar, uc.a<ae.a> aVar2) {
        super(null);
        j0.j(str, "name");
        j0.j(cVar, "clazz");
        j0.j(aVar2, "parameters");
        this.f44912a = str;
        this.f44913b = cVar;
        this.f44914c = aVar;
        this.f44915d = aVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j0.d(this.f44912a, hVar.f44912a) && j0.d(this.f44913b, hVar.f44913b) && j0.d(this.f44914c, hVar.f44914c) && j0.d(this.f44915d, hVar.f44915d);
    }

    public int hashCode() {
        String str = this.f44912a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        cd.c<?> cVar = this.f44913b;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        de.a aVar = this.f44914c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        uc.a<ae.a> aVar2 = this.f44915d;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("InstanceRequest(name=");
        sbA.append(this.f44912a);
        sbA.append(", clazz=");
        sbA.append(this.f44913b);
        sbA.append(", scope=");
        sbA.append(this.f44914c);
        sbA.append(", parameters=");
        sbA.append(this.f44915d);
        sbA.append(")");
        return sbA.toString();
    }
}
