package y6;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.ViewModelEvent;
import com.inscode.autoclicker.service.ClickService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends k1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f38116t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f38117u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jc.e f38118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gc.a<Object> f38119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jc.e f38120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f38121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jc.e f38122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nb.a f38123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f38125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jc.e f38127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f38128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f38129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g7.a f38130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<y6.c> f38131s;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f38132c = new b();

        public b() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f38134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f38136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ v2 f38137g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, WindowManager.LayoutParams layoutParams, View view2, v2 v2Var) {
            super(0);
            this.f38134d = view;
            this.f38135e = layoutParams;
            this.f38136f = view2;
            this.f38137g = v2Var;
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            d0Var.s().updateViewLayout(this.f38134d, this.f38135e);
            d0 d0Var2 = d0.this;
            View view = this.f38134d;
            fd.j0.h(view, "swipe1");
            View view2 = this.f38136f;
            fd.j0.h(view2, "swipe2");
            d0Var2.D(view, view2, this.f38137g);
            d0.this.f38119g.d(new Object());
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f38138c = new d();

        public d() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f38140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f38142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ v2 f38143g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, WindowManager.LayoutParams layoutParams, View view2, v2 v2Var) {
            super(0);
            this.f38140d = view;
            this.f38141e = layoutParams;
            this.f38142f = view2;
            this.f38143g = v2Var;
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            d0Var.s().updateViewLayout(this.f38140d, this.f38141e);
            d0 d0Var2 = d0.this;
            View view = this.f38142f;
            fd.j0.h(view, "swipe1");
            View view2 = this.f38140d;
            fd.j0.h(view2, "swipe2");
            d0Var2.D(view, view2, this.f38143g);
            d0.this.f38119g.d(new Object());
            return jc.w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f38144c = new f();

        public f() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f38146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38147e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view, WindowManager.LayoutParams layoutParams) {
            super(0);
            this.f38146d = view;
            this.f38147e = layoutParams;
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            d0Var.s().updateViewLayout(this.f38146d, this.f38147e);
            d0.this.f38119g.d(new Object());
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f38148c = new h();

        public h() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[MANUAL] [ERROR] (observeActionsChange): ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.l<Object, jc.w> {
        public i() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Object obj) {
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            d0Var.r().r(d0.k(d0.this, false, 1));
            return jc.w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<y6.b, jc.w> {
        public j() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(y6.b bVar) {
            y6.b bVar2 = bVar;
            if (fd.j0.d(bVar2, l1.f38284a)) {
                d0 d0Var = d0.this;
                a aVar = d0.f38116t;
                d0Var.r().t();
            } else if (fd.j0.d(bVar2, y6.o.f38295a)) {
                StringBuilder sbA = defpackage.a.a("Screen Details: ");
                sbA.append(Resources.getSystem().getDisplayMetrics().widthPixels);
                sbA.append(" x ");
                sbA.append(Resources.getSystem().getDisplayMetrics().heightPixels);
                xe.a.f37601c.a(sbA.toString(), new Object[0]);
                d0 d0Var2 = d0.this;
                a aVar2 = d0.f38116t;
                d0Var2.B();
                d0.this.r().r(d0.k(d0.this, false, 1));
            }
            return jc.w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f38151c = new k();

        public k() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[MANUAL] [ERROR] (observeGlobalChanges): ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class l extends vc.l implements uc.l<q6.a, jc.w> {
        public l() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(q6.a aVar) {
            q6.a aVar2 = aVar;
            d0 d0Var = d0.this;
            fd.j0.h(aVar2, "it");
            a aVar3 = d0.f38116t;
            Objects.requireNonNull(d0Var);
            if (aVar2 instanceof r6.h) {
                d0Var.f38126n = ((r6.h) aVar2).f35180a;
            } else if (aVar2 instanceof r6.i) {
                d0Var.f38125m = ((r6.i) aVar2).f35181a;
            }
            d0Var.F();
            d0Var.C();
            return jc.w.f31842a;
        }
    }

    public static final class m extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f38153c = new m();

        public m() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[MANUAL] [ERROR] (observeViewModel): ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class n extends vc.l implements uc.l<ViewModelEvent, jc.w> {
        public n() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(ViewModelEvent viewModelEvent) {
            ViewModelEvent viewModelEvent2 = viewModelEvent;
            d0 d0Var = d0.this;
            fd.j0.h(viewModelEvent2, "it");
            a aVar = d0.f38116t;
            Objects.requireNonNull(d0Var);
            if (!(viewModelEvent2 instanceof a7.c)) {
                if (viewModelEvent2 instanceof a7.d) {
                    d0.f38117u = 0;
                    if (!d0Var.f38269e) {
                        d0Var.e();
                    }
                } else if (viewModelEvent2 instanceof a7.b) {
                    d0Var.A();
                    u6.a aVar2 = ((a7.b) viewModelEvent2).f164a;
                    for (r6.d dVar : aVar2.a()) {
                        if (dVar.f()) {
                            r6.c cVar = (r6.c) kc.t.r(dVar.a());
                            d0Var.h(Float.valueOf(cVar.e()), Float.valueOf(cVar.f()));
                        } else if (!dVar.f()) {
                            r6.c cVar2 = (r6.c) kc.t.r(dVar.a());
                            r6.c cVar3 = (r6.c) kc.t.x(dVar.a());
                            d0Var.g(Float.valueOf(cVar2.e()), Float.valueOf(cVar2.f()), Float.valueOf(cVar3.e()), Float.valueOf(cVar3.f()));
                        }
                    }
                    if (aVar2.c() != Resources.getSystem().getConfiguration().orientation) {
                        d0Var.B();
                    }
                }
                return jc.w.f31842a;
            }
            d0.f38117u = 2;
            d0Var.E();
            return jc.w.f31842a;
        }
    }

    public static final class o extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f38155c = new o();

        public o() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class p extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38157d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(WindowManager.LayoutParams layoutParams) {
            super(0);
            this.f38157d = layoutParams;
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            WindowManager windowManagerS = d0Var.s();
            View view = d0.this.f38128p;
            if (view != null) {
                windowManagerS.updateViewLayout(view, this.f38157d);
                return jc.w.f31842a;
            }
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public static final class q extends vc.l implements uc.a<jc.w> {
        public q() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            Context contextQ;
            Context contextQ2;
            int i10;
            d0 d0Var = d0.this;
            a aVar = d0.f38116t;
            Objects.requireNonNull(d0Var);
            int i11 = d0.f38117u;
            if (i11 == 0) {
                if (d0Var.f38131s.isEmpty()) {
                    contextQ = d0Var.q();
                    contextQ2 = d0Var.q();
                    i10 = R.string.warn_add_one_tap;
                } else if (d0Var.f38131s.size() <= 10 || d0Var.r().f172b.f162d.b()) {
                    d0Var.r().r(d0Var.j(false));
                    a7.i iVarR = d0Var.r();
                    List<r6.d> listJ = d0Var.j(true);
                    Objects.requireNonNull(iVarR);
                    fd.j0.i(listJ, "actionSets");
                    a7.a aVar2 = iVarR.f172b;
                    u6.a aVar3 = aVar2.f161c;
                    fd.j0.i(aVar3, "<set-?>");
                    aVar2.f162d = aVar3;
                    iVarR.f172b.f162d.j(listJ);
                    d0Var.r().s();
                } else {
                    contextQ = d0Var.q();
                    contextQ2 = d0Var.q();
                    i10 = R.string.one_finger_mode;
                }
                Toast.makeText(contextQ, contextQ2.getString(i10), 0).show();
            } else if (i11 == 2) {
                d0Var.r().t();
            }
            return jc.w.f31842a;
        }
    }

    public static final class r extends vc.l implements uc.a<jc.w> {
        public r() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            View view = d0Var.f38128p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.addButton);
            fd.j0.h(imageView, "widgetView.addButton");
            if (fd.j0.d(imageView.getTag(), Boolean.FALSE) || imageView.getTag() == null) {
                b7.b.a aVar = b7.b.f3347a;
                Context context = imageView.getContext();
                fd.j0.h(context, "view.context");
                PopupWindow popupWindowA = aVar.a(context, kc.l.c(new b7.a(0, R.drawable.ic_add, e0.a(d0Var, R.string.add_tap, "context.getString(R.string.add_tap)")), new b7.a(1, R.drawable.ic_swipe, e0.a(d0Var, R.string.add_swipe, "context.getString(R.string.add_swipe)"))), new f0(d0Var));
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                imageView.setTag(Boolean.TRUE);
                popupWindowA.setOnDismissListener(new y6.h(imageView, 1));
                View view2 = d0Var.f38129q;
                if (view2 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                popupWindowA.showAtLocation(view2, 0, kc.j.p(iArr), (d0Var.G() / 2) + kc.j.v(iArr));
            }
            return jc.w.f31842a;
        }
    }

    public static final class s extends vc.l implements uc.a<jc.w> {
        public s() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            WindowManager windowManagerS;
            View view;
            d0 d0Var = d0.this;
            List<y6.c> list = d0Var.f38131s;
            fd.j0.h(list, "actionViews");
            y6.c cVar = (y6.c) kc.t.y(list);
            if (cVar != null) {
                if (cVar instanceof y2) {
                    windowManagerS = d0Var.s();
                    view = ((y2) cVar).f38433a;
                } else {
                    if (cVar instanceof w2) {
                        w2 w2Var = (w2) cVar;
                        d0Var.s().removeViewImmediate(w2Var.f38420a);
                        d0Var.s().removeViewImmediate(w2Var.f38421b);
                        windowManagerS = d0Var.s();
                        view = w2Var.f38422c;
                    }
                    d0Var.f38131s.remove(cVar);
                    d0Var.E();
                    d0Var.f38119g.d(new Object());
                }
                windowManagerS.removeViewImmediate(view);
                d0Var.f38131s.remove(cVar);
                d0Var.E();
                d0Var.f38119g.d(new Object());
            }
            return jc.w.f31842a;
        }
    }

    public static final class t extends vc.l implements uc.a<jc.w> {
        public t() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            d0 d0Var = d0.this;
            View view = d0Var.f38128p;
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
                PopupWindow popupWindowA = aVar.a(context, kc.l.c(new b7.a(0, R.drawable.ic_settings, e0.a(d0Var, R.string.options_load_save, "context.getString(R.string.options_load_save)")), new b7.a(1, R.drawable.ic_app, e0.a(d0Var, R.string.show_app, "context.getString(R.string.show_app)")), new b7.a(2, R.drawable.ic_turn_off, e0.a(d0Var, R.string.turn_off, "context.getString(R.string.turn_off)"))), new g0(d0Var));
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                imageView.setTag(Boolean.TRUE);
                popupWindowA.setOnDismissListener(new y6.h(imageView, 2));
                View view2 = d0Var.f38129q;
                if (view2 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                popupWindowA.showAtLocation(view2, 0, kc.j.p(iArr), (d0Var.G() / 2) + kc.j.v(iArr));
            }
            return jc.w.f31842a;
        }
    }

    public static final class u extends vc.l implements uc.a<uc.a<? extends ClickService>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38162c = aVar;
            this.f38163d = str;
            this.f38164e = aVar2;
            this.f38165f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uc.a<? extends com.inscode.autoclicker.service.ClickService>] */
        @Override // uc.a
        public final uc.a<? extends ClickService> invoke() {
            return this.f38162c.getKoin().f37311a.c(new yd.h(this.f38163d, vc.b0.a(uc.a.class), this.f38164e, this.f38165f));
        }
    }

    public static final class v extends vc.l implements uc.a<a7.i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38166c = aVar;
            this.f38167d = str;
            this.f38168e = aVar2;
            this.f38169f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [a7.i, java.lang.Object] */
        @Override // uc.a
        public final a7.i invoke() {
            return this.f38166c.getKoin().f37311a.c(new yd.h(this.f38167d, vc.b0.a(a7.i.class), this.f38168e, this.f38169f));
        }
    }

    public static final class w extends vc.l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38170c = aVar;
            this.f38171d = str;
            this.f38172e = aVar2;
            this.f38173f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return this.f38170c.getKoin().f37311a.c(new yd.h(this.f38171d, vc.b0.a(q6.b.class), this.f38172e, this.f38173f));
        }
    }

    public static final class x extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38174c = aVar;
            this.f38175d = str;
            this.f38176e = aVar2;
            this.f38177f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return this.f38174c.getKoin().f37311a.c(new yd.h(this.f38175d, vc.b0.a(r6.e.class), this.f38176e, this.f38177f));
        }
    }

    public static final class y extends vc.l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38181f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38178c = aVar;
            this.f38179d = str;
            this.f38180e = aVar2;
            this.f38181f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return this.f38178c.getKoin().f37311a.c(new yd.h(this.f38179d, vc.b0.a(u2.class), this.f38180e, this.f38181f));
        }
    }

    public d0() {
        ae.b bVar = ae.b.f348c;
        this.f38118f = jc.f.b(new u(this, "", null, bVar));
        this.f38119g = new gc.a<>();
        this.f38120h = jc.f.b(new v(this, "", null, bVar));
        this.f38121i = jc.f.b(new w(this, "", null, bVar));
        jc.e eVarB = jc.f.b(new x(this, "", null, bVar));
        this.f38122j = eVarB;
        this.f38123k = new nb.a();
        this.f38124l = x1.q.j(32);
        jc.k kVar = (jc.k) eVarB;
        this.f38125m = ((r6.e) kVar.getValue()).d();
        this.f38126n = ((r6.e) kVar.getValue()).c();
        this.f38127o = jc.f.b(new y(this, "", null, bVar));
        this.f38131s = Collections.synchronizedList(new ArrayList());
    }

    public static /* synthetic */ List k(d0 d0Var, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return d0Var.j(z10);
    }

    public final void A() {
        WindowManager windowManagerS;
        View view;
        Iterator<y6.c> it = this.f38131s.iterator();
        while (it.hasNext()) {
            y6.c next = it.next();
            if (next instanceof y2) {
                windowManagerS = s();
                view = ((y2) next).f38433a;
            } else {
                if (next instanceof w2) {
                    w2 w2Var = (w2) next;
                    s().removeViewImmediate(w2Var.f38420a);
                    s().removeViewImmediate(w2Var.f38421b);
                    windowManagerS = s();
                    view = w2Var.f38422c;
                }
                it.remove();
            }
            windowManagerS.removeViewImmediate(view);
            it.remove();
        }
    }

    public final void B() {
        float f10 = Resources.getSystem().getDisplayMetrics().heightPixels / Resources.getSystem().getDisplayMetrics().widthPixels;
        List<y6.c> list = this.f38131s;
        fd.j0.h(list, "actionViews");
        for (y6.c cVar : list) {
            if (cVar instanceof y2) {
                y2 y2Var = (y2) cVar;
                ViewGroup.LayoutParams layoutParams = y2Var.f38433a.getLayoutParams();
                fd.j0.g(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                layoutParams2.x = (int) (layoutParams2.x / f10);
                layoutParams2.y = (int) (layoutParams2.y * f10);
                s().updateViewLayout(y2Var.f38433a, layoutParams2);
                y2Var.f38433a.requestLayout();
                y2Var.f38433a.invalidate();
            } else if (cVar instanceof w2) {
                w2 w2Var = (w2) cVar;
                ViewGroup.LayoutParams layoutParams3 = w2Var.f38420a.getLayoutParams();
                fd.j0.g(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams4 = (WindowManager.LayoutParams) layoutParams3;
                ViewGroup.LayoutParams layoutParams5 = w2Var.f38421b.getLayoutParams();
                fd.j0.g(layoutParams5, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams6 = (WindowManager.LayoutParams) layoutParams5;
                ViewGroup.LayoutParams layoutParams7 = w2Var.f38422c.getLayoutParams();
                fd.j0.g(layoutParams7, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                int i10 = layoutParams4.x;
                int i11 = layoutParams4.y;
                int i12 = layoutParams6.x;
                int i13 = layoutParams6.y;
                layoutParams4.x = (int) (i10 / f10);
                layoutParams4.y = (int) (i11 * f10);
                layoutParams6.x = (int) (i12 / f10);
                layoutParams6.y = (int) (i13 * f10);
                s().updateViewLayout(w2Var.f38420a, layoutParams4);
                s().updateViewLayout(w2Var.f38421b, layoutParams6);
                s().updateViewLayout(w2Var.f38422c, (WindowManager.LayoutParams) layoutParams7);
                w2Var.f38420a.invalidate();
                w2Var.f38420a.requestLayout();
                w2Var.f38421b.invalidate();
                w2Var.f38421b.requestLayout();
                View view = w2Var.f38420a;
                View view2 = w2Var.f38421b;
                View view3 = w2Var.f38422c;
                fd.j0.g(view3, "null cannot be cast to non-null type com.inscode.autoclicker.service.SwipeLineView");
                D(view, view2, (v2) view3);
            }
        }
    }

    public final void C() {
        List<y6.c> list = this.f38131s;
        fd.j0.h(list, "actionViews");
        for (y6.c cVar : list) {
            if (cVar instanceof y2) {
                y2 y2Var = (y2) cVar;
                ViewGroup.LayoutParams layoutParams = y2Var.f38433a.getLayoutParams();
                layoutParams.width = G();
                layoutParams.height = G();
                y2Var.f38433a.setLayoutParams(layoutParams);
                y2Var.f38433a.requestLayout();
                ((TextView) y2Var.f38433a.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (((double) 12) * this.f38125m));
                s().updateViewLayout(y2Var.f38433a, layoutParams);
            } else if (cVar instanceof w2) {
                w2 w2Var = (w2) cVar;
                ViewGroup.LayoutParams layoutParams2 = w2Var.f38420a.getLayoutParams();
                ViewGroup.LayoutParams layoutParams3 = w2Var.f38421b.getLayoutParams();
                layoutParams2.width = G();
                layoutParams2.height = G();
                layoutParams3.width = G();
                layoutParams3.height = G();
                View view = w2Var.f38422c;
                fd.j0.g(view, "null cannot be cast to non-null type com.inscode.autoclicker.service.SwipeLineView");
                ((v2) w2Var.f38422c).setScale(this.f38125m);
                w2Var.f38420a.setLayoutParams(layoutParams2);
                w2Var.f38421b.setLayoutParams(layoutParams3);
                w2Var.f38420a.requestLayout();
                w2Var.f38421b.requestLayout();
                double d10 = 12;
                ((TextView) w2Var.f38420a.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (this.f38125m * d10));
                ((TextView) w2Var.f38421b.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (d10 * this.f38125m));
                s().updateViewLayout(w2Var.f38420a, layoutParams2);
                s().updateViewLayout(w2Var.f38421b, layoutParams3);
            }
        }
    }

    public final void D(View view, View view2, v2 v2Var) {
        v2Var.post(new s4.a(view, view2, v2Var, this));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x010a A[PHI: r1
  0x010a: PHI (r1v8 android.view.View) = (r1v7 android.view.View), (r1v12 android.view.View) binds: [B:64:0x0108, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x010c A[PHI: r1
  0x010c: PHI (r1v10 android.view.View) = (r1v7 android.view.View), (r1v12 android.view.View) binds: [B:64:0x0108, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    public final void E() {
        View view;
        int i10;
        View view2 = this.f38128p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view2.findViewById(R.id.playPauseButton)).setImageResource(f38117u == 2 ? R.drawable.ic_pause : R.drawable.ic_play);
        View view3 = this.f38128p;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view3.findViewById(R.id.addButton)).setEnabled(f38117u != 2);
        View view4 = this.f38128p;
        if (view4 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view4.findViewById(R.id.addButton)).setAlpha(f38117u == 2 ? 0.5f : 1.0f);
        View view5 = this.f38128p;
        if (view5 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view5.findViewById(R.id.removeButton)).setEnabled(f38117u != 2);
        View view6 = this.f38128p;
        if (view6 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view6.findViewById(R.id.removeButton)).setAlpha(f38117u == 2 ? 0.5f : 1.0f);
        View view7 = this.f38128p;
        if (view7 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view7.findViewById(R.id.addButton)).setVisibility(f38117u == 2 ? 8 : 0);
        View view8 = this.f38128p;
        if (view8 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view8.findViewById(R.id.removeButton)).setVisibility(f38117u == 2 ? 8 : 0);
        View view9 = this.f38128p;
        if (view9 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view9.findViewById(R.id.menuButton)).setVisibility(f38117u == 2 ? 8 : 0);
        View view10 = this.f38128p;
        if (view10 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView = (ImageView) view10.findViewById(R.id.playPauseButton);
        List<y6.c> list = this.f38131s;
        fd.j0.h(list, "actionViews");
        imageView.setEnabled(!list.isEmpty());
        View view11 = this.f38128p;
        if (view11 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view11.findViewById(R.id.playPauseButton)).setAlpha(this.f38131s.isEmpty() ? 0.5f : 1.0f);
        for (y6.c cVar : this.f38131s) {
            if (cVar instanceof y2) {
                view = ((y2) cVar).f38433a;
                if (f38117u == 2) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                view.setVisibility(i10);
            } else if (cVar instanceof w2) {
                w2 w2Var = (w2) cVar;
                w2Var.f38420a.setVisibility(f38117u == 2 ? 8 : 0);
                w2Var.f38421b.setVisibility(f38117u == 2 ? 8 : 0);
                view = w2Var.f38422c;
                if (f38117u == 2) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                view.setVisibility(i10);
            }
        }
    }

    public final void F() {
        View view;
        int iO;
        int iO2;
        int iO3;
        int iO4;
        View view2 = this.f38128p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        for (View view3 : (p0.i0.a) p0.i0.b((ViewGroup) view2)) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.width = G();
            layoutParams.height = G();
            view3.setLayoutParams(layoutParams);
            view3.requestLayout();
            view3.setPadding(this.f38126n == 1 ? o() : 0, this.f38126n != 1 ? o() : 0, 0, 0);
        }
        if (this.f38126n == 1) {
            View view4 = this.f38128p;
            if (view4 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view4).setOrientation(0);
            view = this.f38128p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            iO = o() / 2;
            iO2 = o() / 2;
            iO3 = o() * 2;
            iO4 = o() / 2;
        } else {
            View view5 = this.f38128p;
            if (view5 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view5).setOrientation(1);
            view = this.f38128p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            iO = o() / 2;
            iO2 = o() / 2;
            iO3 = o() / 2;
            iO4 = o() * 2;
        }
        view.setPadding(iO, iO2, iO3, iO4);
    }

    public final int G() {
        return (int) (((double) this.f38124l) * this.f38125m);
    }

    @Override // y6.k1
    public void a() {
        try {
            this.f38123k.d();
            r().t();
            a7.i iVarR = r();
            iVarR.getDisposables().d();
            iVarR.f174d.d();
            iVarR.f172b.c(new u6.a(null, 0L, 0L, 0L, false, 0L, null, 0L, false, 0, 1023, null));
            A();
            View view = this.f38128p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerS = s();
                View view2 = this.f38128p;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerS.removeView(view2);
            }
            View view3 = this.f38129q;
            if (view3 == null) {
                fd.j0.r("measureView");
                throw null;
            }
            if (view3.isAttachedToWindow()) {
                WindowManager windowManagerS2 = s();
                View view4 = this.f38129q;
                if (view4 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                windowManagerS2.removeView(view4);
            }
            f38117u = 0;
            ((u2) this.f38127o.getValue()).a(r6.k.NONE);
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[MANUAL] [ERROR] (destroy): ", e10, ' ')), new Object[0]);
        }
    }

    @Override // y6.k1
    public void b() {
        if (f38117u == 2) {
            View view = this.f38128p;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerS = s();
                View view2 = this.f38128p;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerS.removeView(view2);
            }
            this.f38269e = false;
        }
    }

    @Override // y6.k1
    public r6.k c() {
        return r6.k.MANUAL;
    }

    @Override // y6.k1
    public void d() {
        try {
            p().invoke().d();
            y();
            z();
            this.f38129q = new View(q());
            WindowManager.LayoutParams layoutParamsN = n();
            layoutParamsN.width = -1;
            layoutParamsN.height = -1;
            layoutParamsN.flags = 24;
            WindowManager windowManagerS = s();
            View view = this.f38129q;
            if (view == null) {
                fd.j0.r("measureView");
                throw null;
            }
            windowManagerS.addView(view, layoutParamsN);
            u();
            x();
            v();
            w();
            F();
            C();
            E();
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[MANUAL] [ERROR] (prepare): ", e10, ' ')), new Object[0]);
        }
    }

    @Override // y6.k1
    public void e() {
        View view = this.f38128p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        if (!view.isAttachedToWindow()) {
            WindowManager windowManagerS = s();
            View view2 = this.f38128p;
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
            windowManagerS.addView(view2, (ViewGroup.LayoutParams) tag);
        }
        this.f38269e = true;
    }

    @Override // y6.k1
    public void f() {
        r().s();
    }

    public final void g(Float f10, Float f11, Float f12, Float f13) {
        View viewInflate = View.inflate(q(), R.layout.touch_point, null);
        View viewInflate2 = View.inflate(q(), R.layout.touch_point, null);
        v2 v2Var = new v2(q());
        WindowManager.LayoutParams layoutParamsN = n();
        WindowManager.LayoutParams layoutParamsN2 = n();
        if (f10 == null || f11 == null || f12 == null || f13 == null) {
            int i10 = Resources.getSystem().getDisplayMetrics().widthPixels / 2;
            int i11 = Resources.getSystem().getDisplayMetrics().heightPixels / 2;
            layoutParamsN.x = i10;
            layoutParamsN.y = i11;
            layoutParamsN2.x = i10 + 100;
            layoutParamsN2.y = i11;
        } else {
            layoutParamsN.x = (int) f10.floatValue();
            layoutParamsN.y = (int) f11.floatValue();
            layoutParamsN2.x = (int) f12.floatValue();
            layoutParamsN2.y = (int) f13.floatValue();
        }
        layoutParamsN.width = G();
        layoutParamsN.height = G();
        layoutParamsN2.width = G();
        layoutParamsN2.height = G();
        WindowManager.LayoutParams layoutParamsN3 = n();
        layoutParamsN3.width = -1;
        layoutParamsN3.height = -1;
        layoutParamsN3.flags = 24;
        TextView textView = (TextView) viewInflate.findViewById(R.id.tappingPointNumber);
        StringBuilder sbA = o2.b.a('S');
        sbA.append(this.f38131s.size() + 1);
        textView.setText(sbA.toString());
        TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tappingPointNumber);
        StringBuilder sbA2 = o2.b.a('E');
        sbA2.append(this.f38131s.size() + 1);
        textView2.setText(sbA2.toString());
        double d10 = 12;
        ((TextView) viewInflate.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (this.f38125m * d10));
        ((TextView) viewInflate2.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (d10 * this.f38125m));
        s().addView(v2Var, layoutParamsN3);
        s().addView(viewInflate, layoutParamsN);
        s().addView(viewInflate2, layoutParamsN2);
        viewInflate.setOnTouchListener(new g7.a(layoutParamsN, 0, b.f38132c, new c(viewInflate, layoutParamsN, viewInflate2, v2Var)));
        viewInflate2.setOnTouchListener(new g7.a(layoutParamsN2, 0, d.f38138c, new e(viewInflate2, layoutParamsN2, viewInflate, v2Var)));
        this.f38131s.add(new w2(viewInflate, viewInflate2, v2Var));
        D(viewInflate, viewInflate2, v2Var);
        E();
    }

    public final void h(Float f10, Float f11) {
        int iFloatValue;
        View viewInflate = View.inflate(q(), R.layout.touch_point, null);
        WindowManager.LayoutParams layoutParamsN = n();
        if (f10 == null || f11 == null) {
            int iG = (Resources.getSystem().getDisplayMetrics().widthPixels / 2) - (G() / 2);
            double dT = ((double) (Resources.getSystem().getDisplayMetrics().heightPixels / 2)) - (t() * ((double) G()));
            layoutParamsN.x = iG;
            iFloatValue = (int) dT;
        } else {
            layoutParamsN.x = (int) f10.floatValue();
            iFloatValue = (int) f11.floatValue();
        }
        layoutParamsN.y = iFloatValue;
        layoutParamsN.width = G();
        layoutParamsN.height = G();
        ((TextView) viewInflate.findViewById(R.id.tappingPointNumber)).setTextSize(2, (float) (((double) 12) * this.f38125m));
        ((TextView) viewInflate.findViewById(R.id.tappingPointNumber)).setText(String.valueOf(this.f38131s.size() + 1));
        viewInflate.setOnTouchListener(new g7.a(layoutParamsN, 0, f.f38144c, new g(viewInflate, layoutParamsN)));
        s().addView(viewInflate, layoutParamsN);
        this.f38131s.add(new y2(viewInflate));
        E();
        this.f38119g.d(new Object());
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        fd.j0.g(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        viewInflate.getLocationOnScreen(new int[2]);
    }

    public final int i() {
        int[] iArr = new int[2];
        View view = this.f38129q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            return kc.j.p(iArr);
        }
        fd.j0.r("measureView");
        throw null;
    }

    public final List<r6.d> j(boolean z10) {
        ArrayList arrayList;
        r6.d dVarL;
        List<y6.c> list = this.f38131s;
        fd.j0.h(list, "actionViews");
        synchronized (list) {
            List<y6.c> list2 = this.f38131s;
            fd.j0.h(list2, "actionViews");
            arrayList = new ArrayList(kc.m.j(list2, 10));
            for (y6.c cVar : list2) {
                if (cVar instanceof y2) {
                    fd.j0.h(cVar, "it");
                    dVarL = m((y2) cVar, z10);
                } else {
                    fd.j0.g(cVar, "null cannot be cast to non-null type com.inscode.autoclicker.service.SwipeView");
                    dVarL = l((w2) cVar, z10);
                }
                arrayList.add(dVarL);
            }
        }
        return arrayList;
    }

    public final r6.d l(w2 w2Var, boolean z10) {
        ViewGroup.LayoutParams layoutParams = w2Var.f38420a.getLayoutParams();
        fd.j0.g(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = w2Var.f38421b.getLayoutParams();
        fd.j0.g(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams4 = (WindowManager.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = w2Var.f38422c.getLayoutParams();
        fd.j0.g(layoutParams5, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        int[] iArr = new int[2];
        w2Var.f38420a.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        w2Var.f38421b.getLocationOnScreen(iArr2);
        float fG = layoutParams2.x;
        if (z10) {
            fG = fG + (G() / 2) + i();
        }
        r6.c cVar = new r6.c(fG, z10 ? (G() / 2.0f) + kc.j.v(iArr) : layoutParams2.y, 0L, 0, 0, 20, null);
        float fG2 = layoutParams4.x;
        if (z10) {
            fG2 = fG2 + (G() / 2) + i();
        }
        return new r6.d(kc.l.c(cVar, new r6.c(fG2, z10 ? (G() / 2.0f) + kc.j.v(iArr2) : layoutParams4.y, 0L, 2, 0, 20, null)), 0L, 0L, 0L, 0.0d, 30, null);
    }

    public final r6.d m(y2 y2Var, boolean z10) {
        float fG;
        int[] iArr = new int[2];
        y2Var.f38433a.getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams = y2Var.f38433a.getLayoutParams();
        fd.j0.g(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        View view = y2Var.f38433a;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        fd.j0.g(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        view.getLocationOnScreen(new int[2]);
        int iG = (G() / 2) + kc.j.v(iArr);
        double dT = (t() * ((double) G())) + ((double) layoutParams2.y);
        xe.a.f37601c.a("Creating tap event: Expected " + iG + " Real: " + dT + " Difference: " + Math.abs(dT - ((double) iG)), new Object[0]);
        float fG2 = z10 ? layoutParams2.x + (G() / 2) + i() : layoutParams2.x;
        if (z10) {
            fG = (G() / 2.0f) + kc.j.v(iArr);
        } else {
            fG = layoutParams2.y;
        }
        return new r6.d(kc.k.a(new r6.c(fG2, fG, 0L, 0, 0, 20, null)), 0L, 0L, 0L, 0.0d, 30, null);
    }

    public final WindowManager.LayoutParams n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2032, 8, -3);
        layoutParams.windowAnimations = R.style.PopupAnimation;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    public final int o() {
        return (int) (((double) x1.q.j(8)) * this.f38125m);
    }

    public final uc.a<ClickService> p() {
        return (uc.a) this.f38118f.getValue();
    }

    public final Context q() {
        Context applicationContext = p().invoke().getApplicationContext();
        fd.j0.h(applicationContext, "clickService().applicationContext");
        return applicationContext;
    }

    public final a7.i r() {
        return (a7.i) this.f38120h.getValue();
    }

    public final WindowManager s() {
        Object systemService = p().invoke().getSystemService("window");
        fd.j0.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    public final double t() {
        double d10 = this.f38125m;
        if (d10 == 0.75d) {
            return 1.5d;
        }
        if (d10 == 1.0d) {
            return 1.26d;
        }
        return d10 == 1.25d ? 1.14d : 1.05d;
    }

    public final void u() {
        gc.a<Object> aVar = this.f38119g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(aVar);
        lb.l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        nb.b bVarE = ec.a.e(new vb.d(aVar, 250L, timeUnit, lVar).u(fc.a.f29534b), h.f38148c, null, new i(), 2);
        p6.b.a(bVarE, "$receiver", this.f38123k, "compositeDisposable", bVarE);
    }

    public final void v() {
        nb.b bVarE = ec.a.e(p().invoke().f13101c.u(fc.a.f29534b).p(mb.a.a()), null, null, new j(), 3);
        p6.b.a(bVarE, "$receiver", this.f38123k, "compositeDisposable", bVarE);
    }

    public final void w() {
        nb.b bVarE = ec.a.e(((q6.b) this.f38121i.getValue()).f34787g.u(fc.a.f29534b).p(mb.a.a()), k.f38151c, null, new l(), 2);
        nb.a aVar = this.f38123k;
        fd.j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
    }

    public final void x() {
        nb.b bVarE = ec.a.e(r().f173c.u(fc.a.f29534b).p(mb.a.a()), m.f38153c, null, new n(), 2);
        nb.a aVar = this.f38123k;
        fd.j0.j(bVarE, "$receiver");
        fd.j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
        a7.i iVarR = r();
        Objects.requireNonNull(iVarR);
        iVarR.launch(new a7.h(iVarR));
    }

    public final void y() {
        View viewInflate = View.inflate(q(), R.layout.widget_action, null);
        fd.j0.h(viewInflate, "inflate(context, layoutId(), null)");
        this.f38128p = viewInflate;
        WindowManager.LayoutParams layoutParamsN = n();
        int i10 = Resources.getSystem().getDisplayMetrics().widthPixels / 2;
        int i11 = Resources.getSystem().getDisplayMetrics().heightPixels / 2;
        layoutParamsN.x = i10;
        layoutParamsN.y = i11;
        View view = this.f38128p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view.setTag(layoutParamsN);
        WindowManager windowManagerS = s();
        View view2 = this.f38128p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        windowManagerS.addView(view2, layoutParamsN);
        g7.a aVar = new g7.a(layoutParamsN, 0, o.f38155c, new p(layoutParamsN));
        this.f38130r = aVar;
        View view3 = this.f38128p;
        if (view3 != null) {
            view3.setOnTouchListener(aVar);
        } else {
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public final void z() {
        View view = this.f38128p;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.playPauseButton);
        Context contextQ = q();
        g7.a aVar = this.f38130r;
        if (aVar == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView.setOnTouchListener(new z2(contextQ, aVar, new q()));
        View view2 = this.f38128p;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.addButton);
        Context contextQ2 = q();
        g7.a aVar2 = this.f38130r;
        if (aVar2 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView2.setOnTouchListener(new z2(contextQ2, aVar2, new r()));
        View view3 = this.f38128p;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView3 = (ImageView) view3.findViewById(R.id.removeButton);
        Context contextQ3 = q();
        g7.a aVar3 = this.f38130r;
        if (aVar3 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView3.setOnTouchListener(new z2(contextQ3, aVar3, new s()));
        View view4 = this.f38128p;
        if (view4 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView4 = (ImageView) view4.findViewById(R.id.menuButton);
        Context contextQ4 = q();
        g7.a aVar4 = this.f38130r;
        if (aVar4 != null) {
            imageView4.setOnTouchListener(new z2(contextQ4, aVar4, new t()));
        } else {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
    }
}
