package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37615f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37616g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37617h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37618i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37619j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37620k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37621l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37622m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37623n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37624o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37625p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37626q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37627r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37628s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f37629t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f37630u = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f37631a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37631a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f37631a.append(11, 2);
            f37631a.append(7, 4);
            f37631a.append(8, 5);
            f37631a.append(9, 6);
            f37631a.append(1, 19);
            f37631a.append(2, 20);
            f37631a.append(5, 7);
            f37631a.append(18, 8);
            f37631a.append(17, 9);
            f37631a.append(15, 10);
            f37631a.append(13, 12);
            f37631a.append(12, 13);
            f37631a.append(6, 14);
            f37631a.append(3, 15);
            f37631a.append(4, 16);
            f37631a.append(10, 17);
            f37631a.append(14, 18);
        }
    }

    public e() {
        this.f37613d = 1;
        this.f37614e = new HashMap<>();
    }

    @Override // y.d
    public void a(HashMap<String, x.d> map) {
        int i10;
        float f10;
        for (String str : map.keySet()) {
            x.d dVar = map.get(str);
            if (dVar != null) {
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.a aVar = this.f37614e.get(str.substring(7));
                    if (aVar != null) {
                        ((x.d.b) dVar).f37321f.append(this.f37610a, aVar);
                    }
                } else {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f37620k)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37620k;
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f37621l)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37621l;
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f37627r)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37627r;
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f37628s)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37628s;
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f37629t)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37629t;
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f37630u)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37630u;
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f37625p)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37625p;
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f37626q)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37626q;
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f37620k)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37622m;
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f37621l)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37623n;
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f37619j)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37619j;
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f37618i)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37618i;
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f37624o)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37624o;
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f37617h)) {
                                break;
                            } else {
                                i10 = this.f37610a;
                                f10 = this.f37617h;
                                break;
                            }
                            break;
                        default:
                            continue;
                            break;
                    }
                    dVar.b(i10, f10);
                }
            }
        }
    }

    @Override // y.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f37615f = this.f37615f;
        eVar.f37616g = this.f37616g;
        eVar.f37617h = this.f37617h;
        eVar.f37618i = this.f37618i;
        eVar.f37619j = this.f37619j;
        eVar.f37620k = this.f37620k;
        eVar.f37621l = this.f37621l;
        eVar.f37622m = this.f37622m;
        eVar.f37623n = this.f37623n;
        eVar.f37624o = this.f37624o;
        eVar.f37625p = this.f37625p;
        eVar.f37626q = this.f37626q;
        eVar.f37627r = this.f37627r;
        eVar.f37628s = this.f37628s;
        eVar.f37629t = this.f37629t;
        eVar.f37630u = this.f37630u;
        return eVar;
    }

    @Override // y.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f37617h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f37618i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f37619j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f37620k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f37621l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f37622m)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f37623n)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f37627r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f37628s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f37629t)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f37624o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f37625p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f37626q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f37630u)) {
            hashSet.add("progress");
        }
        if (this.f37614e.size() > 0) {
            Iterator<String> it = this.f37614e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    @Override // y.d
    public void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44940g);
        SparseIntArray sparseIntArray = a.f37631a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (a.f37631a.get(index)) {
                case 1:
                    this.f37617h = typedArrayObtainStyledAttributes.getFloat(index, this.f37617h);
                    break;
                case 2:
                    this.f37618i = typedArrayObtainStyledAttributes.getDimension(index, this.f37618i);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sbA = defpackage.a.a("unused attribute 0x");
                    sbA.append(Integer.toHexString(index));
                    sbA.append("   ");
                    sbA.append(a.f37631a.get(index));
                    Log.e("KeyAttribute", sbA.toString());
                    break;
                case 4:
                    this.f37619j = typedArrayObtainStyledAttributes.getFloat(index, this.f37619j);
                    break;
                case 5:
                    this.f37620k = typedArrayObtainStyledAttributes.getFloat(index, this.f37620k);
                    break;
                case 6:
                    this.f37621l = typedArrayObtainStyledAttributes.getFloat(index, this.f37621l);
                    break;
                case 7:
                    this.f37625p = typedArrayObtainStyledAttributes.getFloat(index, this.f37625p);
                    break;
                case 8:
                    this.f37624o = typedArrayObtainStyledAttributes.getFloat(index, this.f37624o);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
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
                    this.f37615f = typedArrayObtainStyledAttributes.getInteger(index, this.f37615f);
                    break;
                case 14:
                    this.f37626q = typedArrayObtainStyledAttributes.getFloat(index, this.f37626q);
                    break;
                case 15:
                    this.f37627r = typedArrayObtainStyledAttributes.getDimension(index, this.f37627r);
                    break;
                case 16:
                    this.f37628s = typedArrayObtainStyledAttributes.getDimension(index, this.f37628s);
                    break;
                case 17:
                    this.f37629t = typedArrayObtainStyledAttributes.getDimension(index, this.f37629t);
                    break;
                case 18:
                    this.f37630u = typedArrayObtainStyledAttributes.getFloat(index, this.f37630u);
                    break;
                case 19:
                    this.f37622m = typedArrayObtainStyledAttributes.getDimension(index, this.f37622m);
                    break;
                case 20:
                    this.f37623n = typedArrayObtainStyledAttributes.getDimension(index, this.f37623n);
                    break;
            }
        }
    }

    @Override // y.d
    public void f(HashMap<String, Integer> map) {
        if (this.f37615f == -1) {
            return;
        }
        if (!Float.isNaN(this.f37617h)) {
            map.put("alpha", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37618i)) {
            map.put("elevation", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37619j)) {
            map.put("rotation", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37620k)) {
            map.put("rotationX", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37621l)) {
            map.put("rotationY", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37622m)) {
            map.put("transformPivotX", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37623n)) {
            map.put("transformPivotY", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37627r)) {
            map.put("translationX", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37628s)) {
            map.put("translationY", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37629t)) {
            map.put("translationZ", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37624o)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37625p)) {
            map.put("scaleX", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37626q)) {
            map.put("scaleY", Integer.valueOf(this.f37615f));
        }
        if (!Float.isNaN(this.f37630u)) {
            map.put("progress", Integer.valueOf(this.f37615f));
        }
        if (this.f37614e.size() > 0) {
            Iterator<String> it = this.f37614e.keySet().iterator();
            while (it.hasNext()) {
                map.put(i.f.a("CUSTOM,", it.next()), Integer.valueOf(this.f37615f));
            }
        }
    }
}
