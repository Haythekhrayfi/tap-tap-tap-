package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37632f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37633g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37634h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37635i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37636j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37637k = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37638l = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37639m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37640n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37641o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37642p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37643q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37644r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37645s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f37646t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f37647u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f37648v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f37649w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f37650x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f37651y = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f37652a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37652a = sparseIntArray;
            sparseIntArray.append(13, 1);
            f37652a.append(11, 2);
            f37652a.append(14, 3);
            f37652a.append(10, 4);
            f37652a.append(19, 5);
            f37652a.append(17, 6);
            f37652a.append(16, 7);
            f37652a.append(20, 8);
            f37652a.append(0, 9);
            f37652a.append(9, 10);
            f37652a.append(5, 11);
            f37652a.append(6, 12);
            f37652a.append(7, 13);
            f37652a.append(15, 14);
            f37652a.append(3, 15);
            f37652a.append(4, 16);
            f37652a.append(1, 17);
            f37652a.append(2, 18);
            f37652a.append(8, 19);
            f37652a.append(12, 20);
            f37652a.append(18, 21);
        }
    }

    public f() {
        this.f37613d = 4;
        this.f37614e = new HashMap<>();
    }

    @Override // y.d
    public void a(HashMap<String, x.d> map) {
        int i10;
        float f10;
        StringBuilder sbA = defpackage.a.a("add ");
        sbA.append(map.size());
        sbA.append(" values");
        String string = sbA.toString();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String strA = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            StringBuilder sbA2 = defpackage.a.a(".(");
            sbA2.append(stackTrace[i11].getFileName());
            sbA2.append(":");
            sbA2.append(stackTrace[i11].getLineNumber());
            sbA2.append(") ");
            sbA2.append(stackTrace[i11].getMethodName());
            String string2 = sbA2.toString();
            strA = i.f.a(strA, " ");
            Log.v("KeyCycle", string + strA + string2 + strA);
        }
        for (String str : map.keySet()) {
            x.d dVar = map.get(str);
            if (dVar != null) {
                Objects.requireNonNull(str);
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        i10 = this.f37610a;
                        f10 = this.f37645s;
                        break;
                    case "rotationY":
                        i10 = this.f37610a;
                        f10 = this.f37646t;
                        break;
                    case "translationX":
                        i10 = this.f37610a;
                        f10 = this.f37649w;
                        break;
                    case "translationY":
                        i10 = this.f37610a;
                        f10 = this.f37650x;
                        break;
                    case "translationZ":
                        i10 = this.f37610a;
                        f10 = this.f37651y;
                        break;
                    case "progress":
                        i10 = this.f37610a;
                        f10 = this.f37639m;
                        break;
                    case "scaleX":
                        i10 = this.f37610a;
                        f10 = this.f37647u;
                        break;
                    case "scaleY":
                        i10 = this.f37610a;
                        f10 = this.f37648v;
                        break;
                    case "rotation":
                        i10 = this.f37610a;
                        f10 = this.f37643q;
                        break;
                    case "elevation":
                        i10 = this.f37610a;
                        f10 = this.f37642p;
                        break;
                    case "transitionPathRotate":
                        i10 = this.f37610a;
                        f10 = this.f37644r;
                        break;
                    case "alpha":
                        i10 = this.f37610a;
                        f10 = this.f37641o;
                        break;
                    case "waveOffset":
                        i10 = this.f37610a;
                        f10 = this.f37637k;
                        break;
                    case "wavePhase":
                        i10 = this.f37610a;
                        f10 = this.f37638l;
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            continue;
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
                dVar.b(i10, f10);
            }
        }
    }

    @Override // y.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f37632f = this.f37632f;
        fVar.f37633g = this.f37633g;
        fVar.f37634h = this.f37634h;
        fVar.f37635i = this.f37635i;
        fVar.f37636j = this.f37636j;
        fVar.f37637k = this.f37637k;
        fVar.f37638l = this.f37638l;
        fVar.f37639m = this.f37639m;
        fVar.f37640n = this.f37640n;
        fVar.f37641o = this.f37641o;
        fVar.f37642p = this.f37642p;
        fVar.f37643q = this.f37643q;
        fVar.f37644r = this.f37644r;
        fVar.f37645s = this.f37645s;
        fVar.f37646t = this.f37646t;
        fVar.f37647u = this.f37647u;
        fVar.f37648v = this.f37648v;
        fVar.f37649w = this.f37649w;
        fVar.f37650x = this.f37650x;
        fVar.f37651y = this.f37651y;
        return fVar;
    }

    @Override // y.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f37641o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f37642p)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f37643q)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f37645s)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f37646t)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f37647u)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f37648v)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f37644r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f37649w)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f37650x)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f37651y)) {
            hashSet.add("translationZ");
        }
        if (this.f37614e.size() > 0) {
            Iterator<String> it = this.f37614e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x013e  */
    @Override // y.d
    public void e(Context context, AttributeSet attributeSet) {
        int i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44941h);
        SparseIntArray sparseIntArray = a.f37652a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (a.f37652a.get(index)) {
                case 1:
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
                case 2:
                    this.f37610a = typedArrayObtainStyledAttributes.getInt(index, this.f37610a);
                    break;
                case 3:
                    this.f37632f = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f37633g = typedArrayObtainStyledAttributes.getInteger(index, this.f37633g);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f37635i = typedArrayObtainStyledAttributes.getString(index);
                        i10 = 7;
                    } else {
                        i10 = typedArrayObtainStyledAttributes.getInt(index, this.f37634h);
                    }
                    this.f37634h = i10;
                    break;
                case 6:
                    this.f37636j = typedArrayObtainStyledAttributes.getFloat(index, this.f37636j);
                    break;
                case 7:
                    this.f37637k = typedArrayObtainStyledAttributes.peekValue(index).type == 5 ? typedArrayObtainStyledAttributes.getDimension(index, this.f37637k) : typedArrayObtainStyledAttributes.getFloat(index, this.f37637k);
                    break;
                case 8:
                    this.f37640n = typedArrayObtainStyledAttributes.getInt(index, this.f37640n);
                    break;
                case 9:
                    this.f37641o = typedArrayObtainStyledAttributes.getFloat(index, this.f37641o);
                    break;
                case 10:
                    this.f37642p = typedArrayObtainStyledAttributes.getDimension(index, this.f37642p);
                    break;
                case 11:
                    this.f37643q = typedArrayObtainStyledAttributes.getFloat(index, this.f37643q);
                    break;
                case 12:
                    this.f37645s = typedArrayObtainStyledAttributes.getFloat(index, this.f37645s);
                    break;
                case 13:
                    this.f37646t = typedArrayObtainStyledAttributes.getFloat(index, this.f37646t);
                    break;
                case 14:
                    this.f37644r = typedArrayObtainStyledAttributes.getFloat(index, this.f37644r);
                    break;
                case 15:
                    this.f37647u = typedArrayObtainStyledAttributes.getFloat(index, this.f37647u);
                    break;
                case 16:
                    this.f37648v = typedArrayObtainStyledAttributes.getFloat(index, this.f37648v);
                    break;
                case 17:
                    this.f37649w = typedArrayObtainStyledAttributes.getDimension(index, this.f37649w);
                    break;
                case 18:
                    this.f37650x = typedArrayObtainStyledAttributes.getDimension(index, this.f37650x);
                    break;
                case 19:
                    this.f37651y = typedArrayObtainStyledAttributes.getDimension(index, this.f37651y);
                    break;
                case 20:
                    this.f37639m = typedArrayObtainStyledAttributes.getFloat(index, this.f37639m);
                    break;
                case 21:
                    this.f37638l = typedArrayObtainStyledAttributes.getFloat(index, this.f37638l) / 360.0f;
                    break;
                default:
                    StringBuilder sbA = defpackage.a.a("unused attribute 0x");
                    sbA.append(Integer.toHexString(index));
                    sbA.append("   ");
                    sbA.append(a.f37652a.get(index));
                    Log.e("KeyCycle", sbA.toString());
                    break;
            }
        }
    }
}
