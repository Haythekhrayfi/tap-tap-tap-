package s9;

import android.graphics.Paint;
import android.graphics.Rect;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9.b f35490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f35491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f35492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35495f;

    public a(r9.b bVar) {
        j0.i(bVar, "textStyle");
        this.f35490a = bVar;
        this.f35491b = new Rect();
        Paint paint = new Paint(1);
        paint.setTextSize(bVar.f35306a);
        paint.setColor(bVar.f35310e);
        paint.setTypeface(bVar.f35307b);
        paint.setStyle(Paint.Style.FILL);
        this.f35492c = paint;
    }
}
