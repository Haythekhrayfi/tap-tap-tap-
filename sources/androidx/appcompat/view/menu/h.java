package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.inscode.autoclicker.R;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j.d f893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f895l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.c();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar) {
        this(context, eVar, null, false, R.attr.popupMenuStyle, 0);
    }

    public h(Context context, e eVar, View view) {
        this(context, eVar, view, false, R.attr.popupMenuStyle, 0);
    }

    public h(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f890g = 8388611;
        this.f895l = new a();
        this.f884a = context;
        this.f885b = eVar;
        this.f889f = view;
        this.f886c = z10;
        this.f887d = i10;
        this.f888e = i11;
    }

    public j.d a() {
        if (this.f893j == null) {
            Display defaultDisplay = ((WindowManager) this.f884a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            j.d bVar = Math.min(point.x, point.y) >= this.f884a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new androidx.appcompat.view.menu.b(this.f884a, this.f889f, this.f887d, this.f888e, this.f886c) : new k(this.f884a, this.f885b, this.f889f, this.f887d, this.f888e, this.f886c);
            bVar.b(this.f885b);
            bVar.i(this.f895l);
            bVar.d(this.f889f);
            bVar.setCallback(this.f892i);
            bVar.e(this.f891h);
            bVar.f(this.f890g);
            this.f893j = bVar;
        }
        return this.f893j;
    }

    public boolean b() {
        j.d dVar = this.f893j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f893j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f894k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(i.a aVar) {
        this.f892i = aVar;
        j.d dVar = this.f893j;
        if (dVar != null) {
            dVar.setCallback(aVar);
        }
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        j.d dVarA = a();
        dVarA.j(z11);
        if (z10) {
            int i12 = this.f890g;
            View view = this.f889f;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if ((Gravity.getAbsoluteGravity(i12, e0.e.d(view)) & 7) == 5) {
                i10 -= this.f889f.getWidth();
            }
            dVarA.g(i10);
            dVarA.k(i11);
            int i13 = (int) ((this.f884a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarA.f31676c = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        dVarA.show();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f889f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
