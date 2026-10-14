package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.inscode.autoclicker.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends ListView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f1169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.core.widget.f f1173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f1174n;

    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f1175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f1176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f1177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f1178d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1175a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1176b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1177c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1178d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends f.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1179d;

        public d(Drawable drawable) {
            super(drawable);
            this.f1179d = true;
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1179d) {
                this.f29164c.draw(canvas);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1179d) {
                androidx.core.graphics.drawable.a.b.e(this.f29164c, f10, f11);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1179d) {
                androidx.core.graphics.drawable.a.b.f(this.f29164c, i10, i11, i12, i13);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1179d) {
                return this.f29164c.setState(iArr);
            }
            return false;
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1179d) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f1180a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1180a = declaredField;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = d0.this;
            d0Var.f1174n = null;
            d0Var.drawableStateChanged();
        }
    }

    public d0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1163c = new Rect();
        this.f1164d = 0;
        this.f1165e = 0;
        this.f1166f = 0;
        this.f1167g = 0;
        this.f1171k = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1169i;
        if (dVar != null) {
            dVar.f1179d = z10;
        }
    }

    public int a(int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i10, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return (i12 < 0 || i13 <= i12 || i15 <= 0 || measuredHeight == i11) ? i11 : i15;
            }
            if (i12 >= 0 && i13 >= i12) {
                i15 = measuredHeight;
            }
            i13++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    public boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        boolean z11;
        View childAt;
        View childAt2;
        androidx.core.widget.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z12) {
                this.f1172l = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1168h - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f1173m == null) {
                    this.f1173m = new androidx.core.widget.f(this);
                }
                androidx.core.widget.f fVar2 = this.f1173m;
                boolean z13 = fVar2.f1705r;
                fVar2.f1705r = true;
                fVar2.onTouch(this, motionEvent);
            } else {
                fVar = this.f1173m;
                if (fVar != null) {
                    if (fVar.f1705r) {
                        fVar.f();
                    }
                    fVar.f1705r = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f1172l = true;
                a.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f1168h;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1168h = iPointToPosition;
                a.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f1163c;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f1164d;
                rect.top -= this.f1165e;
                rect.right += this.f1166f;
                rect.bottom += this.f1167g;
                if (l0.a.c()) {
                    zA = c.a(this);
                } else {
                    Field field = e.f1180a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z15 = !zA;
                    if (l0.a.c()) {
                        c.b(this, z15);
                    } else {
                        Field field2 = e.f1180a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    Rect rect2 = this.f1163c;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    z11 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    androidx.core.graphics.drawable.a.b.e(selector, fExactCenterX, fExactCenterY);
                } else {
                    z11 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    androidx.core.graphics.drawable.a.b.e(selector2, f10, f11);
                }
                setSelectorEnabled(z11);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z12 = false;
            }
        }
        if (z10) {
            this.f1172l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1168h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f1172l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1168h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f1173m == null) {
                this.f1173m = new androidx.core.widget.f(this);
            }
            androidx.core.widget.f fVar3 = this.f1173m;
            boolean z16 = fVar3.f1705r;
            fVar3.f1705r = true;
            fVar3.onTouch(this, motionEvent);
        } else {
            fVar = this.f1173m;
            if (fVar != null) {
                if (fVar.f1705r) {
                    fVar.f();
                }
                fVar.f1705r = false;
            }
        }
        return z10;
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1172l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1163c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1163c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1174n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1171k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1171k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1171k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1171k && this.f1170j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1174n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1174n == null) {
            f fVar = new f();
            this.f1174n = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f1178d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1175a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1176b.invoke(this, Integer.valueOf(iPointToPosition));
                            b.f1177c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1168h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1174n;
        if (fVar != null) {
            d0 d0Var = d0.this;
            d0Var.f1174n = null;
            d0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1170j = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1169i = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1164d = rect.left;
        this.f1165e = rect.top;
        this.f1166f = rect.right;
        this.f1167g = rect.bottom;
    }
}
