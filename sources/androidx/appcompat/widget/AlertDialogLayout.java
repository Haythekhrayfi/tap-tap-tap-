package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.inscode.autoclicker.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int d(View view) {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        int iD = p0.e0.d.d(view);
        if (iD > 0) {
            return iD;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return d(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i12 - i10;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i16 = gravity & 112;
        int i17 = gravity & 8388615;
        int paddingTop = i16 != 16 ? i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                int i19 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i19 < 0) {
                    i19 = i17;
                }
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i19, p0.e0.e.d(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        iA = paddingRight - measuredWidth;
                    }
                    if (hasDividerBeforeChildAt(i18)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i20 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i14, i20, measuredWidth + i14, measuredHeight2 + i20);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i20;
                } else {
                    iA = a.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                }
                i14 = iA - ((LinearLayout.LayoutParams) aVar).rightMargin;
                if (hasDividerBeforeChildAt(i18)) {
                    paddingTop += intrinsicHeight;
                }
                int i21 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                childAt.layout(i14, i21, measuredWidth + i14, measuredHeight2 + i21);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i21;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int iCombineMeasuredStates;
        int iD;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        boolean z10 = false;
        View view2 = null;
        View view3 = null;
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                int mode = View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i11);
                int mode2 = View.MeasureSpec.getMode(i10);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i10, 0);
                    paddingBottom += view.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    iCombineMeasuredStates = 0;
                }
                if (view2 != null) {
                    view2.measure(i10, 0);
                    iD = d(view2);
                    measuredHeight = view2.getMeasuredHeight() - iD;
                    paddingBottom += iD;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                } else {
                    iD = 0;
                    measuredHeight = 0;
                }
                if (view3 != null) {
                    view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    measuredHeight2 = view3.getMeasuredHeight();
                    paddingBottom += measuredHeight2;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                } else {
                    measuredHeight2 = 0;
                }
                int i13 = size - paddingBottom;
                if (view2 != null) {
                    int i14 = paddingBottom - iD;
                    int iMin = Math.min(i13, measuredHeight);
                    if (iMin > 0) {
                        i13 -= iMin;
                        iD += iMin;
                    }
                    view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iD, 1073741824));
                    paddingBottom = i14 + view2.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                }
                if (view3 != null && i13 > 0) {
                    view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
                    paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                }
                int iMax = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i11, 0));
                if (mode2 != 1073741824) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt2 = getChildAt(i16);
                        if (childAt2.getVisibility() != 8) {
                            LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) aVar).width == -1) {
                                int i17 = ((LinearLayout.LayoutParams) aVar).height;
                                ((LinearLayout.LayoutParams) aVar).height = childAt2.getMeasuredHeight();
                                measureChildWithMargins(childAt2, iMakeMeasureSpec, 0, i11, 0);
                                ((LinearLayout.LayoutParams) aVar).height = i17;
                            }
                        }
                    }
                }
                z10 = true;
                break;
            }
            View childAt3 = getChildAt(i12);
            if (childAt3.getVisibility() != 8) {
                int id2 = childAt3.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt3;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt3;
                } else if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt3;
                }
            }
            i12++;
        }
        if (z10) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
