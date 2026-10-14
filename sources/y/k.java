package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37700s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37687f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37688g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37689h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37690i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f37691j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37692k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37693l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f37694m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37695n = 0.1f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37696o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37697p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f37698q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37699r = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37701t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37702u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f37703v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37704w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f37705x = new RectF();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RectF f37706y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap<String, Method> f37707z = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f37708a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37708a = sparseIntArray;
            sparseIntArray.append(0, 8);
            f37708a.append(4, 4);
            f37708a.append(5, 1);
            f37708a.append(6, 2);
            f37708a.append(1, 7);
            f37708a.append(7, 6);
            f37708a.append(9, 5);
            f37708a.append(3, 9);
            f37708a.append(2, 10);
            f37708a.append(8, 11);
            f37708a.append(10, 12);
            f37708a.append(11, 13);
            f37708a.append(12, 14);
        }
    }

    public k() {
        this.f37613d = 5;
        this.f37614e = new HashMap<>();
    }

    @Override // y.d
    public void a(HashMap<String, x.d> map) {
    }

    @Override // y.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f37687f = this.f37687f;
        kVar.f37688g = this.f37688g;
        kVar.f37689h = this.f37689h;
        kVar.f37690i = this.f37690i;
        kVar.f37691j = this.f37691j;
        kVar.f37692k = this.f37692k;
        kVar.f37693l = this.f37693l;
        kVar.f37694m = this.f37694m;
        kVar.f37695n = this.f37695n;
        kVar.f37696o = this.f37696o;
        kVar.f37697p = this.f37697p;
        kVar.f37698q = this.f37698q;
        kVar.f37699r = this.f37699r;
        kVar.f37700s = this.f37700s;
        kVar.f37701t = this.f37701t;
        kVar.f37705x = this.f37705x;
        kVar.f37706y = this.f37706y;
        kVar.f37707z = this.f37707z;
        return kVar;
    }

    @Override // y.d
    public void d(HashSet<String> hashSet) {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
    @Override // y.d
    public void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44944k);
        SparseIntArray sparseIntArray = a.f37708a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (a.f37708a.get(index)) {
                case 1:
                    this.f37690i = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f37691j = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    StringBuilder sbA = defpackage.a.a("unused attribute 0x");
                    sbA.append(Integer.toHexString(index));
                    sbA.append("   ");
                    sbA.append(a.f37708a.get(index));
                    Log.e("KeyTrigger", sbA.toString());
                    break;
                case 4:
                    this.f37688g = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f37695n = typedArrayObtainStyledAttributes.getFloat(index, this.f37695n);
                    break;
                case 6:
                    this.f37692k = typedArrayObtainStyledAttributes.getResourceId(index, this.f37692k);
                    break;
                case 7:
                    if (r.f37757r0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f37611b);
                        this.f37611b = resourceId;
                        if (resourceId == -1) {
                            this.f37612c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f37612c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f37611b = typedArrayObtainStyledAttributes.getResourceId(index, this.f37611b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f37610a);
                    this.f37610a = integer;
                    this.f37699r = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f37693l = typedArrayObtainStyledAttributes.getResourceId(index, this.f37693l);
                    break;
                case 10:
                    this.f37701t = typedArrayObtainStyledAttributes.getBoolean(index, this.f37701t);
                    break;
                case 11:
                    this.f37689h = typedArrayObtainStyledAttributes.getResourceId(index, this.f37689h);
                    break;
                case 12:
                    this.f37704w = typedArrayObtainStyledAttributes.getResourceId(index, this.f37704w);
                    break;
                case 13:
                    this.f37702u = typedArrayObtainStyledAttributes.getResourceId(index, this.f37702u);
                    break;
                case 14:
                    this.f37703v = typedArrayObtainStyledAttributes.getResourceId(index, this.f37703v);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    public void g(float f10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        boolean z15;
        if (this.f37693l != -1) {
            if (this.f37694m == null) {
                this.f37694m = ((ViewGroup) view.getParent()).findViewById(this.f37693l);
            }
            i(this.f37705x, this.f37694m, this.f37701t);
            i(this.f37706y, view, this.f37701t);
            if (this.f37705x.intersect(this.f37706y)) {
                if (this.f37696o) {
                    this.f37696o = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f37698q) {
                    this.f37698q = false;
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f37697p = true;
                z14 = z15;
                z12 = false;
            } else {
                if (this.f37696o) {
                    z10 = false;
                } else {
                    this.f37696o = true;
                    z10 = true;
                }
                if (this.f37697p) {
                    this.f37697p = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f37698q = true;
                z14 = false;
            }
        } else {
            if (this.f37696o) {
                float f15 = this.f37699r;
                if ((this.f37700s - f15) * (f10 - f15) < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    this.f37696o = false;
                    z10 = true;
                }
                if (this.f37697p) {
                    f13 = this.f37699r;
                    f14 = f10 - f13;
                    if ((this.f37700s - f13) * f14 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f14 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        this.f37697p = false;
                        z11 = true;
                    }
                    if (this.f37698q) {
                        f11 = this.f37699r;
                        f12 = f10 - f11;
                        if ((this.f37700s - f11) * f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            z13 = false;
                        } else {
                            this.f37698q = false;
                            z13 = true;
                        }
                        boolean z16 = z11;
                        z14 = z13;
                        z12 = z16;
                    } else {
                        if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                            this.f37698q = true;
                        }
                        z12 = z11;
                        z14 = false;
                    }
                } else if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                    this.f37697p = true;
                }
                z11 = false;
                if (this.f37698q) {
                    f11 = this.f37699r;
                    f12 = f10 - f11;
                    if ((this.f37700s - f11) * f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = z11;
                    z14 = z13;
                    z12 = z17;
                } else {
                    if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                        this.f37698q = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                this.f37696o = true;
            }
            z10 = false;
            if (this.f37697p) {
                f13 = this.f37699r;
                f14 = f10 - f13;
                if ((this.f37700s - f13) * f14 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                }
                if (this.f37698q) {
                    f11 = this.f37699r;
                    f12 = f10 - f11;
                    if ((this.f37700s - f11) * f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z11;
                    z14 = z13;
                    z12 = z18;
                } else {
                    if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                        this.f37698q = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                this.f37697p = true;
            }
            z11 = false;
            if (this.f37698q) {
                f11 = this.f37699r;
                f12 = f10 - f11;
                if ((this.f37700s - f11) * f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                boolean z19 = z11;
                z14 = z13;
                z12 = z19;
            } else {
                if (Math.abs(f10 - this.f37699r) > this.f37695n) {
                    this.f37698q = true;
                }
                z12 = z11;
                z14 = false;
            }
        }
        this.f37700s = f10;
        if (z12 || z10 || z14) {
            r rVar = (r) view.getParent();
            int i10 = this.f37692k;
            r.k kVar = rVar.f37794v;
            if (kVar != null) {
                kVar.b(rVar, i10, z14, f10);
            }
            CopyOnWriteArrayList<r.k> copyOnWriteArrayList = rVar.M;
            if (copyOnWriteArrayList != null) {
                Iterator<r.k> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().b(rVar, i10, z14, f10);
                }
            }
        }
        View viewFindViewById = this.f37689h == -1 ? view : ((r) view.getParent()).findViewById(this.f37689h);
        if (z12) {
            String str = this.f37690i;
            if (str != null) {
                h(str, viewFindViewById);
            }
            if (this.f37702u != -1) {
                ((r) view.getParent()).t(this.f37702u, viewFindViewById);
            }
        }
        if (z14) {
            String str2 = this.f37691j;
            if (str2 != null) {
                h(str2, viewFindViewById);
            }
            if (this.f37703v != -1) {
                ((r) view.getParent()).t(this.f37703v, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.f37688g;
            if (str3 != null) {
                h(str3, viewFindViewById);
            }
            if (this.f37704w != -1) {
                ((r) view.getParent()).t(this.f37704w, viewFindViewById);
            }
        }
    }

    public final void h(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f37707z.containsKey(str)) {
                method = this.f37707z.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f37707z.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f37707z.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + y.a.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                StringBuilder sbA = defpackage.a.a("Exception in call \"");
                sbA.append(this.f37688g);
                sbA.append("\"on class ");
                sbA.append(view.getClass().getSimpleName());
                sbA.append(" ");
                sbA.append(y.a.d(view));
                Log.e("KeyTrigger", sbA.toString());
                return;
            }
        }
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f37614e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f37614e.get(str2);
                if (aVar != null) {
                    Class<?> cls = view.getClass();
                    String str3 = aVar.f1485b;
                    String strA = !aVar.f1484a ? i.f.a("set", str3) : str3;
                    try {
                        switch (androidx.constraintlayout.widget.a.C0025a.f1492a[aVar.f1486c.ordinal()]) {
                            case 1:
                            case 6:
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
                                Method method2 = cls.getMethod(strA, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(aVar.f1491h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 7:
                                cls.getMethod(strA, Float.TYPE).invoke(view, Float.valueOf(aVar.f1488e));
                                break;
                            case 8:
                                cls.getMethod(strA, Float.TYPE).invoke(view, Float.valueOf(aVar.f1488e));
                                break;
                        }
                    } catch (IllegalAccessException e10) {
                        StringBuilder sbA2 = androidx.activity.result.c.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString());
                        e10.printStackTrace();
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", e11.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cls.getName());
                        sb2.append(" must have a method ");
                        sb2.append(strA);
                        Log.e("TransitionLayout", sb2.toString());
                    } catch (InvocationTargetException e12) {
                        StringBuilder sbA3 = androidx.activity.result.c.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA3.append(cls.getName());
                        Log.e("TransitionLayout", sbA3.toString());
                        e12.printStackTrace();
                    }
                }
            }
        }
    }

    public final void i(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
