package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f1130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f1132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f1134p;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j.a f1135c;

        public a() {
            this.f1135c = new j.a(a1.this.f1119a.getContext(), 0, R.id.home, 0, 0, a1.this.f1127i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a1 a1Var = a1.this;
            Window.Callback callback = a1Var.f1130l;
            if (callback == null || !a1Var.f1131m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1135c);
        }
    }

    public class b extends p0.o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1137a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1138b;

        public b(int i10) {
            this.f1138b = i10;
        }

        @Override // p0.o0, p0.n0
        public void a(View view) {
            this.f1137a = true;
        }

        @Override // p0.o0, p0.n0
        public void b(View view) {
            if (this.f1137a) {
                return;
            }
            a1.this.f1119a.setVisibility(this.f1138b);
        }

        @Override // p0.o0, p0.n0
        public void c(View view) {
            a1.this.f1119a.setVisibility(0);
        }
    }

    public a1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, com.inscode.autoclicker.R.string.abc_action_bar_up_description, com.inscode.autoclicker.R.drawable.abc_ic_ab_back_material);
    }

    public a1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1133o = 0;
        this.f1119a = toolbar;
        this.f1127i = toolbar.getTitle();
        this.f1128j = toolbar.getSubtitle();
        this.f1126h = this.f1127i != null;
        this.f1125g = toolbar.getNavigationIcon();
        y0 y0VarR = y0.r(toolbar.getContext(), null, d.a.f28459a, com.inscode.autoclicker.R.attr.actionBarStyle, 0);
        int i12 = 15;
        this.f1134p = y0VarR.g(15);
        if (z10) {
            CharSequence charSequenceO = y0VarR.o(27);
            if (!TextUtils.isEmpty(charSequenceO)) {
                setTitle(charSequenceO);
            }
            CharSequence charSequenceO2 = y0VarR.o(25);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                this.f1128j = charSequenceO2;
                if ((this.f1120b & 8) != 0) {
                    this.f1119a.setSubtitle(charSequenceO2);
                }
            }
            Drawable drawableG = y0VarR.g(20);
            if (drawableG != null) {
                this.f1124f = drawableG;
                A();
            }
            Drawable drawableG2 = y0VarR.g(17);
            if (drawableG2 != null) {
                this.f1123e = drawableG2;
                A();
            }
            if (this.f1125g == null && (drawable = this.f1134p) != null) {
                this.f1125g = drawable;
                z();
            }
            k(y0VarR.j(10, 0));
            int iM = y0VarR.m(9, 0);
            if (iM != 0) {
                View viewInflate = LayoutInflater.from(this.f1119a.getContext()).inflate(iM, (ViewGroup) this.f1119a, false);
                View view = this.f1122d;
                if (view != null && (this.f1120b & 16) != 0) {
                    this.f1119a.removeView(view);
                }
                this.f1122d = viewInflate;
                if (viewInflate != null && (this.f1120b & 16) != 0) {
                    this.f1119a.addView(viewInflate);
                }
                k(this.f1120b | 16);
            }
            int iL = y0VarR.l(13, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1119a.getLayoutParams();
                layoutParams.height = iL;
                this.f1119a.setLayoutParams(layoutParams);
            }
            int iE = y0VarR.e(7, -1);
            int iE2 = y0VarR.e(3, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1119a.setContentInsetsRelative(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iM2 = y0VarR.m(28, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1119a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM2);
            }
            int iM3 = y0VarR.m(26, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1119a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM3);
            }
            int iM4 = y0VarR.m(22, 0);
            if (iM4 != 0) {
                this.f1119a.setPopupTheme(iM4);
            }
        } else {
            if (this.f1119a.getNavigationIcon() != null) {
                this.f1134p = this.f1119a.getNavigationIcon();
            } else {
                i12 = 11;
            }
            this.f1120b = i12;
        }
        y0VarR.f1412b.recycle();
        if (i10 != this.f1133o) {
            this.f1133o = i10;
            if (TextUtils.isEmpty(this.f1119a.getNavigationContentDescription())) {
                int i13 = this.f1133o;
                this.f1129k = i13 != 0 ? getContext().getString(i13) : null;
                y();
            }
        }
        this.f1129k = this.f1119a.getNavigationContentDescription();
        this.f1119a.setNavigationOnClickListener(new a());
    }

    public final void A() {
        Drawable drawable;
        int i10 = this.f1120b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1124f) == null) {
            drawable = this.f1123e;
        }
        this.f1119a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.b0
    public void a(Menu menu, androidx.appcompat.view.menu.i.a aVar) {
        if (this.f1132n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1119a.getContext());
            this.f1132n = actionMenuPresenter;
            actionMenuPresenter.f804k = com.inscode.autoclicker.R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f1132n;
        actionMenuPresenter2.f800g = aVar;
        this.f1119a.setMenu((androidx.appcompat.view.menu.e) menu, actionMenuPresenter2);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean b() {
        return this.f1119a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.b0
    public void c() {
        this.f1131m = true;
    }

    @Override // androidx.appcompat.widget.b0
    public void collapseActionView() {
        this.f1119a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean d() {
        return this.f1119a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean e() {
        return this.f1119a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean f() {
        return this.f1119a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean g() {
        return this.f1119a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public Context getContext() {
        return this.f1119a.getContext();
    }

    @Override // androidx.appcompat.widget.b0
    public CharSequence getTitle() {
        return this.f1119a.getTitle();
    }

    @Override // androidx.appcompat.widget.b0
    public void h() {
        this.f1119a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.b0
    public void i(p0 p0Var) {
        View view = this.f1121c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1119a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1121c);
            }
        }
        this.f1121c = null;
    }

    @Override // androidx.appcompat.widget.b0
    public boolean j() {
        return this.f1119a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.b0
    public void k(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1120b ^ i10;
        this.f1120b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    y();
                }
                z();
            }
            if ((i11 & 3) != 0) {
                A();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1119a.setTitle(this.f1127i);
                    toolbar = this.f1119a;
                    charSequence = this.f1128j;
                } else {
                    charSequence = null;
                    this.f1119a.setTitle((CharSequence) null);
                    toolbar = this.f1119a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1122d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1119a.addView(view);
            } else {
                this.f1119a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.b0
    public Menu l() {
        return this.f1119a.getMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public void m(int i10) {
        this.f1124f = i10 != 0 ? e.a.b(getContext(), i10) : null;
        A();
    }

    @Override // androidx.appcompat.widget.b0
    public int n() {
        return 0;
    }

    @Override // androidx.appcompat.widget.b0
    public p0.m0 o(int i10, long j10) {
        p0.m0 m0VarB = p0.e0.b(this.f1119a);
        m0VarB.a(i10 == 0 ? 1.0f : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        m0VarB.c(j10);
        b bVar = new b(i10);
        View view = m0VarB.f34395a.get();
        if (view != null) {
            m0VarB.e(view, bVar);
        }
        return m0VarB;
    }

    @Override // androidx.appcompat.widget.b0
    public void p(androidx.appcompat.view.menu.i.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f1119a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.b0
    public void q(int i10) {
        this.f1119a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.b0
    public ViewGroup r() {
        return this.f1119a;
    }

    @Override // androidx.appcompat.widget.b0
    public void s(boolean z10) {
    }

    @Override // androidx.appcompat.widget.b0
    public void setBackgroundDrawable(Drawable drawable) {
        Toolbar toolbar = this.f1119a;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.q(toolbar, drawable);
    }

    @Override // androidx.appcompat.widget.b0
    public void setIcon(int i10) {
        this.f1123e = i10 != 0 ? e.a.b(getContext(), i10) : null;
        A();
    }

    @Override // androidx.appcompat.widget.b0
    public void setIcon(Drawable drawable) {
        this.f1123e = drawable;
        A();
    }

    @Override // androidx.appcompat.widget.b0
    public void setTitle(CharSequence charSequence) {
        this.f1126h = true;
        x(charSequence);
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        this.f1130l = callback;
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1126h) {
            return;
        }
        x(charSequence);
    }

    @Override // androidx.appcompat.widget.b0
    public int t() {
        return this.f1120b;
    }

    @Override // androidx.appcompat.widget.b0
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b0
    public void w(boolean z10) {
        this.f1119a.setCollapsible(z10);
    }

    public final void x(CharSequence charSequence) {
        this.f1127i = charSequence;
        if ((this.f1120b & 8) != 0) {
            this.f1119a.setTitle(charSequence);
            if (this.f1126h) {
                p0.e0.r(this.f1119a.getRootView(), charSequence);
            }
        }
    }

    public final void y() {
        if ((this.f1120b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1129k)) {
                this.f1119a.setNavigationContentDescription(this.f1133o);
            } else {
                this.f1119a.setNavigationContentDescription(this.f1129k);
            }
        }
    }

    public final void z() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1120b & 4) != 0) {
            toolbar = this.f1119a;
            drawable = this.f1125g;
            if (drawable == null) {
                drawable = this.f1134p;
            }
        } else {
            toolbar = this.f1119a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }
}
