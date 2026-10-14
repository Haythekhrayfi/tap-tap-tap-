package h8;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.core.view2.divs.DivBackgroundSpan;
import fd.j0;
import java.util.ArrayList;
import jc.f;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.d f30960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<DivBackgroundSpan> f30961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f30962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f30963e;

    public static final class a extends l implements uc.a<d> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public d invoke() {
            b bVar = b.this;
            return new d(bVar.f30959a, bVar.f30960b);
        }
    }

    /* JADX INFO: renamed from: h8.b$b, reason: collision with other inner class name */
    public static final class C0301b extends l implements uc.a<e> {
        public C0301b() {
            super(0);
        }

        @Override // uc.a
        public e invoke() {
            b bVar = b.this;
            return new e(bVar.f30959a, bVar.f30960b);
        }
    }

    public b(View view, v9.d dVar) {
        j0.i(view, "view");
        j0.i(dVar, "resolver");
        this.f30959a = view;
        this.f30960b = dVar;
        this.f30961c = new ArrayList<>();
        this.f30962d = f.b(new C0301b());
        this.f30963e = f.b(new a());
    }

    public final void a(Canvas canvas, Spanned spanned, Layout layout) {
        j0.i(spanned, "text");
        for (DivBackgroundSpan divBackgroundSpan : this.f30961c) {
            int spanStart = spanned.getSpanStart(divBackgroundSpan);
            int spanEnd = spanned.getSpanEnd(divBackgroundSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            ((c) (lineForOffset == lineForOffset2 ? this.f30962d.getValue() : this.f30963e.getValue())).a(canvas, layout, lineForOffset, lineForOffset2, (int) layout.getPrimaryHorizontal(spanStart), (int) layout.getPrimaryHorizontal(spanEnd), divBackgroundSpan.f13419c, divBackgroundSpan.f13420d);
        }
    }
}
