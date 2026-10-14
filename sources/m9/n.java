package m9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class n extends androidx.appcompat.widget.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33385c = -1;
        this.f33388f = true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f33387e;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f33386d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f33385c == -1 || View.MeasureSpec.getMode(i11) == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + (this.f33385c * getVisibleLineCount()), View.MeasureSpec.getMode(getMeasuredHeightAndState())));
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        j0.i(motionEvent, "event");
        if (!this.f33388f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action == 1) {
                parent = getParent();
                z10 = false;
            }
            return super.onTouchEvent(motionEvent);
        }
        parent = getParent();
        parent.requestDisallowInterceptTouchEvent(z10);
        return super.onTouchEvent(motionEvent);
    }

    public final void setFixedLineHeight(Integer num) {
        this.f33385c = num == null ? -1 : num.intValue();
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z10) {
        this.f33388f = !z10;
        super.setHorizontallyScrolling(z10);
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        float f12 = f10 / 2;
        this.f33386d = xc.b.c(f12);
        this.f33387e = (int) f12;
        super.setLineSpacing(f10, f11);
    }
}
