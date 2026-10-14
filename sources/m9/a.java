package m9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import p0.e0;
import p0.m0;
import vc.b0;
import vc.c0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AppCompatImageView implements u8.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f33311h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc.b f33312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yc.b f33313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yc.b f33314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f33315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33316g;

    /* JADX INFO: renamed from: m9.a$a, reason: collision with other inner class name */
    public enum EnumC0358a {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33317a;

        static {
            int[] iArr = new int[EnumC0358a.values().length];
            iArr[EnumC0358a.NO_SCALE.ordinal()] = 1;
            iArr[EnumC0358a.FIT.ordinal()] = 2;
            iArr[EnumC0358a.FILL.ordinal()] = 3;
            iArr[EnumC0358a.STRETCH.ordinal()] = 4;
            f33317a = iArr;
        }
    }

    public static final class c extends vc.l implements uc.l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f33318c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Float invoke(Float f10) {
            return Float.valueOf(bd.e.a(f10.floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        }
    }

    static {
        vc.n nVar = new vc.n(a.class, "gravity", "getGravity()I", 0);
        c0 c0Var = b0.f36991a;
        Objects.requireNonNull(c0Var);
        vc.n nVar2 = new vc.n(a.class, "aspectRatio", "getAspectRatio()F", 0);
        Objects.requireNonNull(c0Var);
        vc.n nVar3 = new vc.n(a.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0);
        Objects.requireNonNull(c0Var);
        f33311h = new cd.i[]{nVar, nVar2, nVar3};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33312c = new u8.c(0, null);
        this.f33313d = new u8.e(Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), c.f33318c);
        this.f33314e = new u8.e(EnumC0358a.NO_SCALE, null);
        this.f33315f = new Matrix();
        this.f33316g = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o7.b.f33996a, i10, 0);
            j0.h(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
            try {
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
                setAspectRatio(typedArrayObtainStyledAttributes.getFloat(2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
                setImageScale(EnumC0358a.values()[typedArrayObtainStyledAttributes.getInteger(3, 0)]);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final float getAspectRatio() {
        return ((Number) this.f33313d.getValue(this, f33311h[1])).floatValue();
    }

    public final int getGravity() {
        return ((Number) this.f33312c.getValue(this, f33311h[0])).intValue();
    }

    public final EnumC0358a getImageScale() {
        return (EnumC0358a) this.f33314e.getValue(this, f33311h[2]);
    }

    public boolean h(int i10) {
        return View.MeasureSpec.getMode(i10) != 1073741824;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.f33316g = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float fMin;
        float f10;
        j0.i(canvas, "canvas");
        if ((getImageMatrix() == null || j0.d(getImageMatrix(), this.f33315f)) && this.f33316g && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                float paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (height - getPaddingTop()) - getPaddingBottom();
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int gravity = getGravity();
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                int absoluteGravity = Gravity.getAbsoluteGravity(gravity, e0.e.d(this));
                EnumC0358a imageScale = getImageScale();
                int[] iArr = b.f33317a;
                int i10 = iArr[imageScale.ordinal()];
                if (i10 == 1) {
                    fMin = 1.0f;
                } else if (i10 == 2) {
                    fMin = Math.min(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else if (i10 == 3) {
                    fMin = Math.max(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else {
                    if (i10 != 4) {
                        throw new jc.g();
                    }
                    fMin = paddingLeft / intrinsicWidth;
                }
                float f11 = iArr[getImageScale().ordinal()] == 4 ? paddingTop / intrinsicHeight : fMin;
                int i11 = absoluteGravity & 7;
                float f12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                if (i11 != 1) {
                    f10 = i11 != 5 ? 0.0f : paddingLeft - (intrinsicWidth * fMin);
                } else {
                    f10 = (paddingLeft - (intrinsicWidth * fMin)) / 2;
                }
                int i12 = absoluteGravity & 112;
                if (i12 == 16) {
                    f12 = (paddingTop - (intrinsicHeight * f11)) / 2;
                } else if (i12 == 80) {
                    f12 = paddingTop - (intrinsicHeight * f11);
                }
                Matrix matrix = this.f33315f;
                matrix.reset();
                matrix.postScale(fMin, f11);
                matrix.postTranslate(f10, f12);
                setImageMatrix(this.f33315f);
            }
            this.f33316g = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33316g = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float aspectRatio = getAspectRatio();
        if (aspectRatio == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean zH = h(i10);
        boolean z10 = View.MeasureSpec.getMode(i11) != 1073741824;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if ((!zH && !z10) || (!zH && z10)) {
            measuredHeight = xc.b.c(measuredWidth / aspectRatio);
        } else if (zH && !z10) {
            measuredWidth = xc.b.c(measuredHeight * aspectRatio);
        } else if (zH && z10) {
            measuredHeight = xc.b.c(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f33316g = true;
    }

    @Override // u8.d
    public final void setAspectRatio(float f10) {
        this.f33313d.setValue(this, f33311h[1], Float.valueOf(f10));
    }

    public final void setGravity(int i10) {
        this.f33312c.setValue(this, f33311h[0], Integer.valueOf(i10));
    }

    public final void setImageScale(EnumC0358a enumC0358a) {
        j0.i(enumC0358a, "<set-?>");
        this.f33314e.setValue(this, f33311h[2], enumC0358a);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
