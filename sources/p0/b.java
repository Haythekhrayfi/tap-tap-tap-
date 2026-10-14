package p0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f34336a;

    public interface a {
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.f34336a != null) {
            StringBuilder sbA = defpackage.a.a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sbA.append(getClass().getSimpleName());
            sbA.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sbA.toString());
        }
        this.f34336a = aVar;
    }
}
