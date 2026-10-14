package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends j.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.b f31666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f31667e;

    public class a extends p0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActionProvider f31668b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f31668b = actionProvider;
        }

        @Override // p0.b
        public boolean a() {
            return this.f31668b.hasSubMenu();
        }

        @Override // p0.b
        public View c() {
            return this.f31668b.onCreateActionView();
        }

        @Override // p0.b
        public boolean e() {
            return this.f31668b.onPerformDefaultAction();
        }

        @Override // p0.b
        public void f(SubMenu subMenu) {
            this.f31668b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p0.b.a f31670d;

        public b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p0.b
        public boolean b() {
            return this.f31668b.isVisible();
        }

        @Override // p0.b
        public View d(MenuItem menuItem) {
            return this.f31668b.onCreateActionView(menuItem);
        }

        @Override // p0.b
        public boolean g() {
            return this.f31668b.overridesItemVisibility();
        }

        @Override // p0.b
        public void h(p0.b.a aVar) {
            this.f31670d = aVar;
            this.f31668b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            p0.b.a aVar = this.f31670d;
            if (aVar != null) {
                androidx.appcompat.view.menu.g gVar = androidx.appcompat.view.menu.g.this;
                gVar.f870n.onItemVisibleChanged(gVar);
            }
        }
    }

    /* JADX INFO: renamed from: j.c$c, reason: collision with other inner class name */
    public static class C0318c extends FrameLayout implements i.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CollapsibleActionView f31671c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0318c(View view) {
            super(view.getContext());
            this.f31671c = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // i.b
        public void b() {
            this.f31671c.onActionViewExpanded();
        }

        @Override // i.b
        public void c() {
            this.f31671c.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f31672a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f31672a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f31672a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f31672a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f31674c;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f31674c = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f31674c.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, j0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f31666d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f31666d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f31666d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        p0.b bVarB = this.f31666d.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).f31668b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f31666d.getActionView();
        return actionView instanceof C0318c ? (View) ((C0318c) actionView).f31671c : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f31666d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f31666d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f31666d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f31666d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f31666d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f31666d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f31666d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f31666d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f31666d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f31666d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f31666d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f31666d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f31666d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f31666d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f31666d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f31666d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f31666d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f31666d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f31666d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f31666d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f31666d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f31666d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f31666d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f31663a, actionProvider);
        j0.b bVar2 = this.f31666d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f31666d.setActionView(i10);
        View actionView = this.f31666d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f31666d.setActionView(new C0318c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0318c(view);
        }
        this.f31666d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f31666d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f31666d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f31666d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f31666d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f31666d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f31666d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f31666d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f31666d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f31666d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f31666d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f31666d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f31666d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f31666d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f31666d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f31666d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f31666d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f31666d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f31666d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f31666d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f31666d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f31666d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f31666d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f31666d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f31666d.setVisible(z10);
    }
}
