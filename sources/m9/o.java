package m9;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class o extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33391q;

    public o(Context context) {
        this(context, null, 0, 6, null);
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.f(context);
        this.f33391q = true;
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f33390p;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f33389o;
    }

    @Override // m9.f, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int lastMeasuredHeight = getLastMeasuredHeight();
        boolean z10 = true;
        if ((lastMeasuredHeight == -1 || (this.f33389o == 0 && this.f33390p == 0) || lastMeasuredHeight - getMeasuredHeight() == 0) ? false : true) {
            this.f33391q = true;
            this.f33389o = 0;
            this.f33390p = 0;
        }
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        CharSequence text = getText();
        Layout layout = getLayout();
        float lineSpacingExtra = getLineSpacingExtra();
        if (layout != null && this.f33391q && measuredWidth > 0 && lineSpacingExtra > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !TextUtils.isEmpty(text) && getLayout().getLineCount() == 1) {
            this.f33389o = xc.b.c(lineSpacingExtra / 2.0f);
            this.f33390p = ((int) lineSpacingExtra) / 2;
            this.f33391q = false;
        } else {
            z10 = false;
        }
        if (z10) {
            int measuredHeightAndState = getMeasuredHeightAndState();
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measuredHeightAndState) + this.f33389o + this.f33390p, View.MeasureSpec.getMode(measuredHeightAndState)));
        }
        setLastMeasuredHeight(getMeasuredHeight());
    }

    @Override // m9.f, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (this.f33338h) {
            return;
        }
        this.f33391q = true;
        this.f33389o = 0;
        this.f33390p = 0;
    }
}
