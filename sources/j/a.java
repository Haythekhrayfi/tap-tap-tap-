package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements j0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f31647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f31648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f31649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f31650g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f31652i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f31654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f31655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f31656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f31657n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31651h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31653j = 4096;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f31658o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PorterDuff.Mode f31659p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31660q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31661r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31662s = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f31655l = context;
        this.f31644a = i11;
        this.f31645b = i10;
        this.f31646c = i13;
        this.f31647d = charSequence;
    }

    @Override // j0.b
    public j0.b a(p0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.b
    public p0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f31654k;
        if (drawable != null) {
            if (this.f31660q || this.f31661r) {
                this.f31654k = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f31654k = drawableMutate;
                if (this.f31660q) {
                    androidx.core.graphics.drawable.a.b.h(drawableMutate, this.f31658o);
                }
                if (this.f31661r) {
                    androidx.core.graphics.drawable.a.b.i(this.f31654k, this.f31659p);
                }
            }
        }
    }

    @Override // j0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // j0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // j0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f31653j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f31652i;
    }

    @Override // j0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f31656m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f31645b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f31654k;
    }

    @Override // j0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f31658o;
    }

    @Override // j0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f31659p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f31649f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f31644a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f31651h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f31650g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f31646c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f31647d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f31648e;
        return charSequence != null ? charSequence : this.f31647d;
    }

    @Override // j0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f31657n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // j0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f31662s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f31662s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f31662s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f31662s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f31652i = Character.toLowerCase(c10);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f31652i = Character.toLowerCase(c10);
        this.f31653j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f31662s = (z10 ? 1 : 0) | (this.f31662s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f31662s = (z10 ? 2 : 0) | (this.f31662s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f31656m = charSequence;
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public j0.b setContentDescription(CharSequence charSequence) {
        this.f31656m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f31662s = (z10 ? 16 : 0) | (this.f31662s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        Context context = this.f31655l;
        Object obj = e0.a.f28964a;
        this.f31654k = e0.a.c.b(context, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f31654k = drawable;
        c();
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f31658o = colorStateList;
        this.f31660q = true;
        c();
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f31659p = mode;
        this.f31661r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f31649f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f31650g = c10;
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f31650g = c10;
        this.f31651h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f31650g = c10;
        this.f31652i = Character.toLowerCase(c11);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f31650g = c10;
        this.f31651h = KeyEvent.normalizeMetaState(i10);
        this.f31652i = Character.toLowerCase(c11);
        this.f31653j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f31647d = this.f31655l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f31647d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f31648e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f31657n = charSequence;
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public j0.b setTooltipText(CharSequence charSequence) {
        this.f31657n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f31662s = (this.f31662s & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
