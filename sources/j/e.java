package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import q.h;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.a f31677d;

    public e(Context context, j0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f31677d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return c(this.f31677d.add(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f31677d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f31677d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f31677d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f31677d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return d(this.f31677d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f31677d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f31677d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f31677d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        h<j0.b, MenuItem> hVar = this.f31664b;
        if (hVar != null) {
            hVar.clear();
        }
        h<j0.c, SubMenu> hVar2 = this.f31665c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f31677d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f31677d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return c(this.f31677d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return c(this.f31677d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f31677d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f31677d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f31677d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f31677d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        if (this.f31664b != null) {
            int i11 = 0;
            while (true) {
                h<j0.b, MenuItem> hVar = this.f31664b;
                if (i11 >= hVar.f34737e) {
                    break;
                }
                if (hVar.h(i11).getGroupId() == i10) {
                    this.f31664b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f31677d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        if (this.f31664b != null) {
            int i11 = 0;
            while (true) {
                h<j0.b, MenuItem> hVar = this.f31664b;
                if (i11 >= hVar.f34737e) {
                    break;
                }
                if (hVar.h(i11).getItemId() == i10) {
                    this.f31664b.j(i11);
                    break;
                }
                i11++;
            }
        }
        this.f31677d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f31677d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f31677d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f31677d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f31677d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f31677d.size();
    }
}
