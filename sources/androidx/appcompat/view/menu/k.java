package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.j0;
import com.inscode.autoclicker.R;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j.d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0 f904k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i.a f910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f914u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f916w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f905l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f906m = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f915v = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (k.this.a()) {
                k kVar = k.this;
                if (kVar.f904k.f1256z) {
                    return;
                }
                View view = kVar.f909p;
                if (view == null || !view.isShown()) {
                    k.this.dismiss();
                } else {
                    k.this.f904k.show();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f911r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f911r = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f911r.removeGlobalOnLayoutListener(kVar.f905l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f897d = context;
        this.f898e = eVar;
        this.f900g = z10;
        this.f899f = new d(eVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f902i = i10;
        this.f903j = i11;
        Resources resources = context.getResources();
        this.f901h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f908o = view;
        this.f904k = new j0(context, null, i10, i11);
        eVar.addMenuPresenter(this, context);
    }

    @Override // j.f
    public boolean a() {
        return !this.f912s && this.f904k.a();
    }

    @Override // j.d
    public void b(e eVar) {
    }

    @Override // j.d
    public void d(View view) {
        this.f908o = view;
    }

    @Override // j.f
    public void dismiss() {
        if (a()) {
            this.f904k.dismiss();
        }
    }

    @Override // j.d
    public void e(boolean z10) {
        this.f899f.f850e = z10;
    }

    @Override // j.d
    public void f(int i10) {
        this.f915v = i10;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // j.d
    public void g(int i10) {
        this.f904k.f1238h = i10;
    }

    @Override // j.f
    public ListView h() {
        return this.f904k.f1235e;
    }

    @Override // j.d
    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f907n = onDismissListener;
    }

    @Override // j.d
    public void j(boolean z10) {
        this.f916w = z10;
    }

    @Override // j.d
    public void k(int i10) {
        j0 j0Var = this.f904k;
        j0Var.f1239i = i10;
        j0Var.f1241k = true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        if (eVar != this.f898e) {
            return;
        }
        dismiss();
        i.a aVar = this.f910q;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f912s = true;
        this.f898e.close();
        ViewTreeObserver viewTreeObserver = this.f911r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f911r = this.f909p.getViewTreeObserver();
            }
            this.f911r.removeGlobalOnLayoutListener(this.f905l);
            this.f911r = null;
        }
        this.f909p.removeOnAttachStateChangeListener(this.f906m);
        PopupWindow.OnDismissListener onDismissListener = this.f907n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        boolean z10;
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f897d, lVar, this.f909p, this.f900g, this.f902i, this.f903j);
            hVar.d(this.f910q);
            boolean zL = j.d.l(lVar);
            hVar.f891h = zL;
            j.d dVar = hVar.f893j;
            if (dVar != null) {
                dVar.e(zL);
            }
            hVar.f894k = this.f907n;
            this.f907n = null;
            this.f898e.close(false);
            j0 j0Var = this.f904k;
            int width = j0Var.f1238h;
            int i10 = !j0Var.f1241k ? 0 : j0Var.f1239i;
            int i11 = this.f915v;
            View view = this.f908o;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if ((Gravity.getAbsoluteGravity(i11, e0.e.d(view)) & 7) == 5) {
                width += this.f908o.getWidth();
            }
            if (hVar.b()) {
                z10 = true;
            } else if (hVar.f889f == null) {
                z10 = false;
            } else {
                hVar.e(width, i10, true, true);
                z10 = true;
            }
            if (z10) {
                i.a aVar = this.f910q;
                if (aVar != null) {
                    aVar.a(lVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.f910q = aVar;
    }

    @Override // j.f
    public void show() {
        View view;
        boolean z10 = true;
        if (!a()) {
            if (this.f912s || (view = this.f908o) == null) {
                z10 = false;
            } else {
                this.f909p = view;
                this.f904k.A.setOnDismissListener(this);
                j0 j0Var = this.f904k;
                j0Var.f1248r = this;
                j0Var.q(true);
                View view2 = this.f909p;
                boolean z11 = this.f911r == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f911r = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f905l);
                }
                view2.addOnAttachStateChangeListener(this.f906m);
                j0 j0Var2 = this.f904k;
                j0Var2.f1247q = view2;
                j0Var2.f1244n = this.f915v;
                if (!this.f913t) {
                    this.f914u = j.d.c(this.f899f, null, this.f897d, this.f901h);
                    this.f913t = true;
                }
                this.f904k.p(this.f914u);
                this.f904k.A.setInputMethodMode(2);
                j0 j0Var3 = this.f904k;
                Rect rect = this.f31676c;
                Objects.requireNonNull(j0Var3);
                j0Var3.f1255y = rect != null ? new Rect(rect) : null;
                this.f904k.show();
                d0 d0Var = this.f904k.f1235e;
                d0Var.setOnKeyListener(this);
                if (this.f916w && this.f898e.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f897d).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) d0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(this.f898e.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    d0Var.addHeaderView(frameLayout, null, false);
                }
                this.f904k.n(this.f899f);
                this.f904k.show();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        this.f913t = false;
        d dVar = this.f899f;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
