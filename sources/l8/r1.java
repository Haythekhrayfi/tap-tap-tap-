package l8;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f32786a;

    public final class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i8.k f32787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.d f32788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y9.k0 f32789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y9.k0 f32790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<? extends y9.q> f32791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<? extends y9.q> f32792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r1 f32793g;

        public a(r1 r1Var, i8.k kVar, v9.d dVar) {
            fd.j0.i(r1Var, "this$0");
            fd.j0.i(kVar, "divView");
            fd.j0.i(dVar, "resolver");
            this.f32793g = r1Var;
            this.f32787a = kVar;
            this.f32788b = dVar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            List<? extends y9.q> list;
            j jVar;
            i8.k kVar;
            String str;
            y9.k0 k0Var;
            fd.j0.i(view, "v");
            if (z10) {
                y9.k0 k0Var2 = this.f32789c;
                if (k0Var2 != null) {
                    this.f32793g.a(view, k0Var2, this.f32788b);
                }
                list = this.f32791e;
                if (list == null) {
                    return;
                }
                jVar = this.f32793g.f32786a;
                kVar = this.f32787a;
                str = "focus";
            } else {
                if (this.f32789c != null && (k0Var = this.f32790d) != null) {
                    this.f32793g.a(view, k0Var, this.f32788b);
                }
                list = this.f32792f;
                if (list == null) {
                    return;
                }
                jVar = this.f32793g.f32786a;
                kVar = this.f32787a;
                str = "blur";
            }
            jVar.c(kVar, view, list, str);
        }
    }

    public r1(j jVar) {
        fd.j0.i(jVar, "actionBinder");
        this.f32786a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, y9.k0 k0Var, v9.d dVar) {
        if (view instanceof o8.c) {
            ((o8.c) view).a(k0Var, dVar);
            return;
        }
        boolean zF = b.F(k0Var);
        float dimension = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (!zF && k0Var.f40998c.b(dVar).booleanValue() && k0Var.f40999d == null) {
            dimension = view.getResources().getDimension(R.dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
    }
}
