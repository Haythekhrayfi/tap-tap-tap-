package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1653k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1663j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
        public static Icon f(IconCompat iconCompat, Context context) {
            Bitmap bitmapC;
            Icon iconCreateWithResource;
            Bitmap bitmapDecodeStream;
            ColorStateList colorStateList;
            PorterDuff.Mode mode;
            switch (iconCompat.f1654a) {
                case -1:
                    return (Icon) iconCompat.f1655b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    bitmapC = (Bitmap) iconCompat.f1655b;
                    iconCreateWithResource = Icon.createWithBitmap(bitmapC);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 2:
                    iconCreateWithResource = Icon.createWithResource(iconCompat.g(), iconCompat.f1658e);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 3:
                    iconCreateWithResource = Icon.createWithData((byte[]) iconCompat.f1655b, iconCompat.f1658e, iconCompat.f1659f);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 4:
                    iconCreateWithResource = Icon.createWithContentUri((String) iconCompat.f1655b);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmapDecodeStream = (Bitmap) iconCompat.f1655b;
                        iconCreateWithResource = b.b(bitmapDecodeStream);
                        colorStateList = iconCompat.f1660g;
                        if (colorStateList != null) {
                            iconCreateWithResource.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1661h;
                        if (mode != IconCompat.f1653k) {
                            iconCreateWithResource.setTintMode(mode);
                        }
                        return iconCreateWithResource;
                    }
                    bitmapDecodeStream = (Bitmap) iconCompat.f1655b;
                    bitmapC = IconCompat.c(bitmapDecodeStream, false);
                    iconCreateWithResource = Icon.createWithBitmap(bitmapC);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithResource = d.a(iconCompat.j());
                    } else {
                        if (context == null) {
                            StringBuilder sbA = defpackage.a.a("Context is required to resolve the file uri of the icon: ");
                            sbA.append(iconCompat.j());
                            throw new IllegalArgumentException(sbA.toString());
                        }
                        InputStream inputStreamK = iconCompat.k(context);
                        if (inputStreamK == null) {
                            StringBuilder sbA2 = defpackage.a.a("Cannot load adaptive icon from uri: ");
                            sbA2.append(iconCompat.j());
                            throw new IllegalStateException(sbA2.toString());
                        }
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamK);
                        if (i10 >= 26) {
                            iconCreateWithResource = b.b(bitmapDecodeStream);
                        } else {
                            bitmapC = IconCompat.c(bitmapDecodeStream, false);
                            iconCreateWithResource = Icon.createWithBitmap(bitmapC);
                        }
                    }
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
            }
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1654a = -1;
        this.f1656c = null;
        this.f1657d = null;
        this.f1658e = 0;
        this.f1659f = 0;
        this.f1660g = null;
        this.f1661h = f1653k;
        this.f1662i = null;
    }

    public IconCompat(int i10) {
        this.f1654a = -1;
        this.f1656c = null;
        this.f1657d = null;
        this.f1658e = 0;
        this.f1659f = 0;
        this.f1660g = null;
        this.f1661h = f1653k;
        this.f1662i = null;
        this.f1654a = i10;
    }

    public static IconCompat b(Icon icon) {
        Objects.requireNonNull(icon);
        int iC = a.c(icon);
        if (iC == 2) {
            return d(null, a.b(icon), a.a(icon));
        }
        if (iC == 4) {
            Uri uriD = a.d(icon);
            Objects.requireNonNull(uriD);
            String string = uriD.toString();
            Objects.requireNonNull(string);
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f1655b = string;
            return iconCompat;
        }
        if (iC != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f1655b = icon;
            return iconCompat2;
        }
        Uri uriD2 = a.d(icon);
        Objects.requireNonNull(uriD2);
        String string2 = uriD2.toString();
        Objects.requireNonNull(string2);
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f1655b = string2;
        return iconCompat3;
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        Objects.requireNonNull(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1658e = i10;
        if (resources != null) {
            try {
                iconCompat.f1655b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1655b = str;
        }
        iconCompat.f1663j = str;
        return iconCompat;
    }

    public static Resources h(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    public void a(Context context) {
        Object obj;
        if (this.f1654a != 2 || (obj = this.f1655b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split(DialogConfigs.DIRECTORY_SEPERATOR, -1)[0];
            String str4 = str2.split(DialogConfigs.DIRECTORY_SEPERATOR, -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strG = g();
            int identifier = h(context, strG).getIdentifier(str4, str3, str5);
            if (this.f1658e != identifier) {
                Log.i("IconCompat", "Id has changed for " + strG + " " + str);
                this.f1658e = identifier;
            }
        }
    }

    public Bitmap e() {
        int i10 = this.f1654a;
        if (i10 == -1) {
            Object obj = this.f1655b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f1655b;
        }
        if (i10 == 5) {
            return c((Bitmap) this.f1655b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i10 = this.f1654a;
        if (i10 == -1) {
            return a.a(this.f1655b);
        }
        if (i10 == 2) {
            return this.f1658e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i10 = this.f1654a;
        if (i10 == -1) {
            return a.b(this.f1655b);
        }
        if (i10 == 2) {
            String str = this.f1663j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1655b).split(":", -1)[0] : this.f1663j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i10 = this.f1654a;
        return i10 == -1 ? a.c(this.f1655b) : i10;
    }

    public Uri j() {
        int i10 = this.f1654a;
        if (i10 == -1) {
            return a.d(this.f1655b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1655b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        StringBuilder sb2;
        String str;
        Uri uriJ = j();
        String scheme = uriJ.getScheme();
        if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) || Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriJ);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1655b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(uriJ);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    @Deprecated
    public Icon l() {
        return a.f(this, null);
    }

    public String toString() {
        String str;
        int height;
        if (this.f1654a == -1) {
            return String.valueOf(this.f1655b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1654a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1654a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1655b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f1655b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1663j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1658e);
                if (this.f1659f != 0) {
                    sb2.append(" off=");
                    height = this.f1659f;
                    sb2.append(height);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1655b);
                break;
        }
        if (this.f1660g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1660g);
        }
        if (this.f1661h != f1653k) {
            sb2.append(" mode=");
            sb2.append(this.f1661h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
