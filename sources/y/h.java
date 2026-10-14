package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37655g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37656h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37657i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37658j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37659k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37660l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37661m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37662n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37663o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f37664p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37665q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37666r = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f37667a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37667a = sparseIntArray;
            sparseIntArray.append(4, 1);
            f37667a.append(2, 2);
            f37667a.append(11, 3);
            f37667a.append(0, 4);
            f37667a.append(1, 5);
            f37667a.append(8, 6);
            f37667a.append(9, 7);
            f37667a.append(3, 9);
            f37667a.append(10, 8);
            f37667a.append(7, 11);
            f37667a.append(6, 12);
            f37667a.append(5, 10);
        }
    }

    public h() {
        this.f37613d = 2;
    }

    @Override // y.d
    public void a(HashMap<String, x.d> map) {
    }

    @Override // y.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        h hVar = new h();
        super.c(this);
        hVar.f37655g = this.f37655g;
        hVar.f37656h = this.f37656h;
        hVar.f37657i = this.f37657i;
        hVar.f37658j = this.f37658j;
        hVar.f37659k = Float.NaN;
        hVar.f37660l = this.f37660l;
        hVar.f37661m = this.f37661m;
        hVar.f37662n = this.f37662n;
        hVar.f37663o = this.f37663o;
        hVar.f37665q = this.f37665q;
        hVar.f37666r = this.f37666r;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    @Override // y.d
    public void e(Context context, AttributeSet attributeSet) {
        float f10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44942i);
        SparseIntArray sparseIntArray = a.f37667a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (a.f37667a.get(index)) {
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
                        continue;
                    }
                    break;
                case 2:
                    this.f37610a = typedArrayObtainStyledAttributes.getInt(index, this.f37610a);
                    continue;
                    break;
                case 3:
                    this.f37655g = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : t.c.f35565c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    continue;
                    break;
                case 4:
                    this.f37668f = typedArrayObtainStyledAttributes.getInteger(index, this.f37668f);
                    continue;
                    break;
                case 5:
                    this.f37657i = typedArrayObtainStyledAttributes.getInt(index, this.f37657i);
                    continue;
                    break;
                case 6:
                    this.f37660l = typedArrayObtainStyledAttributes.getFloat(index, this.f37660l);
                    continue;
                    break;
                case 7:
                    this.f37661m = typedArrayObtainStyledAttributes.getFloat(index, this.f37661m);
                    continue;
                    break;
                case 8:
                    f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f37659k);
                    this.f37658j = f10;
                    break;
                case 9:
                    this.f37664p = typedArrayObtainStyledAttributes.getInt(index, this.f37664p);
                    continue;
                    break;
                case 10:
                    this.f37656h = typedArrayObtainStyledAttributes.getInt(index, this.f37656h);
                    continue;
                    break;
                case 11:
                    this.f37658j = typedArrayObtainStyledAttributes.getFloat(index, this.f37658j);
                    continue;
                    break;
                case 12:
                    f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f37659k);
                    break;
                default:
                    StringBuilder sbA = defpackage.a.a("unused attribute 0x");
                    sbA.append(Integer.toHexString(index));
                    sbA.append("   ");
                    sbA.append(a.f37667a.get(index));
                    Log.e("KeyPosition", sbA.toString());
                    continue;
                    break;
            }
            this.f37659k = f10;
        }
        if (this.f37610a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
