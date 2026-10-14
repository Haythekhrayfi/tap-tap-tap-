package p;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    @Override // p.c
    public void a(b bVar, ColorStateList colorStateList) {
        d dVarO = o(bVar);
        dVarO.b(colorStateList);
        dVarO.invalidateSelf();
    }

    @Override // p.c
    public ColorStateList b(b bVar) {
        return o(bVar).f34330h;
    }

    @Override // p.c
    public float c(b bVar) {
        return o(bVar).f34323a * 2.0f;
    }

    @Override // p.c
    public void d(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f10 = o(bVar).f34327e;
        float f11 = o(bVar).f34323a;
        int iCeil = (int) Math.ceil(e.a(f10, f11, aVar.a()));
        int iCeil2 = (int) Math.ceil(e.b(f10, f11, aVar.a()));
        aVar.b(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p.c
    public float e(b bVar) {
        return CardView.this.getElevation();
    }

    @Override // p.c
    public float f(b bVar) {
        return o(bVar).f34327e;
    }

    @Override // p.c
    public void g(b bVar, float f10) {
        CardView.this.setElevation(f10);
    }

    @Override // p.c
    public void h(b bVar) {
        m(bVar, o(bVar).f34327e);
    }

    @Override // p.c
    public void i(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        d dVar = new d(colorStateList, f10);
        CardView.a aVar = (CardView.a) bVar;
        aVar.f1421a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f11);
        m(bVar, f12);
    }

    @Override // p.c
    public float j(b bVar) {
        return o(bVar).f34323a;
    }

    @Override // p.c
    public void k(b bVar) {
        m(bVar, o(bVar).f34327e);
    }

    @Override // p.c
    public float l(b bVar) {
        return o(bVar).f34323a * 2.0f;
    }

    @Override // p.c
    public void m(b bVar, float f10) {
        d dVarO = o(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean zA = aVar.a();
        if (f10 != dVarO.f34327e || dVarO.f34328f != useCompatPadding || dVarO.f34329g != zA) {
            dVarO.f34327e = f10;
            dVarO.f34328f = useCompatPadding;
            dVarO.f34329g = zA;
            dVarO.c(null);
            dVarO.invalidateSelf();
        }
        d(bVar);
    }

    @Override // p.c
    public void n(b bVar, float f10) {
        d dVarO = o(bVar);
        if (f10 == dVarO.f34323a) {
            return;
        }
        dVarO.f34323a = f10;
        dVarO.c(null);
        dVarO.invalidateSelf();
    }

    public final d o(b bVar) {
        return (d) ((CardView.a) bVar).f1421a;
    }
}
