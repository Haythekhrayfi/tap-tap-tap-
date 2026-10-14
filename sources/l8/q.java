package l8;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p7.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i8.k f32751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f32752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.a.C0342a f32753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f32754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g9.f f32755e;

    public static final class a extends vc.l implements uc.l<Bitmap, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g9.f f32756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g9.f fVar) {
            super(1);
            this.f32756c = fVar;
        }

        @Override // uc.l
        public jc.w invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            fd.j0.i(bitmap2, "it");
            g9.f fVar = this.f32756c;
            Objects.requireNonNull(fVar);
            fd.j0.i(bitmap2, "bitmap");
            fVar.f30109d = bitmap2;
            fVar.f30112g = true;
            fVar.invalidateSelf();
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i8.k kVar, View view, p.a.C0342a c0342a, v9.d dVar, g9.f fVar) {
        super(kVar);
        this.f32751a = kVar;
        this.f32752b = view;
        this.f32753c = c0342a;
        this.f32754d = dVar;
        this.f32755e = fVar;
    }

    @Override // z7.c
    public void b(z7.b bVar) {
        ArrayList arrayList;
        g9.f.c cVar;
        Bitmap bitmap = bVar.f45158a;
        fd.j0.h(bitmap, "cachedBitmap.bitmap");
        View view = this.f32752b;
        List<p.a.C0342a.AbstractC0343a> list = this.f32753c.f32710g;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kc.m.j(list, 10));
            for (p.a.C0342a.AbstractC0343a abstractC0343a : list) {
                Objects.requireNonNull(abstractC0343a);
                if (!(abstractC0343a instanceof p.a.C0342a.AbstractC0343a.C0344a)) {
                    throw new jc.g();
                }
                arrayList.add(((p.a.C0342a.AbstractC0343a.C0344a) abstractC0343a).f32712b);
            }
        }
        x1.q.c(bitmap, view, arrayList, this.f32751a.getDiv2Component$div_release(), this.f32754d, new a(this.f32755e));
        this.f32755e.setAlpha((int) (this.f32753c.f32704a * ((double) 255)));
        g9.f fVar = this.f32755e;
        y9.h3 h3Var = this.f32753c.f32709f;
        fd.j0.i(h3Var, "<this>");
        int i10 = b.a.f32260f[h3Var.ordinal()];
        if (i10 == 1) {
            cVar = g9.f.c.FILL;
        } else if (i10 != 2) {
            cVar = i10 != 3 ? g9.f.c.NO_SCALE : g9.f.c.STRETCH;
        } else {
            cVar = g9.f.c.FIT;
        }
        Objects.requireNonNull(fVar);
        fd.j0.i(cVar, "<set-?>");
        fVar.f30106a = cVar;
        g9.f fVar2 = this.f32755e;
        y9.t tVar = this.f32753c.f32705b;
        fd.j0.i(tVar, "<this>");
        int i11 = b.a.f32256b[tVar.ordinal()];
        g9.f.a aVar = i11 != 2 ? i11 != 3 ? g9.f.a.LEFT : g9.f.a.RIGHT : g9.f.a.CENTER;
        Objects.requireNonNull(fVar2);
        fd.j0.i(aVar, "<set-?>");
        fVar2.f30107b = aVar;
        g9.f fVar3 = this.f32755e;
        y9.u uVar = this.f32753c.f32706c;
        fd.j0.i(uVar, "<this>");
        int i12 = b.a.f32257c[uVar.ordinal()];
        g9.f.b bVar2 = i12 != 2 ? i12 != 3 ? g9.f.b.TOP : g9.f.b.BOTTOM : g9.f.b.CENTER;
        Objects.requireNonNull(fVar3);
        fd.j0.i(bVar2, "<set-?>");
        fVar3.f30108c = bVar2;
    }
}
