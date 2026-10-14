package w;

/* JADX INFO: loaded from: classes.dex */
public class k extends q {
    public k(v.f fVar) {
        super(fVar);
        fVar.f36581d.f();
        fVar.f36583e.f();
        this.f37075f = ((v.i) fVar).U0;
    }

    @Override // w.q, w.d
    public void a(d dVar) {
        g gVar = this.f37077h;
        if (gVar.f37042c && !gVar.f37049j) {
            this.f37077h.c((int) ((gVar.f37051l.get(0).f37046g * ((v.i) this.f37071b).P0) + 0.5f));
        }
    }

    @Override // w.q
    public void d() {
        q qVar;
        v.f fVar = this.f37071b;
        v.i iVar = (v.i) fVar;
        int i10 = iVar.Q0;
        int i11 = iVar.R0;
        if (iVar.U0 == 1) {
            g gVar = this.f37077h;
            if (i10 != -1) {
                gVar.f37051l.add(fVar.Y.f36581d.f37077h);
                this.f37071b.Y.f36581d.f37077h.f37050k.add(this.f37077h);
                this.f37077h.f37045f = i10;
            } else if (i11 != -1) {
                gVar.f37051l.add(fVar.Y.f36581d.f37078i);
                this.f37071b.Y.f36581d.f37078i.f37050k.add(this.f37077h);
                this.f37077h.f37045f = -i11;
            } else {
                gVar.f37041b = true;
                gVar.f37051l.add(fVar.Y.f36581d.f37078i);
                this.f37071b.Y.f36581d.f37078i.f37050k.add(this.f37077h);
            }
            m(this.f37071b.f36581d.f37077h);
            qVar = this.f37071b.f36581d;
        } else {
            g gVar2 = this.f37077h;
            if (i10 != -1) {
                gVar2.f37051l.add(fVar.Y.f36583e.f37077h);
                this.f37071b.Y.f36583e.f37077h.f37050k.add(this.f37077h);
                this.f37077h.f37045f = i10;
            } else if (i11 != -1) {
                gVar2.f37051l.add(fVar.Y.f36583e.f37078i);
                this.f37071b.Y.f36583e.f37078i.f37050k.add(this.f37077h);
                this.f37077h.f37045f = -i11;
            } else {
                gVar2.f37041b = true;
                gVar2.f37051l.add(fVar.Y.f36583e.f37078i);
                this.f37071b.Y.f36583e.f37078i.f37050k.add(this.f37077h);
            }
            m(this.f37071b.f36583e.f37077h);
            qVar = this.f37071b.f36583e;
        }
        m(qVar.f37078i);
    }

    @Override // w.q
    public void e() {
        v.f fVar = this.f37071b;
        if (((v.i) fVar).U0 == 1) {
            fVar.f36582d0 = this.f37077h.f37046g;
        } else {
            fVar.f36584e0 = this.f37077h.f37046g;
        }
    }

    @Override // w.q
    public void f() {
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
