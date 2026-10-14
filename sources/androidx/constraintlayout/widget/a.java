package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import i.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f1486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1491h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0025a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1492a;

        static {
            int[] iArr = new int[b.values().length];
            f1492a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1492a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1492a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1492a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1492a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1492a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1492a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1492a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.f1484a = false;
        this.f1485b = aVar.f1485b;
        this.f1486c = aVar.f1486c;
        g(obj);
    }

    public a(String str, b bVar) {
        this.f1484a = false;
        this.f1485b = str;
        this.f1486c = bVar;
    }

    public a(String str, b bVar, Object obj, boolean z10) {
        this.f1484a = false;
        this.f1485b = str;
        this.f1486c = bVar;
        this.f1484a = z10;
        g(obj);
    }

    public static void e(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        b bVar;
        int resourceId;
        Object string;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44939f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 10) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    bVar = b.COLOR_TYPE;
                } else if (index == 2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    } else if (index == 5) {
                        bVar = b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == 6) {
                            bVar = b.INT_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            bVar = b.STRING_TYPE;
                            string = typedArrayObtainStyledAttributes.getString(index);
                            Object obj = string;
                            bVar2 = bVar;
                            objValueOf = obj;
                        } else if (index == 8) {
                            bVar = b.REFERENCE_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj2 = string;
                        bVar2 = bVar;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj3 = string;
                    bVar2 = bVar;
                    objValueOf = obj3;
                }
                resourceId = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj4 = string;
                bVar2 = bVar;
                objValueOf = obj4;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String strA = !aVar.f1484a ? f.a("set", str) : str;
            try {
                switch (C0025a.f1492a[aVar.f1486c.ordinal()]) {
                    case 1:
                        cls.getMethod(strA, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1487d));
                        break;
                    case 2:
                        cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1490g));
                        break;
                    case 3:
                        cls.getMethod(strA, CharSequence.class).invoke(view, aVar.f1489f);
                        break;
                    case 4:
                        cls.getMethod(strA, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1491h));
                        break;
                    case 5:
                        Method method = cls.getMethod(strA, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1491h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(strA, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1487d));
                        break;
                    case 7:
                        cls.getMethod(strA, Float.TYPE).invoke(view, Float.valueOf(aVar.f1488e));
                        break;
                    case 8:
                        cls.getMethod(strA, Float.TYPE).invoke(view, Float.valueOf(aVar.f1488e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbA = androidx.activity.result.c.a(" Custom Attribute \"", str, "\" not found on ");
                sbA.append(cls.getName());
                Log.e("TransitionLayout", sbA.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(strA);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e12) {
                StringBuilder sbA2 = androidx.activity.result.c.a(" Custom Attribute \"", str, "\" not found on ");
                sbA2.append(cls.getName());
                Log.e("TransitionLayout", sbA2.toString());
                e12.printStackTrace();
            }
        }
    }

    public float a() {
        switch (C0025a.f1492a[this.f1486c.ordinal()]) {
            case 2:
                if (this.f1490g) {
                    return 1.0f;
                }
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f1487d;
            case 7:
                return this.f1488e;
            case 8:
                return this.f1488e;
            default:
                return Float.NaN;
        }
    }

    public void b(float[] fArr) {
        switch (C0025a.f1492a[this.f1486c.ordinal()]) {
            case 2:
                fArr[0] = this.f1490g ? 1.0f : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = this.f1491h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f1487d;
                return;
            case 7:
                fArr[0] = this.f1488e;
                return;
            case 8:
                fArr[0] = this.f1488e;
                return;
            default:
                return;
        }
    }

    public boolean c() {
        int i10 = C0025a.f1492a[this.f1486c.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public int d() {
        int i10 = C0025a.f1492a[this.f1486c.ordinal()];
        return (i10 == 4 || i10 == 5) ? 4 : 1;
    }

    public void g(Object obj) {
        switch (C0025a.f1492a[this.f1486c.ordinal()]) {
            case 1:
            case 6:
                this.f1487d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f1490g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f1489f = (String) obj;
                break;
            case 4:
            case 5:
                this.f1491h = ((Integer) obj).intValue();
                break;
            case 7:
            case 8:
                this.f1488e = ((Float) obj).floatValue();
                break;
        }
    }
}
