package s3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f35413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f35421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f35422l;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f35423a;

        public a(g gVar) {
            this.f35423a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, c3.a aVar, d3.g<Bitmap> gVar, int i10, int i11, Bitmap bitmap) {
        a aVar2 = new a(new g(a3.c.b(context), aVar, i10, i11, gVar, bitmap));
        this.f35417g = true;
        this.f35419i = -1;
        this.f35413c = aVar2;
    }

    @Deprecated
    public c(Context context, c3.a aVar, h3.d dVar, d3.g<Bitmap> gVar, int i10, int i11, Bitmap bitmap) {
        this(context, aVar, gVar, i10, i11, bitmap);
    }

    @Override // s3.g.b
    public void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.f35413c.f35423a;
        g.a aVar = gVar.f35433i;
        if ((aVar != null ? aVar.f35440e : -1) == gVar.f35425a.c() - 1) {
            this.f35418h++;
        }
        int i10 = this.f35419i;
        if (i10 == -1 || this.f35418h < i10) {
            return;
        }
        stop();
    }

    public Bitmap b() {
        return this.f35413c.f35423a.f35436l;
    }

    public final Paint c() {
        if (this.f35421k == null) {
            this.f35421k = new Paint(2);
        }
        return this.f35421k;
    }

    public final void d() {
        u1.a.e(!this.f35416f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f35413c.f35423a.f35425a.c() != 1) {
            if (this.f35414d) {
                return;
            }
            this.f35414d = true;
            g gVar = this.f35413c.f35423a;
            if (gVar.f35434j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (gVar.f35427c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean zIsEmpty = gVar.f35427c.isEmpty();
            gVar.f35427c.add(this);
            if (zIsEmpty && !gVar.f35430f) {
                gVar.f35430f = true;
                gVar.f35434j = false;
                gVar.b();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f35416f) {
            return;
        }
        if (this.f35420j) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f35422l == null) {
                this.f35422l = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f35422l);
            this.f35420j = false;
        }
        Bitmap bitmapA = this.f35413c.f35423a.a();
        if (this.f35422l == null) {
            this.f35422l = new Rect();
        }
        canvas.drawBitmap(bitmapA, (Rect) null, this.f35422l, c());
    }

    public final void e() {
        this.f35414d = false;
        g gVar = this.f35413c.f35423a;
        gVar.f35427c.remove(this);
        if (gVar.f35427c.isEmpty()) {
            gVar.f35430f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f35413c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f35413c.f35423a.a().getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f35413c.f35423a.a().getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f35414d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f35420j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        u1.a.e(!this.f35416f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f35417g = z10;
        if (!z10) {
            e();
        } else if (this.f35415e) {
            d();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f35415e = true;
        this.f35418h = 0;
        if (this.f35417g) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f35415e = false;
        e();
    }

    public c(a aVar) {
        this.f35417g = true;
        this.f35419i = -1;
        this.f35413c = aVar;
    }
}
