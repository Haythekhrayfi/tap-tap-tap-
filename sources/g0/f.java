package g0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.app.s;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f29675a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f29676b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29677c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f29678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f29679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29680c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f29678a = colorStateList;
            this.f29679b = configuration;
            this.f29680c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f29681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f29682b;

        public d(Resources resources, Resources.Theme theme) {
            this.f29681a = resources;
            this.f29682b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f29681a.equals(dVar.f29681a) && o0.b.a(this.f29682b, dVar.f29682b);
        }

        public int hashCode() {
            return o0.b.b(this.f29681a, this.f29682b);
        }
    }

    public static abstract class e {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(final int i10, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: g0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29683c.lambda$callbackFailAsync$1(i10);
                }
            });
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new s(this, typeface));
        }

        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackFailAsync$1(int i10);

        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackSuccessAsync$0(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [g0.f$e] */
    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        StringBuilder sb2;
        String str;
        ?? r11;
        ?? r12 = i10;
        Resources resources = context.getResources();
        resources.getValue(r12 == true ? 1 : 0, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbA = defpackage.a.a("Resource \"");
            sbA.append(resources.getResourceName(i10));
            sbA.append("\" (");
            sbA.append(Integer.toHexString(i10));
            sbA.append(") is not a Font: ");
            sbA.append(typedValue);
            throw new Resources.NotFoundException(sbA.toString());
        }
        String string = charSequence.toString();
        ?? r10 = -3;
        r10 = -3;
        r10 = -3;
        r10 = -3;
        r10 = -3;
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            Typeface typeface = h0.j.f30467b.get(h0.j.c(resources, r12 == true ? 1 : 0, string, typedValue.assetCookie, i11));
            if (typeface != null) {
                if (eVar != 0) {
                    eVar.callbackSuccessAsync(typeface, handler);
                }
                typefaceA = typeface;
            } else if (!z11) {
                try {
                    try {
                        if (string.toLowerCase().endsWith(".xml")) {
                            g0.e.b bVarA = g0.e.a(resources.getXml(r12 == true ? 1 : 0), resources);
                            if (bVarA == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (eVar != 0) {
                                    eVar.callbackFailAsync(-3, handler);
                                }
                            } else {
                                boolean z12 = z10;
                                typefaceA = h0.j.a(context, bVarA, resources, i10, string, typedValue.assetCookie, i11, eVar, handler, z12);
                                r10 = z12;
                            }
                        } else {
                            Typeface typefaceB = h0.j.b(context, resources, i10, string, typedValue.assetCookie, i11);
                            if (eVar != 0) {
                                if (typefaceB != null) {
                                    eVar.callbackSuccessAsync(typefaceB, handler);
                                } else {
                                    eVar.callbackFailAsync(-3, handler);
                                }
                            }
                            typefaceA = typefaceB;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        sb2 = new StringBuilder();
                        str = "Failed to read xml resource ";
                        r11 = r12;
                        sb2.append(str);
                        sb2.append(string);
                        Log.e("ResourcesCompat", sb2.toString(), e);
                        if (eVar != 0) {
                            eVar.callbackFailAsync(r11, handler);
                        }
                    } catch (XmlPullParserException e11) {
                        e = e11;
                        sb2 = new StringBuilder();
                        str = "Failed to parse xml resource ";
                        r11 = r12;
                        sb2.append(str);
                        sb2.append(string);
                        Log.e("ResourcesCompat", sb2.toString(), e);
                        if (eVar != 0) {
                            eVar.callbackFailAsync(r11, handler);
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    r12 = r10;
                } catch (XmlPullParserException e13) {
                    e = e13;
                    r12 = r10;
                }
            }
        } else if (eVar != 0) {
            eVar.callbackFailAsync(-3, handler);
        }
        if (typefaceA != null || eVar != 0 || z11) {
            return typefaceA;
        }
        StringBuilder sbA2 = defpackage.a.a("Font resource ID #0x");
        sbA2.append(Integer.toHexString(i10));
        sbA2.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sbA2.toString());
    }
}
