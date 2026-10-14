package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(int i10, int i11, float f10) {
            super(i10, i11, f10);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        super(context, attributeSet, i10);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = d.a.f28472n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        p0.e0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.mWeightSum = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.mUseLargestChild = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : e.a.b(context, resourceId));
        this.mShowDividers = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.mDividerPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void forceUniformHeight(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i11, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void forceUniformWidth(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void setChildFrame(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = g1.b(this);
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zB ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                a aVar2 = (a) virtualChildAt2.getLayoutParams();
                if (zB) {
                    left = virtualChildAt2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.mDividerWidth;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i10) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i10, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i10);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i10) {
        this.mDivider.setBounds(i10, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i10, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i10 = this.mOrientation;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.mBaselineAlignedChildIndex;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iA = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i10 = this.mGravity & 112) != 48) {
            if (i10 == 16) {
                iA = androidx.appcompat.widget.a.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, iA);
            } else if (i10 == 80) {
                iA = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return iA + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i10) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i10) {
        return getChildAt(i10);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i10) {
        if (i10 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    void layoutHorizontal(int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int i15;
        int baseline;
        int i16;
        int i17;
        int iA2;
        int childrenSkipCount;
        int i18;
        boolean zB = g1.b(this);
        int paddingTop = getPaddingTop();
        int i19 = i13 - i11;
        int paddingBottom = i19 - getPaddingBottom();
        int paddingBottom2 = (i19 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i20 = this.mGravity;
        int i21 = 8388615 & i20;
        int i22 = i20 & 112;
        boolean z10 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i21, p0.e0.e.d(this));
        int i23 = 1;
        if (absoluteGravity != 1) {
            iA = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.mTotalLength;
        } else {
            iA = androidx.appcompat.widget.a.a(i12 - i10, this.mTotalLength, 2, getPaddingLeft());
        }
        if (zB) {
            i23 = -1;
            i14 = virtualChildCount - 1;
        } else {
            i14 = 0;
        }
        int i24 = i23;
        int i25 = 0;
        while (i25 < virtualChildCount) {
            int i26 = (i24 * i25) + i14;
            View virtualChildAt = getVirtualChildAt(i26);
            if (virtualChildAt == null) {
                iA += measureNullChild(i26);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i27 = i25;
                    if (z10) {
                        i15 = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i16 < 0) {
                            i16 = i22;
                        }
                        i17 = i16 & 112;
                        if (i17 != 16) {
                            iA2 = (androidx.appcompat.widget.a.a(paddingBottom2, measuredHeight, 2, paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        } else if (i17 != 48) {
                            i18 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                iA2 = (iArr[1] - baseline) + i18;
                            } else {
                                iA2 = i18;
                            }
                        } else if (i17 != 80) {
                            iA2 = paddingTop;
                        } else {
                            iA2 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                iA2 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i26)) {
                            iA += this.mDividerWidth;
                        }
                        int i28 = ((LinearLayout.LayoutParams) aVar).leftMargin + iA;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i28, iA2, measuredWidth, measuredHeight);
                        int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + i28;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i26) + i27;
                        iA = nextLocationOffset;
                    } else {
                        i15 = virtualChildCount;
                    }
                    i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i16 < 0) {
                        i16 = i22;
                    }
                    i17 = i16 & 112;
                    if (i17 != 16) {
                        iA2 = (androidx.appcompat.widget.a.a(paddingBottom2, measuredHeight, 2, paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    } else if (i17 != 48) {
                        i18 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                        if (baseline != -1) {
                            iA2 = (iArr[1] - baseline) + i18;
                        } else {
                            iA2 = i18;
                        }
                    } else if (i17 != 80) {
                        iA2 = paddingTop;
                    } else {
                        iA2 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        if (baseline != -1) {
                            iA2 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                        }
                    }
                    if (hasDividerBeforeChildAt(i26)) {
                        iA += this.mDividerWidth;
                    }
                    int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + iA;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i29, iA2, measuredWidth, measuredHeight);
                    int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + i29;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i26) + i27;
                    iA = nextLocationOffset2;
                }
                i25 = childrenSkipCount + 1;
                virtualChildCount = i15;
                i22 = i22;
                paddingTop = paddingTop;
                paddingBottom = paddingBottom;
            }
            i15 = virtualChildCount;
            childrenSkipCount = i25;
            i25 = childrenSkipCount + 1;
            virtualChildCount = i15;
            i22 = i22;
            paddingTop = paddingTop;
            paddingBottom = paddingBottom;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    void layoutVertical(int i10, int i11, int i12, int i13) {
        int iA;
        int iA2;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i12 - i10;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        int i18 = i16 & 8388615;
        if (i17 != 16) {
            iA = i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.mTotalLength;
        } else {
            iA = androidx.appcompat.widget.a.a(i13 - i11, this.mTotalLength, 2, getPaddingTop());
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            int i19 = 1;
            if (virtualChildAt == null) {
                iA += measureNullChild(childrenSkipCount);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                a aVar = (a) virtualChildAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i20 < 0) {
                    i20 = i18;
                }
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, p0.e0.e.d(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        iA2 = paddingRight - measuredWidth;
                    }
                    int i21 = i14;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        iA += this.mDividerHeight;
                    }
                    int i22 = iA + ((LinearLayout.LayoutParams) aVar).topMargin;
                    setChildFrame(virtualChildAt, i21, getLocationOffset(virtualChildAt) + i22, measuredWidth, measuredHeight);
                    iA = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + i22;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    i19 = 1;
                } else {
                    iA2 = androidx.appcompat.widget.a.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                }
                i14 = iA2 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                int i23 = i14;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    iA += this.mDividerHeight;
                }
                int i24 = iA + ((LinearLayout.LayoutParams) aVar).topMargin;
                setChildFrame(virtualChildAt, i23, getLocationOffset(virtualChildAt) + i24, measuredWidth, measuredHeight);
                iA = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + i24;
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                i19 = 1;
            }
            childrenSkipCount += i19;
        }
    }

    public void measureChildBeforeLayout(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03b8 A[PHI: r3
  0x03b8: PHI (r3v39 int) = (r3v35 int), (r3v40 int) binds: [B:166:0x03b6, B:162:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x0445  */
    /* JADX WARN: Code duplicated, block: B:61:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01db  */
    public void measureHorizontal(int i10, int i11) {
        int[] iArr;
        int i12;
        int iMax;
        int iMax2;
        int i13;
        int i14;
        int baseline;
        int i15;
        int i16;
        byte b10;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        View view;
        int i19;
        boolean z12;
        int i20;
        int measuredHeight;
        int childrenSkipCount;
        int baseline2;
        int i21;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z13 = this.mBaselineAligned;
        boolean z14 = this.mUseLargestChild;
        int i22 = 1073741824;
        boolean z15 = mode == 1073741824;
        int childrenSkipCount2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f10 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount2)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f12 = f10 + f11;
                    if (mode == i22 && ((LinearLayout.LayoutParams) aVar).width == 0 && f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        int i23 = this.mTotalLength;
                        if (z15) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + i23;
                        } else {
                            this.mTotalLength = Math.max(i23, ((LinearLayout.LayoutParams) aVar).leftMargin + i23 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z13) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i18 = childrenSkipCount2;
                            z10 = z14;
                            z11 = z13;
                            view = virtualChildAt;
                        } else {
                            i18 = childrenSkipCount2;
                            z10 = z14;
                            z11 = z13;
                            view = virtualChildAt;
                            z16 = true;
                            i19 = 1073741824;
                        }
                        if (mode2 == i19 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z12 = true;
                            z17 = true;
                        } else {
                            z12 = false;
                        }
                        i20 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i20;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z11 && (baseline2 = view.getBaseline()) != -1) {
                            i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i21 < 0) {
                                i21 = this.mGravity;
                            }
                            int i24 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i24] = Math.max(iArr2[i24], baseline2);
                            iArr[i24] = Math.max(iArr[i24], measuredHeight - baseline2);
                        }
                        iMax4 = Math.max(iMax4, measuredHeight);
                        if (z18 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i20);
                        } else {
                            int i25 = iMax6;
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i20);
                            iMax6 = i25;
                        }
                        int i26 = i18;
                        childrenSkipCount = getChildrenSkipCount(view, i26) + i26;
                        f10 = f12;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            b10 = -2;
                            i17 = Integer.MIN_VALUE;
                        } else {
                            b10 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i17 = 0;
                        }
                        i18 = childrenSkipCount2;
                        int i27 = i17;
                        z10 = z14;
                        z11 = z13;
                        measureChildBeforeLayout(virtualChildAt, i18, i10, f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? this.mTotalLength : 0, i11, 0);
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i27;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z15) {
                            view = virtualChildAt;
                            this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + this.mTotalLength;
                        } else {
                            view = virtualChildAt;
                            int i28 = this.mTotalLength;
                            this.mTotalLength = Math.max(i28, getNextLocationOffset(view) + i28 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z10) {
                            iMax3 = Math.max(measuredWidth, iMax3);
                        }
                    }
                    i19 = 1073741824;
                    if (mode2 == i19) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i20 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i20;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z11) {
                        i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i21 < 0) {
                            i21 = this.mGravity;
                        }
                        int i29 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i29] = Math.max(iArr2[i29], baseline2);
                        iArr[i29] = Math.max(iArr[i29], measuredHeight - baseline2);
                    }
                    iMax4 = Math.max(iMax4, measuredHeight);
                    if (z18) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i20);
                    } else {
                        int i210 = iMax6;
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i20);
                        iMax6 = i210;
                    }
                    int i211 = i18;
                    childrenSkipCount = getChildrenSkipCount(view, i211) + i211;
                    f10 = f12;
                }
                int i30 = childrenSkipCount + 1;
                iArr3 = iArr;
                z14 = z10;
                z13 = z11;
                i22 = i19;
                childrenSkipCount2 = i30;
            }
            z10 = z14;
            z11 = z13;
            int i31 = i22;
            childrenSkipCount = childrenSkipCount2;
            i19 = i31;
            int i32 = childrenSkipCount + 1;
            iArr3 = iArr;
            z14 = z10;
            z13 = z11;
            i22 = i19;
            childrenSkipCount2 = i32;
        }
        boolean z19 = z14;
        boolean z20 = z13;
        int i33 = iMax4;
        int i34 = iMax5;
        int i35 = iMax6;
        int i36 = iCombineMeasuredStates;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int iMax7 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i33 : Math.max(i33, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z19 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int childrenSkipCount3 = 0;
            while (childrenSkipCount3 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                if (virtualChildAt2 == null) {
                    this.mTotalLength = measureNullChild(childrenSkipCount3) + this.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                } else {
                    a aVar2 = (a) virtualChildAt2.getLayoutParams();
                    int i37 = this.mTotalLength;
                    if (z15) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax3 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i37;
                    } else {
                        this.mTotalLength = Math.max(i37, getNextLocationOffset(virtualChildAt2) + i37 + iMax3 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                    }
                    childrenSkipCount3++;
                    iMax7 = iMax7;
                }
                childrenSkipCount3++;
                iMax7 = iMax7;
            }
        }
        int i38 = iMax7;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
        int i39 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z16 || (i39 != 0 && f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
            float f13 = this.mWeightSum;
            if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                f10 = f13;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i40 = i34;
            int iMax8 = -1;
            int iCombineMeasuredStates2 = i36;
            int i41 = 0;
            while (i41 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i41);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i13 = i39;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) virtualChildAt3.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f14 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        int measuredWidth2 = (int) ((i39 * f14) / f10);
                        float f15 = f10 - f14;
                        int i42 = i39 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i16 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                            f10 = f15;
                            i13 = i42;
                        } else {
                            i16 = 1073741824;
                        }
                        measuredWidth2 = virtualChildAt3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        f10 = f15;
                        i13 = i42;
                    } else {
                        i13 = i39;
                    }
                    int i43 = this.mTotalLength;
                    if (z15) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + i43;
                    } else {
                        this.mTotalLength = Math.max(i43, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i43 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                    }
                    boolean z21 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i44 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i44;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z21) {
                        i44 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i40, i44);
                    if (z18) {
                        i14 = -1;
                        boolean z22 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z20 && (baseline = virtualChildAt3.getBaseline()) != i14) {
                            i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i15 < 0) {
                                i15 = this.mGravity;
                            }
                            int i45 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i45] = Math.max(iArr2[i45], baseline);
                            iArr[i45] = Math.max(iArr[i45], measuredHeight2 - baseline);
                        }
                        z18 = z22;
                        i40 = iMax9;
                        f10 = f10;
                    } else {
                        i14 = -1;
                    }
                    if (z20) {
                        i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i15 < 0) {
                            i15 = this.mGravity;
                        }
                        int i46 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i46] = Math.max(iArr2[i46], baseline);
                        iArr[i46] = Math.max(iArr[i46], measuredHeight2 - baseline);
                    }
                    z18 = z22;
                    i40 = iMax9;
                    f10 = f10;
                }
                i41++;
                i39 = i13;
                virtualChildCount = virtualChildCount;
            }
            i12 = virtualChildCount;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            iMax = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            iMax2 = i40;
            i36 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i34, i35);
            if (z19 && mode != 1073741824) {
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View virtualChildAt4 = getVirtualChildAt(i47);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt4.getLayoutParams())).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = virtualChildCount;
            iMax = i38;
        }
        if (z18 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i36 & (-16777216)), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax2, getSuggestedMinimumHeight()), i11, i36 << 16));
        if (z17) {
            forceUniformHeight(i12, i10);
        }
    }

    public int measureNullChild(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02df A[PHI: r10
  0x02df: PHI (r10v23 int) = (r10v21 int), (r10v24 int) binds: [B:134:0x02dd, B:130:0x02d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x032c  */
    public void measureVertical(int i10, int i11) {
        int i12;
        int iCombineMeasuredStates;
        int iMax;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        int iMax2;
        boolean z12;
        int iMax3;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i25 = this.mBaselineAlignedChildIndex;
        boolean z13 = this.mUseLargestChild;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iMax4 = 0;
        int i29 = 0;
        int childrenSkipCount = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        boolean z16 = true;
        while (true) {
            int i30 = 8;
            int i31 = iMax4;
            if (childrenSkipCount >= virtualChildCount) {
                int i32 = i26;
                int i33 = i28;
                int i34 = i29;
                int i35 = virtualChildCount;
                int i36 = mode2;
                int iMax5 = i27;
                if (this.mTotalLength > 0) {
                    i12 = i35;
                    if (hasDividerBeforeChildAt(i12)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i12 = i35;
                }
                if (z13 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i12) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i30) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            a aVar = (a) virtualChildAt.getLayoutParams();
                            int i37 = this.mTotalLength;
                            this.mTotalLength = Math.max(i37, getNextLocationOffset(virtualChildAt) + i37 + i33 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i30 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
                int i38 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z14 || (i38 != 0 && f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                    float f11 = this.mWeightSum;
                    if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        f10 = f11;
                    }
                    this.mTotalLength = 0;
                    int i39 = i38;
                    int i40 = i34;
                    iCombineMeasuredStates = i32;
                    int i41 = 0;
                    while (i41 < i12) {
                        View virtualChildAt2 = getVirtualChildAt(i41);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i13 = i39;
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                int measuredHeight = (int) ((i39 * f12) / f10);
                                float f13 = f10 - f12;
                                i13 = i39 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i16 = 1073741824;
                                    if (i36 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                    f10 = f13;
                                } else {
                                    i16 = 1073741824;
                                }
                                measuredHeight = virtualChildAt2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                f10 = f13;
                            } else {
                                i13 = i39;
                            }
                            int i42 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i42;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f14 = f10;
                            if (mode != 1073741824) {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                                z10 = ((LinearLayout.LayoutParams) aVar2).width == -1;
                                if (!z10) {
                                    i42 = measuredWidth;
                                }
                                int iMax6 = Math.max(i40, i42);
                                if (z16 || ((LinearLayout.LayoutParams) aVar2).width != i15) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                int i43 = this.mTotalLength;
                                this.mTotalLength = Math.max(i43, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i43 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                                z16 = z11;
                                iCombineMeasuredStates = i14;
                                i40 = iMax6;
                                f10 = f14;
                            } else {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                            }
                            if (!z10) {
                                i42 = measuredWidth;
                            }
                            int iMax7 = Math.max(i40, i42);
                            if (z16) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            int i44 = this.mTotalLength;
                            this.mTotalLength = Math.max(i44, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            z16 = z11;
                            iCombineMeasuredStates = i14;
                            i40 = iMax7;
                            f10 = f14;
                        }
                        i41++;
                        i39 = i13;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    iMax = i40;
                } else {
                    iMax = Math.max(i34, i31);
                    if (z13 && i36 != 1073741824) {
                        for (int i45 = 0; i45 < i12; i45++) {
                            View virtualChildAt3 = getVirtualChildAt(i45);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt3.getLayoutParams())).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i32;
                }
                if (z16 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z15) {
                    forceUniformWidth(i12, i11);
                    return;
                }
                return;
            }
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
                i20 = virtualChildCount;
                i21 = mode2;
                iMax4 = i31;
            } else {
                int i46 = i26;
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                    i20 = virtualChildCount;
                    iMax4 = i31;
                    i26 = i46;
                    i21 = mode2;
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    a aVar3 = (a) virtualChildAt4.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f16 = f10 + f15;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f15 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        int i47 = this.mTotalLength;
                        this.mTotalLength = Math.max(i47, ((LinearLayout.LayoutParams) aVar3).topMargin + i47 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i28;
                        view = virtualChildAt4;
                        i23 = i29;
                        z14 = true;
                        i18 = i46;
                        i19 = i27;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i24 = childrenSkipCount;
                    } else {
                        int i48 = i27;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f15 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i17 = 0;
                        }
                        i18 = i46;
                        int i49 = i17;
                        i19 = i48;
                        int i50 = i28;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i23 = i29;
                        i24 = childrenSkipCount;
                        measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i10, 0, i11, f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? this.mTotalLength : 0);
                        if (i49 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i49;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight();
                        int i51 = this.mTotalLength;
                        view = virtualChildAt4;
                        this.mTotalLength = Math.max(i51, getNextLocationOffset(view) + i51 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = z13 ? Math.max(measuredHeight2, i50) : i50;
                    }
                    if (i25 >= 0 && i25 == i24 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i24 < i25 && ((LinearLayout.LayoutParams) aVar3).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z15 = true;
                    }
                    int i52 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i52;
                    int iMax8 = Math.max(i19, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i18, view.getMeasuredState());
                    z16 = z16 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        if (!z12) {
                            i52 = measuredWidth2;
                        }
                        iMax4 = Math.max(i22, i52);
                        iMax3 = i23;
                    } else {
                        if (!z12) {
                            i52 = measuredWidth2;
                        }
                        iMax3 = Math.max(i23, i52);
                        iMax4 = i22;
                    }
                    int childrenSkipCount3 = getChildrenSkipCount(view, i24) + i24;
                    i28 = iMax2;
                    f10 = f16;
                    i29 = iMax3;
                    i26 = iCombineMeasuredStates2;
                    childrenSkipCount = childrenSkipCount3;
                    i27 = iMax8;
                }
            }
            childrenSkipCount++;
            mode2 = i21;
            virtualChildCount = i20;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.mOrientation == 1) {
            layoutVertical(i10, i11, i12, i13);
        } else {
            layoutHorizontal(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.mOrientation == 1) {
            measureVertical(i10, i11);
        } else {
            measureHorizontal(i10, i11);
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.mBaselineAligned = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i10;
            return;
        }
        StringBuilder sbA = defpackage.a.a("base aligned child index out of range (0, ");
        sbA.append(getChildCount());
        sbA.append(")");
        throw new IllegalArgumentException(sbA.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.mDividerPadding = i10;
    }

    public void setGravity(int i10) {
        if (this.mGravity != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.mGravity = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.mGravity;
        if ((8388615 & i12) != i11) {
            this.mGravity = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.mUseLargestChild = z10;
    }

    public void setOrientation(int i10) {
        if (this.mOrientation != i10) {
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.mGravity;
        if ((i12 & 112) != i11) {
            this.mGravity = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.mWeightSum = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
