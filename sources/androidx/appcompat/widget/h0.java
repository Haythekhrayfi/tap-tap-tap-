package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.inscode.autoclicker.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements j.f {
    public static Method B;
    public static Method C;
    public PopupWindow A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListAdapter f1234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f1235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DataSetObserver f1246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f1247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f1249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f1250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f1251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f1252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f1253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f1254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Rect f1255y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1256z;

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = h0.this.f1235e;
            if (d0Var != null) {
                d0Var.setListSelectionHidden(true);
                d0Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (h0.this.a()) {
                h0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1) {
                if ((h0.this.A.getInputMethodMode() == 2) || h0.this.A.getContentView() == null) {
                    return;
                }
                h0 h0Var = h0.this;
                h0Var.f1253w.removeCallbacks(h0Var.f1249s);
                h0.this.f1249s.run();
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.A) != null && popupWindow.isShowing() && x10 >= 0 && x10 < h0.this.A.getWidth() && y10 >= 0 && y10 < h0.this.A.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.f1253w.postDelayed(h0Var.f1249s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            h0 h0Var2 = h0.this;
            h0Var2.f1253w.removeCallbacks(h0Var2.f1249s);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = h0.this.f1235e;
            if (d0Var != null) {
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                if (!p0.e0.g.b(d0Var) || h0.this.f1235e.getCount() <= h0.this.f1235e.getChildCount()) {
                    return;
                }
                int childCount = h0.this.f1235e.getChildCount();
                h0 h0Var = h0.this;
                if (childCount <= h0Var.f1245o) {
                    h0Var.A.setInputMethodMode(2);
                    h0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public h0(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public h0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1236f = -2;
        this.f1237g = -2;
        this.f1240j = 1002;
        this.f1244n = 0;
        this.f1245o = Integer.MAX_VALUE;
        this.f1249s = new g();
        this.f1250t = new f();
        this.f1251u = new e();
        this.f1252v = new c();
        this.f1254x = new Rect();
        this.f1233c = context;
        this.f1253w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28473o, i10, i11);
        this.f1238h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1239i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1241k = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i10, i11);
        this.A = qVar;
        qVar.setInputMethodMode(1);
    }

    @Override // j.f
    public boolean a() {
        return this.A.isShowing();
    }

    public Drawable b() {
        return this.A.getBackground();
    }

    public int c() {
        return this.f1238h;
    }

    @Override // j.f
    public void dismiss() {
        this.A.dismiss();
        this.A.setContentView(null);
        this.f1235e = null;
        this.f1253w.removeCallbacks(this.f1249s);
    }

    public void e(int i10) {
        this.f1238h = i10;
    }

    @Override // j.f
    public ListView h() {
        return this.f1235e;
    }

    public void j(int i10) {
        this.f1239i = i10;
        this.f1241k = true;
    }

    public int m() {
        if (this.f1241k) {
            return this.f1239i;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1246p;
        if (dataSetObserver == null) {
            this.f1246p = new d();
        } else {
            ListAdapter listAdapter2 = this.f1234d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1234d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1246p);
        }
        d0 d0Var = this.f1235e;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1234d);
        }
    }

    public d0 o(Context context, boolean z10) {
        return new d0(context, z10);
    }

    public void p(int i10) {
        Drawable background = this.A.getBackground();
        if (background == null) {
            this.f1237g = i10;
            return;
        }
        background.getPadding(this.f1254x);
        Rect rect = this.f1254x;
        this.f1237g = rect.left + rect.right + i10;
    }

    public void q(boolean z10) {
        this.f1256z = z10;
        this.A.setFocusable(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    @Override // j.f
    public void show() {
        int i10;
        int i11;
        int paddingBottom;
        d0 d0Var;
        if (this.f1235e == null) {
            d0 d0VarO = o(this.f1233c, !this.f1256z);
            this.f1235e = d0VarO;
            d0VarO.setAdapter(this.f1234d);
            this.f1235e.setOnItemClickListener(this.f1248r);
            this.f1235e.setFocusable(true);
            this.f1235e.setFocusableInTouchMode(true);
            this.f1235e.setOnItemSelectedListener(new g0(this));
            this.f1235e.setOnScrollListener(this.f1251u);
            this.A.setContentView(this.f1235e);
        }
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.getPadding(this.f1254x);
            Rect rect = this.f1254x;
            int i12 = rect.top;
            i10 = rect.bottom + i12;
            if (!this.f1241k) {
                this.f1239i = -i12;
            }
        } else {
            this.f1254x.setEmpty();
            i10 = 0;
        }
        int iA = a.a(this.A, this.f1247q, this.f1239i, this.A.getInputMethodMode() == 2);
        if (this.f1236f == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.f1237g;
            if (i13 != -2) {
                i11 = 1073741824;
                if (i13 == -1) {
                    int i14 = this.f1233c.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1254x;
                    i13 = i14 - (rect2.left + rect2.right);
                }
            } else {
                int i15 = this.f1233c.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1254x;
                i13 = i15 - (rect3.left + rect3.right);
                i11 = Integer.MIN_VALUE;
            }
            int iA2 = this.f1235e.a(View.MeasureSpec.makeMeasureSpec(i13, i11), iA - 0, -1);
            paddingBottom = iA2 + (iA2 > 0 ? this.f1235e.getPaddingBottom() + this.f1235e.getPaddingTop() + i10 + 0 : 0);
        }
        boolean z10 = this.A.getInputMethodMode() == 2;
        androidx.core.widget.i.d(this.A, this.f1240j);
        if (this.A.isShowing()) {
            View view = this.f1247q;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            if (p0.e0.g.b(view)) {
                int width = this.f1237g;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1247q.getWidth();
                }
                int i16 = this.f1236f;
                if (i16 == -1) {
                    if (!z10) {
                        paddingBottom = -1;
                    }
                    if (z10) {
                        this.A.setWidth(this.f1237g == -1 ? -1 : 0);
                        this.A.setHeight(0);
                    } else {
                        this.A.setWidth(this.f1237g == -1 ? -1 : 0);
                        this.A.setHeight(-1);
                    }
                } else if (i16 != -2) {
                    paddingBottom = i16;
                }
                this.A.setOutsideTouchable(true);
                this.A.update(this.f1247q, this.f1238h, this.f1239i, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f1237g;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1247q.getWidth();
        }
        int i17 = this.f1236f;
        if (i17 == -1) {
            paddingBottom = -1;
        } else if (i17 != -2) {
            paddingBottom = i17;
        }
        this.A.setWidth(width2);
        this.A.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(this.A, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(this.A, true);
        }
        this.A.setOutsideTouchable(true);
        this.A.setTouchInterceptor(this.f1250t);
        if (this.f1243m) {
            androidx.core.widget.i.c(this.A, this.f1242l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(this.A, this.f1255y);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(this.A, this.f1255y);
        }
        androidx.core.widget.h.a(this.A, this.f1247q, this.f1238h, this.f1239i, this.f1244n);
        this.f1235e.setSelection(-1);
        if ((!this.f1256z || this.f1235e.isInTouchMode()) && (d0Var = this.f1235e) != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
        if (this.f1256z) {
            return;
        }
        this.f1253w.post(this.f1252v);
    }
}
