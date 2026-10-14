package j8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Iterator;
import java.util.WeakHashMap;
import jc.w;
import p0.e0;
import p0.i0;
import p0.m0;
import x1.q;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f31778d;

        public a(View view, View view2) {
            this.f31777c = view;
            this.f31778d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            j0.i(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            j0.i(view, "view");
            this.f31777c.removeOnAttachStateChangeListener(this);
            k.b(this.f31778d, null);
        }
    }

    public static final class b extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageView f31779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f31780d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageView imageView, View view) {
            super(0);
            this.f31779c = imageView;
            this.f31780d = view;
        }

        @Override // uc.a
        public w invoke() {
            k.c(this.f31779c, this.f31780d);
            return w.f31842a;
        }
    }

    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.a f31781c;

        public c(uc.a aVar) {
            this.f31781c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f31781c.invoke();
        }
    }

    public static final class d extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImageView f31783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, ImageView imageView) {
            super(0);
            this.f31782c = view;
            this.f31783d = imageView;
        }

        @Override // uc.a
        public w invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f31782c.getWidth(), this.f31782c.getHeight(), Bitmap.Config.ARGB_8888);
            j0.h(bitmapCreateBitmap, "createBitmap(view.width,… Bitmap.Config.ARGB_8888)");
            View view = this.f31782c;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            this.f31783d.setImageBitmap(bitmapCreateBitmap);
            return w.f31842a;
        }
    }

    public static final View a(View view, ViewGroup viewGroup, r1.l lVar, int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(R.id.save_overlay_view, imageView);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(imageView);
        lVar.addListener(new l(view, overlay, imageView));
        b(view, new b(imageView, view));
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.g.b(imageView)) {
            imageView.addOnAttachStateChangeListener(new a(imageView, view));
        } else {
            b(view, null);
        }
        return imageView;
    }

    public static final void b(View view, uc.a<w> aVar) {
        j0.i(view, "<this>");
        if (view instanceof o8.g) {
            ((o8.g) view).setImageChangeCallback(aVar);
        } else if (view instanceof ViewGroup) {
            Iterator<View> it = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                b(it.next(), aVar);
            }
        }
    }

    public static final void c(ImageView imageView, View view) {
        Bitmap bitmap;
        ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
        Drawable drawable = imageView2 == null ? null : imageView2.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        d dVar = new d(view, imageView);
        if (!q.k(view) && (!q.k(view) || view.isLayoutRequested())) {
            view.addOnLayoutChangeListener(new c(dVar));
        } else {
            dVar.invoke();
        }
    }
}
