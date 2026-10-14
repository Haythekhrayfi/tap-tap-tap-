package i8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class j0 extends f9.a<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f31349d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9.g f31351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f31352c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public j0(Context context, l9.g gVar, g0 g0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(gVar, "viewPool");
        fd.j0.i(g0Var, "validator");
        this.f31350a = context;
        this.f31351b = gVar;
        this.f31352c = g0Var;
        gVar.a("DIV2.TEXT_VIEW", new i0(this, 0), 20);
        gVar.a("DIV2.IMAGE_VIEW", new i0(this, 8), 20);
        gVar.a("DIV2.IMAGE_GIF_VIEW", new i0(this, 9), 3);
        gVar.a("DIV2.OVERLAP_CONTAINER_VIEW", new i0(this, 10), 8);
        gVar.a("DIV2.LINEAR_CONTAINER_VIEW", new i0(this, 11), 12);
        gVar.a("DIV2.WRAP_CONTAINER_VIEW", new i0(this, 12), 4);
        gVar.a("DIV2.GRID_VIEW", new i0(this, 13), 4);
        gVar.a("DIV2.GALLERY_VIEW", new i0(this, 14), 6);
        gVar.a("DIV2.PAGER_VIEW", new i0(this, 15), 2);
        gVar.a("DIV2.TAB_VIEW", new i0(this, 16), 2);
        gVar.a("DIV2.STATE", new i0(this, 1), 4);
        gVar.a("DIV2.CUSTOM", new i0(this, 2), 2);
        gVar.a("DIV2.INDICATOR", new i0(this, 3), 2);
        gVar.a("DIV2.SLIDER", new i0(this, 4), 2);
        gVar.a("DIV2.INPUT", new i0(this, 5), 2);
        gVar.a("DIV2.SELECT", new i0(this, 6), 2);
        gVar.a("DIV2.VIDEO", new i0(this, 7), 2);
    }

    @Override // f9.a
    public View b(y9.k.c cVar, v9.d dVar) {
        ViewGroup viewGroup = (ViewGroup) a(cVar, dVar);
        Iterator<T> it = cVar.f40976c.f43638t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(n((y9.k) it.next(), dVar));
        }
        return viewGroup;
    }

    @Override // f9.a
    public View f(y9.k.g gVar, v9.d dVar) {
        ViewGroup viewGroup = (ViewGroup) a(gVar, dVar);
        Iterator<T> it = gVar.f40980c.f39044t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(n((y9.k) it.next(), dVar));
        }
        return viewGroup;
    }

    @Override // f9.a
    public View i(y9.k.m mVar, v9.d dVar) {
        return new o8.o(this.f31350a, null, 0, 6, null);
    }

    public View n(y9.k kVar, v9.d dVar) {
        fd.j0.i(kVar, "div");
        fd.j0.i(dVar, "resolver");
        g0 g0Var = this.f31352c;
        Objects.requireNonNull(g0Var);
        return g0Var.m(kVar, dVar).booleanValue() ? m(kVar, dVar) : new Space(this.f31350a);
    }

    @Override // f9.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public View a(y9.k kVar, v9.d dVar) {
        String str;
        fd.j0.i(kVar, "data");
        fd.j0.i(dVar, "resolver");
        l9.g gVar = this.f31351b;
        Objects.requireNonNull(f31349d);
        if (kVar instanceof y9.k.c) {
            y9.k.c cVar = (y9.k.c) kVar;
            if (l8.b.H(cVar.f40976c, dVar)) {
                str = "DIV2.WRAP_CONTAINER_VIEW";
            } else {
                str = cVar.f40976c.f43643y.b(dVar) == y9.w0.j.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
        } else if (kVar instanceof y9.k.d) {
            str = "DIV2.CUSTOM";
        } else if (kVar instanceof y9.k.e) {
            str = "DIV2.GALLERY_VIEW";
        } else if (kVar instanceof y9.k.f) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (kVar instanceof y9.k.g) {
            str = "DIV2.GRID_VIEW";
        } else if (kVar instanceof y9.k.h) {
            str = "DIV2.IMAGE_VIEW";
        } else if (kVar instanceof y9.k.i) {
            str = "DIV2.INDICATOR";
        } else if (kVar instanceof y9.k.j) {
            str = "DIV2.INPUT";
        } else if (kVar instanceof y9.k.C0475k) {
            str = "DIV2.PAGER_VIEW";
        } else if (kVar instanceof y9.k.l) {
            str = "DIV2.SELECT";
        } else if (kVar instanceof y9.k.n) {
            str = "DIV2.SLIDER";
        } else if (kVar instanceof y9.k.o) {
            str = "DIV2.STATE";
        } else if (kVar instanceof y9.k.p) {
            str = "DIV2.TAB_VIEW";
        } else if (kVar instanceof y9.k.q) {
            str = "DIV2.TEXT_VIEW";
        } else if (kVar instanceof y9.k.r) {
            str = "DIV2.VIDEO";
        } else {
            if (!(kVar instanceof y9.k.m)) {
                throw new jc.g();
            }
            str = "";
        }
        return gVar.b(str);
    }
}
