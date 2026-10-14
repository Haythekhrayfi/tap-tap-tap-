package w;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l extends q {
    public l(v.f fVar) {
        super(fVar);
    }

    @Override // w.q, w.d
    public void a(d dVar) {
        v.a aVar = (v.a) this.f37071b;
        int i10 = aVar.R0;
        int i11 = 0;
        Iterator<g> it = this.f37077h.f37051l.iterator();
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = it.next().f37046g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            this.f37077h.c(i12 + aVar.T0);
        } else {
            this.f37077h.c(i11 + aVar.T0);
        }
    }

    @Override // w.q
    public void d() {
        q qVar;
        v.f fVar = this.f37071b;
        if (fVar instanceof v.a) {
            g gVar = this.f37077h;
            gVar.f37041b = true;
            v.a aVar = (v.a) fVar;
            int i10 = aVar.R0;
            boolean z10 = aVar.S0;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        gVar.f37044e = g.a.TOP;
                        while (i11 < aVar.Q0) {
                            v.f fVar2 = aVar.P0[i11];
                            if (z10 || fVar2.f36608q0 != 8) {
                                g gVar2 = fVar2.f36583e.f37077h;
                                gVar2.f37050k.add(this.f37077h);
                                this.f37077h.f37051l.add(gVar2);
                            }
                            i11++;
                        }
                    } else {
                        if (i10 != 3) {
                            return;
                        }
                        gVar.f37044e = g.a.BOTTOM;
                        while (i11 < aVar.Q0) {
                            v.f fVar3 = aVar.P0[i11];
                            if (z10 || fVar3.f36608q0 != 8) {
                                g gVar3 = fVar3.f36583e.f37078i;
                                gVar3.f37050k.add(this.f37077h);
                                this.f37077h.f37051l.add(gVar3);
                            }
                            i11++;
                        }
                    }
                    m(this.f37071b.f36583e.f37077h);
                    qVar = this.f37071b.f36583e;
                } else {
                    gVar.f37044e = g.a.RIGHT;
                    while (i11 < aVar.Q0) {
                        v.f fVar4 = aVar.P0[i11];
                        if (z10 || fVar4.f36608q0 != 8) {
                            g gVar4 = fVar4.f36581d.f37078i;
                            gVar4.f37050k.add(this.f37077h);
                            this.f37077h.f37051l.add(gVar4);
                        }
                        i11++;
                    }
                }
                m(qVar.f37078i);
            }
            gVar.f37044e = g.a.LEFT;
            while (i11 < aVar.Q0) {
                v.f fVar5 = aVar.P0[i11];
                if (z10 || fVar5.f36608q0 != 8) {
                    g gVar5 = fVar5.f36581d.f37077h;
                    gVar5.f37050k.add(this.f37077h);
                    this.f37077h.f37051l.add(gVar5);
                }
                i11++;
            }
            m(this.f37071b.f36581d.f37077h);
            qVar = this.f37071b.f36581d;
            m(qVar.f37078i);
        }
    }

    @Override // w.q
    public void e() {
        v.f fVar = this.f37071b;
        if (fVar instanceof v.a) {
            int i10 = ((v.a) fVar).R0;
            if (i10 == 0 || i10 == 1) {
                fVar.f36582d0 = this.f37077h.f37046g;
            } else {
                fVar.f36584e0 = this.f37077h.f37046g;
            }
        }
    }

    @Override // w.q
    public void f() {
        this.f37072c = null;
        this.f37077h.b();
    }

    @Override // w.q
    public boolean k() {
        return false;
    }

    public final void m(g gVar) {
        this.f37077h.f37050k.add(gVar);
        gVar.f37051l.add(this.f37077h);
    }
}
