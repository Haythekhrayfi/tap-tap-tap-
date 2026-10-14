package r;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f35016p = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f35024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f35025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f35026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b[] f35027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35029o;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, a aVar) {
        this.f35019e = -1;
        this.f35020f = -1;
        this.f35021g = 0;
        this.f35023i = false;
        this.f35024j = new float[9];
        this.f35025k = new float[9];
        this.f35027m = new b[16];
        this.f35028n = 0;
        this.f35029o = 0;
        this.f35018d = str;
        this.f35026l = aVar;
    }

    public i(a aVar, String str) {
        this.f35019e = -1;
        this.f35020f = -1;
        this.f35021g = 0;
        this.f35023i = false;
        this.f35024j = new float[9];
        this.f35025k = new float[9];
        this.f35027m = new b[16];
        this.f35028n = 0;
        this.f35029o = 0;
        this.f35026l = aVar;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f35028n;
            if (i10 >= i11) {
                b[] bVarArr = this.f35027m;
                if (i11 >= bVarArr.length) {
                    this.f35027m = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f35027m;
                int i12 = this.f35028n;
                bVarArr2[i12] = bVar;
                this.f35028n = i12 + 1;
                return;
            }
            if (this.f35027m[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f35028n;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f35027m[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f35027m;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f35028n--;
                return;
            }
            i11++;
        }
    }

    public void c() {
        this.f35018d = null;
        this.f35026l = a.UNKNOWN;
        this.f35021g = 0;
        this.f35019e = -1;
        this.f35020f = -1;
        this.f35022h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35023i = false;
        int i10 = this.f35028n;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35027m[i11] = null;
        }
        this.f35028n = 0;
        this.f35029o = 0;
        this.f35017c = false;
        Arrays.fill(this.f35025k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    @Override // java.lang.Comparable
    public int compareTo(i iVar) {
        return this.f35019e - iVar.f35019e;
    }

    public void d(d dVar, float f10) {
        this.f35022h = f10;
        this.f35023i = true;
        int i10 = this.f35028n;
        this.f35020f = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35027m[i11].k(dVar, this, false);
        }
        this.f35028n = 0;
    }

    public final void e(d dVar, b bVar) {
        int i10 = this.f35028n;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35027m[i11].l(dVar, bVar, false);
        }
        this.f35028n = 0;
    }

    public String toString() {
        StringBuilder sbA;
        if (this.f35018d != null) {
            sbA = defpackage.a.a("");
            sbA.append(this.f35018d);
        } else {
            sbA = defpackage.a.a("");
            sbA.append(this.f35019e);
        }
        return sbA.toString();
    }
}
