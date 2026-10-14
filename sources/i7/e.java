package i7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final long a(v6.a aVar, r6.d dVar, int i10) {
        j0.i(aVar, "recording");
        xe.a.f37601c.a("Calculating time left of recording - repetition: " + i10, new Object[0]);
        v6.a aVarA = v6.a.a(aVar, null, aVar.b().subList(Math.min(aVar.b().indexOf(dVar), aVar.b().size()), aVar.b().size()), 0L, 0L, 0, 1L, 0.0d, 93);
        return (v6.a.a(aVar, null, null, 0L, 0L, 0, 1L, 0.0d, 95).c() * Math.max(0L, Math.max(1L, aVar.f()) - ((long) i10))) + aVarA.c();
    }
}
