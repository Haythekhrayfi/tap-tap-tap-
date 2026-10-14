package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;

/* JADX INFO: loaded from: classes.dex */
public class e extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1616e;

    public e(Context context) {
        super(context);
        this.f1614c = -1;
        this.f1615d = null;
        this.f1616e = 4;
        a(null);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1614c = -1;
        this.f1615d = null;
        this.f1616e = 4;
        a(attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1614c = -1;
        this.f1615d = null;
        this.f1616e = 4;
        a(attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f1614c = -1;
        this.f1615d = null;
        this.f1616e = 4;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        setVisibility(this.f1616e);
        this.f1614c = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44936c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f1614c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1614c);
                } else if (index == 1) {
                    this.f1616e = typedArrayObtainStyledAttributes.getInt(index, this.f1616e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f1615d;
    }

    public int getEmptyVisibility() {
        return this.f1616e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f1614c == i10) {
            return;
        }
        View view = this.f1615d;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f1615d.getLayoutParams()).f1446j0 = false;
            this.f1615d = null;
        }
        this.f1614c = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f1616e = i10;
    }
}
