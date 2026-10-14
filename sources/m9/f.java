package m9;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class f extends AppCompatTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f33333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f33336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f33337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f33341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f33342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f33344n;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        CharSequence charSequence = "…";
        this.f33333c = "…";
        this.f33339i = -1;
        this.f33340j = -1;
        this.f33342l = -1.0f;
        this.f33344n = new c(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o7.b.f33998c, i10, 0);
            j0.h(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(0);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        i(this.f33333c);
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.f33336f = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.f33338h = true;
        super.setText(charSequence);
        this.f33338h = false;
    }

    public final Layout e(CharSequence charSequence, int i10) {
        return new StaticLayout(charSequence, getPaint(), i10, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    public final boolean getAutoEllipsize() {
        return this.f33334d;
    }

    public final CharSequence getDisplayText() {
        return this.f33337g;
    }

    public final CharSequence getEllipsis() {
        return this.f33333c;
    }

    public final CharSequence getEllipsizedText() {
        return this.f33336f;
    }

    public final int getLastMeasuredHeight() {
        return this.f33340j;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.f33341k;
        return charSequence == null ? "" : charSequence;
    }

    public final boolean h() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    public final void i(CharSequence charSequence) {
        if (h()) {
            super.setEllipsize(null);
        } else if (j0.d(charSequence, "…")) {
            super.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            super.setEllipsize(null);
            this.f33343m = true;
            this.f33342l = -1.0f;
            this.f33335e = false;
        }
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f33344n;
        if (cVar.f33322b && cVar.f33323c == null) {
            cVar.f33323c = new b(cVar);
            cVar.f33321a.getViewTreeObserver().addOnPreDrawListener(cVar.f33323c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f33344n;
        if (cVar.f33323c != null) {
            cVar.f33321a.getViewTreeObserver().removeOnPreDrawListener(cVar.f33323c);
            cVar.f33323c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0143  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        CharSequence charSequence;
        int length;
        int measuredWidth;
        Layout layoutE;
        super.onMeasure(i10, i11);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i12 = this.f33339i;
        int i13 = this.f33340j;
        if (measuredWidth2 != i12 || measuredHeight != i13) {
            this.f33343m = true;
        }
        if (this.f33343m) {
            CharSequence charSequence2 = this.f33336f;
            boolean z10 = h() || j0.d(this.f33333c, "…");
            if (this.f33336f != null || !z10) {
                if (z10) {
                    charSequence = this.f33341k;
                    if (charSequence == null) {
                        charSequence = null;
                    } else {
                        this.f33335e = !j0.d(charSequence, charSequence2);
                    }
                } else {
                    charSequence = this.f33341k;
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = null;
                    } else {
                        CharSequence charSequence3 = this.f33333c;
                        if ((charSequence.length() == 0) || getMaxLines() == 0 || (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) <= 0) {
                            length = 0;
                        } else {
                            if ((Build.VERSION.SDK_INT >= 26) && getHyphenationFrequency() != 0) {
                                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), measuredWidth);
                                j0.h(builderObtain, "obtain(text, 0, text.length, paint, textWidth)");
                                layoutE = builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
                                j0.h(layoutE, "builder\n            .set…ncy)\n            .build()");
                            } else {
                                layoutE = e(charSequence, measuredWidth);
                            }
                            int lineCount = layoutE.getLineCount();
                            float lineWidth = layoutE.getLineWidth(lineCount - 1);
                            if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= measuredWidth)) {
                                this.f33335e = true;
                                length = charSequence.length();
                            } else {
                                if (this.f33342l == -1.0f) {
                                    this.f33342l = e(charSequence3, Integer.MAX_VALUE).getLineWidth(0);
                                }
                                this.f33335e = true;
                                float f10 = measuredWidth - this.f33342l;
                                length = layoutE.getOffsetForHorizontal(getMaxLines() - 1, f10);
                                while (layoutE.getPrimaryHorizontal(length) > f10 && length > 0) {
                                    length--;
                                }
                                if (length > 0) {
                                    int i14 = length - 1;
                                    if (Character.isHighSurrogate(charSequence.charAt(i14))) {
                                        length = i14;
                                    }
                                }
                            }
                        }
                        if (length <= 0) {
                            charSequence = null;
                        } else if (length != charSequence.length()) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, length);
                            spannableStringBuilder.append(charSequence3);
                            charSequence = spannableStringBuilder;
                        }
                    }
                }
                setEllipsizedText(charSequence);
            }
            this.f33343m = false;
            CharSequence charSequence4 = this.f33336f;
            if (charSequence4 != null) {
                if ((this.f33335e ? charSequence4 : null) != null) {
                    super.onMeasure(i10, i11);
                }
            }
        }
        this.f33339i = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f33343m = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (this.f33338h) {
            return;
        }
        this.f33341k = charSequence;
        requestLayout();
        this.f33343m = true;
    }

    public final void setAutoEllipsize(boolean z10) {
        this.f33334d = z10;
        this.f33344n.f33322b = z10;
    }

    public final void setEllipsis(CharSequence charSequence) {
        j0.i(charSequence, "value");
        i(charSequence);
        this.f33333c = charSequence;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public final void setInternalTextChange(boolean z10) {
        this.f33338h = z10;
    }

    public final void setLastMeasuredHeight(int i10) {
        this.f33340j = i10;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        super.setMaxLines(i10);
        i(this.f33333c);
        this.f33343m = true;
        this.f33342l = -1.0f;
        this.f33335e = false;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f33337g = charSequence;
        super.setText(charSequence, bufferType);
    }
}
