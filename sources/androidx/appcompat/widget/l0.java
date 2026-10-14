package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static l0 f1290i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, q.i<ColorStateList>> f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q.h<String, b> f1293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q.i<String> f1294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, q.e<WeakReference<Drawable.ConstantState>>> f1295d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f1296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f1298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f1289h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f1291j = new a(6);

    public static class a extends q.f<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
    }

    public static synchronized l0 c() {
        if (f1290i == null) {
            f1290i = new l0();
        }
        return f1290i;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        a aVar = f1291j;
        Objects.requireNonNull(aVar);
        int i11 = (i10 + 31) * 31;
        porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            Objects.requireNonNull(aVar);
            aVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final synchronized boolean a(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            q.e<WeakReference<Drawable.ConstantState>> eVar = this.f1295d.get(context);
            if (eVar == null) {
                eVar = new q.e<>();
                this.f1295d.put(context, eVar);
            }
            eVar.j(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final Drawable b(Context context, int i10) {
        int i11;
        if (this.f1296e == null) {
            this.f1296e = new TypedValue();
        }
        TypedValue typedValue = this.f1296e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j10);
        if (drawableD != null) {
            return drawableD;
        }
        c cVar = this.f1298g;
        LayerDrawable layerDrawableC = null;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                layerDrawableC = aVar.c(this, context, i11);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j10, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable d(Context context, long j10) {
        q.e<WeakReference<Drawable.ConstantState>> eVar = this.f1295d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceG = eVar.g(j10, null);
        if (weakReferenceG != null) {
            Drawable.ConstantState constantState = weakReferenceG.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.k(j10);
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i10) {
        return f(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.drawable.Drawable f(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1297f     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f1297f = r0     // Catch: java.lang.Throwable -> L4a
            r1 = 2131230817(0x7f080061, float:1.8077697E38)
            android.graphics.drawable.Drawable r1 = r4.e(r5, r1)     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 == 0) goto L4c
            boolean r3 = r1 instanceof s1.c     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L4c
        L2b:
            android.graphics.drawable.Drawable r0 = r4.i(r5, r6)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.b(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L35:
            if (r0 != 0) goto L3d
            java.lang.Object r0 = e0.a.f28964a     // Catch: java.lang.Throwable -> L4a
            android.graphics.drawable.Drawable r0 = e0.a.c.b(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L3d:
            if (r0 == 0) goto L43
            android.graphics.drawable.Drawable r0 = r4.j(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            if (r0 == 0) goto L48
            androidx.appcompat.widget.c0.a(r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r4)
            return r0
        L4a:
            r5 = move-exception
            goto L56
        L4c:
            r4.f1297f = r2     // Catch: java.lang.Throwable -> L4a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a
            throw r5     // Catch: java.lang.Throwable -> L4a
        L56:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public synchronized ColorStateList h(Context context, int i10) {
        ColorStateList colorStateListE;
        q.i<ColorStateList> iVar;
        WeakHashMap<Context, q.i<ColorStateList>> weakHashMap = this.f1292a;
        ColorStateList colorStateListD = null;
        colorStateListE = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.e(i10, null);
        if (colorStateListE == null) {
            c cVar = this.f1298g;
            if (cVar != null) {
                colorStateListD = ((j.a) cVar).d(context, i10);
            }
            if (colorStateListD != null) {
                if (this.f1292a == null) {
                    this.f1292a = new WeakHashMap<>();
                }
                q.i<ColorStateList> iVar2 = this.f1292a.get(context);
                if (iVar2 == null) {
                    iVar2 = new q.i<>();
                    this.f1292a.put(context, iVar2);
                }
                iVar2.b(i10, colorStateListD);
            }
            colorStateListE = colorStateListD;
        }
        return colorStateListE;
    }

    public final Drawable i(Context context, int i10) {
        int next;
        q.h<String, b> hVar = this.f1293b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        q.i<String> iVar = this.f1294c;
        if (iVar != null) {
            String strE = iVar.e(i10, null);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.f1293b.getOrDefault(strE, null) == null)) {
                return null;
            }
        } else {
            this.f1294c = new q.i<>();
        }
        if (this.f1296e == null) {
            this.f1296e = new TypedValue();
        }
        TypedValue typedValue = this.f1296e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j10);
        if (drawableD != null) {
            return drawableD;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1294c.b(i10, name);
                b bVar = this.f1293b.get(name);
                if (bVar != null) {
                    drawableD = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableD != null) {
                    drawableD.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j10, drawableD);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableD == null) {
            this.f1294c.b(i10, "appcompat_skip_skip");
        }
        return drawableD;
    }

    public final Drawable j(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListH = h(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListH != null) {
            int[] iArr = c0.f1152a;
            Drawable drawableMutate = drawable.mutate();
            androidx.core.graphics.drawable.a.b.h(drawableMutate, colorStateListH);
            c cVar = this.f1298g;
            if (cVar != null) {
                if (i10 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawableMutate;
            }
            androidx.core.graphics.drawable.a.b.i(drawableMutate, mode);
            return drawableMutate;
        }
        c cVar2 = this.f1298g;
        if (cVar2 != null) {
            j.a aVar = (j.a) cVar2;
            boolean z11 = true;
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = t0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.f1268b;
                aVar.e(drawableFindDrawableByLayerId, iC, mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), t0.c(context, R.attr.colorControlNormal), mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), t0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = t0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j.f1268b;
                aVar.e(drawableFindDrawableByLayerId2, iB, mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), t0.c(context, R.attr.colorControlActivated), mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), t0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z11 = false;
            }
            if (z11) {
                return drawable;
            }
        }
        if (k(context, i10, drawable) || !z10) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public boolean k(Context context, int i10, Drawable drawable) {
        int i11;
        boolean z10;
        int iRound;
        boolean z11;
        Drawable drawableMutate;
        c cVar = this.f1298g;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            Objects.requireNonNull(aVar);
            PorterDuff.Mode mode = j.f1268b;
            boolean zA = aVar.a(aVar.f1271a, i10);
            int i12 = android.R.attr.colorBackground;
            if (zA) {
                i12 = R.attr.colorControlNormal;
            } else if (aVar.a(aVar.f1273c, i10)) {
                i12 = R.attr.colorControlActivated;
            } else if (aVar.a(aVar.f1274d, i10)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                    i11 = android.R.attr.colorForeground;
                    iRound = Math.round(40.8f);
                    z10 = true;
                } else if (i10 != R.drawable.abc_dialog_material_background) {
                    i11 = 0;
                    z10 = false;
                    iRound = -1;
                }
                if (z10) {
                    int[] iArr = c0.f1152a;
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(j.c(t0.c(context, i11), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
            }
            i11 = i12;
            iRound = -1;
            z10 = true;
            if (z10) {
                int[] iArr2 = c0.f1152a;
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(j.c(t0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }
}
