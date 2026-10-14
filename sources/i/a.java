package i;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f31119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31120d;

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    public interface InterfaceC0307a {
        boolean a(a aVar, MenuItem menuItem);

        void b(a aVar);

        boolean c(a aVar, Menu menu);

        boolean d(a aVar, Menu menu);
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view);

    public abstract void j(int i10);

    public abstract void k(CharSequence charSequence);

    public abstract void l(int i10);

    public abstract void m(CharSequence charSequence);

    public void n(boolean z10) {
        this.f31120d = z10;
    }
}
