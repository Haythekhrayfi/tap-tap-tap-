package i3;

import g3.l;
import g3.u;

/* JADX INFO: loaded from: classes.dex */
public class g extends b4.g<d3.c, u<?>> implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.a f31229d;

    public g(long j10) {
        super(j10);
    }

    @Override // b4.g
    public int b(u<?> uVar) {
        u<?> uVar2 = uVar;
        if (uVar2 == null) {
            return 1;
        }
        return uVar2.getSize();
    }

    @Override // b4.g
    public void c(d3.c cVar, u<?> uVar) {
        u<?> uVar2 = uVar;
        h.a aVar = this.f31229d;
        if (aVar == null || uVar2 == null) {
            return;
        }
        ((l) aVar).f29868e.a(uVar2);
    }
}
