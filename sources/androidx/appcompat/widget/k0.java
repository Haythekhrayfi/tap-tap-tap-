package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f1282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f1284c;

    public class a implements androidx.appcompat.view.menu.e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            Objects.requireNonNull(k0.this);
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            Objects.requireNonNull(k0.this);
        }
    }

    public k0(Context context, View view) {
        this(context, view, 0);
    }

    public k0(Context context, View view, int i10) {
        this(context, view, i10, R.attr.popupMenuStyle, 0);
    }

    public k0(Context context, View view, int i10, int i11, int i12) {
        this.f1283b = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f1282a = eVar;
        eVar.setCallback(new a());
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context, eVar, view, false, i11, i12);
        this.f1284c = hVar;
        hVar.f890g = i10;
        hVar.f894k = new b();
    }
}
