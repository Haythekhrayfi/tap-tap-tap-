package com.developer.filepicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.developer.filepicker.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckbox extends View {
    private RectF bounds;
    private boolean checked;
    private Context context;
    private int minDim;
    private OnCheckedChangeListener onCheckedChangeListener;
    private Paint paint;
    private Path tick;

    public MaterialCheckbox(Context context) {
        super(context);
        initView(context);
    }

    public MaterialCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public MaterialCheckbox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    public void initView(Context context) {
        this.context = context;
        this.checked = false;
        this.tick = new Path();
        this.paint = new Paint();
        this.bounds = new RectF();
        setOnClickListener(new View.OnClickListener() { // from class: com.developer.filepicker.widget.MaterialCheckbox.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialCheckbox materialCheckbox = MaterialCheckbox.this;
                materialCheckbox.setChecked(!materialCheckbox.checked);
                OnCheckedChangeListener onCheckedChangeListener = MaterialCheckbox.this.onCheckedChangeListener;
                MaterialCheckbox materialCheckbox2 = MaterialCheckbox.this;
                onCheckedChangeListener.onCheckedChanged(materialCheckbox2, materialCheckbox2.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isChecked()) {
            this.paint.reset();
            this.paint.setAntiAlias(true);
            RectF rectF = this.bounds;
            int i10 = this.minDim;
            rectF.set(i10 / 10, i10 / 10, i10 - (i10 / 10), i10 - (i10 / 10));
            this.paint.setColor(getResources().getColor(R.color.colorAccent, this.context.getTheme()));
            RectF rectF2 = this.bounds;
            int i11 = this.minDim;
            canvas.drawRoundRect(rectF2, i11 / 8, i11 / 8, this.paint);
            this.paint.setColor(Color.parseColor("#FFFFFF"));
            this.paint.setStrokeWidth(this.minDim / 10);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeJoin(Paint.Join.BEVEL);
            canvas.drawPath(this.tick, this.paint);
            return;
        }
        this.paint.reset();
        this.paint.setAntiAlias(true);
        RectF rectF3 = this.bounds;
        int i12 = this.minDim;
        rectF3.set(i12 / 10, i12 / 10, i12 - (i12 / 10), i12 - (i12 / 10));
        this.paint.setColor(Color.parseColor("#C1C1C1"));
        RectF rectF4 = this.bounds;
        int i13 = this.minDim;
        canvas.drawRoundRect(rectF4, i13 / 8, i13 / 8, this.paint);
        RectF rectF5 = this.bounds;
        int i14 = this.minDim;
        rectF5.set(i14 / 5, i14 / 5, i14 - (i14 / 5), i14 - (i14 / 5));
        this.paint.setColor(Color.parseColor("#FFFFFF"));
        canvas.drawRect(this.bounds, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int iMin = Math.min(measuredWidth, measuredHeight);
        this.minDim = iMin;
        this.bounds.set(iMin / 10, iMin / 10, iMin - (iMin / 10), iMin - (iMin / 10));
        Path path = this.tick;
        int i12 = this.minDim;
        path.moveTo(i12 / 4, i12 / 2);
        Path path2 = this.tick;
        int i13 = this.minDim;
        path2.lineTo(i13 / 2.5f, i13 - (i13 / 3));
        Path path3 = this.tick;
        int i14 = this.minDim;
        path3.moveTo(i14 / 2.75f, i14 - (i14 / 3.25f));
        Path path4 = this.tick;
        int i15 = this.minDim;
        path4.lineTo(i15 - (i15 / 4), i15 / 3);
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
        invalidate();
    }

    public void setOnCheckedChangedListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }
}
