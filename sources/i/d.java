package i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class d extends a implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f31127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f31128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.InterfaceC0307a f31129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference<View> f31130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f31132j;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0307a interfaceC0307a, boolean z10) {
        this.f31127e = context;
        this.f31128f = actionBarContextView;
        this.f31129g = interfaceC0307a;
        androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f31132j = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // i.a
    public void a() {
        if (this.f31131i) {
            return;
        }
        this.f31131i = true;
        this.f31129g.b(this);
    }

    @Override // i.a
    public View b() {
        WeakReference<View> weakReference = this.f31130h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public Menu c() {
        return this.f31132j;
    }

    @Override // i.a
    public MenuInflater d() {
        return new g(this.f31128f.getContext());
    }

    @Override // i.a
    public CharSequence e() {
        return this.f31128f.getSubtitle();
    }

    @Override // i.a
    public CharSequence f() {
        return this.f31128f.getTitle();
    }

    @Override // i.a
    public void g() {
        this.f31129g.c(this, this.f31132j);
    }

    @Override // i.a
    public boolean h() {
        return this.f31128f.f939u;
    }

    @Override // i.a
    public void i(View view) {
        this.f31128f.setCustomView(view);
        this.f31130h = view != null ? new WeakReference<>(view) : null;
    }

    @Override // i.a
    public void j(int i10) {
        this.f31128f.setSubtitle(this.f31127e.getString(i10));
    }

    @Override // i.a
    public void k(CharSequence charSequence) {
        this.f31128f.setSubtitle(charSequence);
    }

    @Override // i.a
    public void l(int i10) {
        this.f31128f.setTitle(this.f31127e.getString(i10));
    }

    @Override // i.a
    public void m(CharSequence charSequence) {
        this.f31128f.setTitle(charSequence);
    }

    @Override // i.a
    public void n(boolean z10) {
        this.f31120d = z10;
        this.f31128f.setTitleOptional(z10);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f31129g.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        g();
        ActionMenuPresenter actionMenuPresenter = this.f31128f.f1143f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i();
        }
    }
}
