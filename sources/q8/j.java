package q8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p7.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f34824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f34825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f34826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f34827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f34828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p7.d f34829h;

    public static final class a extends vc.l implements uc.l<m, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(m mVar) {
            String str;
            m mVar2 = mVar;
            j0.i(mVar2, "m");
            j jVar = j.this;
            m mVar3 = jVar.f34828g;
            if (mVar3 == null || mVar3.f34833a != mVar2.f34833a) {
                ViewGroup viewGroup = jVar.f34826e;
                if (viewGroup != null) {
                    jVar.f34824c.removeView(viewGroup);
                }
                jVar.f34826e = null;
                b bVar = jVar.f34827f;
                if (bVar != null) {
                    jVar.f34824c.removeView(bVar);
                }
                jVar.f34827f = null;
            }
            if (mVar2.f34833a) {
                if (jVar.f34827f == null) {
                    Context context = jVar.f34824c.getContext();
                    j0.h(context, "root.context");
                    b bVar2 = new b(context, new k(jVar), new l(jVar));
                    jVar.f34824c.addView(bVar2, new ViewGroup.LayoutParams(-1, -1));
                    jVar.f34827f = bVar2;
                }
                b bVar3 = jVar.f34827f;
                if (bVar3 != null) {
                    if (mVar2.f34834b <= 0 || mVar2.f34835c <= 0) {
                        str = mVar2.f34835c > 0 ? mVar2.f34837e : mVar2.f34836d;
                    } else {
                        str = mVar2.f34836d + "\n\n" + mVar2.f34837e;
                    }
                    j0.i(str, "value");
                    bVar3.f34803e.setText(str);
                }
            } else {
                boolean z10 = mVar2.b().length() > 0;
                int i10 = R.drawable.error_counter_background;
                if (!z10) {
                    ViewGroup viewGroup2 = jVar.f34826e;
                    if (viewGroup2 != null) {
                        jVar.f34824c.removeView(viewGroup2);
                    }
                    jVar.f34826e = null;
                } else if (jVar.f34826e == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(jVar.f34824c.getContext());
                    appCompatTextView.setBackgroundResource(R.drawable.error_counter_background);
                    appCompatTextView.setTextSize(12.0f);
                    appCompatTextView.setTextColor(-16777216);
                    appCompatTextView.setGravity(17);
                    appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R.dimen.div_shadow_elevation));
                    appCompatTextView.setOnClickListener(new y6.d(jVar));
                    int iB = k9.i.b(24);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iB, iB);
                    int iB2 = k9.i.b(8);
                    marginLayoutParams.topMargin = iB2;
                    marginLayoutParams.leftMargin = iB2;
                    marginLayoutParams.rightMargin = iB2;
                    marginLayoutParams.bottomMargin = iB2;
                    Context context2 = jVar.f34824c.getContext();
                    j0.h(context2, "root.context");
                    m9.g gVar = new m9.g(context2, null, 0, 6, null);
                    gVar.addView(appCompatTextView, marginLayoutParams);
                    jVar.f34824c.addView(gVar, -1, -1);
                    jVar.f34826e = gVar;
                }
                ViewGroup viewGroup3 = jVar.f34826e;
                View childAt = viewGroup3 == null ? null : viewGroup3.getChildAt(0);
                AppCompatTextView appCompatTextView2 = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setText(mVar2.b());
                    int i11 = mVar2.f34835c;
                    if (i11 > 0 && mVar2.f34834b > 0) {
                        i10 = R.drawable.warning_error_counter_background;
                    } else if (i11 > 0) {
                        i10 = R.drawable.warning_counter_background;
                    }
                    appCompatTextView2.setBackgroundResource(i10);
                }
            }
            jVar.f34828g = mVar2;
            return w.f31842a;
        }
    }

    public j(ViewGroup viewGroup, h hVar) {
        j0.i(viewGroup, "root");
        j0.i(hVar, "errorModel");
        this.f34824c = viewGroup;
        this.f34825d = hVar;
        a aVar = new a();
        Objects.requireNonNull(hVar);
        j0.i(aVar, "observer");
        hVar.f34816b.add(aVar);
        aVar.invoke(hVar.f34821g);
        this.f34829h = new c(hVar, aVar);
    }

    @Override // p7.d, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.f34829h.close();
        this.f34824c.removeView(this.f34826e);
        this.f34824c.removeView(this.f34827f);
    }
}
