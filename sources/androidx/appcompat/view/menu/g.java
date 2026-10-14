package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j0.b {
    public p0.b A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f864h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f866j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f868l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f874r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f882z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f865i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f867k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f869m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f875s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f876t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f877u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f878v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f879w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f880x = 16;
    public boolean C = false;

    public class a implements p0.b.a {
        public a() {
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f881y = 0;
        this.f870n = eVar;
        this.f857a = i11;
        this.f858b = i10;
        this.f859c = i12;
        this.f860d = i13;
        this.f861e = charSequence;
        this.f881y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // j0.b
    public j0.b a(p0.b bVar) {
        p0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f34336a = null;
        }
        this.f882z = null;
        this.A = bVar;
        this.f870n.onItemsChanged(true);
        p0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // j0.b
    public p0.b b() {
        return this.A;
    }

    @Override // j0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f881y & 8) == 0) {
            return false;
        }
        if (this.f882z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f870n.collapseItemActionView(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f879w && (this.f877u || this.f878v)) {
            drawable = drawable.mutate();
            if (this.f877u) {
                androidx.core.graphics.drawable.a.b.h(drawable, this.f875s);
            }
            if (this.f878v) {
                androidx.core.graphics.drawable.a.b.i(drawable, this.f876t);
            }
            this.f879w = false;
        }
        return drawable;
    }

    public char e() {
        return this.f870n.isQwertyMode() ? this.f866j : this.f864h;
    }

    @Override // j0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f870n.expandItemActionView(this);
        }
        return false;
    }

    public boolean f() {
        p0.b bVar;
        if ((this.f881y & 8) == 0) {
            return false;
        }
        if (this.f882z == null && (bVar = this.A) != null) {
            this.f882z = bVar.d(this);
        }
        return this.f882z != null;
    }

    public boolean g() {
        return (this.f880x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // j0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f882z;
        if (view != null) {
            return view;
        }
        p0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.f882z = viewD;
        return viewD;
    }

    @Override // j0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f867k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f866j;
    }

    @Override // j0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f873q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f858b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f868l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f869m == 0) {
            return null;
        }
        Drawable drawableB = e.a.b(this.f870n.getContext(), this.f869m);
        this.f869m = 0;
        this.f868l = drawableB;
        return d(drawableB);
    }

    @Override // j0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f875s;
    }

    @Override // j0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f876t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f863g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f857a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // j0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f865i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f864h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f859c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f871o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f861e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f862f;
        return charSequence != null ? charSequence : this.f861e;
    }

    @Override // j0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f874r;
    }

    public boolean h() {
        return (this.f880x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f871o != null;
    }

    public j0.b i(View view) {
        int i10;
        this.f882z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f857a) > 0) {
            view.setId(i10);
        }
        this.f870n.onItemActionRequestChanged(this);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f880x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f880x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f880x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        p0.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            return (this.f880x & 8) == 0;
        }
        return (this.f880x & 8) == 0 && this.A.b();
    }

    public void j(boolean z10) {
        int i10 = this.f880x;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f880x = i11;
        if (i10 != i11) {
            this.f870n.onItemsChanged(false);
        }
    }

    public void k(boolean z10) {
        this.f880x = (z10 ? 4 : 0) | (this.f880x & (-5));
    }

    public void l(boolean z10) {
        this.f880x = z10 ? this.f880x | 32 : this.f880x & (-33);
    }

    public boolean m(boolean z10) {
        int i10 = this.f880x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f880x = i11;
        return i10 != i11;
    }

    public boolean n() {
        return this.f870n.isShortcutsVisible() && e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setActionView(int i10) {
        Context context = this.f870n.getContext();
        i(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f866j == c10) {
            return this;
        }
        this.f866j = Character.toLowerCase(c10);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f866j == c10 && this.f867k == i10) {
            return this;
        }
        this.f866j = Character.toLowerCase(c10);
        this.f867k = KeyEvent.normalizeMetaState(i10);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f880x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f880x = i11;
        if (i10 != i11) {
            this.f870n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f880x & 4) != 0) {
            this.f870n.setExclusiveItemChecked(this);
        } else {
            j(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f873q = charSequence;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public j0.b setContentDescription(CharSequence charSequence) {
        this.f873q = charSequence;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f880x = z10 ? this.f880x | 16 : this.f880x & (-17);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f868l = null;
        this.f869m = i10;
        this.f879w = true;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f869m = 0;
        this.f868l = drawable;
        this.f879w = true;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f875s = colorStateList;
        this.f877u = true;
        this.f879w = true;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f876t = mode;
        this.f878v = true;
        this.f879w = true;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f863g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f864h == c10) {
            return this;
        }
        this.f864h = c10;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f864h == c10 && this.f865i == i10) {
            return this;
        }
        this.f864h = c10;
        this.f865i = KeyEvent.normalizeMetaState(i10);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f872p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f864h = c10;
        this.f866j = Character.toLowerCase(c11);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f864h = c10;
        this.f865i = KeyEvent.normalizeMetaState(i10);
        this.f866j = Character.toLowerCase(c11);
        this.f867k = KeyEvent.normalizeMetaState(i11);
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f881y = i10;
        this.f870n.onItemActionRequestChanged(this);
    }

    @Override // j0.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        setTitle(this.f870n.getContext().getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f861e = charSequence;
        this.f870n.onItemsChanged(false);
        l lVar = this.f871o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f862f = charSequence;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f874r = charSequence;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // j0.b, android.view.MenuItem
    public j0.b setTooltipText(CharSequence charSequence) {
        this.f874r = charSequence;
        this.f870n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m(z10)) {
            this.f870n.onItemVisibleChanged(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f861e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
