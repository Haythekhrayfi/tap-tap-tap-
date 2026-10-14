package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.n0;
import p0.o0;
import p0.p0;

/* JADX INFO: loaded from: classes.dex */
public class z extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i.a f740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i.a.InterfaceC0307a f741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<androidx.appcompat.app.a.b> f743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i.h f751u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f752v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n0 f754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n0 f755y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p0 f756z;

    public class a extends o0 {
        public a() {
        }

        @Override // p0.o0, p0.n0
        public void b(View view) {
            View view2;
            z zVar = z.this;
            if (zVar.f746p && (view2 = zVar.f737g) != null) {
                view2.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                z.this.f734d.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            z.this.f734d.setVisibility(8);
            z.this.f734d.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f751u = null;
            i.a.InterfaceC0307a interfaceC0307a = zVar2.f741k;
            if (interfaceC0307a != null) {
                interfaceC0307a.b(zVar2.f740j);
                zVar2.f740j = null;
                zVar2.f741k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f733c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends o0 {
        public b() {
        }

        @Override // p0.o0, p0.n0
        public void b(View view) {
            z zVar = z.this;
            zVar.f751u = null;
            zVar.f734d.requestLayout();
        }
    }

    public class c implements p0 {
        public c() {
        }
    }

    public class d extends i.a implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Context f760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i.a.InterfaceC0307a f762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public WeakReference<View> f763h;

        public d(Context context, i.a.InterfaceC0307a interfaceC0307a) {
            this.f760e = context;
            this.f762g = interfaceC0307a;
            androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(context).setDefaultShowAsAction(1);
            this.f761f = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // i.a
        public void a() {
            z zVar = z.this;
            if (zVar.f739i != this) {
                return;
            }
            if ((zVar.f747q || zVar.f748r) ? false : true) {
                this.f762g.b(this);
            } else {
                zVar.f740j = this;
                zVar.f741k = this.f762g;
            }
            this.f762g = null;
            z.this.t(false);
            ActionBarContextView actionBarContextView = z.this.f736f;
            if (actionBarContextView.f931m == null) {
                actionBarContextView.h();
            }
            z zVar2 = z.this;
            zVar2.f733c.setHideOnContentScrollEnabled(zVar2.f753w);
            z.this.f739i = null;
        }

        @Override // i.a
        public View b() {
            WeakReference<View> weakReference = this.f763h;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // i.a
        public Menu c() {
            return this.f761f;
        }

        @Override // i.a
        public MenuInflater d() {
            return new i.g(this.f760e);
        }

        @Override // i.a
        public CharSequence e() {
            return z.this.f736f.getSubtitle();
        }

        @Override // i.a
        public CharSequence f() {
            return z.this.f736f.getTitle();
        }

        @Override // i.a
        public void g() {
            if (z.this.f739i != this) {
                return;
            }
            this.f761f.stopDispatchingItemsChanged();
            try {
                this.f762g.c(this, this.f761f);
            } finally {
                this.f761f.startDispatchingItemsChanged();
            }
        }

        @Override // i.a
        public boolean h() {
            return z.this.f736f.f939u;
        }

        @Override // i.a
        public void i(View view) {
            z.this.f736f.setCustomView(view);
            this.f763h = new WeakReference<>(view);
        }

        @Override // i.a
        public void j(int i10) {
            z.this.f736f.setSubtitle(z.this.f731a.getResources().getString(i10));
        }

        @Override // i.a
        public void k(CharSequence charSequence) {
            z.this.f736f.setSubtitle(charSequence);
        }

        @Override // i.a
        public void l(int i10) {
            z.this.f736f.setTitle(z.this.f731a.getResources().getString(i10));
        }

        @Override // i.a
        public void m(CharSequence charSequence) {
            z.this.f736f.setTitle(charSequence);
        }

        @Override // i.a
        public void n(boolean z10) {
            this.f31120d = z10;
            z.this.f736f.setTitleOptional(z10);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            i.a.InterfaceC0307a interfaceC0307a = this.f762g;
            if (interfaceC0307a != null) {
                return interfaceC0307a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            if (this.f762g == null) {
                return;
            }
            g();
            ActionMenuPresenter actionMenuPresenter = z.this.f736f.f1143f;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.i();
            }
        }
    }

    public z(Activity activity, boolean z10) {
        new ArrayList();
        this.f743m = new ArrayList<>();
        this.f745o = 0;
        this.f746p = true;
        this.f750t = true;
        this.f754x = new a();
        this.f755y = new b();
        this.f756z = new c();
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z10) {
            return;
        }
        this.f737g = decorView.findViewById(R.id.content);
    }

    public z(Dialog dialog) {
        new ArrayList();
        this.f743m = new ArrayList<>();
        this.f745o = 0;
        this.f746p = true;
        this.f750t = true;
        this.f754x = new a();
        this.f755y = new b();
        this.f756z = new c();
        u(dialog.getWindow().getDecorView());
    }

    public z(View view) {
        new ArrayList();
        this.f743m = new ArrayList<>();
        this.f745o = 0;
        this.f746p = true;
        this.f750t = true;
        this.f754x = new a();
        this.f755y = new b();
        this.f756z = new c();
        u(view);
    }

    @Override // androidx.appcompat.app.a
    public boolean b() {
        b0 b0Var = this.f735e;
        if (b0Var == null || !b0Var.j()) {
            return false;
        }
        this.f735e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z10) {
        if (z10 == this.f742l) {
            return;
        }
        this.f742l = z10;
        int size = this.f743m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f743m.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int d() {
        return this.f735e.t();
    }

    @Override // androidx.appcompat.app.a
    public Context e() {
        if (this.f732b == null) {
            TypedValue typedValue = new TypedValue();
            this.f731a.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f732b = new ContextThemeWrapper(this.f731a, i10);
            } else {
                this.f732b = this.f731a;
            }
        }
        return this.f732b;
    }

    @Override // androidx.appcompat.app.a
    public void f() {
        if (this.f747q) {
            return;
        }
        this.f747q = true;
        w(false);
    }

    @Override // androidx.appcompat.app.a
    public void h(Configuration configuration) {
        v(this.f731a.getResources().getBoolean(com.inscode.autoclicker.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.a
    public boolean j(int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.e eVar;
        d dVar = this.f739i;
        if (dVar == null || (eVar = dVar.f761f) == null) {
            return false;
        }
        eVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return eVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void m(Drawable drawable) {
        this.f734d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z10) {
        if (this.f738h) {
            return;
        }
        o(z10);
    }

    @Override // androidx.appcompat.app.a
    public void o(boolean z10) {
        int i10 = z10 ? 4 : 0;
        int iT = this.f735e.t();
        this.f738h = true;
        this.f735e.k((i10 & 4) | ((-5) & iT));
    }

    @Override // androidx.appcompat.app.a
    public void p(boolean z10) {
        i.h hVar;
        this.f752v = z10;
        if (z10 || (hVar = this.f751u) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void q(CharSequence charSequence) {
        this.f735e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void r(CharSequence charSequence) {
        this.f735e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public i.a s(i.a.InterfaceC0307a interfaceC0307a) {
        d dVar = this.f739i;
        if (dVar != null) {
            dVar.a();
        }
        this.f733c.setHideOnContentScrollEnabled(false);
        this.f736f.h();
        d dVar2 = new d(this.f736f.getContext(), interfaceC0307a);
        dVar2.f761f.stopDispatchingItemsChanged();
        try {
            boolean zD = dVar2.f762g.d(dVar2, dVar2.f761f);
            dVar2.f761f.startDispatchingItemsChanged();
            if (!zD) {
                return null;
            }
            this.f739i = dVar2;
            dVar2.g();
            this.f736f.f(dVar2);
            t(true);
            return dVar2;
        } catch (Throwable th) {
            dVar2.f761f.startDispatchingItemsChanged();
            throw th;
        }
    }

    public void t(boolean z10) {
        m0 m0VarO;
        m0 m0VarE;
        if (z10) {
            if (!this.f749s) {
                this.f749s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f733c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f749s) {
            this.f749s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f733c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        ActionBarContainer actionBarContainer = this.f734d;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (!e0.g.c(actionBarContainer)) {
            if (z10) {
                this.f735e.q(4);
                this.f736f.setVisibility(0);
                return;
            } else {
                this.f735e.q(0);
                this.f736f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            m0VarE = this.f735e.o(4, 100L);
            m0VarO = this.f736f.e(0, 200L);
        } else {
            m0VarO = this.f735e.o(0, 200L);
            m0VarE = this.f736f.e(8, 100L);
        }
        i.h hVar = new i.h();
        hVar.f31174a.add(m0VarE);
        View view = m0VarE.f34395a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = m0VarO.f34395a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        hVar.f31174a.add(m0VarO);
        hVar.b();
    }

    public final void u(View view) {
        b0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.inscode.autoclicker.R.id.decor_content_parent);
        this.f733c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.inscode.autoclicker.R.id.action_bar);
        if (callbackFindViewById instanceof b0) {
            wrapper = (b0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbA = defpackage.a.a("Can't make a decor toolbar out of ");
                sbA.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbA.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f735e = wrapper;
        this.f736f = (ActionBarContextView) view.findViewById(com.inscode.autoclicker.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.inscode.autoclicker.R.id.action_bar_container);
        this.f734d = actionBarContainer;
        b0 b0Var = this.f735e;
        if (b0Var == null || this.f736f == null || actionBarContainer == null) {
            throw new IllegalStateException(z.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f731a = b0Var.getContext();
        boolean z10 = (this.f735e.t() & 4) != 0;
        if (z10) {
            this.f738h = true;
        }
        Context context = this.f731a;
        this.f735e.s((context.getApplicationInfo().targetSdkVersion < 14) || z10);
        v(context.getResources().getBoolean(com.inscode.autoclicker.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f731a.obtainStyledAttributes(null, d.a.f28459a, com.inscode.autoclicker.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f733c;
            if (!actionBarOverlayLayout2.f949j) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f753w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f734d;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void v(boolean z10) {
        this.f744n = z10;
        if (z10) {
            this.f734d.setTabContainer(null);
            this.f735e.i(null);
        } else {
            this.f735e.i(null);
            this.f734d.setTabContainer(null);
        }
        boolean z11 = this.f735e.n() == 2;
        this.f735e.w(!this.f744n && z11);
        this.f733c.setHasNonEmbeddedTabs(!this.f744n && z11);
    }

    public final void w(boolean z10) {
        View view;
        View view2;
        View view3;
        if (!(this.f749s || !(this.f747q || this.f748r))) {
            if (this.f750t) {
                this.f750t = false;
                i.h hVar = this.f751u;
                if (hVar != null) {
                    hVar.a();
                }
                if (this.f745o != 0 || (!this.f752v && !z10)) {
                    this.f754x.b(null);
                    return;
                }
                this.f734d.setAlpha(1.0f);
                this.f734d.setTransitioning(true);
                i.h hVar2 = new i.h();
                float f10 = -this.f734d.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f734d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                m0 m0VarB = e0.b(this.f734d);
                m0VarB.g(f10);
                m0VarB.f(this.f756z);
                if (!hVar2.f31178e) {
                    hVar2.f31174a.add(m0VarB);
                }
                if (this.f746p && (view = this.f737g) != null) {
                    m0 m0VarB2 = e0.b(view);
                    m0VarB2.g(f10);
                    if (!hVar2.f31178e) {
                        hVar2.f31174a.add(m0VarB2);
                    }
                }
                Interpolator interpolator = A;
                boolean z11 = hVar2.f31178e;
                if (!z11) {
                    hVar2.f31176c = interpolator;
                }
                if (!z11) {
                    hVar2.f31175b = 250L;
                }
                n0 n0Var = this.f754x;
                if (!z11) {
                    hVar2.f31177d = n0Var;
                }
                this.f751u = hVar2;
                hVar2.b();
                return;
            }
            return;
        }
        if (this.f750t) {
            return;
        }
        this.f750t = true;
        i.h hVar3 = this.f751u;
        if (hVar3 != null) {
            hVar3.a();
        }
        this.f734d.setVisibility(0);
        if (this.f745o == 0 && (this.f752v || z10)) {
            this.f734d.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            float f11 = -this.f734d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f734d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f734d.setTranslationY(f11);
            i.h hVar4 = new i.h();
            m0 m0VarB3 = e0.b(this.f734d);
            m0VarB3.g(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            m0VarB3.f(this.f756z);
            if (!hVar4.f31178e) {
                hVar4.f31174a.add(m0VarB3);
            }
            if (this.f746p && (view3 = this.f737g) != null) {
                view3.setTranslationY(f11);
                m0 m0VarB4 = e0.b(this.f737g);
                m0VarB4.g(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                if (!hVar4.f31178e) {
                    hVar4.f31174a.add(m0VarB4);
                }
            }
            Interpolator interpolator2 = B;
            boolean z12 = hVar4.f31178e;
            if (!z12) {
                hVar4.f31176c = interpolator2;
            }
            if (!z12) {
                hVar4.f31175b = 250L;
            }
            n0 n0Var2 = this.f755y;
            if (!z12) {
                hVar4.f31177d = n0Var2;
            }
            this.f751u = hVar4;
            hVar4.b();
        } else {
            this.f734d.setAlpha(1.0f);
            this.f734d.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            if (this.f746p && (view2 = this.f737g) != null) {
                view2.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            this.f755y.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f733c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.h.c(actionBarOverlayLayout);
        }
    }
}
