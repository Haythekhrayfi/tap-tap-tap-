package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import q.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h<j0.b, MenuItem> f31664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h<j0.c, SubMenu> f31665c;

    public b(Context context) {
        this.f31663a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof j0.b)) {
            return menuItem;
        }
        j0.b bVar = (j0.b) menuItem;
        if (this.f31664b == null) {
            this.f31664b = new h<>();
        }
        MenuItem menuItem2 = this.f31664b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f31663a, bVar);
        this.f31664b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof j0.c)) {
            return subMenu;
        }
        j0.c cVar = (j0.c) subMenu;
        if (this.f31665c == null) {
            this.f31665c = new h<>();
        }
        SubMenu subMenu2 = this.f31665c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f31663a, cVar);
        this.f31665c.put(cVar, gVar);
        return gVar;
    }
}
