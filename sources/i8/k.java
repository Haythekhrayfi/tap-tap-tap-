package i8;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.WeakHashMap;
import p7.d1;
import p7.e1;
import p7.f1;
import y9.b8;
import y9.c8;
import y9.l1;
import y9.v7;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class k extends m9.g implements f1 {
    public static final /* synthetic */ int S = 0;
    public d8.a A;
    public final Object B;
    public f8.e C;
    public f8.e D;
    public f8.e E;
    public f8.e F;
    public long G;
    public e1 H;
    public final uc.a<b9.s> I;
    public final jc.e J;
    public o7.a K;
    public o7.a L;
    public l1 M;
    public p7.j N;
    public long O;
    public final String P;
    public boolean Q;
    public final j8.b R;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f31353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.b f31354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7.i f31355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f31356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f31357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f31358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<z7.e> f31359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<q9.a> f31360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<Object> f31361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakHashMap<View, y9.k> f31362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WeakHashMap<View, y9.o.d> f31363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f31364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u7.d f31365z;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l1.c f31367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c8.e> f31368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f31369d;

        /* JADX INFO: renamed from: i8.k$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC0312a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0312a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                fd.j0.i(view, "view");
                view.removeOnLayoutChangeListener(this);
                a.this.a(j.f31348c);
            }
        }

        public a(k kVar) {
            fd.j0.i(kVar, "this$0");
            this.f31369d = kVar;
            this.f31368c = new ArrayList();
        }

        public final void a(uc.a<jc.w> aVar) {
            fd.j0.i(aVar, "function");
            if (this.f31366a) {
                return;
            }
            this.f31366a = true;
            aVar.invoke();
            b();
            this.f31366a = false;
        }

        public final void b() {
            if (this.f31369d.getChildCount() == 0) {
                k kVar = this.f31369d;
                if (!x1.q.k(kVar) || kVar.isLayoutRequested()) {
                    kVar.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0312a());
                    return;
                } else {
                    a(j.f31348c);
                    return;
                }
            }
            l1.c cVar = this.f31367b;
            if (cVar == null) {
                return;
            }
            t8.e eVar = ((r7.a.c) this.f31369d.getViewComponent$div_release()).f35256h.get();
            List<c8.e> listUnmodifiableList = this.f31368c;
            fd.j0.i(listUnmodifiableList, "<this>");
            if (!(listUnmodifiableList instanceof wc.a) || (listUnmodifiableList instanceof wc.b)) {
                listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listUnmodifiableList));
                fd.j0.h(listUnmodifiableList, "{\n        Collections.un…st(ArrayList(this))\n    }");
            }
            eVar.a(cVar, listUnmodifiableList);
            this.f31367b = null;
            this.f31368c.clear();
        }

        public final void c(l1.c cVar, c8.e eVar, boolean z10) {
            List<c8.e> listA = kc.k.a(eVar);
            l1.c cVar2 = this.f31367b;
            if (cVar2 != null && !fd.j0.d(cVar, cVar2)) {
                this.f31368c.clear();
            }
            this.f31367b = cVar;
            kc.q.l(this.f31368c, listA);
            k kVar = this.f31369d;
            for (c8.e eVar2 : listA) {
                c8.c cVarC = ((r7.a.b) kVar.getDiv2Component$div_release()).c();
                String str = kVar.getDivTag().f33995a;
                fd.j0.h(str, "divTag.id");
                cVarC.c(str, eVar2, z10);
            }
            if (this.f31366a) {
                return;
            }
            b();
        }
    }

    public static final class b extends vc.l implements uc.a<jc.w> {
        public b() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            k kVar = k.this;
            u7.d dVar = kVar.f31365z;
            if (dVar != null) {
                dVar.a(kVar);
            }
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<y9.k, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kc.f<b8> f31372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v9.d f31373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kc.f<b8> fVar, v9.d dVar) {
            super(1);
            this.f31372c = fVar;
            this.f31373d = dVar;
        }

        @Override // uc.l
        public Boolean invoke(y9.k kVar) {
            y9.k kVar2 = kVar;
            fd.j0.i(kVar2, "div");
            if (kVar2 instanceof y9.k.o) {
                this.f31372c.a(((y9.k.o) kVar2).f40988c.f44150v.b(this.f31373d));
            }
            return Boolean.TRUE;
        }
    }

    public static final class d extends vc.l implements uc.l<y9.k, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kc.f<b8> f31374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kc.f<b8> fVar) {
            super(1);
            this.f31374c = fVar;
        }

        @Override // uc.l
        public jc.w invoke(y9.k kVar) {
            y9.k kVar2 = kVar;
            fd.j0.i(kVar2, "div");
            if (kVar2 instanceof y9.k.o) {
                this.f31374c.j();
            }
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<y9.k, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kc.f<b8> f31375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kc.f<b8> fVar) {
            super(1);
            this.f31375c = fVar;
        }

        @Override // uc.l
        public Boolean invoke(y9.k kVar) {
            Boolean boolValueOf;
            boolean zBooleanValue;
            y9.k kVar2 = kVar;
            fd.j0.i(kVar2, "div");
            List<c8> listI = kVar2.a().i();
            if (listI == null) {
                boolValueOf = null;
            } else {
                fd.j0.i(listI, "<this>");
                boolValueOf = Boolean.valueOf(listI.contains(c8.DATA_CHANGE));
            }
            if (boolValueOf == null) {
                b8 b8VarF = this.f31375c.f();
                zBooleanValue = b8VarF == null ? false : j8.c.b(b8VarF);
            } else {
                zBooleanValue = boolValueOf.booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    public static final class f extends vc.l implements uc.a<jc.w> {
        public f() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            b9.e histogramReporter = k.this.getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.f3367g = Long.valueOf(SystemClock.uptimeMillis());
            }
            return jc.w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.a<jc.w> {
        public g() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            b9.e histogramReporter = k.this.getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.b();
            }
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(p7.e eVar) {
        this(eVar, null, 0, 6, null);
        fd.j0.i(eVar, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(p7.e eVar, AttributeSet attributeSet) {
        this(eVar, attributeSet, 0, 4, null);
        fd.j0.i(eVar, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p7.e eVar, AttributeSet attributeSet, int i10) {
        super(eVar, attributeSet, i10);
        fd.j0.i(eVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f31353n = jUptimeMillis;
        this.f31354o = eVar.f34504a;
        r7.a.b bVar = (r7.a.b) getDiv2Component$div_release();
        r7.a aVar = bVar.f35201c;
        r7.a.b bVar2 = bVar.f35203d;
        h9.d.e(this, k.class);
        this.f31355p = new r7.a.c(aVar, bVar2, this, null);
        this.f31356q = ((r7.a.b) getDiv2Component$div_release()).f35197a.D;
        this.f31357r = ((r7.a.c) getViewComponent$div_release()).f35258j.get();
        h hVar = ((r7.a.b) eVar.f34504a).f35231r.get();
        fd.j0.h(hVar, "context.div2Component.div2Builder");
        this.f31358s = hVar;
        this.f31359t = new ArrayList();
        this.f31360u = new ArrayList();
        this.f31361v = new ArrayList();
        this.f31362w = new WeakHashMap<>();
        this.f31363x = new WeakHashMap<>();
        this.f31364y = new a(this);
        this.B = new Object();
        h9.d.h(l1.f41189h);
        this.G = -1L;
        int i11 = e1.D1;
        this.H = d1.f34480d;
        this.I = new q(eVar);
        this.J = jc.f.a(kotlin.a.NONE, new o(this));
        o7.a aVar2 = o7.a.f33994b;
        fd.j0.h(aVar2, "INVALID");
        this.K = aVar2;
        fd.j0.h(aVar2, "INVALID");
        this.L = aVar2;
        this.O = -1L;
        this.P = ((r7.a.b) getDiv2Component$div_release()).f35199b.f34532e.compareAndSet(true, false) ? p7.j0.f34527h.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
        this.Q = true;
        this.R = new j8.b(this);
        Objects.requireNonNull(p7.j0.f34525f);
        this.O = SystemClock.uptimeMillis();
    }

    public /* synthetic */ k(p7.e eVar, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(eVar, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private a8.g getDivVideoActionHandler() {
        a8.g gVar = ((r7.a.b) getDiv2Component$div_release()).f35248z0.get();
        fd.j0.h(gVar, "div2Component.divVideoActionHandler");
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9.e getHistogramReporter() {
        return (b9.e) this.J.getValue();
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private e8.d getTooltipController() {
        e8.d dVar = ((r7.a.b) getDiv2Component$div_release()).G.get();
        fd.j0.h(dVar, "div2Component.tooltipController");
        return dVar;
    }

    private w7.h getVariableController() {
        u7.d dVar = this.f31365z;
        if (dVar == null) {
            return null;
        }
        return dVar.f36046b;
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public final l1.c A(l1 l1Var) {
        Object next;
        long jB = B(l1Var);
        Iterator<T> it = l1Var.f41198b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((l1.c) next).f41208b == jB) {
                return (l1.c) next;
            }
        }
        next = null;
        return (l1.c) next;
    }

    public final long B(l1 l1Var) {
        c8.f currentState = getCurrentState();
        Long lValueOf = currentState == null ? null : Long.valueOf(currentState.f3634a);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        fd.j0.i(l1Var, "<this>");
        if (!l1Var.f41198b.isEmpty()) {
            return l1Var.f41198b.get(0).f41208b;
        }
        h9.d.h(l1.f41189h);
        return -1L;
    }

    public void C(q9.a aVar) {
        synchronized (this.B) {
            this.f31360u.add(aVar);
        }
    }

    public void D() {
        q0 q0VarD = ((r7.a.b) getDiv2Component$div_release()).d();
        fd.j0.h(q0VarD, "div2Component.visibilityActionTracker");
        for (Map.Entry<View, y9.k> entry : this.f31362w.entrySet()) {
            View key = entry.getKey();
            y9.k value = entry.getValue();
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            if (p0.e0.g.b(key)) {
                fd.j0.h(value, "div");
                q0VarD.d(this, key, value, (8 & 8) != 0 ? l8.b.A(value.a()) : null);
            }
        }
    }

    public final void E(l1.c cVar) {
        q0 q0VarD = ((r7.a.b) getDiv2Component$div_release()).d();
        fd.j0.h(q0VarD, "div2Component.visibilityActionTracker");
        k view = getView();
        y9.k kVar = cVar.f41207a;
        q0VarD.d(this, view, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
    }

    public void F() {
        List<l1.c> list;
        l1 divData = getDivData();
        l1.c cVar = null;
        Object obj = null;
        cVar = null;
        if (divData != null && (list = divData.f41198b) != null) {
            for (Object obj2 : list) {
                if (((l1.c) obj2).f41208b == getStateId$div_release()) {
                    obj = obj2;
                    break;
                }
            }
            cVar = (l1.c) obj;
        }
        if (cVar != null) {
            E(cVar);
        }
        D();
    }

    public y9.k G(View view) {
        fd.j0.i(view, "view");
        return this.f31362w.remove(view);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final boolean H(l1 l1Var, o7.a aVar) {
        View viewQ;
        b9.e histogramReporter = getHistogramReporter();
        if (histogramReporter != null) {
            histogramReporter.f3365e = Long.valueOf(SystemClock.uptimeMillis());
        }
        l1 divData = getDivData();
        r1.p pVar = null;
        setDivData$div_release(null);
        o7.a aVar2 = o7.a.f33994b;
        fd.j0.h(aVar2, "INVALID");
        setDataTag$div_release(aVar2);
        Iterator<T> it = this.f31359t.iterator();
        while (it.hasNext()) {
            ((z7.e) it.next()).cancel();
        }
        this.f31359t.clear();
        this.f31362w.clear();
        this.f31363x.clear();
        e8.d tooltipController = getTooltipController();
        Objects.requireNonNull(tooltipController);
        fd.j0.i(this, "div2View");
        tooltipController.b(this, this);
        s();
        this.f31361v.clear();
        setDataTag$div_release(aVar);
        setDivData$div_release(l1Var);
        l1.c cVarA = divData == null ? null : A(divData);
        l1.c cVarA2 = A(l1Var);
        setStateId$div_release(B(l1Var));
        boolean z10 = false;
        if (cVarA2 != null) {
            if (divData == null) {
                ((r7.a.b) getDiv2Component$div_release()).c().b(getDataTag(), getStateId$div_release(), true);
                c8.e eVarA = c8.e.f3631c.a(cVarA2.f41208b);
                viewQ = this.f31358s.b(cVarA2.f41207a, this, eVarA);
                if (this.f31356q) {
                    setBindOnAttachRunnable$div_release(new f8.e(this, new m(this, viewQ, cVarA2, eVarA)));
                } else {
                    ((r7.a.b) getDiv2Component$div_release()).b().b(viewQ, cVarA2.f41207a, this, eVarA);
                    WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                    if (p0.e0.g.b(this)) {
                        ((r7.a.b) getDiv2Component$div_release()).b().a();
                    } else {
                        addOnAttachStateChangeListener(new l(this, this));
                    }
                }
            } else {
                viewQ = q(cVarA2, getStateId$div_release(), true);
            }
            if (cVarA != null) {
                t(cVarA);
            }
            E(cVarA2);
            if (!(divData != null && j8.c.a(divData, getExpressionResolver())) && !j8.c.a(l1Var, getExpressionResolver())) {
                fd.j0.i(this, "<this>");
                fd.j0.i(this, "divView");
                Iterator<View> it2 = ((p0.i0.a) p0.i0.b(this)).iterator();
                while (true) {
                    p0.j0 j0Var = (p0.j0) it2;
                    if (!j0Var.hasNext()) {
                        break;
                    }
                    u1.a.u(getReleaseViewVisitor$div_release(), (View) j0Var.next());
                }
            } else {
                y9.k kVar = cVarA == null ? null : cVarA.f41207a;
                y9.k kVar2 = cVarA2.f41207a;
                if (!fd.j0.d(kVar, kVar2)) {
                    r1.p pVarA = ((r7.a.c) getViewComponent$div_release()).c().a(kVar == null ? null : u(divData, kVar), kVar2 == null ? null : u(l1Var, kVar2), getExpressionResolver());
                    if (pVarA.d() != 0) {
                        p7.o0 o0Var = ((r7.a.b) getDiv2Component$div_release()).f35197a.f34536d;
                        Objects.requireNonNull(o0Var, "Cannot return null from a non-@Nullable @Provides method");
                        o0Var.b(this, l1Var);
                        pVarA.addListener(new p(pVarA, o0Var, this, l1Var));
                        pVar = pVarA;
                    }
                }
                if (pVar == null) {
                    fd.j0.i(this, "<this>");
                    fd.j0.i(this, "divView");
                    Iterator<View> it3 = ((p0.i0.a) p0.i0.b(this)).iterator();
                    while (true) {
                        p0.j0 j0Var2 = (p0.j0) it3;
                        if (!j0Var2.hasNext()) {
                            break;
                        }
                        u1.a.u(getReleaseViewVisitor$div_release(), (View) j0Var2.next());
                    }
                } else {
                    r1.j jVar = (r1.j) getTag(R.id.transition_current_scene);
                    if (jVar != null) {
                        jVar.f35099d = new androidx.activity.c(this);
                    }
                    r1.j jVar2 = new r1.j(this, viewQ);
                    r1.n.b(this);
                    ViewGroup viewGroup = jVar2.f35097b;
                    if (!r1.n.f35117c.contains(viewGroup)) {
                        r1.j jVarB = r1.j.b(viewGroup);
                        r1.n.f35117c.add(viewGroup);
                        r1.l lVarClone = pVar.clone();
                        if (jVarB != null) {
                            if (jVarB.f35096a > 0) {
                                lVarClone.setCanRemoveViews(true);
                            }
                        }
                        r1.n.d(viewGroup, lVarClone);
                        jVar2.a();
                        r1.n.a aVar3 = new r1.n.a(lVarClone, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar3);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar3);
                    }
                }
                z10 = true;
            }
            removeAllViews();
            addView(viewQ);
            ((r7.a.c) getViewComponent$div_release()).b().a(this);
            z10 = true;
        }
        o();
        if (this.f31356q && divData == null) {
            b9.e histogramReporter2 = getHistogramReporter();
            if (histogramReporter2 != null) {
                histogramReporter2.f3366f = Long.valueOf(SystemClock.uptimeMillis());
            }
            this.E = new f8.e(this, new f());
            this.F = new f8.e(this, new g());
        } else {
            b9.e histogramReporter3 = getHistogramReporter();
            if (histogramReporter3 != null) {
                histogramReporter3.b();
            }
        }
        return z10;
    }

    @Override // p7.f1
    public void b(long j10, boolean z10) {
        synchronized (this.B) {
            h9.d.h(l1.f41189h);
            if (j10 != -1) {
                f8.e bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                if (bindOnAttachRunnable$div_release != null) {
                    bindOnAttachRunnable$div_release.f29419a = null;
                }
                v(j10, z10);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p7.f1
    public void c(c8.e eVar, boolean z10) {
        List<l1.c> list;
        synchronized (this.B) {
            long stateId$div_release = getStateId$div_release();
            long j10 = eVar.f3632a;
            if (stateId$div_release == j10) {
                f8.e bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                Object obj = null;
                cVar = null;
                l1.c cVar = null;
                if (bindOnAttachRunnable$div_release != null) {
                    bindOnAttachRunnable$div_release.f29419a = null;
                }
                l1 divData = getDivData();
                if (divData != null && (list = divData.f41198b) != null) {
                    for (Object obj2 : list) {
                        if (((l1.c) obj2).f41208b == eVar.f3632a) {
                            obj = obj2;
                            break;
                        }
                    }
                    cVar = (l1.c) obj;
                }
                this.f31364y.c(cVar, eVar, z10);
            } else {
                h9.d.h(l1.f41189h);
                if (j10 != -1) {
                    c8.c cVarC = ((r7.a.b) getDiv2Component$div_release()).c();
                    String str = getDataTag().f33995a;
                    fd.j0.h(str, "dataTag.id");
                    cVarC.c(str, eVar, z10);
                    b(eVar.f3632a, z10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fd.j0.i(canvas, "canvas");
        if (this.Q) {
            b9.e histogramReporter = getHistogramReporter();
            Objects.requireNonNull(histogramReporter);
            histogramReporter.f3371k = Long.valueOf(SystemClock.uptimeMillis());
        }
        l8.b.w(this, canvas);
        super.dispatchDraw(canvas);
        if (this.Q) {
            getHistogramReporter().c();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.Q = false;
        b9.e histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f3371k = Long.valueOf(SystemClock.uptimeMillis());
        super.draw(canvas);
        getHistogramReporter().c();
        this.Q = true;
    }

    @Override // p7.f1
    public void e(String str) {
        e8.d tooltipController = getTooltipController();
        Objects.requireNonNull(tooltipController);
        jc.h<x7, View> hVarC = e8.h.c(str, this);
        if (hVarC == null) {
            return;
        }
        x7 x7Var = hVarC.f31811c;
        View view = hVarC.f31812d;
        if (tooltipController.f29084f.containsKey(x7Var.f44178e)) {
            return;
        }
        if (!x1.q.k(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e8.e(tooltipController, view, x7Var, this));
        } else {
            e8.d.a(tooltipController, view, x7Var, this);
        }
        if (x1.q.k(view) || view.isLayoutRequested()) {
            return;
        }
        view.requestLayout();
    }

    public p7.j getActionHandler() {
        return this.N;
    }

    public f8.e getBindOnAttachRunnable$div_release() {
        return this.D;
    }

    public String getComponentName() {
        return getHistogramReporter().f3363c;
    }

    public e1 getConfig() {
        e1 e1Var = this.H;
        fd.j0.h(e1Var, "config");
        return e1Var;
    }

    public c8.f getCurrentState() {
        l1 divData = getDivData();
        if (divData == null) {
            return null;
        }
        c8.f fVarA = ((r7.a.b) getDiv2Component$div_release()).c().a(getDataTag());
        List<l1.c> list = divData.f41198b;
        boolean z10 = true;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (fVarA != null && ((l1.c) it.next()).f41208b == fVarA.f3634a) {
                }
            }
            z10 = false;
        }
        if (z10) {
            return fVarA;
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    public p7.k0 getCustomContainerChildFactory$div_release() {
        Objects.requireNonNull((r7.a.b) getDiv2Component$div_release());
        return new p7.k0();
    }

    public o7.a getDataTag() {
        return this.K;
    }

    public r7.b getDiv2Component$div_release() {
        return this.f31354o;
    }

    public l1 getDivData() {
        return this.M;
    }

    public o7.a getDivTag() {
        return getDataTag();
    }

    public d8.a getDivTimerEventDispatcher$div_release() {
        return this.A;
    }

    public j8.b getDivTransitionHandler$div_release() {
        return this.R;
    }

    @Override // p7.f1
    public v9.d getExpressionResolver() {
        u7.d dVar = this.f31365z;
        v9.d dVar2 = dVar == null ? null : dVar.f36045a;
        return dVar2 == null ? v9.d.f36763a : dVar2;
    }

    public String getLogId() {
        String str;
        l1 divData = getDivData();
        return (divData == null || (str = divData.f41197a) == null) ? "" : str;
    }

    public o7.a getPrevDataTag() {
        return this.L;
    }

    public o8.y getReleaseViewVisitor$div_release() {
        return ((r7.a.c) getViewComponent$div_release()).f35253e.get();
    }

    public long getStateId$div_release() {
        return this.G;
    }

    @Override // p7.f1
    public k getView() {
        return this;
    }

    public r7.i getViewComponent$div_release() {
        return this.f31355p;
    }

    public boolean getVisualErrorsEnabled() {
        return ((r7.a.c) getViewComponent$div_release()).b().f34839b;
    }

    @Override // p7.f1
    public void h(String str) {
        getTooltipController().c(str, this);
    }

    public void m(z7.e eVar, View view) {
        fd.j0.i(view, "targetView");
        synchronized (this.B) {
            this.f31359t.add(eVar);
        }
    }

    public boolean n(String str, String str2) {
        a8.f playerView;
        a8.g divVideoActionHandler = getDivVideoActionHandler();
        Objects.requireNonNull(divVideoActionHandler);
        o8.s sVarA = divVideoActionHandler.a(this, str);
        a8.a attachedPlayer = null;
        if (sVarA != null && (playerView = sVarA.getPlayerView()) != null) {
            attachedPlayer = playerView.getAttachedPlayer();
        }
        if (attachedPlayer == null) {
            return false;
        }
        if (fd.j0.d(str2, "start")) {
            attachedPlayer.play();
        } else {
            if (!fd.j0.d(str2, "pause")) {
                int i10 = e9.a.f29114a;
                return false;
            }
            attachedPlayer.pause();
        }
        return true;
    }

    public final void o() {
        if (this.f31356q) {
            this.C = new f8.e(this, new b());
            return;
        }
        u7.d dVar = this.f31365z;
        if (dVar == null) {
            return;
        }
        dVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f8.e eVar = this.E;
        if (eVar != null) {
            eVar.a();
        }
        f8.e eVar2 = this.C;
        if (eVar2 != null) {
            eVar2.a();
        }
        f8.e bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            bindOnAttachRunnable$div_release.a();
        }
        f8.e eVar3 = this.F;
        if (eVar3 == null) {
            return;
        }
        eVar3.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F();
        d8.a divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release == null) {
            return;
        }
        divTimerEventDispatcher$div_release.c(this);
    }

    @Override // m9.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b9.e histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f3370j = Long.valueOf(SystemClock.uptimeMillis());
        super.onLayout(z10, i10, i11, i12, i13);
        F();
        b9.e histogramReporter2 = getHistogramReporter();
        Long l10 = histogramReporter2.f3370j;
        if (l10 == null) {
            return;
        }
        histogramReporter2.a().f3649d += histogramReporter2.d(l10.longValue());
    }

    @Override // m9.g, android.view.View
    public void onMeasure(int i10, int i11) {
        b9.e histogramReporter = getHistogramReporter();
        Objects.requireNonNull(histogramReporter);
        histogramReporter.f3369i = Long.valueOf(SystemClock.uptimeMillis());
        super.onMeasure(i10, i11);
        b9.e histogramReporter2 = getHistogramReporter();
        Long l10 = histogramReporter2.f3369i;
        if (l10 == null) {
            return;
        }
        histogramReporter2.a().f3648c += histogramReporter2.d(l10.longValue());
    }

    public void p(View view, y9.k kVar) {
        fd.j0.i(view, "view");
        fd.j0.i(kVar, "div");
        this.f31362w.put(view, kVar);
    }

    public final View q(l1.c cVar, long j10, boolean z10) {
        ((r7.a.b) getDiv2Component$div_release()).c().b(getDataTag(), j10, z10);
        View viewA = this.f31358s.a(cVar.f41207a, this, c8.e.f3631c.a(cVar.f41208b));
        ((r7.a.b) getDiv2Component$div_release()).b().a();
        return viewA;
    }

    public void r(uc.a<jc.w> aVar) {
        this.f31364y.a(aVar);
    }

    public void s() {
        synchronized (this.B) {
            this.f31360u.clear();
        }
    }

    public void setActionHandler(p7.j jVar) {
        this.N = jVar;
    }

    public void setBindOnAttachRunnable$div_release(f8.e eVar) {
        this.D = eVar;
    }

    public void setComponentName(String str) {
        getHistogramReporter().f3363c = str;
    }

    public void setConfig(e1 e1Var) {
        fd.j0.i(e1Var, "viewConfig");
        this.H = e1Var;
    }

    public void setDataTag$div_release(o7.a aVar) {
        fd.j0.i(aVar, "value");
        setPrevDataTag$div_release(this.K);
        this.K = aVar;
        this.f31357r.a(aVar, getDivData());
    }

    public void setDivData$div_release(l1 l1Var) {
        d8.a divTimerEventDispatcher$div_release;
        this.M = l1Var;
        l1 divData = getDivData();
        d8.a aVar = null;
        if (divData != null) {
            u7.d dVar = this.f31365z;
            u7.d dVarA = ((r7.a.b) getDiv2Component$div_release()).f35230q0.get().a(getDataTag(), divData);
            this.f31365z = dVarA;
            if (!fd.j0.d(dVar, dVarA) && dVar != null) {
                Iterator<T> it = dVar.f36047c.f36717g.iterator();
                while (it.hasNext()) {
                    ((v7.a) it.next()).a(null);
                }
            }
        }
        l1 divData2 = getDivData();
        if (divData2 != null) {
            d8.b bVar = ((r7.a.b) getDiv2Component$div_release()).f35246y0.get();
            o7.a dataTag = getDataTag();
            v9.d expressionResolver = getExpressionResolver();
            Objects.requireNonNull(bVar);
            fd.j0.i(dataTag, "dataTag");
            fd.j0.i(divData2, "data");
            fd.j0.i(expressionResolver, "expressionResolver");
            List<v7> list = divData2.f41199c;
            if (list != null) {
                q8.d dVarA2 = bVar.f28853b.a(dataTag, divData2);
                Map<String, d8.a> map = bVar.f28854c;
                fd.j0.h(map, "controllers");
                String str = dataTag.f33995a;
                d8.a aVar2 = map.get(str);
                if (aVar2 == null) {
                    aVar2 = new d8.a(dVarA2);
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        aVar2.a(new d8.j((v7) it2.next(), bVar.f28852a, dVarA2, expressionResolver));
                    }
                    map.put(str, aVar2);
                }
                d8.a aVar3 = aVar2;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    v7 v7Var = (v7) it3.next();
                    if (!(aVar3.b(v7Var.f43581c) != null)) {
                        aVar3.a(new d8.j(v7Var, bVar.f28852a, dVarA2, expressionResolver));
                    }
                }
                ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((v7) it4.next()).f43581c);
                }
                fd.j0.i(arrayList, "ids");
                Map<String, d8.j> map2 = aVar3.f28848b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, d8.j> entry : map2.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (d8.j jVar : linkedHashMap.values()) {
                    jVar.f28893e = null;
                    jVar.f28898j.h();
                    jVar.f28897i = true;
                }
                aVar3.f28849c.clear();
                aVar3.f28849c.addAll(arrayList);
                aVar = aVar3;
            }
            if (!fd.j0.d(getDivTimerEventDispatcher$div_release(), aVar) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
                divTimerEventDispatcher$div_release.c(this);
            }
            setDivTimerEventDispatcher$div_release(aVar);
            if (aVar != null) {
                fd.j0.i(this, "view");
                Timer timer = new Timer();
                aVar.f28850d = timer;
                aVar.f28851e = this;
                Iterator<T> it5 = aVar.f28849c.iterator();
                while (it5.hasNext()) {
                    d8.j jVar2 = aVar.f28848b.get((String) it5.next());
                    if (jVar2 != null) {
                        fd.j0.i(this, "view");
                        fd.j0.i(timer, "timer");
                        jVar2.f28893e = this;
                        d8.d dVar2 = jVar2.f28898j;
                        Objects.requireNonNull(dVar2);
                        fd.j0.i(timer, "parentTimer");
                        dVar2.f28872o = timer;
                        if (jVar2.f28897i) {
                            jVar2.f28898j.g();
                            jVar2.f28897i = false;
                        }
                    }
                }
            }
        }
        this.f31357r.a(getDataTag(), this.M);
    }

    public void setDivTimerEventDispatcher$div_release(d8.a aVar) {
        this.A = aVar;
    }

    public void setPrevDataTag$div_release(o7.a aVar) {
        fd.j0.i(aVar, "<set-?>");
        this.L = aVar;
    }

    public void setStateId$div_release(long j10) {
        this.G = j10;
    }

    public void setVisualErrorsEnabled(boolean z10) {
        q8.n nVarB = ((r7.a.c) getViewComponent$div_release()).b();
        nVarB.f34839b = z10;
        nVarB.b();
    }

    public final void t(l1.c cVar) {
        q0 q0VarD = ((r7.a.b) getDiv2Component$div_release()).d();
        fd.j0.h(q0VarD, "div2Component.visibilityActionTracker");
        y9.k kVar = cVar.f41207a;
        q0VarD.d(this, null, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
    }

    public final dd.g<y9.k> u(l1 l1Var, y9.k kVar) {
        v9.b<b8> bVar;
        v9.d expressionResolver = getExpressionResolver();
        kc.f fVar = new kc.f();
        b8 b8VarB = (l1Var == null || (bVar = l1Var.f41200d) == null) ? null : bVar.b(expressionResolver);
        if (b8VarB == null) {
            b8VarB = b8.NONE;
        }
        fVar.a(b8VarB);
        f8.a aVarB = u1.a.v(kVar).b(new c(fVar, expressionResolver));
        return dd.q.d(new f8.a(aVarB.f29403a, aVarB.f29404b, new d(fVar), aVarB.f29406d), new e(fVar));
    }

    public final boolean v(long j10, boolean z10) {
        l1.c cVar;
        l1.c cVar2;
        List<l1.c> list;
        Object next;
        List<l1.c> list2;
        Object next2;
        setStateId$div_release(j10);
        c8.f currentState = getCurrentState();
        Long lValueOf = currentState == null ? null : Long.valueOf(currentState.f3634a);
        l1 divData = getDivData();
        if (divData == null || (list2 = divData.f41198b) == null) {
            cVar = null;
        } else {
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!(lValueOf != null && ((l1.c) next2).f41208b == lValueOf.longValue()));
            cVar = (l1.c) next2;
        }
        l1 divData2 = getDivData();
        if (divData2 == null || (list = divData2.f41198b) == null) {
            cVar2 = null;
        } else {
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((l1.c) next).f41208b == j10));
            cVar2 = (l1.c) next;
        }
        if (cVar2 != null) {
            if (cVar != null) {
                t(cVar);
            }
            E(cVar2);
            if (j8.a.b(cVar != null ? cVar.f41207a : null, cVar2.f41207a, getExpressionResolver())) {
                View childAt = getView().getChildAt(0);
                u uVarB = ((r7.a.b) getDiv2Component$div_release()).b();
                fd.j0.h(childAt, "rootView");
                uVarB.b(childAt, cVar2.f41207a, this, c8.e.f3631c.a(j10));
                ((r7.a.b) getDiv2Component$div_release()).c().b(getDataTag(), j10, z10);
                ((r7.a.b) getDiv2Component$div_release()).b().a();
            } else {
                fd.j0.i(this, "<this>");
                fd.j0.i(this, "divView");
                Iterator<View> it3 = ((p0.i0.a) p0.i0.b(this)).iterator();
                while (it3.hasNext()) {
                    u1.a.u(getReleaseViewVisitor$div_release(), it3.next());
                }
                removeAllViews();
                addView(q(cVar2, j10, z10));
            }
        }
        return cVar2 != null;
    }

    public final void w(l1 l1Var, boolean z10) {
        Object next;
        try {
            if (getChildCount() == 0) {
                H(l1Var, getDataTag());
                return;
            }
            b9.e histogramReporter = getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.f3368h = Long.valueOf(SystemClock.uptimeMillis());
            }
            q8.d dVarA = ((r7.a.c) getViewComponent$div_release()).a().a(getDataTag(), getDivData());
            dVarA.f34811e.clear();
            dVarA.f34808b.clear();
            dVarA.c();
            Iterator<T> it = l1Var.f41198b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((l1.c) next).f41208b == getStateId$div_release()));
            l1.c cVar = (l1.c) next;
            if (cVar == null) {
                cVar = l1Var.f41198b.get(0);
            }
            View childAt = getChildAt(0);
            fd.j0.h(childAt, "");
            l8.b.r(childAt, cVar.f41207a.a(), getExpressionResolver());
            setDivData$div_release(l1Var);
            ((r7.a.b) getDiv2Component$div_release()).b().b(childAt, cVar.f41207a, this, c8.e.f3631c.a(getStateId$div_release()));
            requestLayout();
            if (z10) {
                c8.b bVar = ((r7.a.b) getDiv2Component$div_release()).f35197a.f34537e;
                Objects.requireNonNull(bVar, "Cannot return null from a non-@Nullable @Provides method");
                bVar.a(this);
            }
            o();
            b9.e histogramReporter2 = getHistogramReporter();
            if (histogramReporter2 == null) {
                return;
            }
            Long l10 = histogramReporter2.f3368h;
            c9.a aVarA = histogramReporter2.a();
            if (l10 == null) {
                int i10 = e9.a.f29114a;
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis() - l10.longValue();
                aVarA.f3647b = jUptimeMillis;
                d9.a.a(histogramReporter2.f3361a.invoke(), "Div.Rebinding", jUptimeMillis, histogramReporter2.f3363c, null, null, 24, null);
            }
            histogramReporter2.f3368h = null;
        } catch (Exception unused) {
            H(l1Var, getDataTag());
            int i11 = e9.a.f29114a;
        }
    }

    public final void x() {
        long j10;
        if (this.O < 0) {
            return;
        }
        p7.j0 j0Var = ((r7.a.b) getDiv2Component$div_release()).f35199b;
        long j11 = this.f31353n;
        long j12 = this.O;
        d9.a aVar = ((r7.a.b) getDiv2Component$div_release()).B0.get();
        fd.j0.h(aVar, "div2Component.histogramReporter");
        String str = this.P;
        Objects.requireNonNull(j0Var);
        fd.j0.i(str, "viewCreateCallType");
        if (j12 < 0) {
            j10 = -1;
        } else {
            long j13 = j12 - j11;
            j10 = -1;
            d9.a.a(aVar, "Div.View.Create", j13, null, str, null, 20, null);
            if (j0Var.f34530c.compareAndSet(false, true)) {
                long j14 = j0Var.f34529b;
                if (j14 >= 0) {
                    d9.a.a(aVar, "Div.Context.Create", j14 - j0Var.f34528a, null, j0Var.f34531d, null, 20, null);
                    j0Var.f34529b = -1L;
                }
            }
        }
        this.O = j10;
    }

    public boolean y(l1 l1Var, o7.a aVar) {
        boolean zH;
        l1 divData = getDivData();
        synchronized (this.B) {
            zH = false;
            if (l1Var != null) {
                if (!fd.j0.d(getDivData(), l1Var)) {
                    f8.e bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                    l1 l1Var2 = null;
                    if (bindOnAttachRunnable$div_release != null) {
                        bindOnAttachRunnable$div_release.f29419a = null;
                    }
                    getHistogramReporter().f3364d = true;
                    l1 divData2 = getDivData();
                    if (divData2 != null) {
                        divData = divData2;
                    }
                    if (j8.a.e(divData, l1Var, getStateId$div_release(), getExpressionResolver())) {
                        l1Var2 = divData;
                    }
                    setDataTag$div_release(aVar);
                    for (l1.c cVar : l1Var.f41198b) {
                        p7.y0 y0Var = ((r7.a.b) getDiv2Component$div_release()).F.get();
                        fd.j0.h(y0Var, "div2Component.preloader");
                        y9.k kVar = cVar.f41207a;
                        v9.d expressionResolver = getExpressionResolver();
                        p7.y0.a aVar2 = p7.y0.f34605d;
                        y0Var.a(kVar, expressionResolver, p7.y0.f34605d);
                    }
                    if (l1Var2 != null) {
                        if (j8.c.a(l1Var, getExpressionResolver())) {
                            H(l1Var, aVar);
                        } else {
                            w(l1Var, false);
                        }
                        ((r7.a.b) getDiv2Component$div_release()).b().a();
                    } else {
                        zH = H(l1Var, aVar);
                    }
                    x();
                }
            }
        }
        return zH;
    }

    public w8.f z(String str, String str2) {
        fd.j0.i(str, "name");
        fd.j0.i(str2, "value");
        w7.h variableController = getVariableController();
        w8.d dVarB = variableController == null ? null : variableController.b(str);
        if (dVarB == null) {
            w8.f fVar = new w8.f(androidx.activity.j.a("Variable '", str, "' not defined!"), null, 2, null);
            ((r7.a.c) getViewComponent$div_release()).a().a(getDivTag(), getDivData()).a(fVar);
            return fVar;
        }
        try {
            dVarB.d(str2);
            return null;
        } catch (w8.f e10) {
            w8.f fVar2 = new w8.f(androidx.activity.j.a("Variable '", str, "' mutation failed!"), e10);
            ((r7.a.c) getViewComponent$div_release()).a().a(getDivTag(), getDivData()).a(fVar2);
            return fVar2;
        }
    }
}
