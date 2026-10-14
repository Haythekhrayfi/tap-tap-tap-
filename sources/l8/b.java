package l8;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import y9.c7;
import y9.o8;
import y9.q8;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f32257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f32258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f32259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f32260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f32261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f32262h;

        static {
            int[] iArr = new int[y9.n6.values().length];
            iArr[y9.n6.DP.ordinal()] = 1;
            iArr[y9.n6.SP.ordinal()] = 2;
            iArr[y9.n6.PX.ordinal()] = 3;
            f32255a = iArr;
            int[] iArr2 = new int[y9.t.values().length];
            iArr2[y9.t.LEFT.ordinal()] = 1;
            iArr2[y9.t.CENTER.ordinal()] = 2;
            iArr2[y9.t.RIGHT.ordinal()] = 3;
            f32256b = iArr2;
            int[] iArr3 = new int[y9.u.values().length];
            iArr3[y9.u.TOP.ordinal()] = 1;
            iArr3[y9.u.CENTER.ordinal()] = 2;
            iArr3[y9.u.BOTTOM.ordinal()] = 3;
            f32257c = iArr3;
            int[] iArr4 = new int[y9.y0.values().length];
            iArr4[y9.y0.LEFT.ordinal()] = 1;
            iArr4[y9.y0.CENTER.ordinal()] = 2;
            iArr4[y9.y0.RIGHT.ordinal()] = 3;
            f32258d = iArr4;
            int[] iArr5 = new int[y9.z0.values().length];
            iArr5[y9.z0.TOP.ordinal()] = 1;
            iArr5[y9.z0.CENTER.ordinal()] = 2;
            iArr5[y9.z0.BOTTOM.ordinal()] = 3;
            iArr5[y9.z0.BASELINE.ordinal()] = 4;
            f32259e = iArr5;
            int[] iArr6 = new int[y9.h3.values().length];
            iArr6[y9.h3.FILL.ordinal()] = 1;
            iArr6[y9.h3.FIT.ordinal()] = 2;
            iArr6[y9.h3.STRETCH.ordinal()] = 3;
            iArr6[y9.h3.NO_SCALE.ordinal()] = 4;
            f32260f = iArr6;
            int[] iArr7 = new int[y9.h0.values().length];
            iArr7[y9.h0.SOURCE_IN.ordinal()] = 1;
            iArr7[y9.h0.SOURCE_ATOP.ordinal()] = 2;
            iArr7[y9.h0.DARKEN.ordinal()] = 3;
            iArr7[y9.h0.LIGHTEN.ordinal()] = 4;
            iArr7[y9.h0.MULTIPLY.ordinal()] = 5;
            iArr7[y9.h0.SCREEN.ordinal()] = 6;
            f32261g = iArr7;
            int[] iArr8 = new int[y9.q2.values().length];
            iArr8[y9.q2.LIGHT.ordinal()] = 1;
            iArr8[y9.q2.REGULAR.ordinal()] = 2;
            iArr8[y9.q2.MEDIUM.ordinal()] = 3;
            iArr8[y9.q2.BOLD.ordinal()] = 4;
            f32262h = iArr8;
        }
    }

    /* JADX INFO: renamed from: l8.b$b, reason: collision with other inner class name */
    public static final class RunnableC0339b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f32264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y9.g0 f32265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ v9.d f32266f;

        public RunnableC0339b(View view, View view2, y9.g0 g0Var, v9.d dVar) {
            this.f32263c = view;
            this.f32264d = view2;
            this.f32265e = g0Var;
            this.f32266f = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f32264d;
            view.setPivotX(b.C(view.getWidth(), this.f32265e.a().f44791a, this.f32266f));
            View view2 = this.f32264d;
            view2.setPivotY(b.C(view2.getHeight(), this.f32265e.a().f44792b, this.f32266f));
        }
    }

    public static final class c extends vc.l implements uc.l<Double, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(1);
            this.f32267c = view;
        }

        @Override // uc.l
        public jc.w invoke(Double d10) {
            ((u8.d) this.f32267c).setAspectRatio((float) d10.doubleValue());
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.l<y9.v1, jc.w> f32268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y9.v1 f32269d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(uc.l<? super y9.v1, jc.w> lVar, y9.v1 v1Var) {
            super(1);
            this.f32268c = lVar;
            this.f32269d = v1Var;
        }

        @Override // uc.l
        public jc.w invoke(Object obj) {
            fd.j0.i(obj, "$noName_0");
            this.f32268c.invoke(this.f32269d);
            return jc.w.f31842a;
        }
    }

    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f32270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f32271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i8.q0 f32272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i8.k f32273f;

        public e(ViewGroup viewGroup, List list, i8.q0 q0Var, i8.k kVar) {
            this.f32270c = viewGroup;
            this.f32271d = list;
            this.f32272e = q0Var;
            this.f32273f = kVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            fd.j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            dd.g<View> gVarB = p0.i0.b(this.f32270c);
            dd.g gVarN = kc.t.n(this.f32271d);
            fd.j0.i(gVarB, "<this>");
            fd.j0.i(gVarN, "other");
            dd.f fVar = new dd.f(gVarB, gVarN, dd.p.f28953c);
            Iterator it = fVar.f28942a.iterator();
            Iterator it2 = fVar.f28943b.iterator();
            while (true) {
                if (!(it.hasNext() && it2.hasNext())) {
                    return;
                }
                jc.h hVar = (jc.h) fVar.f28944c.invoke((T1) it.next(), (T2) it2.next());
                View view2 = (View) hVar.f31811c;
                y9.k kVar = (y9.k) hVar.f31812d;
                this.f32272e.d(this.f32273f, view2, kVar, (8 & 8) != 0 ? b.A(kVar.a()) : null);
            }
        }
    }

    public static final List<o8> A(y9.g0 g0Var) {
        fd.j0.i(g0Var, "<this>");
        List<o8> listC = g0Var.c();
        if (listC != null) {
            return listC;
        }
        o8 o8VarN = g0Var.n();
        List<o8> listA = o8VarN == null ? null : kc.k.a(o8VarN);
        return listA == null ? kc.w.f32009c : listA;
    }

    public static final boolean B(y9.g0 g0Var) {
        fd.j0.i(g0Var, "<this>");
        if (g0Var.n() == null) {
            List<o8> listC = g0Var.c();
            if (listC == null || listC.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final float C(int i10, y9.z4 z4Var, v9.d dVar) {
        u9.a aVar;
        Long lB;
        Objects.requireNonNull(z4Var);
        if (z4Var instanceof y9.z4.c) {
            aVar = ((y9.z4.c) z4Var).f44618c;
        } else {
            if (!(z4Var instanceof y9.z4.d)) {
                throw new jc.g();
            }
            aVar = ((y9.z4.d) z4Var).f44619c;
        }
        if (!(aVar instanceof y9.a5)) {
            return aVar instanceof y9.c5 ? i10 * (((float) ((y9.c5) aVar).f39512a.b(dVar).doubleValue()) / 100.0f) : i10 / 2.0f;
        }
        y9.a5 a5Var = (y9.a5) aVar;
        v9.b<Long> bVar = a5Var.f39065b;
        Float fValueOf = null;
        if (bVar != null && (lB = bVar.b(dVar)) != null) {
            fValueOf = Float.valueOf(lB.longValue());
        }
        if (fValueOf == null) {
            return i10 / 2.0f;
        }
        float fFloatValue = fValueOf.floatValue();
        int i11 = a.f32255a[a5Var.f39064a.b(dVar).ordinal()];
        if (i11 == 1) {
            return k9.i.a(fFloatValue);
        }
        if (i11 == 2) {
            return fFloatValue * k9.i.f31952a.scaledDensity;
        }
        if (i11 == 3) {
            return fFloatValue;
        }
        throw new jc.g();
    }

    public static final Typeface D(y9.q2 q2Var, y7.a aVar) {
        fd.j0.i(q2Var, "fontWeight");
        fd.j0.i(aVar, "typefaceProvider");
        int i10 = a.f32262h[q2Var.ordinal()];
        if (i10 == 1) {
            Typeface light = aVar.getLight();
            if (light != null) {
                return light;
            }
            Typeface typeface = Typeface.DEFAULT;
            fd.j0.h(typeface, "DEFAULT");
            return typeface;
        }
        if (i10 == 2) {
            Typeface regular = aVar.getRegular();
            if (regular != null) {
                return regular;
            }
            Typeface typeface2 = Typeface.DEFAULT;
            fd.j0.h(typeface2, "DEFAULT");
            return typeface2;
        }
        if (i10 == 3) {
            Typeface medium = aVar.getMedium();
            if (medium != null) {
                return medium;
            }
            Typeface typeface3 = Typeface.DEFAULT;
            fd.j0.h(typeface3, "DEFAULT");
            return typeface3;
        }
        if (i10 != 4) {
            Typeface regular2 = aVar.getRegular();
            if (regular2 != null) {
                return regular2;
            }
            Typeface typeface4 = Typeface.DEFAULT;
            fd.j0.h(typeface4, "DEFAULT");
            return typeface4;
        }
        Typeface bold = aVar.getBold();
        if (bold != null) {
            return bold;
        }
        Typeface typeface5 = Typeface.DEFAULT_BOLD;
        fd.j0.h(typeface5, "DEFAULT_BOLD");
        return typeface5;
    }

    public static final float E(y9.l6 l6Var, v9.d dVar) {
        v9.b<Double> bVar;
        Double dB;
        fd.j0.i(l6Var, "<this>");
        return (!(l6Var instanceof y9.l6.d) || (bVar = ((y9.l6.d) l6Var).f41240c.f40606a) == null || (dB = bVar.b(dVar)) == null) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : (float) dB.doubleValue();
    }

    public static final boolean F(y9.k0 k0Var) {
        if (k0Var == null) {
            return true;
        }
        return k0Var.f40996a == null && k0Var.f40997b == null && fd.j0.d(k0Var.f40998c, v9.b.f36747a.a(Boolean.FALSE)) && k0Var.f40999d == null && k0Var.f41000e == null;
    }

    public static final boolean G(y9.w0 w0Var, v9.d dVar) {
        fd.j0.i(w0Var, "<this>");
        fd.j0.i(dVar, "resolver");
        return w0Var.f43643y.b(dVar) == y9.w0.j.HORIZONTAL;
    }

    public static final boolean H(y9.w0 w0Var, v9.d dVar) {
        fd.j0.i(w0Var, "<this>");
        fd.j0.i(dVar, "resolver");
        if (w0Var.f43639u.b(dVar) == y9.w0.i.WRAP && w0Var.f43643y.b(dVar) != y9.w0.j.OVERLAP) {
            if (G(w0Var, dVar)) {
                return s(w0Var.M, dVar);
            }
            if (s(w0Var.f43636r, dVar)) {
                return true;
            }
            y9.c0 c0Var = w0Var.f43626h;
            if (c0Var != null) {
                return true ^ (((float) c0Var.f39347a.b(dVar).doubleValue()) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
        }
        return false;
    }

    public static final void I(y9.i5 i5Var, v9.d dVar, f9.b bVar, uc.l<Object, jc.w> lVar) {
        v9.b bVar2;
        fd.j0.i(i5Var, "<this>");
        fd.j0.i(dVar, "resolver");
        fd.j0.i(bVar, "subscriber");
        fd.j0.i(lVar, "callback");
        Object objA = i5Var.a();
        if (objA instanceof y9.k5) {
            y9.k5 k5Var = (y9.k5) objA;
            bVar.d(k5Var.f41100a.e(dVar, lVar));
            bVar2 = k5Var.f41101b;
        } else if (!(objA instanceof y9.o5)) {
            return;
        } else {
            bVar2 = ((y9.o5) objA).f41823a;
        }
        bVar.d(bVar2.e(dVar, lVar));
    }

    public static final void J(y9.m5 m5Var, v9.d dVar, f9.b bVar, uc.l<Object, jc.w> lVar) {
        v9.b bVar2;
        fd.j0.i(m5Var, "<this>");
        fd.j0.i(bVar, "subscriber");
        Object objA = m5Var.a();
        if (objA instanceof y9.l2) {
            y9.l2 l2Var = (y9.l2) objA;
            bVar.d(l2Var.f41215a.e(dVar, lVar));
            bVar2 = l2Var.f41216b;
        } else if (!(objA instanceof y9.q5)) {
            return;
        } else {
            bVar2 = ((y9.q5) objA).f42155a;
        }
        bVar.d(bVar2.e(dVar, lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(View view, v9.d dVar, y9.c0 c0Var) {
        fd.j0.i(dVar, "resolver");
        if (view instanceof u8.d) {
            if ((c0Var == null ? null : c0Var.f39347a) == null) {
                ((u8.d) view).setAspectRatio(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                return;
            }
            f9.b bVar = view instanceof f9.b ? (f9.b) view : null;
            if (bVar == null) {
                return;
            }
            bVar.d(c0Var.f39347a.f(dVar, new c(view)));
        }
    }

    public static final void L(f9.b bVar, v9.d dVar, y9.v1 v1Var, uc.l<? super y9.v1, jc.w> lVar) {
        fd.j0.i(bVar, "<this>");
        fd.j0.i(dVar, "resolver");
        fd.j0.i(v1Var, "drawable");
        lVar.invoke(v1Var);
        d dVar2 = new d(lVar, v1Var);
        if (v1Var instanceof y9.v1.c) {
            y9.i6 i6Var = ((y9.v1.c) v1Var).f43426c;
            bVar.d(i6Var.f40613a.e(dVar, dVar2));
            O(bVar, dVar, i6Var.f40615c, dVar2);
            N(bVar, dVar, i6Var.f40614b, dVar2);
        }
    }

    public static final void M(f9.b bVar, v9.d dVar, y9.t5 t5Var, uc.l<Object, jc.w> lVar) {
        p7.d dVarE;
        fd.j0.i(t5Var, "shape");
        bVar.d(t5Var.f42760d.f41216b.e(dVar, lVar));
        bVar.d(t5Var.f42760d.f41215a.e(dVar, lVar));
        bVar.d(t5Var.f42759c.f41216b.e(dVar, lVar));
        bVar.d(t5Var.f42759c.f41215a.e(dVar, lVar));
        bVar.d(t5Var.f42758b.f41216b.e(dVar, lVar));
        bVar.d(t5Var.f42758b.f41215a.e(dVar, lVar));
        v9.b<Integer> bVar2 = t5Var.f42757a;
        if (bVar2 != null && (dVarE = bVar2.e(dVar, lVar)) != null) {
            bVar.d(dVarE);
        }
        O(bVar, dVar, t5Var.f42761e, lVar);
    }

    public static final void N(f9.b bVar, v9.d dVar, y9.h6 h6Var, uc.l<Object, jc.w> lVar) {
        p7.d dVarE;
        fd.j0.i(dVar, "resolver");
        fd.j0.i(h6Var, "shape");
        if (h6Var instanceof y9.h6.d) {
            M(bVar, dVar, ((y9.h6.d) h6Var).f40293c, lVar);
            return;
        }
        if (h6Var instanceof y9.h6.a) {
            y9.t0 t0Var = ((y9.h6.a) h6Var).f40291c;
            bVar.d(t0Var.f42677b.f41216b.e(dVar, lVar));
            bVar.d(t0Var.f42677b.f41215a.e(dVar, lVar));
            v9.b<Integer> bVar2 = t0Var.f42676a;
            if (bVar2 != null && (dVarE = bVar2.e(dVar, lVar)) != null) {
                bVar.d(dVarE);
            }
            O(bVar, dVar, t0Var.f42678c, lVar);
        }
    }

    public static final void O(f9.b bVar, v9.d dVar, c7 c7Var, uc.l<Object, jc.w> lVar) {
        if (c7Var == null) {
            return;
        }
        bVar.d(c7Var.f39543a.e(dVar, lVar));
        bVar.d(c7Var.f39545c.e(dVar, lVar));
        bVar.d(c7Var.f39544b.e(dVar, lVar));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public static final void P(View view, i8.k kVar, y9.v vVar, i8.w wVar) {
        final j8.i iVar;
        final p0.e eVar;
        fd.j0.i(view, "<this>");
        if (vVar == null) {
            iVar = null;
        } else {
            v9.d expressionResolver = kVar.getExpressionResolver();
            y9.v vVar2 = j8.h.f31766a;
            fd.j0.i(expressionResolver, "expressionResolver");
            Animation animationF = j8.h.f(vVar, expressionResolver, false, view);
            Animation animationF2 = j8.h.f(vVar, expressionResolver, true, null);
            if (animationF == null && animationF2 == null) {
                iVar = null;
            } else {
                iVar = new j8.i(animationF, animationF2);
            }
        }
        if (wVar != null) {
            if ((!(wVar.f31478c == null && wVar.f31479d == null) ? wVar : null) == null) {
                eVar = null;
            } else {
                eVar = new p0.e(kVar.getContext(), wVar);
            }
        } else {
            eVar = null;
        }
        if (iVar == null && eVar == null) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: l8.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    uc.p pVar = iVar;
                    p0.e eVar2 = eVar;
                    if (pVar != null) {
                        fd.j0.h(view2, "v");
                        fd.j0.h(motionEvent, "event");
                        pVar.invoke(view2, motionEvent);
                    }
                    if (eVar2 == null) {
                        return false;
                    }
                    return ((p0.e.b) eVar2.f34352a).f34353a.onTouchEvent(motionEvent);
                }
            });
        }
    }

    public static final int Q(Long l10, DisplayMetrics displayMetrics) {
        int i10;
        float f10;
        if (l10 == null) {
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i11 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            f10 = i10;
        }
        return xc.b.c(TypedValue.applyDimension(2, f10, displayMetrics));
    }

    public static final int R(y9.n6 n6Var) {
        int i10 = a.f32255a[n6Var.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new jc.g();
    }

    public static final Drawable S(y9.v1 v1Var, DisplayMetrics displayMetrics, v9.d dVar) {
        Drawable aVar;
        v9.b<Long> bVar;
        Long lB;
        v9.b<Integer> bVar2;
        v9.b<Long> bVar3;
        Long lB2;
        v9.b<Integer> bVar4;
        fd.j0.i(v1Var, "<this>");
        fd.j0.i(dVar, "resolver");
        if (!(v1Var instanceof y9.v1.c)) {
            throw new jc.g();
        }
        y9.i6 i6Var = ((y9.v1.c) v1Var).f43426c;
        fd.j0.i(i6Var, "<this>");
        y9.h6 h6Var = i6Var.f40614b;
        Float fValueOf = null;
        if (h6Var instanceof y9.h6.d) {
            y9.h6.d dVar2 = (y9.h6.d) h6Var;
            float fA0 = a0(dVar2.f40293c.f42760d, displayMetrics, dVar);
            float fA1 = a0(dVar2.f40293c.f42759c, displayMetrics, dVar);
            v9.b<Integer> bVar5 = dVar2.f40293c.f42757a;
            if (bVar5 == null) {
                bVar5 = i6Var.f40613a;
            }
            int iIntValue = bVar5.b(dVar).intValue();
            float fA2 = a0(dVar2.f40293c.f42758b, displayMetrics, dVar);
            c7 c7Var = dVar2.f40293c.f42761e;
            if (c7Var == null) {
                c7Var = i6Var.f40615c;
            }
            Integer numB = (c7Var == null || (bVar4 = c7Var.f39543a) == null) ? null : bVar4.b(dVar);
            c7 c7Var2 = dVar2.f40293c.f42761e;
            if (c7Var2 == null) {
                c7Var2 = i6Var.f40615c;
            }
            if (c7Var2 != null && (bVar3 = c7Var2.f39545c) != null && (lB2 = bVar3.b(dVar)) != null) {
                fValueOf = Float.valueOf(lB2.longValue());
            }
            aVar = new g9.e(new g9.e.a(fA0, fA1, iIntValue, fA2, numB, fValueOf));
        } else {
            if (!(h6Var instanceof y9.h6.a)) {
                return null;
            }
            y9.h6.a aVar2 = (y9.h6.a) h6Var;
            float fA3 = a0(aVar2.f40291c.f42677b, displayMetrics, dVar);
            v9.b<Integer> bVar6 = aVar2.f40291c.f42676a;
            if (bVar6 == null) {
                bVar6 = i6Var.f40613a;
            }
            int iIntValue2 = bVar6.b(dVar).intValue();
            c7 c7Var3 = aVar2.f40291c.f42678c;
            if (c7Var3 == null) {
                c7Var3 = i6Var.f40615c;
            }
            Integer numB2 = (c7Var3 == null || (bVar2 = c7Var3.f39543a) == null) ? null : bVar2.b(dVar);
            c7 c7Var4 = aVar2.f40291c.f42678c;
            if (c7Var4 == null) {
                c7Var4 = i6Var.f40615c;
            }
            if (c7Var4 != null && (bVar = c7Var4.f39545c) != null && (lB = bVar.b(dVar)) != null) {
                fValueOf = Float.valueOf(lB.longValue());
            }
            aVar = new g9.a(new g9.a.C0271a(fA3, iIntValue2, numB2, fValueOf));
        }
        return aVar;
    }

    public static final m9.a.EnumC0358a T(y9.h3 h3Var) {
        int i10 = a.f32260f[h3Var.ordinal()];
        if (i10 == 1) {
            return m9.a.EnumC0358a.FILL;
        }
        if (i10 == 2) {
            return m9.a.EnumC0358a.FIT;
        }
        if (i10 == 3) {
            return m9.a.EnumC0358a.STRETCH;
        }
        if (i10 == 4) {
            return m9.a.EnumC0358a.NO_SCALE;
        }
        throw new jc.g();
    }

    public static final int U(y9.l6 l6Var, DisplayMetrics displayMetrics, v9.d dVar, ViewGroup.LayoutParams layoutParams) {
        fd.j0.i(displayMetrics, "metrics");
        fd.j0.i(dVar, "resolver");
        if (l6Var != null) {
            if (l6Var instanceof y9.l6.d) {
                return -1;
            }
            if (l6Var instanceof y9.l6.c) {
                return Y(((y9.l6.c) l6Var).f41239c, displayMetrics, dVar);
            }
            if (!(l6Var instanceof y9.l6.e)) {
                throw new jc.g();
            }
            v9.b<Boolean> bVar = ((y9.l6.e) l6Var).f41241c.f42192a;
            boolean z10 = false;
            if (bVar != null && bVar.b(dVar).booleanValue()) {
                z10 = true;
            }
            if (z10) {
                return layoutParams instanceof m9.d ? -3 : -1;
            }
        }
        return -2;
    }

    public static final PorterDuff.Mode W(y9.h0 h0Var) {
        fd.j0.i(h0Var, "<this>");
        switch (a.f32261g[h0Var.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new jc.g();
        }
    }

    public static final int X(y9.o1 o1Var, DisplayMetrics displayMetrics, v9.d dVar) {
        fd.j0.i(displayMetrics, "metrics");
        fd.j0.i(dVar, "resolver");
        int i10 = a.f32255a[o1Var.f41739a.b(dVar).ordinal()];
        float fDoubleValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (i10 == 1) {
            Double dB = o1Var.f41740b.b(dVar);
            if (dB != null) {
                fDoubleValue = (float) dB.doubleValue();
            }
            return xc.b.c(TypedValue.applyDimension(1, fDoubleValue, displayMetrics));
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return (int) o1Var.f41740b.b(dVar).doubleValue();
            }
            throw new jc.g();
        }
        Double dB2 = o1Var.f41740b.b(dVar);
        if (dB2 != null) {
            fDoubleValue = (float) dB2.doubleValue();
        }
        return xc.b.c(TypedValue.applyDimension(1, fDoubleValue, displayMetrics));
    }

    public static final int Y(y9.l2 l2Var, DisplayMetrics displayMetrics, v9.d dVar) {
        fd.j0.i(l2Var, "<this>");
        fd.j0.i(dVar, "resolver");
        int i10 = a.f32255a[l2Var.f41215a.b(dVar).ordinal()];
        if (i10 == 1) {
            return u(l2Var.f41216b.b(dVar), displayMetrics);
        }
        if (i10 == 2) {
            return Q(l2Var.f41216b.b(dVar), displayMetrics);
        }
        if (i10 != 3) {
            throw new jc.g();
        }
        long jLongValue = l2Var.f41216b.b(dVar).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            return (int) jLongValue;
        }
        int i11 = e9.a.f29114a;
        return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final int Z(q8.b bVar, DisplayMetrics displayMetrics, v9.d dVar) {
        int i10 = a.f32255a[bVar.f42200a.b(dVar).ordinal()];
        if (i10 == 1) {
            return u(bVar.f42201b.b(dVar), displayMetrics);
        }
        if (i10 == 2) {
            return Q(bVar.f42201b.b(dVar), displayMetrics);
        }
        if (i10 != 3) {
            throw new jc.g();
        }
        long jLongValue = bVar.f42201b.b(dVar).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            return (int) jLongValue;
        }
        int i11 = e9.a.f29114a;
        return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final void a(View view, y9.t tVar, y9.u uVar) {
        fd.j0.i(view, "<this>");
        int iX = x(tVar, uVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof m9.d) {
            m9.d dVar = (m9.d) layoutParams;
            if (dVar.f33324a != iX) {
                dVar.f33324a = iX;
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
        }
        boolean z10 = uVar == y9.u.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        m9.d dVar2 = layoutParams2 instanceof m9.d ? (m9.d) layoutParams2 : null;
        if (dVar2 == null || dVar2.f33325b == z10) {
            return;
        }
        dVar2.f33325b = z10;
        view.requestLayout();
    }

    public static final float a0(y9.l2 l2Var, DisplayMetrics displayMetrics, v9.d dVar) {
        fd.j0.i(l2Var, "<this>");
        fd.j0.i(displayMetrics, "metrics");
        fd.j0.i(dVar, "resolver");
        return z(l2Var.f41216b.b(dVar).longValue(), l2Var.f41215a.b(dVar), displayMetrics);
    }

    public static final void b(View view, String str, String str2) {
        fd.j0.i(view, "<this>");
        if (str == null) {
            str = str2;
        } else if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) str);
            sb2.append('\n');
            sb2.append((Object) str2);
            str = sb2.toString();
        }
        view.setContentDescription(str);
    }

    public static final void b0(ViewGroup viewGroup, List<? extends y9.k> list, List<? extends y9.k> list2, i8.k kVar) {
        fd.j0.i(list, "newDivs");
        i8.q0 q0VarD = ((r7.a.b) kVar.getDiv2Component$div_release()).d();
        fd.j0.h(q0VarD, "divView.div2Component.visibilityActionTracker");
        if (!(list2 == null || list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kc.q.l(arrayList, A(((y9.k) it.next()).a()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((o8) it2.next()).f41855b);
            }
            for (y9.k kVar2 : list2) {
                List<o8> listA = A(kVar2.a());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listA) {
                    if (!hashSet.contains(((o8) obj).f41855b)) {
                        arrayList2.add(obj);
                    }
                }
                q0VarD.d(kVar, null, kVar2, arrayList2);
            }
        }
        if (!list.isEmpty()) {
            viewGroup.addOnLayoutChangeListener(new e(viewGroup, list, q0VarD, kVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01db  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0200  */
    /* JADX WARN: Code duplicated, block: B:134:0x0204  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x0237  */
    /* JADX WARN: Code duplicated, block: B:139:0x023b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0244  */
    /* JADX WARN: Code duplicated, block: B:143:0x024d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0263  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa A[SYNTHETIC] */
    public static final void c(final View view, final i8.k kVar, y9.q qVar, List<? extends y9.q> list, final List<? extends y9.q> list2, List<? extends y9.q> list3, y9.v vVar) {
        List<? extends y9.q> listA;
        Object next;
        int i10;
        List<y9.q.d> list4;
        Object next2;
        l lVar;
        List<y9.q.d> list5;
        List<? extends y9.q> list6;
        boolean z10;
        Iterator<T> it;
        Object next3;
        y9.q qVar2;
        com.inscode.autoclicker.ui.dialogs.k kVar2;
        m mVar;
        List<y9.q.d> list7;
        com.inscode.autoclicker.ui.dialogs.f fVar;
        List<y9.q.d> list8;
        boolean z11;
        boolean z12;
        y9.v vVar2 = vVar;
        fd.j0.i(vVar2, "actionAnimation");
        final j jVar = ((r7.a.b) kVar.getDiv2Component$div_release()).K.get();
        fd.j0.h(jVar, "divView.div2Component.actionBinder");
        if (list == null || list.isEmpty()) {
            listA = qVar == null ? null : kc.k.a(qVar);
        } else {
            listA = list;
        }
        boolean zIsClickable = view.isClickable();
        boolean zIsLongClickable = view.isLongClickable();
        i8.w wVar = new i8.w();
        boolean z13 = listA == null || listA.isEmpty();
        if (list2 == null || list2.isEmpty()) {
            if (!jVar.f32463d || z13) {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
            } else if (x1.q.l(view)) {
                final uc.l<View, Boolean> lVar2 = jVar.f32466g;
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l8.g
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        uc.l lVar3 = lVar2;
                        fd.j0.i(lVar3, "$tmp0");
                        return ((Boolean) lVar3.invoke(view2)).booleanValue();
                    }
                });
                view.setTag(R.id.div_penetrating_longtap_tag, Boolean.TRUE);
            } else {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
                view.setTag(R.id.div_penetrating_longtap_tag, null);
            }
            wVar = wVar;
            zIsLongClickable = zIsLongClickable;
            zIsClickable = zIsClickable;
            listA = listA;
        } else {
            Iterator<T> it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    list4 = ((y9.q) next).f42098c;
                }
            } while (!(((list4 == null || list4.isEmpty()) || jVar.f32464e) ? false : true));
            final y9.q qVar3 = (y9.q) next;
            if (qVar3 != null) {
                List<y9.q.d> list9 = qVar3.f42098c;
                if (list9 == null) {
                    int i11 = e9.a.f29114a;
                    i10 = R.id.div_penetrating_longtap_tag;
                } else {
                    final q9.b bVar = new q9.b(view.getContext(), view, kVar);
                    bVar.f34850d = new j.a(jVar, kVar, list9);
                    kVar.s();
                    kVar.C(new n(bVar));
                    i10 = R.id.div_penetrating_longtap_tag;
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l8.f
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            j jVar2 = jVar;
                            y9.q qVar4 = qVar3;
                            i8.k kVar3 = kVar;
                            q9.b bVar2 = bVar;
                            View view3 = view;
                            List list10 = list2;
                            fd.j0.i(jVar2, "this$0");
                            fd.j0.i(kVar3, "$divView");
                            fd.j0.i(bVar2, "$overflowMenuWrapper");
                            fd.j0.i(view3, "$target");
                            String string = UUID.randomUUID().toString();
                            fd.j0.h(string, "randomUUID().toString()");
                            jVar2.f32462c.a(qVar4, kVar3.getExpressionResolver());
                            new y6.d(bVar2).onClick(view3);
                            Iterator it3 = list10.iterator();
                            while (it3.hasNext()) {
                                jVar2.f32461b.r(kVar3, view3, (y9.q) it3.next(), string);
                            }
                            return true;
                        }
                    });
                }
            } else {
                i10 = R.id.div_penetrating_longtap_tag;
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l8.e
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        j jVar2 = jVar;
                        i8.k kVar3 = kVar;
                        View view3 = view;
                        List<? extends y9.q> list10 = list2;
                        fd.j0.i(jVar2, "this$0");
                        fd.j0.i(kVar3, "$divView");
                        fd.j0.i(view3, "$target");
                        jVar2.c(kVar3, view3, list10, "long_click");
                        return true;
                    }
                });
            }
            if (jVar.f32463d) {
                view.setTag(i10, Boolean.TRUE);
            }
        }
        if (!(list3 == null || list3.isEmpty())) {
            Iterator<T> it3 = list3.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    list5 = ((y9.q) next2).f42098c;
                }
            } while (!(((list5 == null || list5.isEmpty()) || jVar.f32464e) ? false : true));
            y9.q qVar4 = (y9.q) next2;
            if (qVar4 != null) {
                List<y9.q.d> list10 = qVar4.f42098c;
                if (list10 == null) {
                    int i12 = e9.a.f29114a;
                } else {
                    q9.b bVar2 = new q9.b(view.getContext(), view, kVar);
                    bVar2.f34850d = new j.a(jVar, kVar, list10);
                    kVar.s();
                    kVar.C(new n(bVar2));
                    wVar.f31479d = new k(jVar, kVar, view, qVar4, bVar2);
                }
            } else {
                lVar = new l(jVar, kVar, view, list3);
            }
            boolean z14 = jVar.f32464e;
            list6 = listA;
            if (list6 != null || list6.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wVar.f31478c = null;
                view.setOnClickListener(null);
                view.setClickable(false);
            } else {
                it = list6.iterator();
                do {
                    if (it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    list8 = ((y9.q) next3).f42098c;
                    if (list8 != null || list8.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || z14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } while (!z12);
                qVar2 = (y9.q) next3;
                if (qVar2 != null) {
                    list7 = qVar2.f42098c;
                    if (list7 == null) {
                        int i13 = e9.a.f29114a;
                    } else {
                        q9.b bVar3 = new q9.b(view.getContext(), view, kVar);
                        bVar3.f34850d = new j.a(jVar, kVar, list7);
                        kVar.s();
                        kVar.C(new n(bVar3));
                        fVar = new com.inscode.autoclicker.ui.dialogs.f(jVar, kVar, view, qVar2, bVar3);
                        if (wVar.f31479d != null) {
                            mVar = new m(fVar, view);
                            wVar.f31478c = mVar;
                        } else {
                            view.setOnClickListener(fVar);
                        }
                    }
                } else {
                    kVar2 = new com.inscode.autoclicker.ui.dialogs.k(jVar, kVar, view, list6);
                    if (wVar.f31479d != null) {
                        mVar = new m(kVar2, view);
                        wVar.f31478c = mVar;
                    } else {
                        view.setOnClickListener(kVar2);
                    }
                }
            }
            if (h9.d.c(list6, list2, list3)) {
                vVar2 = null;
            }
            P(view, kVar, vVar2, wVar);
            if (jVar.f32465f || y9.o.d.MERGE != kVar.f31363x.get(view)) {
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && kVar.f31363x.get(view2) == kVar.f31363x.get(view)) {
                view.setClickable(zIsClickable);
                view.setLongClickable(zIsLongClickable);
                return;
            }
            return;
        }
        lVar = null;
        wVar.f31479d = lVar;
        boolean z15 = jVar.f32464e;
        list6 = listA;
        if (list6 != null) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (z10) {
            wVar.f31478c = null;
            view.setOnClickListener(null);
            view.setClickable(false);
        } else {
            it = list6.iterator();
            do {
                if (it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                list8 = ((y9.q) next3).f42098c;
                if (list8 != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
            } while (!z12);
            qVar2 = (y9.q) next3;
            if (qVar2 != null) {
                list7 = qVar2.f42098c;
                if (list7 == null) {
                    int i14 = e9.a.f29114a;
                } else {
                    q9.b bVar4 = new q9.b(view.getContext(), view, kVar);
                    bVar4.f34850d = new j.a(jVar, kVar, list7);
                    kVar.s();
                    kVar.C(new n(bVar4));
                    fVar = new com.inscode.autoclicker.ui.dialogs.f(jVar, kVar, view, qVar2, bVar4);
                    if (wVar.f31479d != null) {
                        mVar = new m(fVar, view);
                        wVar.f31478c = mVar;
                    } else {
                        view.setOnClickListener(fVar);
                    }
                }
            } else {
                kVar2 = new com.inscode.autoclicker.ui.dialogs.k(jVar, kVar, view, list6);
                if (wVar.f31479d != null) {
                    mVar = new m(kVar2, view);
                    wVar.f31478c = mVar;
                } else {
                    view.setOnClickListener(kVar2);
                }
            }
        }
        if (h9.d.c(list6, list2, list3)) {
            vVar2 = null;
        }
        P(view, kVar, vVar2, wVar);
        if (jVar.f32465f) {
        }
    }

    public static final int c0(Long l10, DisplayMetrics displayMetrics, y9.n6 n6Var) {
        int i10;
        float f10;
        fd.j0.i(displayMetrics, "metrics");
        fd.j0.i(n6Var, "unit");
        int iR = R(n6Var);
        if (l10 == null) {
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i11 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            f10 = i10;
        }
        return xc.b.c(TypedValue.applyDimension(iR, f10, displayMetrics));
    }

    public static final void d(TextView textView, int i10, y9.n6 n6Var) {
        fd.j0.i(textView, "<this>");
        fd.j0.i(n6Var, "unit");
        textView.setTextSize(R(n6Var), i10);
    }

    public static final <T extends View & o8.c> o8.a d0(T t10, y9.k0 k0Var, v9.d dVar) {
        ViewOutlineProvider viewOutlineProvider;
        o8.a divBorderDrawer = t10.getDivBorderDrawer();
        if (fd.j0.d(k0Var, divBorderDrawer == null ? null : divBorderDrawer.f34007f)) {
            return divBorderDrawer;
        }
        if (k0Var != null) {
            if (divBorderDrawer != null) {
                divBorderDrawer.g();
                divBorderDrawer.f34006e = dVar;
                divBorderDrawer.f34007f = k0Var;
                divBorderDrawer.m(dVar, k0Var);
            } else if (F(k0Var)) {
                t10.setElevation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                t10.setClipToOutline(true);
                viewOutlineProvider = ViewOutlineProvider.BOUNDS;
            } else {
                DisplayMetrics displayMetrics = t10.getResources().getDisplayMetrics();
                fd.j0.h(displayMetrics, "resources.displayMetrics");
                divBorderDrawer = new o8.a(displayMetrics, t10, dVar, k0Var);
            }
            t10.invalidate();
            return divBorderDrawer;
        }
        if (divBorderDrawer != null) {
            divBorderDrawer.g();
        }
        t10.setElevation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        t10.setClipToOutline(false);
        viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        t10.setOutlineProvider(viewOutlineProvider);
        divBorderDrawer = null;
        t10.invalidate();
        return divBorderDrawer;
    }

    public static final void e(View view, y9.g0 g0Var, v9.d dVar) {
        fd.j0.i(view, "<this>");
        fd.j0.i(g0Var, "div");
        fd.j0.i(dVar, "resolver");
        y9.l6 height = g0Var.getHeight();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "resources.displayMetrics");
        int iU = U(height, displayMetrics, dVar, view.getLayoutParams());
        if (view.getLayoutParams().height != iU) {
            view.getLayoutParams().height = iU;
            view.requestLayout();
        }
        o(view, g0Var, dVar);
    }

    public static final void f(View view, float f10) {
        fd.j0.i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m9.d dVar = layoutParams instanceof m9.d ? (m9.d) layoutParams : null;
        if (dVar == null) {
            return;
        }
        if (dVar.f33327d == f10) {
            return;
        }
        dVar.f33327d = f10;
        view.requestLayout();
    }

    public static final void g(TextView textView, double d10, int i10) {
        fd.j0.i(textView, "<this>");
        textView.setLetterSpacing(((float) d10) / i10);
    }

    public static final void h(TextView textView, Long l10, y9.n6 n6Var) {
        int iC0;
        fd.j0.i(textView, "<this>");
        fd.j0.i(n6Var, "unit");
        if (l10 == null) {
            iC0 = 0;
        } else {
            Long lValueOf = Long.valueOf(l10.longValue());
            DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            iC0 = c0(lValueOf, displayMetrics, n6Var) - textView.getPaint().getFontMetricsInt(null);
        }
        textView.setLineSpacing(iC0, 1.0f);
    }

    public static final void i(View view, y9.x1 x1Var, v9.d dVar) {
        int iC0;
        int iC1;
        int iC2;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i10 = 0;
        if (x1Var != null) {
            y9.n6 n6VarB = x1Var.f44036e.b(dVar);
            Long lB = x1Var.f44033b.b(dVar);
            fd.j0.h(displayMetrics, "metrics");
            int iC3 = c0(lB, displayMetrics, n6VarB);
            iC1 = c0(x1Var.f44035d.b(dVar), displayMetrics, n6VarB);
            iC2 = c0(x1Var.f44034c.b(dVar), displayMetrics, n6VarB);
            iC0 = c0(x1Var.f44032a.b(dVar), displayMetrics, n6VarB);
            i10 = iC3;
        } else {
            iC0 = 0;
            iC1 = 0;
            iC2 = 0;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == iC1 && marginLayoutParams.rightMargin == iC2 && marginLayoutParams.bottomMargin == iC0) {
            return;
        }
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = iC1;
        marginLayoutParams.rightMargin = iC2;
        marginLayoutParams.bottomMargin = iC0;
        view.requestLayout();
    }

    public static final void j(View view, q8.b bVar, v9.d dVar) {
        int iZ;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m9.d dVar2 = layoutParams instanceof m9.d ? (m9.d) layoutParams : null;
        if (dVar2 == null) {
            return;
        }
        if (bVar == null) {
            iZ = Integer.MAX_VALUE;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            iZ = Z(bVar, displayMetrics, dVar);
        }
        if (dVar2.f33330g != iZ) {
            dVar2.f33330g = iZ;
            view.requestLayout();
        }
    }

    public static final void k(View view, q8.b bVar, v9.d dVar) {
        int iZ;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m9.d dVar2 = layoutParams instanceof m9.d ? (m9.d) layoutParams : null;
        if (dVar2 == null) {
            return;
        }
        if (bVar == null) {
            iZ = Integer.MAX_VALUE;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            iZ = Z(bVar, displayMetrics, dVar);
        }
        if (dVar2.f33331h != iZ) {
            dVar2.f33331h = iZ;
            view.requestLayout();
        }
    }

    public static final void l(View view, q8.b bVar, v9.d dVar) {
        int iZ;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        if (bVar == null) {
            iZ = 0;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            iZ = Z(bVar, displayMetrics, dVar);
        }
        if (view.getMinimumHeight() != iZ) {
            view.setMinimumHeight(iZ);
            view.requestLayout();
        }
    }

    public static final void m(View view, q8.b bVar, v9.d dVar) {
        int iZ;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        if (bVar == null) {
            iZ = 0;
        } else {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            iZ = Z(bVar, displayMetrics, dVar);
        }
        if (view.getMinimumWidth() != iZ) {
            view.setMinimumWidth(iZ);
            view.requestLayout();
        }
    }

    public static final void n(View view, y9.x1 x1Var, v9.d dVar) {
        int iU;
        int iU2;
        int iU3;
        int iU4;
        int i10;
        int i11;
        int i12;
        v9.b<y9.n6> bVar;
        fd.j0.i(view, "<this>");
        fd.j0.i(dVar, "resolver");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        y9.n6 n6VarB = null;
        if (x1Var != null && (bVar = x1Var.f44036e) != null) {
            n6VarB = bVar.b(dVar);
        }
        int i13 = n6VarB == null ? -1 : a.f32255a[n6VarB.ordinal()];
        if (i13 == 1) {
            Long lB = x1Var.f44033b.b(dVar);
            fd.j0.h(displayMetrics, "metrics");
            iU = u(lB, displayMetrics);
            iU2 = u(x1Var.f44035d.b(dVar), displayMetrics);
            iU3 = u(x1Var.f44034c.b(dVar), displayMetrics);
            iU4 = u(x1Var.f44032a.b(dVar), displayMetrics);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                long jLongValue = x1Var.f44033b.b(dVar).longValue();
                long j10 = jLongValue >> 31;
                int i14 = Integer.MAX_VALUE;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    int i15 = e9.a.f29114a;
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                long jLongValue2 = x1Var.f44035d.b(dVar).longValue();
                long j11 = jLongValue2 >> 31;
                if (j11 == 0 || j11 == -1) {
                    i11 = (int) jLongValue2;
                } else {
                    int i16 = e9.a.f29114a;
                    i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                long jLongValue3 = x1Var.f44034c.b(dVar).longValue();
                long j12 = jLongValue3 >> 31;
                if (j12 == 0 || j12 == -1) {
                    i12 = (int) jLongValue3;
                } else {
                    int i17 = e9.a.f29114a;
                    i12 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                long jLongValue4 = x1Var.f44032a.b(dVar).longValue();
                long j13 = jLongValue4 >> 31;
                if (j13 == 0 || j13 == -1) {
                    i14 = (int) jLongValue4;
                } else {
                    int i18 = e9.a.f29114a;
                    if (jLongValue4 <= 0) {
                        i14 = Integer.MIN_VALUE;
                    }
                }
                view.setPadding(i10, i11, i12, i14);
                return;
            }
            Long lB2 = x1Var.f44033b.b(dVar);
            fd.j0.h(displayMetrics, "metrics");
            iU = Q(lB2, displayMetrics);
            iU2 = Q(x1Var.f44035d.b(dVar), displayMetrics);
            iU3 = Q(x1Var.f44034c.b(dVar), displayMetrics);
            iU4 = Q(x1Var.f44032a.b(dVar), displayMetrics);
        }
        view.setPadding(iU, iU2, iU3, iU4);
    }

    public static final void o(View view, y9.g0 g0Var, v9.d dVar) {
        Double dB;
        fd.j0.i(view, "<this>");
        fd.j0.i(g0Var, "div");
        fd.j0.i(dVar, "resolver");
        v9.b<Double> bVar = g0Var.a().f44793c;
        float fDoubleValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (bVar != null && (dB = bVar.b(dVar)) != null) {
            fDoubleValue = (float) dB.doubleValue();
        }
        view.setRotation(fDoubleValue);
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            p0.x.a(view, new RunnableC0339b(view, view, g0Var, dVar));
        } else {
            view.setPivotX(C(view.getWidth(), g0Var.a().f44791a, dVar));
            view.setPivotY(C(view.getHeight(), g0Var.a().f44792b, dVar));
        }
    }

    public static final void p(View view, float f10) {
        fd.j0.i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m9.d dVar = layoutParams instanceof m9.d ? (m9.d) layoutParams : null;
        if (dVar == null) {
            return;
        }
        if (dVar.f33326c == f10) {
            return;
        }
        dVar.f33326c = f10;
        view.requestLayout();
    }

    public static final void q(View view, y9.g0 g0Var, v9.d dVar) {
        fd.j0.i(view, "<this>");
        fd.j0.i(g0Var, "div");
        fd.j0.i(dVar, "resolver");
        y9.l6 width = g0Var.getWidth();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "resources.displayMetrics");
        int iU = U(width, displayMetrics, dVar, view.getLayoutParams());
        if (view.getLayoutParams().width != iU) {
            view.getLayoutParams().width = iU;
            view.requestLayout();
        }
        o(view, g0Var, dVar);
    }

    public static final void r(View view, y9.g0 g0Var, v9.d dVar) {
        fd.j0.i(g0Var, "div");
        fd.j0.i(dVar, "resolver");
        try {
            q(view, g0Var, dVar);
            e(view, g0Var, dVar);
            v9.b<y9.t> bVarK = g0Var.k();
            y9.u uVarB = null;
            y9.t tVarB = bVarK == null ? null : bVarK.b(dVar);
            v9.b<y9.u> bVarO = g0Var.o();
            if (bVarO != null) {
                uVarB = bVarO.b(dVar);
            }
            a(view, tVarB, uVarB);
        } catch (u9.f e10) {
            if (!x1.q.a(e10)) {
                throw e10;
            }
        }
    }

    public static final boolean s(y9.l6 l6Var, v9.d dVar) {
        fd.j0.i(l6Var, "<this>");
        if (l6Var instanceof y9.l6.e) {
            v9.b<Boolean> bVar = ((y9.l6.e) l6Var).f41241c.f42192a;
            if (!(bVar != null && bVar.b(dVar).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public static final n9.d t(int i10, float f10, float f11, float f12, float f13, Float f14, Integer num) {
        return new n9.d.b(i10, new n9.c.b(f10 * f13, f11 * f13, f12 * f13), f14 == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : f14.floatValue(), num == null ? 0 : num.intValue());
    }

    public static final int u(Long l10, DisplayMetrics displayMetrics) {
        int i10;
        float f10;
        fd.j0.i(displayMetrics, "metrics");
        if (l10 == null) {
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i11 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            f10 = i10;
        }
        return xc.b.c(TypedValue.applyDimension(1, f10, displayMetrics));
    }

    public static final float v(Long l10, DisplayMetrics displayMetrics) {
        fd.j0.i(displayMetrics, "metrics");
        return TypedValue.applyDimension(1, l10 == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : l10.longValue(), displayMetrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(ViewGroup viewGroup, Canvas canvas) {
        Object next;
        o8.a divBorderDrawer;
        int iB = dd.q.b(p0.i0.b(viewGroup));
        int i10 = 0;
        while (i10 < iB) {
            int i11 = i10 + 1;
            dd.g<View> gVarB = p0.i0.b(viewGroup);
            dd.m mVar = new dd.m(i10);
            if (i10 >= 0) {
                Iterator<View> it = ((p0.i0.a) gVarB).iterator();
                int i12 = 0;
                while (true) {
                    p0.j0 j0Var = (p0.j0) it;
                    if (j0Var.hasNext()) {
                        next = j0Var.next();
                        int i13 = i12 + 1;
                        if (i10 == i12) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                View view = (View) next;
                float x10 = view.getX();
                float y10 = view.getY();
                int iSave = canvas.save();
                canvas.translate(x10, y10);
                try {
                    o8.c cVar = view instanceof o8.c ? (o8.c) view : null;
                    if (cVar != null && (divBorderDrawer = cVar.getDivBorderDrawer()) != null) {
                        divBorderDrawer.f(canvas);
                    }
                    canvas.restoreToCount(iSave);
                    i10 = i11;
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
            mVar.invoke(Integer.valueOf(i10));
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public static final int x(y9.t tVar, y9.u uVar) {
        int i10;
        int i11 = tVar == null ? -1 : a.f32256b[tVar.ordinal()];
        if (i11 == 1) {
            i10 = 3;
        } else if (i11 == 2) {
            i10 = 1;
        } else if (i11 != 3) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i12 = uVar != null ? a.f32257c[uVar.ordinal()] : -1;
        int i13 = 48;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 16;
            } else if (i12 == 3) {
                i13 = 80;
            }
        }
        return i10 | i13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public static final int y(y9.y0 y0Var, y9.z0 z0Var) {
        int i10;
        int i11 = y0Var == null ? -1 : a.f32258d[y0Var.ordinal()];
        if (i11 == 1) {
            i10 = 3;
        } else if (i11 == 2) {
            i10 = 1;
        } else if (i11 != 3) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i12 = z0Var != null ? a.f32259e[z0Var.ordinal()] : -1;
        int i13 = 48;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 16;
            } else if (i12 == 3) {
                i13 = 80;
            }
        }
        return i10 | i13;
    }

    public static final float z(long j10, y9.n6 n6Var, DisplayMetrics displayMetrics) {
        int i10 = a.f32255a[n6Var.ordinal()];
        if (i10 == 1) {
            return v(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 2) {
            Long lValueOf = Long.valueOf(j10);
            return TypedValue.applyDimension(2, lValueOf == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : lValueOf.longValue(), displayMetrics);
        }
        if (i10 == 3) {
            return j10;
        }
        throw new jc.g();
    }
}
