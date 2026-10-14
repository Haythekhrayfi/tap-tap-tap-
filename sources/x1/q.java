package x1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.List;
import java.util.Objects;
import y9.d2;
import y9.e8;
import y9.i0;
import y9.o8;
import y9.s8;
import y9.u8;
import y9.w8;
import y9.y8;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final boolean a(u9.f fVar) {
        u9.g gVar = fVar.f36171c;
        return gVar == u9.g.MISSING_VARIABLE || gVar == u9.g.INVALID_VALUE || gVar == u9.g.TYPE_MISMATCH;
    }

    public static final r8.d b(Uri uri, int i10, int i11) {
        String queryParameter = uri.getQueryParameter("overflow");
        Objects.requireNonNull(r8.d.f35298b);
        if (queryParameter == null ? true : j0.d(queryParameter, "clamp")) {
            return new r8.d.a(i10, i11);
        }
        if (j0.d(queryParameter, "ring")) {
            return new r8.d.c(i10, i11);
        }
        int i12 = e9.a.f29114a;
        return new r8.d.a(i10, i11);
    }

    public static final void c(Bitmap bitmap, View view, List<? extends d2> list, r7.b bVar, v9.d dVar, uc.l<? super Bitmap, jc.w> lVar) {
        j0.i(view, "target");
        j0.i(bVar, "component");
        j0.i(dVar, "resolver");
        if (list == null) {
            lVar.invoke(bitmap);
            return;
        }
        if (!k(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new o8.v(view, bitmap, list, bVar, dVar, lVar));
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        for (d2 d2Var : list) {
            if (d2Var instanceof d2.a) {
                j0.h(bitmapCreateScaledBitmap, "bitmap");
                bitmapCreateScaledBitmap = h(bitmapCreateScaledBitmap, ((d2.a) d2Var).f39562c, bVar, dVar);
            }
        }
        j0.h(bitmapCreateScaledBitmap, "bitmap");
        lVar.invoke(bitmapCreateScaledBitmap);
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(i.f.a(str, " should not be null"));
        }
    }

    public static final i8.g f(i8.k kVar, o8 o8Var) {
        j0.i(kVar, Action.SCOPE_ATTRIBUTE);
        j0.i(o8Var, "action");
        String logId = kVar.getLogId();
        String str = o8Var.f41855b;
        String str2 = kVar.getDataTag().f33995a;
        j0.h(str2, FacebookMediationAdapter.KEY_ID);
        return new i8.g(logId, str2, str);
    }

    public static final View g(View view) {
        View view2 = null;
        while (view != null) {
            if (!k(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final Bitmap h(Bitmap bitmap, i0 i0Var, r7.b bVar, v9.d dVar) {
        int i10;
        float f10;
        j0.i(i0Var, "blur");
        j0.i(bVar, "component");
        j0.i(dVar, "resolver");
        long jLongValue = i0Var.f40530a.b(dVar).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (i10 == 0) {
            return bitmap;
        }
        int iB = k9.i.b(i10);
        int i12 = 25;
        if (iB > 25) {
            f10 = (iB * 1.0f) / 25;
        } else {
            i12 = iB;
            f10 = 1.0f;
        }
        if (!(f10 == 1.0f)) {
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f10), (int) (bitmap.getHeight() / f10), false);
        }
        RenderScript renderScript = ((r7.a.b) bVar).C0.get();
        j0.h(renderScript, "component.renderScript");
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.setRadius(i12);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmap);
        j0.h(bitmap, "bitmap");
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f9.b i(View view) {
        j0.i(view, "<this>");
        if (view instanceof f9.b) {
            return (f9.b) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q.i iVar = tag instanceof q.i ? (q.i) tag : null;
        if (iVar == null) {
            iVar = new q.i();
            view.setTag(R.id.div_releasable_list, iVar);
        }
        Object objD = iVar.d(0);
        f9.b bVar = objD instanceof f9.b ? (f9.b) objD : null;
        if (bVar != null) {
            return bVar;
        }
        f8.c cVar = new f8.c();
        iVar.g(0, cVar);
        return cVar;
    }

    public static final int j(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final boolean k(View view) {
        j0.i(view, "<this>");
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean l(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool == null ? false : bool.booleanValue()) || l(viewGroup);
    }

    public static final w8.d m(e8 e8Var) {
        j0.i(e8Var, "<this>");
        if (e8Var instanceof e8.a) {
            y9.a aVar = ((e8.a) e8Var).f39902c;
            return new w8.d.a(aVar.f38964a, aVar.f38965b);
        }
        if (e8Var instanceof e8.f) {
            s8 s8Var = ((e8.f) e8Var).f39906c;
            return new w8.d.e(s8Var.f42671a, s8Var.f42672b);
        }
        if (e8Var instanceof e8.g) {
            u8 u8Var = ((e8.g) e8Var).f39907c;
            return new w8.d.C0447d(u8Var.f43375a, u8Var.f43376b);
        }
        if (e8Var instanceof e8.h) {
            w8 w8Var = ((e8.h) e8Var).f39908c;
            return new w8.d.f(w8Var.f43836a, w8Var.f43837b);
        }
        if (e8Var instanceof e8.b) {
            y9.e eVar = ((e8.b) e8Var).f39903c;
            return new w8.d.b(eVar.f39724a, eVar.f39725b);
        }
        if (e8Var instanceof e8.i) {
            y8 y8Var = ((e8.i) e8Var).f39909c;
            return new w8.d.g(y8Var.f44574a, y8Var.f44575b);
        }
        if (!(e8Var instanceof e8.e)) {
            throw new jc.g();
        }
        y9.g gVar = ((e8.e) e8Var).f39905c;
        return new w8.d.c(gVar.f40074a, gVar.f40075b);
    }
}
