package l8;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import y9.q8;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.j0> f32480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.j f32481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.g f32482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<i8.u> f32483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q8.e f32484f;

    public static final class a extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y9.g0 f32485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v9.d f32486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y9.w0 f32487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f32488f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y9.g0 g0Var, v9.d dVar, y9.w0 w0Var, View view) {
            super(1);
            this.f32485c = g0Var;
            this.f32486d = dVar;
            this.f32487e = w0Var;
            this.f32488f = view;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0094  */
        @Override // uc.l
        public jc.w invoke(Object obj) {
            y9.t tVarB;
            fd.j0.i(obj, "$noName_0");
            v9.b<y9.t> bVarK = this.f32485c.k();
            y9.u uVarB = null;
            if (bVarK != null) {
                tVarB = bVarK.b(this.f32486d);
            } else if (l8.b.H(this.f32487e, this.f32486d)) {
                tVarB = null;
            } else {
                y9.y0 y0VarB = this.f32487e.f43630l.b(this.f32486d);
                fd.j0.i(y0VarB, "<this>");
                int i10 = l8.b.a.f32258d[y0VarB.ordinal()];
                if (i10 == 1) {
                    tVarB = y9.t.LEFT;
                } else if (i10 == 2) {
                    tVarB = y9.t.CENTER;
                } else if (i10 != 3) {
                    tVarB = y9.t.LEFT;
                } else {
                    tVarB = y9.t.RIGHT;
                }
            }
            v9.b<y9.u> bVarO = this.f32485c.o();
            if (bVarO != null) {
                uVarB = bVarO.b(this.f32486d);
            } else if (!l8.b.H(this.f32487e, this.f32486d)) {
                y9.z0 z0VarB = this.f32487e.f43631m.b(this.f32486d);
                fd.j0.i(z0VarB, "<this>");
                int i11 = l8.b.a.f32259e[z0VarB.ordinal()];
                if (i11 == 1) {
                    uVarB = y9.u.TOP;
                } else if (i11 == 2) {
                    uVarB = y9.u.CENTER;
                } else if (i11 == 3) {
                    uVarB = y9.u.BOTTOM;
                } else if (i11 != 4) {
                    uVarB = y9.u.TOP;
                } else {
                    uVarB = y9.u.BASELINE;
                }
            }
            l8.b.a(this.f32488f, tVarB, uVarB);
            return jc.w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<y9.y0, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.l<Integer, jc.w> f32489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y9.w0 f32490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f32491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(uc.l<? super Integer, jc.w> lVar, y9.w0 w0Var, v9.d dVar) {
            super(1);
            this.f32489c = lVar;
            this.f32490d = w0Var;
            this.f32491e = dVar;
        }

        @Override // uc.l
        public jc.w invoke(y9.y0 y0Var) {
            y9.y0 y0Var2 = y0Var;
            fd.j0.i(y0Var2, "it");
            this.f32489c.invoke(Integer.valueOf(l8.b.y(y0Var2, this.f32490d.f43631m.b(this.f32491e))));
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<y9.z0, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.l<Integer, jc.w> f32492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y9.w0 f32493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f32494e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(uc.l<? super Integer, jc.w> lVar, y9.w0 w0Var, v9.d dVar) {
            super(1);
            this.f32492c = lVar;
            this.f32493d = w0Var;
            this.f32494e = dVar;
        }

        @Override // uc.l
        public jc.w invoke(y9.z0 z0Var) {
            y9.z0 z0Var2 = z0Var;
            fd.j0.i(z0Var2, "it");
            this.f32492c.invoke(Integer.valueOf(l8.b.y(this.f32493d.f43630l.b(this.f32494e), z0Var2)));
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y9.w0.k f32495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v9.d f32496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ uc.l<Integer, jc.w> f32497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(y9.w0.k kVar, v9.d dVar, uc.l<? super Integer, jc.w> lVar) {
            super(1);
            this.f32495c = kVar;
            this.f32496d = dVar;
            this.f32497e = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // uc.l
        public jc.w invoke(Object obj) {
            fd.j0.i(obj, "$noName_0");
            boolean zBooleanValue = this.f32495c.f43661b.b(this.f32496d).booleanValue();
            ?? r10 = zBooleanValue;
            if (this.f32495c.f43662c.b(this.f32496d).booleanValue()) {
                r10 = (zBooleanValue ? 1 : 0) | 2;
            }
            int i10 = r10;
            if (this.f32495c.f43660a.b(this.f32496d).booleanValue()) {
                i10 = (r10 == true ? 1 : 0) | 4;
            }
            this.f32497e.invoke(Integer.valueOf(i10));
            return jc.w.f31842a;
        }
    }

    public j1(v vVar, ic.a<i8.j0> aVar, s7.j jVar, s7.g gVar, ic.a<i8.u> aVar2, q8.e eVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(aVar, "divViewCreator");
        fd.j0.i(jVar, "divPatchManager");
        fd.j0.i(gVar, "divPatchCache");
        fd.j0.i(aVar2, "divBinder");
        fd.j0.i(eVar, "errorCollectors");
        this.f32479a = vVar;
        this.f32480b = aVar;
        this.f32481c = jVar;
        this.f32482d = gVar;
        this.f32483e = aVar2;
        this.f32484f = eVar;
    }

    public final void a(q8.d dVar, String str, String str2) {
        String strA;
        if (str == null || (strA = a1.a(" with id='", str, CoreConstants.SINGLE_QUOTE_CHAR)) == null) {
            strA = "";
        }
        String str3 = String.format("Incorrect child size. Container with wrap layout mode contains child%s with %s size along the cross axis.", Arrays.copyOf(new Object[]{strA, str2}, 2));
        fd.j0.h(str3, "format(this, *args)");
        dVar.b(new Throwable(str3));
    }

    public final void b(y9.l6 l6Var, y9.g0 g0Var, v9.d dVar, q8.d dVar2) {
        String id2;
        String str;
        Object objA = l6Var.a();
        if (objA instanceof y9.i4) {
            id2 = g0Var.getId();
            str = "match parent";
        } else {
            if (!(objA instanceof q8)) {
                return;
            }
            v9.b<Boolean> bVar = ((q8) objA).f42192a;
            boolean z10 = false;
            if (bVar != null && bVar.b(dVar).booleanValue()) {
                z10 = true;
            }
            if (!z10) {
                return;
            }
            id2 = g0Var.getId();
            str = "wrap content with constrained=true";
        }
        a(dVar2, id2, str);
    }

    public final void c(y9.w0 w0Var, y9.g0 g0Var, View view, v9.d dVar, f9.b bVar) {
        a aVar = new a(g0Var, dVar, w0Var, view);
        bVar.d(w0Var.f43630l.e(dVar, aVar));
        bVar.d(w0Var.f43631m.e(dVar, aVar));
        bVar.d(w0Var.f43643y.e(dVar, aVar));
        aVar.invoke(view);
    }

    public final void d(f9.b bVar, y9.w0 w0Var, v9.d dVar, uc.l<? super Integer, jc.w> lVar) {
        bVar.d(w0Var.f43630l.f(dVar, new b(lVar, w0Var, dVar)));
        bVar.d(w0Var.f43631m.f(dVar, new c(lVar, w0Var, dVar)));
    }

    public final void e(f9.b bVar, y9.w0.k kVar, v9.d dVar, uc.l<? super Integer, jc.w> lVar) {
        d dVar2 = new d(kVar, dVar, lVar);
        bVar.d(kVar.f43661b.e(dVar, dVar2));
        bVar.d(kVar.f43662c.e(dVar, dVar2));
        bVar.d(kVar.f43660a.e(dVar, dVar2));
        dVar2.invoke(jc.w.f31842a);
    }
}
