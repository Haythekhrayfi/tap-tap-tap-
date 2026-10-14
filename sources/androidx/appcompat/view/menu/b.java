package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j0;
import com.inscode.autoclicker.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f810i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f824w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.a f827z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<e> f811j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<d> f812k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f813l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f814m = new ViewOnAttachStateChangeListenerC0024b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0 f815n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f816o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f817p = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f825x = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f812k.size() <= 0 || b.this.f812k.get(0).f835a.f1256z) {
                return;
            }
            View view = b.this.f819r;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f812k.iterator();
            while (it.hasNext()) {
                it.next().f835a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0024b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0024b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.A = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.A.removeGlobalOnLayoutListener(bVar.f813l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements i0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f831c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MenuItem f832d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f833e;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f831c = dVar;
                this.f832d = menuItem;
                this.f833e = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f831c;
                if (dVar != null) {
                    b.this.C = true;
                    dVar.f836b.close(false);
                    b.this.C = false;
                }
                if (this.f832d.isEnabled() && this.f832d.hasSubMenu()) {
                    this.f833e.performItemAction(this.f832d, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.i0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f810i.removeCallbacksAndMessages(null);
            int size = b.this.f812k.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f812k.get(i10).f836b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f810i.postAtTime(new a(i11 < b.this.f812k.size() ? b.this.f812k.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.i0
        public void g(e eVar, MenuItem menuItem) {
            b.this.f810i.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f837c;

        public d(j0 j0Var, e eVar, int i10) {
            this.f835a = j0Var;
            this.f836b = eVar;
            this.f837c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f805d = context;
        this.f818q = view;
        this.f807f = i10;
        this.f808g = i11;
        this.f809h = z10;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        this.f820s = e0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f806e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f810i = new Handler();
    }

    @Override // j.f
    public boolean a() {
        return this.f812k.size() > 0 && this.f812k.get(0).f835a.a();
    }

    @Override // j.d
    public void b(e eVar) {
        eVar.addMenuPresenter(this, this.f805d);
        if (a()) {
            m(eVar);
        } else {
            this.f811j.add(eVar);
        }
    }

    @Override // j.d
    public void d(View view) {
        if (this.f818q != view) {
            this.f818q = view;
            int i10 = this.f816o;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            this.f817p = Gravity.getAbsoluteGravity(i10, e0.e.d(view));
        }
    }

    @Override // j.f
    public void dismiss() {
        int size = this.f812k.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f812k.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f835a.a()) {
                    dVar.f835a.dismiss();
                }
            }
        }
    }

    @Override // j.d
    public void e(boolean z10) {
        this.f825x = z10;
    }

    @Override // j.d
    public void f(int i10) {
        if (this.f816o != i10) {
            this.f816o = i10;
            View view = this.f818q;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            this.f817p = Gravity.getAbsoluteGravity(i10, e0.e.d(view));
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // j.d
    public void g(int i10) {
        this.f821t = true;
        this.f823v = i10;
    }

    @Override // j.f
    public ListView h() {
        if (this.f812k.isEmpty()) {
            return null;
        }
        List<d> list = this.f812k;
        return list.get(list.size() - 1).f835a.f1235e;
    }

    @Override // j.d
    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // j.d
    public void j(boolean z10) {
        this.f826y = z10;
    }

    @Override // j.d
    public void k(int i10) {
        this.f822u = true;
        this.f824w = i10;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[PHI: r4
  0x01a4: PHI (r4v14 int) = (r4v13 int), (r4v5 int) binds: [B:79:0x01a0, B:75:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6 A[PHI: r4
  0x01a6: PHI (r4v15 int) = (r4v5 int), (r4v16 int) binds: [B:78:0x019e, B:77:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    public final void m(e eVar) {
        d dVar;
        Rect rect;
        Rect rect2;
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        Method method;
        MenuItem item;
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f805d);
        androidx.appcompat.view.menu.d dVar3 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f809h, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f825x) {
            dVar3.f850e = true;
        } else if (a()) {
            dVar3.f850e = j.d.l(eVar);
        }
        View childAt = null;
        int iC = j.d.c(dVar3, null, this.f805d, this.f806e);
        j0 j0Var = new j0(this.f805d, null, this.f807f, this.f808g);
        j0Var.D = this.f815n;
        j0Var.f1248r = this;
        j0Var.A.setOnDismissListener(this);
        j0Var.f1247q = this.f818q;
        j0Var.f1244n = this.f817p;
        j0Var.q(true);
        j0Var.A.setInputMethodMode(2);
        j0Var.n(dVar3);
        j0Var.p(iC);
        j0Var.f1244n = this.f817p;
        if (this.f812k.size() > 0) {
            List<d> list = this.f812k;
            dVar = list.get(list.size() - 1);
            e eVar2 = dVar.f836b;
            int size = eVar2.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    item = null;
                    break;
                }
                item = eVar2.getItem(i14);
                if (item.hasSubMenu() && eVar == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item != null) {
                d0 d0Var = dVar.f835a.f1235e;
                ListAdapter adapter = d0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar2 = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                int count = dVar2.getCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == dVar2.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - d0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < d0Var.getChildCount()) {
                    childAt = d0Var.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    method = j0.E;
                    if (method != null) {
                        try {
                            method.invoke(j0Var.A, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    j0.b.a(j0Var.A, false);
                }
                j0.a.a(j0Var.A, null);
                List<d> list2 = this.f812k;
                d0 d0Var2 = list2.get(list2.size() - 1).f835a.f1235e;
                int[] iArr3 = new int[2];
                d0Var2.getLocationOnScreen(iArr3);
                Rect rect3 = new Rect();
                this.f819r.getWindowVisibleDisplayFrame(rect3);
                i10 = (this.f820s == 1 ? iArr3[0] - iC >= 0 : (d0Var2.getWidth() + iArr3[0]) + iC > rect3.right) ? 0 : 1;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f820s = i10;
                if (Build.VERSION.SDK_INT >= 26) {
                    j0Var.f1247q = childAt;
                    i12 = 0;
                    i11 = 0;
                } else {
                    iArr = new int[2];
                    this.f818q.getLocationOnScreen(iArr);
                    iArr2 = new int[2];
                    childAt.getLocationOnScreen(iArr2);
                    if ((this.f817p & 7) == 5) {
                        iArr[0] = this.f818q.getWidth() + iArr[0];
                        iArr2[0] = childAt.getWidth() + iArr2[0];
                    }
                    i11 = iArr2[0] - iArr[0];
                    i12 = iArr2[1] - iArr[1];
                }
                if ((this.f817p & 5) == 5) {
                    if (z10) {
                        i13 = i11 + iC;
                    } else {
                        iC = childAt.getWidth();
                        i13 = i11 - iC;
                    }
                } else if (z10) {
                    iC = childAt.getWidth();
                    i13 = i11 + iC;
                } else {
                    i13 = i11 - iC;
                }
                j0Var.f1238h = i13;
                j0Var.f1243m = true;
                j0Var.f1242l = true;
                j0Var.j(i12);
            } else {
                if (this.f821t) {
                    j0Var.f1238h = this.f823v;
                }
                if (this.f822u) {
                    j0Var.j(this.f824w);
                }
                rect = this.f31676c;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                j0Var.f1255y = rect2;
            }
            this.f812k.add(new d(j0Var, eVar, this.f820s));
            j0Var.show();
            d0 d0Var3 = j0Var.f1235e;
            d0Var3.setOnKeyListener(this);
            if (dVar == null || !this.f826y || eVar.getHeaderTitle() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) d0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.getHeaderTitle());
            d0Var3.addHeaderView(frameLayout, null, false);
            j0Var.show();
            return;
        }
        dVar = null;
        childAt = null;
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                method = j0.E;
                if (method != null) {
                    method.invoke(j0Var.A, Boolean.FALSE);
                }
            } else {
                j0.b.a(j0Var.A, false);
            }
            j0.a.a(j0Var.A, null);
            List<d> list3 = this.f812k;
            d0 d0Var4 = list3.get(list3.size() - 1).f835a.f1235e;
            int[] iArr4 = new int[2];
            d0Var4.getLocationOnScreen(iArr4);
            Rect rect4 = new Rect();
            this.f819r.getWindowVisibleDisplayFrame(rect4);
            if (this.f820s == 1) {
            }
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f820s = i10;
            if (Build.VERSION.SDK_INT >= 26) {
                j0Var.f1247q = childAt;
                i12 = 0;
                i11 = 0;
            } else {
                iArr = new int[2];
                this.f818q.getLocationOnScreen(iArr);
                iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if ((this.f817p & 7) == 5) {
                    iArr[0] = this.f818q.getWidth() + iArr[0];
                    iArr2[0] = childAt.getWidth() + iArr2[0];
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.f817p & 5) == 5) {
                if (z10) {
                    i13 = i11 + iC;
                } else {
                    iC = childAt.getWidth();
                    i13 = i11 - iC;
                }
            } else if (z10) {
                iC = childAt.getWidth();
                i13 = i11 + iC;
            } else {
                i13 = i11 - iC;
            }
            j0Var.f1238h = i13;
            j0Var.f1243m = true;
            j0Var.f1242l = true;
            j0Var.j(i12);
        } else {
            if (this.f821t) {
                j0Var.f1238h = this.f823v;
            }
            if (this.f822u) {
                j0Var.j(this.f824w);
            }
            rect = this.f31676c;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            j0Var.f1255y = rect2;
        }
        this.f812k.add(new d(j0Var, eVar, this.f820s));
        j0Var.show();
        d0 d0Var5 = j0Var.f1235e;
        d0Var5.setOnKeyListener(this);
        if (dVar == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        int i10;
        int size = this.f812k.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (eVar == this.f812k.get(i11).f836b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < this.f812k.size()) {
            this.f812k.get(i12).f836b.close(false);
        }
        d dVarRemove = this.f812k.remove(i11);
        dVarRemove.f836b.removeMenuPresenter(this);
        if (this.C) {
            j0.a.b(dVarRemove.f835a.A, null);
            dVarRemove.f835a.A.setAnimationStyle(0);
        }
        dVarRemove.f835a.dismiss();
        int size2 = this.f812k.size();
        if (size2 > 0) {
            i10 = this.f812k.get(size2 - 1).f837c;
        } else {
            View view = this.f818q;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            i10 = e0.e.d(view) == 1 ? 0 : 1;
        }
        this.f820s = i10;
        if (size2 != 0) {
            if (z10) {
                this.f812k.get(0).f836b.close(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f827z;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f813l);
            }
            this.A = null;
        }
        this.f819r.removeOnAttachStateChangeListener(this.f814m);
        this.B.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f812k.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f812k.get(i10);
            if (!dVar.f835a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f836b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        for (d dVar : this.f812k) {
            if (lVar == dVar.f836b) {
                dVar.f835a.f1235e.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        lVar.addMenuPresenter(this, this.f805d);
        if (a()) {
            m(lVar);
        } else {
            this.f811j.add(lVar);
        }
        i.a aVar = this.f827z;
        if (aVar != null) {
            aVar.a(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.f827z = aVar;
    }

    @Override // j.f
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f811j.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        this.f811j.clear();
        View view = this.f818q;
        this.f819r = view;
        if (view != null) {
            boolean z10 = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f813l);
            }
            this.f819r.addOnAttachStateChangeListener(this.f814m);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        Iterator<d> it = this.f812k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f835a.f1235e.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).notifyDataSetChanged();
        }
    }
}
