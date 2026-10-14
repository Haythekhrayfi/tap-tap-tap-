package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.activity.result.c;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationBarMenu extends e {
    private final int maxItemCount;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i10) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i10;
    }

    @Override // androidx.appcompat.view.menu.e
    public MenuItem addInternal(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i10, i11, i12, charSequence);
            if (menuItemAddInternal instanceof g) {
                ((g) menuItemAddInternal).k(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbA = c.a("Maximum number of items supported by ", simpleName, " is ");
        sbA.append(this.maxItemCount);
        sbA.append(". Limit can be checked with ");
        sbA.append(simpleName);
        sbA.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbA.toString());
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
