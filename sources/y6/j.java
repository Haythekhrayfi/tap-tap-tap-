package y6;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.ViewModelEvent;
import com.inscode.autoclicker.service.ClickService;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends k1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f38212r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f38213s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jc.e f38214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f38215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nb.a f38216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f38217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jc.e f38218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f38220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g7.a f38222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jc.e f38223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f38224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f38225q;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<y6.b, jc.w> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(y6.b bVar) {
            if (fd.j0.d(bVar, l1.f38284a)) {
                j jVar = j.this;
                a aVar = j.f38212r;
                jVar.l().e();
            }
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f38227c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[COMBINE] [ERROR] (observeGlobalActions) ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<q6.a, jc.w> {
        public d() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(q6.a aVar) {
            q6.a aVar2 = aVar;
            j jVar = j.this;
            fd.j0.h(aVar2, "it");
            a aVar3 = j.f38212r;
            Objects.requireNonNull(jVar);
            if (aVar2 instanceof r6.h) {
                jVar.f38221m = ((r6.h) aVar2).f35180a;
            } else if (aVar2 instanceof r6.i) {
                jVar.f38220l = ((r6.i) aVar2).f35181a;
            }
            jVar.u();
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f38229c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[COMBINE] [ERROR] (observeViewModel) ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<ViewModelEvent, jc.w> {
        public f() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(ViewModelEvent viewModelEvent) {
            ViewModelEvent viewModelEvent2 = viewModelEvent;
            j jVar = j.this;
            fd.j0.h(viewModelEvent2, "it");
            a aVar = j.f38212r;
            Objects.requireNonNull(jVar);
            if (viewModelEvent2 instanceof z6.q0) {
                xe.a.f37601c.a("[COMBINE] Playing started.", new Object[0]);
                j.f38213s = 2;
            } else if (viewModelEvent2 instanceof z6.r0) {
                xe.a.f37601c.a("[COMBINE] Playing stopped.", new Object[0]);
                j.f38213s = 0;
                if (!jVar.f38269e) {
                    jVar.e();
                }
                jVar.t();
                jVar.k().f34781a.d(Boolean.TRUE);
            } else {
                if (viewModelEvent2 instanceof z6.p0) {
                    j.f38213s = 2;
                } else if (viewModelEvent2 instanceof z6.o0) {
                    j.f38213s = 3;
                } else if (viewModelEvent2 instanceof z6.s0) {
                    jVar.t();
                } else if (viewModelEvent2 instanceof z6.n0) {
                    z6.n0 n0Var = (z6.n0) viewModelEvent2;
                    try {
                        View view = jVar.f38224p;
                        if (view == null) {
                            fd.j0.r("widgetView");
                            throw null;
                        }
                        ((TextView) view.findViewById(R.id.currentRecording)).setText("> " + n0Var.f45119a);
                        View view2 = jVar.f38224p;
                        if (view2 == null) {
                            fd.j0.r("widgetView");
                            throw null;
                        }
                        ((TextView) view2.findViewById(R.id.currentRecording)).setSelected(true);
                    } catch (Exception e10) {
                        xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[COMBINE] [ERROR} Set current recording issue: ", e10, ' ')), new Object[0]);
                    }
                } else if (viewModelEvent2 instanceof z6.t0) {
                    z6.t0 t0Var = (z6.t0) viewModelEvent2;
                    View view3 = jVar.f38224p;
                    if (view3 == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    ((TextView) view3.findViewById(R.id.timeLeft)).setText(u1.a.q(t0Var.f45138a));
                }
                jVar.t();
            }
            jVar.t();
            return jc.w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f38231c = new g();

        public g() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38233d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(WindowManager.LayoutParams layoutParams) {
            super(0);
            this.f38233d = layoutParams;
        }

        @Override // uc.a
        public jc.w invoke() {
            j jVar = j.this;
            a aVar = j.f38212r;
            WindowManager windowManagerM = jVar.m();
            View view = j.this.f38224p;
            if (view != null) {
                windowManagerM.updateViewLayout(view, this.f38233d);
                return jc.w.f31842a;
            }
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public static final class i extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f38234c = new i();

        public i() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    /* JADX INFO: renamed from: y6.j$j, reason: collision with other inner class name */
    public static final class C0468j extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38236d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0468j(WindowManager.LayoutParams layoutParams) {
            super(0);
            this.f38236d = layoutParams;
        }

        @Override // uc.a
        public jc.w invoke() {
            j jVar = j.this;
            a aVar = j.f38212r;
            WindowManager windowManagerM = jVar.m();
            View view = j.this.f38224p;
            if (view != null) {
                windowManagerM.updateViewLayout(view, this.f38236d);
                return jc.w.f31842a;
            }
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public static final class k extends vc.l implements uc.a<jc.w> {
        public k() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            j jVar = j.this;
            a aVar = j.f38212r;
            Objects.requireNonNull(jVar);
            int i10 = j.f38213s;
            if (i10 == 0) {
                jVar.l().d();
            } else if (i10 == 2) {
                jVar.l().a();
            } else if (i10 == 3) {
                jVar.l().b();
            }
            return jc.w.f31842a;
        }
    }

    public static final class l extends vc.l implements uc.a<jc.w> {
        public l() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            j jVar = j.this;
            a aVar = j.f38212r;
            Objects.requireNonNull(jVar);
            int i10 = j.f38213s;
            if (i10 == 2 || i10 == 3) {
                jVar.l().e();
            }
            return jc.w.f31842a;
        }
    }

    public static final class m extends vc.l implements uc.a<jc.w> {
        public m() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            j jVar = j.this;
            View view = jVar.f38224p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.menuButton);
            fd.j0.h(imageView, "widgetView.menuButton");
            if (fd.j0.d(imageView.getTag(), Boolean.FALSE) || imageView.getTag() == null) {
                b7.b.a aVar = b7.b.f3347a;
                Context context = imageView.getContext();
                fd.j0.h(context, "view.context");
                String string = jVar.j().getString(R.string.combinations_load_save);
                fd.j0.h(string, "context.getString(R.string.combinations_load_save)");
                String string2 = jVar.j().getString(R.string.edit_current_comb);
                fd.j0.h(string2, "context.getString(R.string.edit_current_comb)");
                String string3 = jVar.j().getString(R.string.show_app);
                fd.j0.h(string3, "context.getString(R.string.show_app)");
                String string4 = jVar.j().getString(R.string.turn_off);
                fd.j0.h(string4, "context.getString(R.string.turn_off)");
                PopupWindow popupWindowA = aVar.a(context, kc.l.c(new b7.a(0, R.drawable.ic_settings, string), new b7.a(1, R.drawable.ic_settings, string2), new b7.a(2, R.drawable.ic_app, string3), new b7.a(3, R.drawable.ic_turn_off, string4)), new y6.n(jVar));
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                imageView.setTag(Boolean.TRUE);
                popupWindowA.setOnDismissListener(new y6.h(imageView, 0));
                View view2 = jVar.f38225q;
                if (view2 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                popupWindowA.showAtLocation(view2, 0, kc.j.p(iArr), (jVar.v() / 2) + kc.j.v(iArr));
            }
            return jc.w.f31842a;
        }
    }

    public static final class n extends vc.l implements uc.a<uc.a<? extends ClickService>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38240c = aVar;
            this.f38241d = str;
            this.f38242e = aVar2;
            this.f38243f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uc.a<? extends com.inscode.autoclicker.service.ClickService>] */
        @Override // uc.a
        public final uc.a<? extends ClickService> invoke() {
            return this.f38240c.getKoin().f37311a.c(new yd.h(this.f38241d, vc.b0.a(uc.a.class), this.f38242e, this.f38243f));
        }
    }

    public static final class o extends vc.l implements uc.a<z6.u0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38247f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38244c = aVar;
            this.f38245d = str;
            this.f38246e = aVar2;
            this.f38247f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.u0] */
        @Override // uc.a
        public final z6.u0 invoke() {
            return this.f38244c.getKoin().f37311a.c(new yd.h(this.f38245d, vc.b0.a(z6.u0.class), this.f38246e, this.f38247f));
        }
    }

    public static final class p extends vc.l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38251f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38248c = aVar;
            this.f38249d = str;
            this.f38250e = aVar2;
            this.f38251f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return this.f38248c.getKoin().f37311a.c(new yd.h(this.f38249d, vc.b0.a(q6.b.class), this.f38250e, this.f38251f));
        }
    }

    public static final class q extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38252c = aVar;
            this.f38253d = str;
            this.f38254e = aVar2;
            this.f38255f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return this.f38252c.getKoin().f37311a.c(new yd.h(this.f38253d, vc.b0.a(r6.e.class), this.f38254e, this.f38255f));
        }
    }

    public static final class r extends vc.l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38256c = aVar;
            this.f38257d = str;
            this.f38258e = aVar2;
            this.f38259f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return this.f38256c.getKoin().f37311a.c(new yd.h(this.f38257d, vc.b0.a(u2.class), this.f38258e, this.f38259f));
        }
    }

    public j() {
        ae.b bVar = ae.b.f348c;
        this.f38214f = jc.f.b(new n(this, "", null, bVar));
        this.f38215g = jc.f.b(new o(this, "", null, bVar));
        this.f38216h = new nb.a();
        this.f38217i = jc.f.b(new p(this, "", null, bVar));
        this.f38218j = jc.f.b(new q(this, "", null, bVar));
        this.f38219k = x1.q.j(32);
        this.f38220l = h().d();
        this.f38221m = h().c();
        this.f38223o = jc.f.b(new r(this, "", null, bVar));
    }

    @Override // y6.k1
    public void a() {
        xe.a.f37601c.a("[COMBINE] Destroying combination service.", new Object[0]);
        try {
            this.f38216h.d();
            l().e();
            l().f();
            View view = this.f38224p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerM = m();
                View view2 = this.f38224p;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerM.removeView(view2);
            }
            View view3 = this.f38225q;
            if (view3 == null) {
                fd.j0.r("measureView");
                throw null;
            }
            if (view3.isAttachedToWindow()) {
                WindowManager windowManagerM2 = m();
                View view4 = this.f38225q;
                if (view4 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                windowManagerM2.removeView(view4);
            }
            f38213s = 0;
            ((u2) this.f38223o.getValue()).a(r6.k.NONE);
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[COMBINE] [ERROR] (destroy): ", e10, ' ')), new Object[0]);
            e10.printStackTrace();
        }
    }

    @Override // y6.k1
    public void b() {
        if (f38213s == 2) {
            View view = this.f38224p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerM = m();
                View view2 = this.f38224p;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerM.removeView(view2);
            }
            this.f38269e = false;
        }
    }

    @Override // y6.k1
    public r6.k c() {
        return r6.k.COMBINE;
    }

    @Override // y6.k1
    public void d() {
        try {
            i().invoke().d();
            q();
            s();
            r();
            p();
            o();
            nb.b bVarE = ec.a.e(k().f34788h.u(fc.a.f29534b), y6.l.f38280c, null, new y6.m(this), 2);
            nb.a aVar = this.f38216h;
            fd.j0.j(bVarE, "$receiver");
            fd.j0.j(aVar, "compositeDisposable");
            aVar.a(bVarE);
            n();
            u();
            t();
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[COMBINE] [ERROR] (prepare): ", e10, ' ')), new Object[0]);
        }
    }

    @Override // y6.k1
    public void e() {
        View view = this.f38224p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        if (!view.isAttachedToWindow()) {
            WindowManager windowManagerM = m();
            View view2 = this.f38224p;
            if (view2 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view2 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            Object tag = view2.getTag();
            fd.j0.g(tag, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            windowManagerM.addView(view2, (ViewGroup.LayoutParams) tag);
        }
        this.f38269e = true;
    }

    @Override // y6.k1
    public void f() {
        l().d();
    }

    public final int g() {
        return (int) (((double) x1.q.j(8)) * this.f38220l);
    }

    public final r6.e h() {
        return (r6.e) this.f38218j.getValue();
    }

    public final uc.a<ClickService> i() {
        return (uc.a) this.f38214f.getValue();
    }

    public final Context j() {
        Context applicationContext = i().invoke().getApplicationContext();
        fd.j0.h(applicationContext, "clickService().applicationContext");
        return applicationContext;
    }

    public final q6.b k() {
        return (q6.b) this.f38217i.getValue();
    }

    public final z6.u0 l() {
        return (z6.u0) this.f38215g.getValue();
    }

    public final WindowManager m() {
        Object systemService = i().invoke().getSystemService("window");
        fd.j0.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    public final void n() {
        nb.b bVarE = ec.a.e(i().invoke().f13101c.u(fc.a.f29534b).p(mb.a.a()), null, null, new b(), 3);
        p6.b.a(bVarE, "$receiver", this.f38216h, "compositeDisposable", bVarE);
    }

    public final void o() {
        nb.b bVarE = ec.a.e(k().f34787g.u(fc.a.f29534b).p(mb.a.a()), c.f38227c, null, new d(), 2);
        p6.b.a(bVarE, "$receiver", this.f38216h, "compositeDisposable", bVarE);
    }

    public final void p() {
        nb.b bVarE = ec.a.e(l().g().u(fc.a.f29534b).p(mb.a.a()), e.f38229c, null, new f(), 2);
        nb.a aVar = this.f38216h;
        fd.j0.j(bVarE, "$receiver");
        fd.j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
        l().l();
    }

    public final void q() {
        View viewInflate = View.inflate(j(), R.layout.widget_combine, null);
        fd.j0.h(viewInflate, "inflate(context, layoutId(), null)");
        this.f38224p = viewInflate;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2032, 8, -3);
        layoutParams.windowAnimations = R.style.PopupAnimation;
        View view = this.f38224p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view.setTag(layoutParams);
        View view2 = this.f38224p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view2.setOnTouchListener(new g7.a(layoutParams, 0, g.f38231c, new h(layoutParams)));
        g7.a aVar = new g7.a(layoutParams, 0, i.f38234c, new C0468j(layoutParams));
        this.f38222n = aVar;
        View view3 = this.f38224p;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view3.setOnTouchListener(aVar);
        WindowManager windowManagerM = m();
        View view4 = this.f38224p;
        if (view4 != null) {
            windowManagerM.addView(view4, layoutParams);
        } else {
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public final void r() {
        d7.f fVar = new d7.f(j());
        this.f38225q = fVar;
        fVar.getViewTreeObserver().addOnGlobalFocusChangeListener(new y6.g(this));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2032, 131128, -3);
        View view = this.f38225q;
        if (view == null) {
            fd.j0.r("measureView");
            throw null;
        }
        view.setFocusableInTouchMode(true);
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : AdError.CACHE_ERROR_CODE, 8, -3);
        layoutParams2.windowAnimations = R.style.PopupAnimation;
        layoutParams2.gravity = 51;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.flags = 32;
        WindowManager windowManagerM = m();
        View view2 = this.f38225q;
        if (view2 != null) {
            windowManagerM.addView(view2, layoutParams);
        } else {
            fd.j0.r("measureView");
            throw null;
        }
    }

    public final void s() {
        View view = this.f38224p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.playPauseButton);
        Context contextJ = j();
        g7.a aVar = this.f38222n;
        if (aVar == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView.setOnTouchListener(new z2(contextJ, aVar, new k()));
        View view2 = this.f38224p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.stopButton);
        Context contextJ2 = j();
        g7.a aVar2 = this.f38222n;
        if (aVar2 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView2.setOnTouchListener(new z2(contextJ2, aVar2, new l()));
        View view3 = this.f38224p;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView3 = (ImageView) view3.findViewById(R.id.menuButton);
        Context contextJ3 = j();
        g7.a aVar3 = this.f38222n;
        if (aVar3 != null) {
            imageView3.setOnTouchListener(new z2(contextJ3, aVar3, new m()));
        } else {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
    }

    public final void t() {
        View view = this.f38224p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view.findViewById(R.id.playPauseButton)).setImageResource(f38213s == 2 ? R.drawable.ic_pause : R.drawable.ic_play);
        View view2 = this.f38224p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.stopButton);
        int i10 = f38213s;
        int i11 = 8;
        imageView.setVisibility((i10 == 2 || i10 == 3) ? 0 : 8);
        if (l().n() || l().m()) {
            View view3 = this.f38224p;
            if (view3 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((ImageView) view3.findViewById(R.id.playPauseButton)).setEnabled(false);
        } else {
            View view4 = this.f38224p;
            if (view4 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ImageView imageView2 = (ImageView) view4.findViewById(R.id.playPauseButton);
            int i12 = f38213s;
            imageView2.setEnabled(i12 == 0 || i12 == 2 || i12 == 3);
        }
        View view5 = this.f38224p;
        if (view5 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView3 = (ImageView) view5.findViewById(R.id.playPauseButton);
        View view6 = this.f38224p;
        if (view6 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        imageView3.setAlpha(((ImageView) view6.findViewById(R.id.playPauseButton)).isEnabled() ? 1.0f : 0.5f);
        View view7 = this.f38224p;
        if (view7 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView4 = (ImageView) view7.findViewById(R.id.menuButton);
        int i13 = f38213s;
        imageView4.setVisibility((i13 == 2 || i13 == 3) ? 8 : 0);
        View view8 = this.f38224p;
        if (view8 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view8.findViewById(R.id.menuButton)).setEnabled(f38213s == 0);
        View view9 = this.f38224p;
        if (view9 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView5 = (ImageView) view9.findViewById(R.id.menuButton);
        View view10 = this.f38224p;
        if (view10 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        imageView5.setAlpha(((ImageView) view10.findViewById(R.id.menuButton)).isEnabled() ? 1.0f : 0.5f);
        View view11 = this.f38224p;
        if (view11 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        TextView textView = (TextView) view11.findViewById(R.id.currentRecording);
        int i14 = f38213s;
        textView.setVisibility(((i14 == 2 || i14 == 3) && h().h()) ? 0 : 8);
        View view12 = this.f38224p;
        if (view12 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        TextView textView2 = (TextView) view12.findViewById(R.id.timeLeft);
        int i15 = f38213s;
        if ((i15 == 2 || i15 == 3) && h().g() == r6.l.ONE_TO_ONE && h().l()) {
            i11 = 0;
        }
        textView2.setVisibility(i11);
        if (f38213s == 0) {
            View view13 = this.f38224p;
            if (view13 != null) {
                ((TextView) view13.findViewById(R.id.timeLeft)).setText("00:00:00");
            } else {
                fd.j0.r("widgetView");
                throw null;
            }
        }
    }

    public final void u() {
        View view;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        View view2 = this.f38224p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.controlsContainer);
        fd.j0.g(linearLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view3 : (p0.i0.a) p0.i0.b(linearLayout)) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.width = v();
            layoutParams.height = v();
            view3.setLayoutParams(layoutParams);
            view3.requestLayout();
            view3.setPadding(this.f38221m == 1 ? g() : 0, this.f38221m != 1 ? g() : 0, 0, 0);
        }
        if (this.f38221m == 1) {
            View view4 = this.f38224p;
            if (view4 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view4).setOrientation(1);
            View view5 = this.f38224p;
            if (view5 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) view5.findViewById(R.id.controlsContainer);
            fd.j0.g(linearLayout2, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout2.setOrientation(0);
            view = this.f38224p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            iG = g() / 2;
            iG2 = g() / 2;
            iG3 = g() * 2;
            iG4 = g() / 2;
        } else {
            View view6 = this.f38224p;
            if (view6 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view6).setOrientation(0);
            View view7 = this.f38224p;
            if (view7 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout3 = (LinearLayout) view7.findViewById(R.id.controlsContainer);
            fd.j0.g(linearLayout3, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout3.setOrientation(1);
            view = this.f38224p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            iG = g() / 2;
            iG2 = g() / 2;
            iG3 = g() / 2;
            iG4 = g() * 2;
        }
        view.setPadding(iG, iG2, iG3, iG4);
    }

    public final int v() {
        return (int) (((double) this.f38219k) * this.f38220l);
    }
}
