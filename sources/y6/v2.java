package y6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f38411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f38412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f38413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f38414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f38415h;

    public v2(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        new LinkedHashMap();
        super(context);
        this.f38414g = new Paint();
        this.f38415h = 1.0d;
    }

    public final double getScale() {
        return this.f38415h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f38414g.setAntiAlias(true);
        this.f38414g.setColor(Color.parseColor("#80000000"));
        this.f38414g.setStrokeWidth((float) (((double) 10.0f) * this.f38415h));
        if (canvas != null) {
            canvas.drawLine(this.f38410c, this.f38411d, this.f38412e, this.f38413f, this.f38414g);
        }
    }

    public final void setScale(double d10) {
        this.f38415h = d10;
    }
}
