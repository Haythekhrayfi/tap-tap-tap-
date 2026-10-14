package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.a f31134b;

    public static class a implements i.a.InterfaceC0307a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f31135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f31136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f31137c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q.h<Menu, Menu> f31138d = new q.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f31136b = context;
            this.f31135a = callback;
        }

        @Override // i.a.InterfaceC0307a
        public boolean a(i.a aVar, MenuItem menuItem) {
            return this.f31135a.onActionItemClicked(e(aVar), new j.c(this.f31136b, (j0.b) menuItem));
        }

        @Override // i.a.InterfaceC0307a
        public void b(i.a aVar) {
            this.f31135a.onDestroyActionMode(e(aVar));
        }

        @Override // i.a.InterfaceC0307a
        public boolean c(i.a aVar, Menu menu) {
            return this.f31135a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // i.a.InterfaceC0307a
        public boolean d(i.a aVar, Menu menu) {
            return this.f31135a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(i.a aVar) {
            int size = this.f31137c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f31137c.get(i10);
                if (eVar != null && eVar.f31134b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f31136b, aVar);
            this.f31137c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f31138d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            j.e eVar = new j.e(this.f31136b, (j0.a) menu);
            this.f31138d.put(menu, eVar);
            return eVar;
        }
    }

    public e(Context context, i.a aVar) {
        this.f31133a = context;
        this.f31134b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f31134b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f31134b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new j.e(this.f31133a, (j0.a) this.f31134b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f31134b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f31134b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f31134b.f31119c;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f31134b.f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f31134b.f31120d;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f31134b.g();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f31134b.h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f31134b.i(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f31134b.j(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f31134b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f31134b.f31119c = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f31134b.l(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f31134b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f31134b.n(z10);
    }
}
