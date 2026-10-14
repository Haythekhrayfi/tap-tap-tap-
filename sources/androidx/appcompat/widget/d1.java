package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.inscode.autoclicker.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static d1 f1182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static d1 f1183n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f1185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f1187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f1188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e1 f1191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1193l;

    public d1(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f1187f = new Runnable(this) { // from class: androidx.appcompat.widget.c1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d1 f1162d;

            {
                this.f1162d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f1162d.c(false);
                        break;
                    default:
                        this.f1162d.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f1188g = new Runnable(this) { // from class: androidx.appcompat.widget.c1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d1 f1162d;

            {
                this.f1162d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f1162d.c(false);
                        break;
                    default:
                        this.f1162d.a();
                        break;
                }
            }
        };
        this.f1184c = view;
        this.f1185d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = p0.g0.f34378a;
        this.f1186e = Build.VERSION.SDK_INT >= 28 ? p0.g0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f1193l = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(d1 d1Var) {
        d1 d1Var2 = f1182m;
        if (d1Var2 != null) {
            d1Var2.f1184c.removeCallbacks(d1Var2.f1187f);
        }
        f1182m = d1Var;
        if (d1Var != null) {
            d1Var.f1184c.postDelayed(d1Var.f1187f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public void a() {
        if (f1183n == this) {
            f1183n = null;
            e1 e1Var = this.f1191j;
            if (e1Var != null) {
                e1Var.a();
                this.f1191j = null;
                this.f1193l = true;
                this.f1184c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1182m == this) {
            b(null);
        }
        this.f1184c.removeCallbacks(this.f1188g);
    }

    public void c(boolean z10) {
        int height;
        int i10;
        View view = this.f1184c;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        if (p0.e0.g.b(view)) {
            b(null);
            d1 d1Var = f1183n;
            if (d1Var != null) {
                d1Var.a();
            }
            f1183n = this;
            this.f1192k = z10;
            e1 e1Var = new e1(this.f1184c.getContext());
            this.f1191j = e1Var;
            View view2 = this.f1184c;
            int width = this.f1189h;
            int i11 = this.f1190i;
            boolean z11 = this.f1192k;
            CharSequence charSequence = this.f1185d;
            if (e1Var.f1201b.getParent() != null) {
                e1Var.a();
            }
            e1Var.f1202c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = e1Var.f1203d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = e1Var.f1200a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                width = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = e1Var.f1200a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i11 + dimensionPixelOffset2;
                i10 = i11 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = e1Var.f1200a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(e1Var.f1204e);
                Rect rect = e1Var.f1204e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = e1Var.f1200a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    e1Var.f1204e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(e1Var.f1206g);
                view2.getLocationOnScreen(e1Var.f1205f);
                int[] iArr = e1Var.f1205f;
                int i12 = iArr[0];
                int[] iArr2 = e1Var.f1206g;
                iArr[0] = i12 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                e1Var.f1201b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = e1Var.f1201b.getMeasuredHeight();
                int[] iArr3 = e1Var.f1205f;
                int i13 = ((iArr3[1] + i10) - dimensionPixelOffset3) - measuredHeight;
                int i14 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z11 ? measuredHeight + i14 > e1Var.f1204e.height() : i13 >= 0) {
                    layoutParams.y = i13;
                } else {
                    layoutParams.y = i14;
                }
            }
            ((WindowManager) e1Var.f1200a.getSystemService("window")).addView(e1Var.f1201b, e1Var.f1203d);
            this.f1184c.addOnAttachStateChangeListener(this);
            long longPressTimeout = this.f1192k ? 2500L : ((p0.e0.d.g(this.f1184c) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            this.f1184c.removeCallbacks(this.f1188g);
            this.f1184c.postDelayed(this.f1188g, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1191j != null && this.f1192k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1184c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f1193l = true;
                a();
            }
        } else if (this.f1184c.isEnabled() && this.f1191j == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f1193l || Math.abs(x10 - this.f1189h) > this.f1186e || Math.abs(y10 - this.f1190i) > this.f1186e) {
                this.f1189h = x10;
                this.f1190i = y10;
                this.f1193l = false;
            } else {
                z10 = false;
            }
            if (z10) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1189h = view.getWidth() / 2;
        this.f1190i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
