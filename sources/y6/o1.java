package y6;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
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
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends k1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f38296s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f38297t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jc.e f38298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f38299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nb.a f38300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f38301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jc.e f38302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f38304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g7.a f38306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jc.e f38307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f38308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f38309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f38310r;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f38311c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[RECORD] [ERROR] (observeClickService) : ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<y6.b, jc.w> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(y6.b bVar) {
            if (fd.j0.d(bVar, l1.f38284a)) {
                o1 o1Var = o1.this;
                a aVar = o1.f38296s;
                o1Var.m().e();
            }
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f38313c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[RECORD] [ERROR] (observeGlobalChanges): ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<q6.a, jc.w> {
        public e() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(q6.a aVar) {
            q6.a aVar2 = aVar;
            o1 o1Var = o1.this;
            fd.j0.h(aVar2, "it");
            a aVar3 = o1.f38296s;
            Objects.requireNonNull(o1Var);
            if (aVar2 instanceof r6.h) {
                o1Var.f38305m = ((r6.h) aVar2).f35180a;
            } else if (aVar2 instanceof r6.i) {
                o1Var.f38304l = ((r6.i) aVar2).f35181a;
            }
            o1Var.z();
            return jc.w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f38315c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "e", "[RECORD] [ERROR] (observeViewModel) ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.l<ViewModelEvent, jc.w> {
        public g() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(ViewModelEvent viewModelEvent) {
            ViewModelEvent viewModelEvent2 = viewModelEvent;
            o1 o1Var = o1.this;
            fd.j0.h(viewModelEvent2, "it");
            a aVar = o1.f38296s;
            Objects.requireNonNull(o1Var);
            if (viewModelEvent2 instanceof d7.d) {
                xe.a.f37601c.a("[RECORD] EVENT: Playing started.", new Object[0]);
                o1.f38297t = 2;
            } else {
                if (viewModelEvent2 instanceof d7.b) {
                    o1.f38297t = 3;
                } else if (viewModelEvent2 instanceof d7.c) {
                    o1.f38297t = 2;
                } else if (viewModelEvent2 instanceof d7.j) {
                    xe.a.f37601c.a("[RECORD] EVENT: Recording started.", new Object[0]);
                    o1.f38297t = 1;
                    o1Var.h();
                    View view = o1Var.f38309q;
                    if (view == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    ((LinearLayout) view.findViewById(R.id.navigationContainer)).setVisibility(0);
                } else {
                    boolean z10 = viewModelEvent2 instanceof d7.e;
                    if (z10 ? true : fd.j0.d(viewModelEvent2, d7.k.f28811a)) {
                        xe.a.f37601c.a(androidx.activity.k.a(defpackage.a.a("[RECORD] EVENT: "), z10 ? "Playing" : "Recording", " stopped."), new Object[0]);
                        o1Var.p();
                        o1Var.o();
                        o1.f38297t = 0;
                        if (!o1Var.f38269e) {
                            o1Var.e();
                        }
                        o1Var.y();
                        o1Var.l().f34781a.d(Boolean.TRUE);
                    } else if (viewModelEvent2 instanceof d7.m) {
                        o1Var.h();
                    } else if (viewModelEvent2 instanceof d7.a) {
                        o1Var.p();
                    } else if (viewModelEvent2 instanceof d7.h) {
                        Toast.makeText(o1Var.k(), o1Var.k().getString(R.string.record_smth_first), 0).show();
                    } else if (!(viewModelEvent2 instanceof d7.l)) {
                        if (viewModelEvent2 instanceof d7.i) {
                            Toast.makeText(o1Var.k(), o1Var.k().getString(R.string.record_time_limit), 1).show();
                        } else if (viewModelEvent2 instanceof d7.n) {
                            d7.n nVar = (d7.n) viewModelEvent2;
                            StringBuilder sbA = defpackage.a.a("RecordService timeleft: ");
                            sbA.append(nVar.f28815a);
                            xe.a.f37601c.a(sbA.toString(), new Object[0]);
                            View view2 = o1Var.f38309q;
                            if (view2 == null) {
                                fd.j0.r("widgetView");
                                throw null;
                            }
                            ((TextView) view2.findViewById(R.id.timeLeft)).setText(u1.a.q(nVar.f28815a));
                        }
                    }
                }
                o1Var.y();
            }
            o1Var.y();
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f38317c = new h();

        public h() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f38319d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WindowManager.LayoutParams layoutParams) {
            super(0);
            this.f38319d = layoutParams;
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            WindowManager windowManagerN = o1Var.n();
            View view = o1.this.f38309q;
            if (view != null) {
                windowManagerN.updateViewLayout(view, this.f38319d);
                return jc.w.f31842a;
            }
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public static final class j extends vc.l implements uc.a<jc.w> {
        public j() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            Objects.requireNonNull(o1Var);
            xe.a.f37601c.a("[RECORD] Play pause clicked.", new Object[0]);
            int i10 = o1.f38297t;
            if (i10 == 0) {
                o1Var.m().d();
            } else if (i10 == 2) {
                o1Var.m().a();
            } else if (i10 == 3) {
                o1Var.m().b();
            }
            return jc.w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.a<jc.w> {
        public k() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            Objects.requireNonNull(o1Var);
            int i10 = o1.f38297t;
            if (i10 == 3 || i10 == 2) {
                o1Var.m().e();
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
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            Objects.requireNonNull(o1Var);
            int i10 = o1.f38297t;
            if (i10 == 0) {
                Object objA = k7.g.a("recording_info_dialog", Boolean.TRUE);
                fd.j0.h(objA, "get(DIALOG_KEY, true)");
                if (((Boolean) objA).booleanValue()) {
                    new i7.b(o1Var.k(), null, 0, 6, null).b(o1Var.n(), t1.a(o1Var, R.string.record_guide, "context.getString(R.string.record_guide)"), t1.a(o1Var, android.R.string.ok, "context.getString(android.R.string.ok)"), t1.a(o1Var, R.string.not_show_again, "context.getString(R.string.not_show_again)"), new r1(o1Var), new s1("recording_info_dialog", o1Var));
                } else {
                    o1Var.x();
                }
            } else if (i10 == 1) {
                o1Var.m().k();
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
            o1 o1Var = o1.this;
            View view = o1Var.f38309q;
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
                PopupWindow popupWindowA = aVar.a(context, kc.l.c(new b7.a(0, R.drawable.ic_settings, t1.a(o1Var, R.string.options_load_save, "context.getString(R.string.options_load_save)")), new b7.a(1, R.drawable.ic_app, t1.a(o1Var, R.string.show_app, "context.getString(R.string.show_app)")), new b7.a(2, R.drawable.ic_turn_off, t1.a(o1Var, R.string.turn_off, "context.getString(R.string.turn_off)"))), new u1(o1Var));
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                imageView.setTag(Boolean.TRUE);
                popupWindowA.setOnDismissListener(new y6.h(imageView, 3));
                View view2 = o1Var.f38310r;
                if (view2 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                popupWindowA.showAtLocation(view2, 0, kc.j.p(iArr), (o1Var.A() / 2) + kc.j.v(iArr));
            }
            return jc.w.f31842a;
        }
    }

    public static final class n extends vc.l implements uc.a<jc.w> {
        public n() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            o1Var.l().e(com.inscode.autoclicker.utils.b.BACK_BUTTON);
            return jc.w.f31842a;
        }
    }

    public static final class o extends vc.l implements uc.a<jc.w> {
        public o() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            o1Var.l().e(com.inscode.autoclicker.utils.b.HOME_BUTTON);
            return jc.w.f31842a;
        }
    }

    public static final class p extends vc.l implements uc.a<jc.w> {
        public p() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            o1Var.l().e(com.inscode.autoclicker.utils.b.APPS_BUTTON);
            return jc.w.f31842a;
        }
    }

    public static final class q extends vc.l implements uc.a<jc.w> {
        public q() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            o1Var.l().e(com.inscode.autoclicker.utils.b.SCREENSHOT_BUTTON);
            return jc.w.f31842a;
        }
    }

    public static final class r extends vc.l implements uc.a<jc.w> {
        public r() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            Toast.makeText(o1Var.k(), o1.this.k().getString(R.string.feature_for_pro), 0).show();
            return jc.w.f31842a;
        }
    }

    public static final class s extends vc.l implements uc.a<jc.w> {
        public s() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            o1 o1Var = o1.this;
            a aVar = o1.f38296s;
            o1Var.m().o();
            return jc.w.f31842a;
        }
    }

    public static final class t extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f38330c = new t();

        public t() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ jc.w invoke() {
            return jc.w.f31842a;
        }
    }

    public static final class u extends vc.l implements uc.a<uc.a<? extends ClickService>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38334f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38331c = aVar;
            this.f38332d = str;
            this.f38333e = aVar2;
            this.f38334f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uc.a<? extends com.inscode.autoclicker.service.ClickService>] */
        @Override // uc.a
        public final uc.a<? extends ClickService> invoke() {
            return this.f38331c.getKoin().f37311a.c(new yd.h(this.f38332d, vc.b0.a(uc.a.class), this.f38333e, this.f38334f));
        }
    }

    public static final class v extends vc.l implements uc.a<d7.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38338f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38335c = aVar;
            this.f38336d = str;
            this.f38337e = aVar2;
            this.f38338f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.o, java.lang.Object] */
        @Override // uc.a
        public final d7.o invoke() {
            return this.f38335c.getKoin().f37311a.c(new yd.h(this.f38336d, vc.b0.a(d7.o.class), this.f38337e, this.f38338f));
        }
    }

    public static final class w extends vc.l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38342f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38339c = aVar;
            this.f38340d = str;
            this.f38341e = aVar2;
            this.f38342f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return this.f38339c.getKoin().f37311a.c(new yd.h(this.f38340d, vc.b0.a(q6.b.class), this.f38341e, this.f38342f));
        }
    }

    public static final class x extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38346f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38343c = aVar;
            this.f38344d = str;
            this.f38345e = aVar2;
            this.f38346f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return this.f38343c.getKoin().f37311a.c(new yd.h(this.f38344d, vc.b0.a(r6.e.class), this.f38345e, this.f38346f));
        }
    }

    public static final class y extends vc.l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38350f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38347c = aVar;
            this.f38348d = str;
            this.f38349e = aVar2;
            this.f38350f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return this.f38347c.getKoin().f37311a.c(new yd.h(this.f38348d, vc.b0.a(u2.class), this.f38349e, this.f38350f));
        }
    }

    public o1() {
        ae.b bVar = ae.b.f348c;
        this.f38298f = jc.f.b(new u(this, "", null, bVar));
        this.f38299g = jc.f.b(new v(this, "", null, bVar));
        this.f38300h = new nb.a();
        this.f38301i = jc.f.b(new w(this, "", null, bVar));
        this.f38302j = jc.f.b(new x(this, "", null, bVar));
        this.f38303k = x1.q.j(32);
        this.f38304l = i().d();
        this.f38305m = i().c();
        this.f38307o = jc.f.b(new y(this, "", null, bVar));
    }

    public final int A() {
        return (int) (((double) this.f38303k) * this.f38304l);
    }

    @Override // y6.k1
    public void a() {
        try {
            this.f38300h.d();
            m().e();
            m().f();
            o();
            p();
            View view = this.f38309q;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerN = n();
                View view2 = this.f38309q;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerN.removeView(view2);
            }
            View view3 = this.f38310r;
            if (view3 == null) {
                fd.j0.r("measureView");
                throw null;
            }
            if (view3.isAttachedToWindow()) {
                WindowManager windowManagerN2 = n();
                View view4 = this.f38310r;
                if (view4 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                windowManagerN2.removeView(view4);
            }
            f38297t = 0;
            ((u2) this.f38307o.getValue()).a(r6.k.NONE);
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[RECORD] [ERROR] (destroy): ", e10, ' ')), new Object[0]);
            e10.printStackTrace();
        }
    }

    @Override // y6.k1
    public void b() {
        StringBuilder sbA = defpackage.a.a("[RecordService] Hide called, state: ");
        sbA.append(f38297t);
        xe.a.f37601c.a(sbA.toString(), new Object[0]);
        if (f38297t == 2) {
            View view = this.f38309q;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerN = n();
                View view2 = this.f38309q;
                if (view2 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                windowManagerN.removeView(view2);
            }
            this.f38269e = false;
        }
    }

    @Override // y6.k1
    public r6.k c() {
        return r6.k.RECORD;
    }

    @Override // y6.k1
    public void d() {
        try {
            j().invoke().d();
            t();
            w();
            v();
            u();
            s();
            r();
            nb.b bVarE = ec.a.e(l().f34788h.u(fc.a.f29534b), p1.f38362c, null, new q1(this), 2);
            nb.a aVar = this.f38300h;
            fd.j0.j(bVarE, "$receiver");
            fd.j0.j(aVar, "compositeDisposable");
            aVar.a(bVarE);
            q();
            z();
            y();
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[RECORD] [ERROR] (prepare) : ", e10, ' ')), new Object[0]);
        }
    }

    @Override // y6.k1
    public void e() {
        View view = this.f38309q;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        if (!view.isAttachedToWindow()) {
            WindowManager windowManagerN = n();
            View view2 = this.f38309q;
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
            windowManagerN.addView(view2, (ViewGroup.LayoutParams) tag);
        }
        this.f38269e = true;
    }

    @Override // y6.k1
    public void f() {
        m().d();
    }

    public final int g() {
        return (int) (((double) x1.q.j(8)) * this.f38304l);
    }

    public final void h() {
        if (f38297t != 1) {
            return;
        }
        xe.a.f37601c.a("[RECORD] Display overlay view.", new Object[0]);
        try {
            View view = this.f38308p;
            if (view == null) {
                fd.j0.r("overlayView");
                throw null;
            }
            if (view.isAttachedToWindow()) {
                WindowManager windowManagerN = n();
                View view2 = this.f38308p;
                if (view2 == null) {
                    fd.j0.r("overlayView");
                    throw null;
                }
                windowManagerN.removeViewImmediate(view2);
            }
            try {
                View view3 = this.f38308p;
                if (view3 == null) {
                    fd.j0.r("overlayView");
                    throw null;
                }
                if (!view3.isAttachedToWindow()) {
                    WindowManager windowManagerN2 = n();
                    View view4 = this.f38308p;
                    if (view4 == null) {
                        fd.j0.r("overlayView");
                        throw null;
                    }
                    Object tag = view4.getTag();
                    fd.j0.g(tag, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    windowManagerN2.addView(view4, (ViewGroup.LayoutParams) tag);
                }
                try {
                    View view5 = this.f38309q;
                    if (view5 == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    if (view5.isAttachedToWindow()) {
                        WindowManager windowManagerN3 = n();
                        View view6 = this.f38309q;
                        if (view6 == null) {
                            fd.j0.r("widgetView");
                            throw null;
                        }
                        windowManagerN3.removeViewImmediate(view6);
                    }
                    try {
                        new Handler().postDelayed(new n1(this, 0), 150L);
                    } catch (Exception e10) {
                        xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[RECORD] [ERROR] display overlay view #4: ", e10, ' ')), new Object[0]);
                    }
                } catch (Exception e11) {
                    xe.a.f37601c.b(d0.b.a(e11, d0.c.a("[RECORD] [ERROR] display overlay view #3: ", e11, ' ')), new Object[0]);
                }
            } catch (Exception e12) {
                xe.a.f37601c.b(d0.b.a(e12, d0.c.a("[RECORD] [ERROR] display overlay view #2: ", e12, ' ')), new Object[0]);
            }
        } catch (Exception e13) {
            xe.a.f37601c.b(d0.b.a(e13, d0.c.a("[RECORD] [ERROR] display overlay view #1: ", e13, ' ')), new Object[0]);
        }
    }

    public final r6.e i() {
        return (r6.e) this.f38302j.getValue();
    }

    public final uc.a<ClickService> j() {
        return (uc.a) this.f38298f.getValue();
    }

    public final Context k() {
        Context applicationContext = j().invoke().getApplicationContext();
        fd.j0.h(applicationContext, "clickService().applicationContext");
        return applicationContext;
    }

    public final q6.b l() {
        return (q6.b) this.f38301i.getValue();
    }

    public final d7.o m() {
        return (d7.o) this.f38299g.getValue();
    }

    public final WindowManager n() {
        Object systemService = j().invoke().getSystemService("window");
        fd.j0.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    public final void o() {
        View view = this.f38309q;
        if (view != null) {
            ((LinearLayout) view.findViewById(R.id.navigationContainer)).setVisibility(8);
        } else {
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public final void p() {
        xe.a.f37601c.a("[RECORD] Hide overlay view.", new Object[0]);
        View view = this.f38308p;
        if (view == null) {
            fd.j0.r("overlayView");
            throw null;
        }
        if (view.isAttachedToWindow()) {
            WindowManager windowManagerN = n();
            View view2 = this.f38308p;
            if (view2 != null) {
                windowManagerN.removeViewImmediate(view2);
            } else {
                fd.j0.r("overlayView");
                throw null;
            }
        }
    }

    public final void q() {
        nb.b bVarE = ec.a.e(j().invoke().f13101c.u(fc.a.f29534b).p(mb.a.a()), b.f38311c, null, new c(), 2);
        p6.b.a(bVarE, "$receiver", this.f38300h, "compositeDisposable", bVarE);
    }

    public final void r() {
        nb.b bVarE = ec.a.e(l().f34787g.u(fc.a.f29534b).p(mb.a.a()), d.f38313c, null, new e(), 2);
        p6.b.a(bVarE, "$receiver", this.f38300h, "compositeDisposable", bVarE);
    }

    public final void s() {
        nb.b bVarE = ec.a.e(m().g().u(fc.a.f29534b).p(mb.a.a()), f.f38315c, null, new g(), 2);
        nb.a aVar = this.f38300h;
        fd.j0.j(bVarE, "$receiver");
        fd.j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
        m().q();
        m().h();
    }

    public final void t() {
        View viewInflate = View.inflate(k(), R.layout.widget_record, null);
        fd.j0.h(viewInflate, "inflate(context, layoutId(), null)");
        this.f38309q = viewInflate;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2032, 8, -3);
        View view = this.f38309q;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view.setTag(layoutParams);
        g7.a aVar = new g7.a(layoutParams, 0, h.f38317c, new i(layoutParams));
        this.f38306n = aVar;
        View view2 = this.f38309q;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        view2.setOnTouchListener(aVar);
        WindowManager windowManagerN = n();
        View view3 = this.f38309q;
        if (view3 != null) {
            windowManagerN.addView(view3, layoutParams);
        } else {
            fd.j0.r("widgetView");
            throw null;
        }
    }

    public final void u() {
        d7.f fVar = new d7.f(k());
        this.f38310r = fVar;
        fVar.getViewTreeObserver().addOnGlobalFocusChangeListener(new y6.g(this));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2032, 131128, -3);
        View view = this.f38310r;
        if (view == null) {
            fd.j0.r("measureView");
            throw null;
        }
        view.setFocusableInTouchMode(true);
        WindowManager windowManagerN = n();
        View view2 = this.f38310r;
        if (view2 != null) {
            windowManagerN.addView(view2, layoutParams);
        } else {
            fd.j0.r("measureView");
            throw null;
        }
    }

    public final void v() {
        View view = new View(k());
        this.f38308p = view;
        view.setBackgroundResource(R.drawable.overlay_background);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2032, 8, -3);
        View view2 = this.f38308p;
        if (view2 == null) {
            fd.j0.r("overlayView");
            throw null;
        }
        view2.setOnTouchListener(new m1(this));
        View view3 = this.f38308p;
        if (view3 != null) {
            view3.setTag(layoutParams);
        } else {
            fd.j0.r("overlayView");
            throw null;
        }
    }

    public final void w() {
        ImageView imageView;
        z2 z2Var;
        View view = this.f38309q;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.playPauseButton);
        Context contextK = k();
        g7.a aVar = this.f38306n;
        if (aVar == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView2.setOnTouchListener(new z2(contextK, aVar, new j()));
        View view2 = this.f38309q;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.stopButton);
        Context contextK2 = k();
        g7.a aVar2 = this.f38306n;
        if (aVar2 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView3.setOnTouchListener(new z2(contextK2, aVar2, new k()));
        View view3 = this.f38309q;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView4 = (ImageView) view3.findViewById(R.id.recordButton);
        Context contextK3 = k();
        g7.a aVar3 = this.f38306n;
        if (aVar3 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView4.setOnTouchListener(new z2(contextK3, aVar3, new l()));
        View view4 = this.f38309q;
        if (view4 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView5 = (ImageView) view4.findViewById(R.id.menuButton);
        Context contextK4 = k();
        g7.a aVar4 = this.f38306n;
        if (aVar4 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView5.setOnTouchListener(new z2(contextK4, aVar4, new m()));
        View view5 = this.f38309q;
        if (view5 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView6 = (ImageView) view5.findViewById(R.id.backButton);
        Context contextK5 = k();
        g7.a aVar5 = this.f38306n;
        if (aVar5 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView6.setOnTouchListener(new z2(contextK5, aVar5, new n()));
        View view6 = this.f38309q;
        if (view6 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView7 = (ImageView) view6.findViewById(R.id.homeButton);
        Context contextK6 = k();
        g7.a aVar6 = this.f38306n;
        if (aVar6 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView7.setOnTouchListener(new z2(contextK6, aVar6, new o()));
        View view7 = this.f38309q;
        if (view7 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView8 = (ImageView) view7.findViewById(R.id.recentButton);
        Context contextK7 = k();
        g7.a aVar7 = this.f38306n;
        if (aVar7 == null) {
            fd.j0.r("widgetViewViewTouchListener");
            throw null;
        }
        imageView8.setOnTouchListener(new z2(contextK7, aVar7, new p()));
        if (Build.VERSION.SDK_INT >= 28) {
            View view8 = this.f38309q;
            if (view8 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((ImageView) view8.findViewById(R.id.screenshotButton)).setVisibility(0);
            if (ma.h.f33410y.a().i()) {
                View view9 = this.f38309q;
                if (view9 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                imageView = (ImageView) view9.findViewById(R.id.screenshotButton);
                Context contextK8 = k();
                g7.a aVar8 = this.f38306n;
                if (aVar8 == null) {
                    fd.j0.r("widgetViewViewTouchListener");
                    throw null;
                }
                z2Var = new z2(contextK8, aVar8, new q());
            } else {
                View view10 = this.f38309q;
                if (view10 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                ((ImageView) view10.findViewById(R.id.screenshotButton)).setAlpha(0.5f);
                View view11 = this.f38309q;
                if (view11 == null) {
                    fd.j0.r("widgetView");
                    throw null;
                }
                imageView = (ImageView) view11.findViewById(R.id.screenshotButton);
                Context contextK9 = k();
                g7.a aVar9 = this.f38306n;
                if (aVar9 == null) {
                    fd.j0.r("widgetViewViewTouchListener");
                    throw null;
                }
                z2Var = new z2(contextK9, aVar9, new r());
            }
            imageView.setOnTouchListener(z2Var);
        }
    }

    public final void x() {
        if (i().i()) {
            new i7.b(k(), null, 0, 6, null).b(n(), t1.a(this, R.string.want_start_recording, "context.getString(R.string.want_start_recording)"), t1.a(this, android.R.string.ok, "context.getString(android.R.string.ok)"), t1.a(this, android.R.string.cancel, "context.getString(android.R.string.cancel)"), new s(), t.f38330c);
        } else {
            m().o();
        }
    }

    public final void y() {
        View view = this.f38309q;
        if (view == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view.findViewById(R.id.recordButton)).setImageResource(f38297t == 1 ? R.drawable.ic_stop : R.drawable.ic_record);
        View view2 = this.f38309q;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view2.findViewById(R.id.playPauseButton)).setImageResource(f38297t == 2 ? R.drawable.ic_pause : R.drawable.ic_play);
        View view3 = this.f38309q;
        if (view3 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView = (ImageView) view3.findViewById(R.id.recordButton);
        int i10 = f38297t;
        imageView.setEnabled(i10 == 0 || i10 == 1);
        View view4 = this.f38309q;
        if (view4 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView2 = (ImageView) view4.findViewById(R.id.stopButton);
        int i11 = f38297t;
        imageView2.setVisibility((i11 == 2 || i11 == 3) ? 0 : 8);
        if (m().j()) {
            View view5 = this.f38309q;
            if (view5 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((ImageView) view5.findViewById(R.id.playPauseButton)).setEnabled(false);
        } else {
            View view6 = this.f38309q;
            if (view6 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ImageView imageView3 = (ImageView) view6.findViewById(R.id.playPauseButton);
            int i12 = f38297t;
            imageView3.setEnabled(i12 == 0 || i12 == 2 || i12 == 3);
        }
        View view7 = this.f38309q;
        if (view7 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView4 = (ImageView) view7.findViewById(R.id.playPauseButton);
        View view8 = this.f38309q;
        if (view8 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        imageView4.setAlpha(((ImageView) view8.findViewById(R.id.playPauseButton)).isEnabled() ? 1.0f : 0.5f);
        View view9 = this.f38309q;
        if (view9 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView5 = (ImageView) view9.findViewById(R.id.recordButton);
        View view10 = this.f38309q;
        if (view10 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        imageView5.setAlpha(((ImageView) view10.findViewById(R.id.recordButton)).isEnabled() ? 1.0f : 0.5f);
        View view11 = this.f38309q;
        if (view11 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView6 = (ImageView) view11.findViewById(R.id.recordButton);
        int i13 = f38297t;
        imageView6.setVisibility((i13 == 2 || i13 == 3) ? 8 : 0);
        View view12 = this.f38309q;
        if (view12 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView7 = (ImageView) view12.findViewById(R.id.menuButton);
        int i14 = f38297t;
        imageView7.setVisibility((i14 == 2 || i14 == 3) ? 8 : 0);
        View view13 = this.f38309q;
        if (view13 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ((ImageView) view13.findViewById(R.id.menuButton)).setEnabled(f38297t == 0);
        View view14 = this.f38309q;
        if (view14 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        ImageView imageView8 = (ImageView) view14.findViewById(R.id.menuButton);
        View view15 = this.f38309q;
        if (view15 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        imageView8.setAlpha(((ImageView) view15.findViewById(R.id.menuButton)).isEnabled() ? 1.0f : 0.5f);
        View view16 = this.f38309q;
        if (view16 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        TextView textView = (TextView) view16.findViewById(R.id.timeLeft);
        int i15 = f38297t;
        textView.setVisibility(((i15 == 2 || i15 == 3) && i().l() && i().g() == r6.l.ONE_TO_ONE) ? 0 : 8);
        if (f38297t == 0) {
            View view17 = this.f38309q;
            if (view17 != null) {
                ((TextView) view17.findViewById(R.id.timeLeft)).setText("00:00:00");
            } else {
                fd.j0.r("widgetView");
                throw null;
            }
        }
    }

    public final void z() {
        View view;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        View view2 = this.f38309q;
        if (view2 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.controlsContainer);
        fd.j0.g(linearLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view3 : (p0.i0.a) p0.i0.b(linearLayout)) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.width = A();
            layoutParams.height = A();
            view3.setLayoutParams(layoutParams);
            view3.requestLayout();
            view3.setPadding(this.f38305m == 1 ? g() : 0, this.f38305m != 1 ? g() : 0, 0, 0);
        }
        View view4 = this.f38309q;
        if (view4 == null) {
            fd.j0.r("widgetView");
            throw null;
        }
        LinearLayout linearLayout2 = (LinearLayout) view4.findViewById(R.id.navigationContainer);
        fd.j0.g(linearLayout2, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view5 : (p0.i0.a) p0.i0.b(linearLayout2)) {
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            layoutParams2.width = A();
            layoutParams2.height = A();
            view5.setLayoutParams(layoutParams2);
            view5.requestLayout();
            view5.setPadding(this.f38305m == 1 ? g() : 0, this.f38305m != 1 ? g() : 0, 0, 0);
        }
        if (this.f38305m == 1) {
            View view6 = this.f38309q;
            if (view6 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view6).setOrientation(1);
            View view7 = this.f38309q;
            if (view7 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout3 = (LinearLayout) view7.findViewById(R.id.controlsContainer);
            fd.j0.g(linearLayout3, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout3.setOrientation(0);
            View view8 = this.f38309q;
            if (view8 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout4 = (LinearLayout) view8.findViewById(R.id.navigationContainer);
            fd.j0.g(linearLayout4, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout4.setOrientation(0);
            view = this.f38309q;
            if (view == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            iG = g() / 2;
            iG2 = g() / 2;
            iG3 = g() * 2;
            iG4 = g() / 2;
        } else {
            View view9 = this.f38309q;
            if (view9 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            ((LinearLayout) view9).setOrientation(0);
            View view10 = this.f38309q;
            if (view10 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout5 = (LinearLayout) view10.findViewById(R.id.controlsContainer);
            fd.j0.g(linearLayout5, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout5.setOrientation(1);
            View view11 = this.f38309q;
            if (view11 == null) {
                fd.j0.r("widgetView");
                throw null;
            }
            LinearLayout linearLayout6 = (LinearLayout) view11.findViewById(R.id.navigationContainer);
            fd.j0.g(linearLayout6, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout6.setOrientation(1);
            view = this.f38309q;
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
}
