package s3;

import android.graphics.Bitmap;

/* JADX WARN: Unexpected interfaces in signature: [g3.r] */
/* JADX INFO: loaded from: classes.dex */
public class e extends q3.b<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // g3.u
    public void a() {
        ((c) this.f34771c).stop();
        c cVar = (c) this.f34771c;
        cVar.f35416f = true;
        g gVar = cVar.f35413c.f35423a;
        gVar.f35427c.clear();
        Bitmap bitmap = gVar.f35436l;
        if (bitmap != null) {
            gVar.f35429e.d(bitmap);
            gVar.f35436l = null;
        }
        gVar.f35430f = false;
        g.a aVar = gVar.f35433i;
        if (aVar != null) {
            gVar.f35428d.i(aVar);
            gVar.f35433i = null;
        }
        g.a aVar2 = gVar.f35435k;
        if (aVar2 != null) {
            gVar.f35428d.i(aVar2);
            gVar.f35435k = null;
        }
        g.a aVar3 = gVar.f35438n;
        if (aVar3 != null) {
            gVar.f35428d.i(aVar3);
            gVar.f35438n = null;
        }
        gVar.f35425a.clear();
        gVar.f35434j = true;
    }

    @Override // g3.u
    public Class<c> b() {
        return c.class;
    }

    @Override // g3.u
    public int getSize() {
        g gVar = ((c) this.f34771c).f35413c.f35423a;
        return b4.j.c(gVar.a().getWidth(), gVar.a().getHeight(), gVar.a().getConfig()) + gVar.f35425a.g();
    }

    @Override // q3.b, g3.r
    public void initialize() {
        ((c) this.f34771c).b().prepareToDraw();
    }
}
