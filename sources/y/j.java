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

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37670g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37671h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37672i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37673j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37674k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37675l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37676m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37677n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37678o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37679p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37680q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37681r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37682s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f37683t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f37684u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f37685v = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f37686a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37686a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f37686a.append(9, 2);
            f37686a.append(5, 4);
            f37686a.append(6, 5);
            f37686a.append(7, 6);
            f37686a.append(3, 7);
            f37686a.append(15, 8);
            f37686a.append(14, 9);
            f37686a.append(13, 10);
            f37686a.append(11, 12);
            f37686a.append(10, 13);
            f37686a.append(4, 14);
            f37686a.append(1, 15);
            f37686a.append(2, 16);
            f37686a.append(8, 17);
            f37686a.append(12, 18);
            f37686a.append(18, 20);
            f37686a.append(17, 21);
            f37686a.append(20, 19);
        }
    }

    public j() {
        this.f37613d = 3;
        this.f37614e = new HashMap<>();
    }

    @Override // y.d
    public void a(HashMap<String, x.d> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // y.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f37669f = this.f37669f;
        jVar.f37670g = this.f37670g;
        jVar.f37683t = this.f37683t;
        jVar.f37684u = this.f37684u;
        jVar.f37685v = this.f37685v;
        jVar.f37682s = this.f37682s;
        jVar.f37671h = this.f37671h;
        jVar.f37672i = this.f37672i;
        jVar.f37673j = this.f37673j;
        jVar.f37676m = this.f37676m;
        jVar.f37674k = this.f37674k;
        jVar.f37675l = this.f37675l;
        jVar.f37677n = this.f37677n;
        jVar.f37678o = this.f37678o;
        jVar.f37679p = this.f37679p;
        jVar.f37680q = this.f37680q;
        jVar.f37681r = this.f37681r;
        return jVar;
    }

    @Override // y.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f37671h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f37672i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f37673j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f37674k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f37675l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f37679p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f37680q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f37681r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f37676m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f37677n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f37678o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f37682s)) {
            hashSet.add("progress");
        }
        if (this.f37614e.size() > 0) {
            Iterator<String> it = this.f37614e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    @Override // y.d
    public void e(Context context, AttributeSet attributeSet) {
        int i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44943j);
        SparseIntArray sparseIntArray = a.f37686a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (a.f37686a.get(index)) {
                case 1:
                    this.f37671h = typedArrayObtainStyledAttributes.getFloat(index, this.f37671h);
                    break;
                case 2:
                    this.f37672i = typedArrayObtainStyledAttributes.getDimension(index, this.f37672i);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sbA = defpackage.a.a("unused attribute 0x");
                    sbA.append(Integer.toHexString(index));
                    sbA.append("   ");
                    sbA.append(a.f37686a.get(index));
                    Log.e("KeyTimeCycle", sbA.toString());
                    break;
                case 4:
                    this.f37673j = typedArrayObtainStyledAttributes.getFloat(index, this.f37673j);
                    break;
                case 5:
                    this.f37674k = typedArrayObtainStyledAttributes.getFloat(index, this.f37674k);
                    break;
                case 6:
                    this.f37675l = typedArrayObtainStyledAttributes.getFloat(index, this.f37675l);
                    break;
                case 7:
                    this.f37677n = typedArrayObtainStyledAttributes.getFloat(index, this.f37677n);
                    break;
                case 8:
                    this.f37676m = typedArrayObtainStyledAttributes.getFloat(index, this.f37676m);
                    break;
                case 9:
                    this.f37669f = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f37610a = typedArrayObtainStyledAttributes.getInt(index, this.f37610a);
                    break;
                case 13:
                    this.f37670g = typedArrayObtainStyledAttributes.getInteger(index, this.f37670g);
                    break;
                case 14:
                    this.f37678o = typedArrayObtainStyledAttributes.getFloat(index, this.f37678o);
                    break;
                case 15:
                    this.f37679p = typedArrayObtainStyledAttributes.getDimension(index, this.f37679p);
                    break;
                case 16:
                    this.f37680q = typedArrayObtainStyledAttributes.getDimension(index, this.f37680q);
                    break;
                case 17:
                    this.f37681r = typedArrayObtainStyledAttributes.getDimension(index, this.f37681r);
                    break;
                case 18:
                    this.f37682s = typedArrayObtainStyledAttributes.getFloat(index, this.f37682s);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        i10 = 7;
                    } else {
                        i10 = typedArrayObtainStyledAttributes.getInt(index, this.f37683t);
                    }
                    this.f37683t = i10;
                    break;
                case 20:
                    this.f37684u = typedArrayObtainStyledAttributes.getFloat(index, this.f37684u);
                    break;
                case 21:
                    this.f37685v = typedArrayObtainStyledAttributes.peekValue(index).type == 5 ? typedArrayObtainStyledAttributes.getDimension(index, this.f37685v) : typedArrayObtainStyledAttributes.getFloat(index, this.f37685v);
                    break;
            }
        }
    }

    @Override // y.d
    public void f(HashMap<String, Integer> map) {
        if (this.f37670g == -1) {
            return;
        }
        if (!Float.isNaN(this.f37671h)) {
            map.put("alpha", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37672i)) {
            map.put("elevation", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37673j)) {
            map.put("rotation", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37674k)) {
            map.put("rotationX", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37675l)) {
            map.put("rotationY", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37679p)) {
            map.put("translationX", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37680q)) {
            map.put("translationY", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37681r)) {
            map.put("translationZ", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37676m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37677n)) {
            map.put("scaleX", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37677n)) {
            map.put("scaleY", Integer.valueOf(this.f37670g));
        }
        if (!Float.isNaN(this.f37682s)) {
            map.put("progress", Integer.valueOf(this.f37670g));
        }
        if (this.f37614e.size() > 0) {
            Iterator<String> it = this.f37614e.keySet().iterator();
            while (it.hasNext()) {
                map.put(i.f.a("CUSTOM,", it.next()), Integer.valueOf(this.f37670g));
            }
        }
    }
}
