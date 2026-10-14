package oe;

import fd.z;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f34269e = new m();

    private Object readResolve() {
        return f34269e;
    }

    @Override // oe.h
    public b b(re.e eVar) {
        return ne.f.r(eVar);
    }

    @Override // oe.h
    public i f(int i10) {
        return n.of(i10);
    }

    @Override // oe.h
    public String h() {
        return "iso8601";
    }

    @Override // oe.h
    public String i() {
        return "ISO";
    }

    @Override // oe.h
    public c j(re.e eVar) {
        return ne.g.r(eVar);
    }

    @Override // oe.h
    public f l(ne.e eVar, ne.q qVar) {
        z.B(eVar, "instant");
        return ne.t.s(eVar.f33775c, eVar.f33776d, qVar);
    }

    @Override // oe.h
    public f m(re.e eVar) {
        return ne.t.t(eVar);
    }

    public boolean n(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }
}
