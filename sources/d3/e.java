package d3;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.a<d<?>, Object> f28638b = new b4.b();

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            q.a<d<?>, Object> aVar = this.f28638b;
            if (i10 >= aVar.f34737e) {
                return;
            }
            d<?> dVarH = aVar.h(i10);
            Object objL = this.f28638b.l(i10);
            d.b<?> bVar = dVarH.f28635b;
            if (dVarH.f28637d == null) {
                dVarH.f28637d = dVarH.f28636c.getBytes(c.f28632a);
            }
            bVar.a(dVarH.f28637d, objL, messageDigest);
            i10++;
        }
    }

    public <T> T c(d<T> dVar) {
        return this.f28638b.e(dVar) >= 0 ? (T) this.f28638b.getOrDefault(dVar, null) : dVar.f28634a;
    }

    public void d(e eVar) {
        this.f28638b.i(eVar.f28638b);
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f28638b.equals(((e) obj).f28638b);
        }
        return false;
    }

    @Override // d3.c
    public int hashCode() {
        return this.f28638b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Options{values=");
        sbA.append(this.f28638b);
        sbA.append('}');
        return sbA.toString();
    }
}
