package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.eh1;

/* JADX INFO: loaded from: classes3.dex */
final class f extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f27961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f27962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27964d;

    public f(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f27961a = new Rect();
        this.f27962b = new Paint();
        this.f27963c = eh1.a(getContext(), 1.0f);
        this.f27964d = eh1.a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iA = eh1.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f27962b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f27963c);
        paint.setColor(iA);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int lineBounds = getLineBounds(i10, this.f27961a);
            int lineStart = layout.getLineStart(i10);
            int lineEnd = layout.getLineEnd(i10);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f10 = lineBounds + this.f27964d;
            canvas.drawLine(primaryHorizontal, f10, primaryHorizontal2, f10, paint);
        }
        super.onDraw(canvas);
    }
}
