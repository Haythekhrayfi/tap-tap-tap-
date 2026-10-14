package t9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AppCompatTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f35845m = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y7.a f35846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f35850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f35851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e.f f35852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y7.b f35853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y7.b f35854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35855l;

    public interface a {
        int h();
    }

    public interface b {
    }

    public s(Context context) {
        this(context, null);
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35850g = i5.a.f31264t;
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new View.OnClickListener() { // from class: t9.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = s.f35845m;
            }
        });
    }

    private Typeface getDefaultTypeface() {
        y7.a aVar = this.f35846c;
        if (aVar != null) {
            if (this.f35855l) {
                y7.b bVar = this.f35854k;
                if (bVar != null) {
                    return bVar.getTypeface(aVar);
                }
            } else {
                y7.b bVar2 = this.f35853j;
                if (bVar2 != null) {
                    return bVar2.getTypeface(aVar);
                }
            }
        }
        if (aVar != null) {
            return aVar.getMedium();
        }
        return null;
    }

    public void e() {
        e.f fVar = this.f35852i;
        setText(fVar == null ? null : fVar.f35809a);
        b bVar = this.f35851h;
        if (bVar != null) {
            Objects.requireNonNull(((d) bVar).f35760c);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(androidx.appcompat.app.a.c.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(androidx.appcompat.app.a.c.class.getName());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        e.f fVar;
        CharSequence transformation;
        TextPaint paint;
        Typeface defaultTypeface;
        TextPaint paint2 = getPaint();
        if (paint2 != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint2.setTypeface(defaultTypeface);
        }
        if (!this.f35849f) {
            super.onMeasure(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int iH = this.f35850g.h();
        if (iH > 0 && (mode == 0 || size > iH)) {
            i10 = View.MeasureSpec.makeMeasureSpec(iH, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (fVar = this.f35852i) == null || (transformation = fVar.f35809a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            transformation = transformationMethod.getTransformation(transformation, this);
        }
        if (transformation == null) {
            return;
        }
        setText(TextUtils.ellipsize(transformation, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        e.f fVar = this.f35852i;
        if (fVar == null) {
            return zPerformClick;
        }
        fVar.a();
        return true;
    }

    public void setActiveTypefaceType(y7.b bVar) {
        this.f35854k = bVar;
    }

    public void setBoldTextOnSelection(boolean z10) {
        this.f35848e = z10;
    }

    public void setEllipsizeEnabled(boolean z10) {
        this.f35849f = z10;
        setEllipsize(z10 ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setAlpha(z10 ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(y7.b bVar) {
        this.f35853j = bVar;
    }

    public void setMaxWidthProvider(a aVar) {
        this.f35850g = aVar;
    }

    public void setOnUpdateListener(b bVar) {
        this.f35851h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        boolean z11 = isSelected() != z10;
        super.setSelected(z10);
        setTypefaceType(z10);
        if (this.f35848e && z11 && !isSelected()) {
            setTextAppearance(getContext(), this.f35847d);
        }
        if (z11 && z10) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTab(e.f fVar) {
        if (fVar != this.f35852i) {
            this.f35852i = fVar;
            e();
        }
    }

    public void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTypefaceType(boolean z10) {
        boolean z11 = this.f35855l != z10;
        this.f35855l = z10;
        if (z11) {
            requestLayout();
        }
    }
}
