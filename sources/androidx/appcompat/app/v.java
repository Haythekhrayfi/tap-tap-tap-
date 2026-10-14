package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.b0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class v extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatDelegateImpl.c f709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<androidx.appcompat.app.a.b> f713g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f714h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            Menu menuT = vVar.t();
            androidx.appcompat.view.menu.e eVar = menuT instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuT : null;
            if (eVar != null) {
                eVar.stopDispatchingItemsChanged();
            }
            try {
                menuT.clear();
                if (!vVar.f708b.onCreatePanelMenu(0, menuT) || !vVar.f708b.onPreparePanel(0, null, menuT)) {
                    menuT.clear();
                }
            } finally {
                if (eVar != null) {
                    eVar.startDispatchingItemsChanged();
                }
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements androidx.appcompat.view.menu.i.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f717c;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean a(androidx.appcompat.view.menu.e eVar) {
            v.this.f708b.onMenuOpened(108, eVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f717c) {
                return;
            }
            this.f717c = true;
            v.this.f707a.h();
            v.this.f708b.onPanelClosed(108, eVar);
            this.f717c = false;
        }
    }

    public final class d implements androidx.appcompat.view.menu.e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            if (v.this.f707a.b()) {
                v.this.f708b.onPanelClosed(108, eVar);
            } else if (v.this.f708b.onPreparePanel(0, null, eVar)) {
                v.this.f708b.onMenuOpened(108, eVar);
            }
        }
    }

    public class e implements AppCompatDelegateImpl.c {
        public e() {
        }
    }

    public v(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        a1 a1Var = new a1(toolbar, false);
        this.f707a = a1Var;
        Objects.requireNonNull(callback);
        this.f708b = callback;
        a1Var.f1130l = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!a1Var.f1126h) {
            a1Var.x(charSequence);
        }
        this.f709c = new e();
    }

    @Override // androidx.appcompat.app.a
    public boolean a() {
        return this.f707a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean b() {
        if (!this.f707a.j()) {
            return false;
        }
        this.f707a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z10) {
        if (z10 == this.f712f) {
            return;
        }
        this.f712f = z10;
        int size = this.f713g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f713g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int d() {
        return this.f707a.t();
    }

    @Override // androidx.appcompat.app.a
    public Context e() {
        return this.f707a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void f() {
        this.f707a.q(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        this.f707a.r().removeCallbacks(this.f714h);
        ViewGroup viewGroupR = this.f707a.r();
        Runnable runnable = this.f714h;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.m(viewGroupR, runnable);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.a
    public void i() {
        this.f707a.r().removeCallbacks(this.f714h);
    }

    @Override // androidx.appcompat.app.a
    public boolean j(int i10, KeyEvent keyEvent) {
        Menu menuT = t();
        if (menuT == null) {
            return false;
        }
        menuT.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuT.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f707a.g();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        return this.f707a.g();
    }

    @Override // androidx.appcompat.app.a
    public void m(Drawable drawable) {
        this.f707a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void o(boolean z10) {
        this.f707a.k(((z10 ? 4 : 0) & 4) | ((-5) & this.f707a.t()));
    }

    @Override // androidx.appcompat.app.a
    public void p(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void q(CharSequence charSequence) {
        this.f707a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void r(CharSequence charSequence) {
        this.f707a.setWindowTitle(charSequence);
    }

    public final Menu t() {
        if (!this.f711e) {
            this.f707a.p(new c(), new d());
            this.f711e = true;
        }
        return this.f707a.l();
    }
}
