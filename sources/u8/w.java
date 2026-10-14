package u8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class w extends m9.a implements o8.w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f36159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z7.e f36160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public uc.a<jc.w> f36161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f36162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f36163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public /* synthetic */ w(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z10) {
        f delegate = getDelegate();
        if (delegate != null) {
            delegate.b(z10);
        }
        super.buildDrawingCache(z10);
    }

    @Override // o8.w
    public void e() {
        setTag(R.id.bitmap_load_references_tag, null);
    }

    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.f36159i;
    }

    public f getDelegate() {
        return this.f36162l;
    }

    public final Drawable getExternalImage() {
        return this.f36163m;
    }

    public final z7.e getLoadReference$div_release() {
        return this.f36160j;
    }

    public Future<?> getLoadingTask() {
        Object tag = getTag(R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void i() {
        setTag(R.id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawableInvalidateDrawable;
        j0.i(drawable, "dr");
        f delegate = getDelegate();
        if (delegate != null && (drawableInvalidateDrawable = delegate.invalidateDrawable(drawable)) != null) {
            drawable = drawableInvalidateDrawable;
        }
        super.invalidateDrawable(drawable);
    }

    public boolean j() {
        return j0.d(getTag(R.id.image_loaded_flag), Boolean.TRUE);
    }

    public boolean k() {
        return j0.d(getTag(R.id.image_loaded_flag), Boolean.FALSE);
    }

    public void l() {
        setTag(R.id.image_loaded_flag, null);
    }

    public final Drawable m(Drawable drawable) {
        if (!n()) {
            return drawable;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) ? drawable : new p8.a(drawable, getContext().getResources().getDisplayMetrics().density);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            bitmap.setDensity(SyslogConstants.LOG_LOCAL4);
        }
        bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        return drawable;
    }

    public final boolean n() {
        return (getLayoutParams().width == -2 && getLayoutParams().height == -2) || getImageScale() == m9.a.EnumC0358a.NO_SCALE;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        j0.i(view, "changedView");
        f delegate = getDelegate();
        boolean z10 = false;
        if (delegate != null && !delegate.onVisibilityChanged(view, i10)) {
            z10 = true;
        }
        if (z10) {
            super.onVisibilityChanged(view, i10);
        }
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.f36159i = bitmap;
    }

    public void setDelegate(f fVar) {
        this.f36162l = fVar;
    }

    public final void setExternalImage(Drawable drawable) {
        this.f36163m = drawable == null ? null : m(drawable);
        invalidate();
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.f36163m == null) {
            ((Animatable) drawable2).start();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (this.f36163m == null) {
            if (n() && bitmap != null) {
                bitmap.setDensity(SyslogConstants.LOG_LOCAL4);
            }
            super.setImageBitmap(bitmap);
            uc.a<jc.w> aVar = this.f36161k;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        Drawable drawable = getDrawable();
        Drawable drawable2 = this.f36163m;
        if (drawable != drawable2) {
            super.setImageDrawable(drawable2);
        }
        uc.a<jc.w> aVar2 = this.f36161k;
        if (aVar2 == null) {
            return;
        }
        aVar2.invoke();
    }

    public final void setImageChangeCallback(uc.a<jc.w> aVar) {
        this.f36161k = aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f36163m == null) {
            super.setImageDrawable(drawable == null ? null : m(drawable));
            uc.a<jc.w> aVar = this.f36161k;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.f36163m;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        uc.a<jc.w> aVar2 = this.f36161k;
        if (aVar2 == null) {
            return;
        }
        aVar2.invoke();
    }

    public final void setLoadReference$div_release(z7.e eVar) {
        this.f36160j = eVar;
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        f delegate = getDelegate();
        if (delegate != null) {
            delegate.a(drawable);
        }
        super.unscheduleDrawable(drawable);
    }
}
