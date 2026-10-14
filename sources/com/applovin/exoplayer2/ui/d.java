package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.l.ai;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class d extends View implements k {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f8046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f8047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f8049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f8050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f8051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f8052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f8053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f8054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f8055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f8056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f8057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f8058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f8060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f8061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f8062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f8063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f8064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f8065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f8066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f8067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f8068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<k.a> f8069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f8070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f8071z;

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        int i12;
        int iMax;
        super(context, attributeSet, i10);
        this.f8046a = new Rect();
        this.f8047b = new Rect();
        this.f8048c = new Rect();
        this.f8049d = new Rect();
        Paint paint = new Paint();
        this.f8050e = paint;
        Paint paint2 = new Paint();
        this.f8051f = paint2;
        Paint paint3 = new Paint();
        this.f8052g = paint3;
        Paint paint4 = new Paint();
        this.f8053h = paint4;
        Paint paint5 = new Paint();
        this.f8054i = paint5;
        Paint paint6 = new Paint();
        this.f8055j = paint6;
        paint6.setAntiAlias(true);
        this.f8069x = new CopyOnWriteArraySet<>();
        this.f8070y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8071z = f10;
        this.f8065t = a(f10, -50);
        int iA = a(f10, 4);
        int iA2 = a(f10, 26);
        int iA3 = a(f10, 4);
        int iA4 = a(f10, 12);
        int iA5 = a(f10, 0);
        int iA6 = a(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f8056k = drawable;
                if (drawable != null) {
                    a(drawable);
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.f8057l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, iA);
                this.f8058m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, iA2);
                this.f8059n = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f8060o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, iA3);
                this.f8061p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, iA4);
                this.f8062q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, iA5);
                this.f8063r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, iA6);
                int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f8057l = iA;
            this.f8058m = iA2;
            this.f8059n = 0;
            this.f8060o = iA3;
            this.f8061p = iA4;
            this.f8062q = iA5;
            this.f8063r = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f8056k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f8066u = sb2;
        this.f8067v = new Formatter(sb2, Locale.getDefault());
        this.f8068w = new androidx.activity.c(this);
        Drawable drawable2 = this.f8056k;
        if (drawable2 != null) {
            iMax = drawable2.getMinimumWidth();
            i12 = 1;
        } else {
            i12 = 1;
            iMax = Math.max(this.f8062q, Math.max(this.f8061p, this.f8063r));
        }
        this.f8064s = (iMax + i12) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new m(this));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private Point a(MotionEvent motionEvent) {
        this.f8070y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f8070y;
    }

    private void a() {
        this.f8048c.set(this.f8047b);
        this.f8049d.set(this.f8047b);
        long j10 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f8047b.width()) * this.L) / this.J);
            Rect rect = this.f8048c;
            Rect rect2 = this.f8047b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f8047b.width()) * j10) / this.J);
            Rect rect3 = this.f8049d;
            Rect rect4 = this.f8047b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f8048c;
            int i10 = this.f8047b.left;
            rect5.right = i10;
            this.f8049d.right = i10;
        }
        invalidate(this.f8046a);
    }

    private void a(float f10) {
        Rect rect = this.f8049d;
        Rect rect2 = this.f8047b;
        rect.right = ai.a((int) f10, rect2.left, rect2.right);
    }

    private void a(int i10, int i11) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i10 && this.D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void a(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<k.a> it = this.f8069x.iterator();
        while (it.hasNext()) {
            it.next().a(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f8046a);
    }

    private void a(Canvas canvas) {
        int iHeight = this.f8047b.height();
        int iCenterY = this.f8047b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f8047b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f8052g);
            return;
        }
        Rect rect2 = this.f8048c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f8047b.left, i12), this.f8049d.right);
        int i13 = this.f8047b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f8052g);
        }
        int iMax2 = Math.max(i11, this.f8049d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f8051f);
        }
        if (this.f8049d.width() > 0) {
            Rect rect3 = this.f8049d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f8050e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.b(this.N);
        boolean[] zArr = (boolean[]) com.applovin.exoplayer2.l.a.b(this.O);
        int i14 = this.f8060o / 2;
        for (int i15 = 0; i15 < this.M; i15++) {
            int iWidth = ((int) ((((long) this.f8047b.width()) * ai.a(jArr[i15], 0L, this.J)) / this.J)) - i14;
            Rect rect4 = this.f8047b;
            int iMin = Math.min(rect4.width() - this.f8060o, Math.max(0, iWidth)) + rect4.left;
            canvas.drawRect(iMin, iCenterY, iMin + this.f8060o, i10, zArr[i15] ? this.f8054i : this.f8053h);
        }
    }

    private void a(boolean z10) {
        removeCallbacks(this.f8068w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<k.a> it = this.f8069x.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I, z10);
        }
    }

    private boolean a(float f10, float f11) {
        return this.f8046a.contains((int) f10, (int) f11);
    }

    private boolean a(Drawable drawable) {
        return ai.f7595a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i10) {
        return ai.f7595a >= 23 && drawable.setLayoutDirection(i10);
    }

    private static int b(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private void b() {
        Drawable drawable = this.f8056k;
        if (drawable != null && drawable.isStateful() && this.f8056k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void b(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator<k.a> it = this.f8069x.iterator();
        while (it.hasNext()) {
            it.next().b(this, j10);
        }
    }

    private void b(Canvas canvas) {
        int i10;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f8049d;
        int iA = ai.a(rect.right, rect.left, this.f8047b.right);
        int iCenterY = this.f8049d.centerY();
        Drawable drawable = this.f8056k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i10 = this.f8063r;
            } else {
                i10 = isEnabled() ? this.f8061p : this.f8062q;
            }
            canvas.drawCircle(iA, iCenterY, (int) ((i10 * this.F) / 2.0f), this.f8055j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f8056k.getIntrinsicHeight() * this.F)) / 2;
        this.f8056k.setBounds(iA - intrinsicWidth, iCenterY - intrinsicHeight, iA + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f8056k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(false);
    }

    private boolean c(long j10) {
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.H ? this.I : this.K;
        long jA = ai.a(j12 + j10, 0L, j11);
        if (jA == j12) {
            return false;
        }
        if (this.H) {
            b(jA);
        } else {
            a(jA);
        }
        a();
        return true;
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.J;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.A);
    }

    private String getProgressText() {
        return ai.a(this.f8066u, this.f8067v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f8047b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f8049d.width()) * this.J) / ((long) this.f8047b.width());
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(k.a aVar) {
        com.applovin.exoplayer2.l.a.b(aVar);
        this.f8069x.add(aVar);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(long[] jArr, boolean[] zArr, int i10) {
        com.applovin.exoplayer2.l.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.M = i10;
        this.N = jArr;
        this.O = zArr;
        a();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public long getPreferredUpdateDelay() {
        int iB = b(this.f8071z, this.f8047b.width());
        if (iB != 0) {
            long j10 = this.J;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / ((long) iB);
            }
        }
        return RecyclerView.FOREVER_NS;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8056k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        a(canvas);
        b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.H || z10) {
            return;
        }
        a(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (ai.f7595a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (c(positionIncrement)) {
                            removeCallbacks(this.f8068w);
                            postDelayed(this.f8068w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (c(positionIncrement)) {
                            removeCallbacks(this.f8068w);
                            postDelayed(this.f8068w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            a(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                a(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.G ? 0 : this.f8064s;
        if (this.f8059n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f8058m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f8057l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f8058m) / 2;
            iMax = (i15 - this.f8057l) / 2;
        }
        this.f8046a.set(paddingLeft, paddingBottom, paddingRight, this.f8058m + paddingBottom);
        Rect rect = this.f8047b;
        Rect rect2 = this.f8046a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f8057l + iMax);
        if (ai.f7595a >= 29) {
            a(i14, i15);
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f8058m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f8058m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        b();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f8056k;
        if (drawable == null || !a(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            Point pointA = a(motionEvent);
            int iA = pointA.x;
            int i10 = pointA.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f10 = iA;
                if (a(f10, i10)) {
                    a(f10);
                    a(getScrubberPosition());
                    a();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    a(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        a(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i10 < this.f8065t) {
                    int i11 = this.C;
                    iA = androidx.appcompat.widget.a.a(iA, i11, 3, i11);
                } else {
                    this.C = iA;
                }
                a(iA);
                b(getScrubberPosition());
                a();
                invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (c(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (c(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f8053h.setColor(i10);
        invalidate(this.f8046a);
    }

    public void setBufferedColor(int i10) {
        this.f8051f.setColor(i10);
        invalidate(this.f8046a);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setBufferedPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        a();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == -9223372036854775807L) {
            a(true);
        }
        a();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.k
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.H || z10) {
            return;
        }
        a(true);
    }

    public void setKeyCountIncrement(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 > 0);
        this.A = i10;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        com.applovin.exoplayer2.l.a.a(j10 > 0);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f8054i.setColor(i10);
        invalidate(this.f8046a);
    }

    public void setPlayedColor(int i10) {
        this.f8050e.setColor(i10);
        invalidate(this.f8046a);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setPosition(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        setContentDescription(getProgressText());
        a();
    }

    public void setScrubberColor(int i10) {
        this.f8055j.setColor(i10);
        invalidate(this.f8046a);
    }

    public void setUnplayedColor(int i10) {
        this.f8052g.setColor(i10);
        invalidate(this.f8046a);
    }
}
