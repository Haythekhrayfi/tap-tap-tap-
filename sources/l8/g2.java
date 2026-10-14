package l8;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.inscode.autoclicker.R;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.d f32389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.z f32390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.e f32391d;

    public static final class a extends vc.l implements uc.l<Drawable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o8.g f32392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o8.g gVar) {
            super(1);
            this.f32392c = gVar;
        }

        @Override // uc.l
        public jc.w invoke(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (!this.f32392c.j() && !this.f32392c.k()) {
                this.f32392c.setPlaceholder(drawable2);
            }
            return jc.w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<Bitmap, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o8.g f32393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g2 f32394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y9.d3 f32395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i8.k f32396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ v9.d f32397g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o8.g gVar, g2 g2Var, y9.d3 d3Var, i8.k kVar, v9.d dVar) {
            super(1);
            this.f32393c = gVar;
            this.f32394d = g2Var;
            this.f32395e = d3Var;
            this.f32396f = kVar;
            this.f32397g = dVar;
        }

        @Override // uc.l
        public jc.w invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (!this.f32393c.j()) {
                this.f32393c.setCurrentBitmapWithoutFilters$div_release(bitmap2);
                g2.a(this.f32394d, this.f32393c, this.f32395e.f39607r, this.f32396f, this.f32397g);
                this.f32393c.setTag(R.id.image_loaded_flag, Boolean.FALSE);
                g2 g2Var = this.f32394d;
                o8.g gVar = this.f32393c;
                v9.d dVar = this.f32397g;
                y9.d3 d3Var = this.f32395e;
                g2Var.c(gVar, dVar, d3Var.G, d3Var.H);
            }
            return jc.w.f31842a;
        }
    }

    public g2(v vVar, z7.d dVar, i8.z zVar, q8.e eVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(dVar, "imageLoader");
        fd.j0.i(zVar, "placeholderLoader");
        fd.j0.i(eVar, "errorCollectors");
        this.f32388a = vVar;
        this.f32389b = dVar;
        this.f32390c = zVar;
        this.f32391d = eVar;
    }

    public static final void a(g2 g2Var, o8.g gVar, List list, i8.k kVar, v9.d dVar) {
        Objects.requireNonNull(g2Var);
        Bitmap currentBitmapWithoutFilters$div_release = gVar.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release != null) {
            x1.q.c(currentBitmapWithoutFilters$div_release, gVar, list, kVar.getDiv2Component$div_release(), dVar, new e2(gVar));
        } else {
            gVar.setImageBitmap(null);
        }
    }

    public final void b(o8.g gVar, i8.k kVar, v9.d dVar, y9.d3 d3Var, q8.d dVar2, boolean z10) {
        v9.b<String> bVar = d3Var.C;
        String strB = bVar == null ? null : bVar.b(dVar);
        gVar.setPreview$div_release(strB);
        this.f32390c.a(gVar, dVar2, strB, d3Var.A.b(dVar).intValue(), z10, new a(gVar), new b(gVar, this, d3Var, kVar, dVar));
    }

    public final void c(ImageView imageView, v9.d dVar, v9.b<Integer> bVar, v9.b<y9.h0> bVar2) {
        Integer numB = bVar == null ? null : bVar.b(dVar);
        if (numB != null) {
            imageView.setColorFilter(numB.intValue(), l8.b.W(bVar2.b(dVar)));
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    public final boolean d(v9.d dVar, o8.g gVar, y9.d3 d3Var) {
        return !gVar.j() && d3Var.f39610u.b(dVar).booleanValue();
    }
}
