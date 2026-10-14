package r;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f34947c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34945a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34948d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f34949e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f34950f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f34951g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34952h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34953i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34954j = false;

    public a(b bVar, c cVar) {
        this.f34946b = bVar;
        this.f34947c = cVar;
    }

    @Override // r.b.a
    public float a(b bVar, boolean z10) {
        float fG = g(bVar.f34955a);
        i(bVar.f34955a, z10);
        b.a aVar = bVar.f34958d;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarC = aVar.c(i10);
            j(iVarC, aVar.g(iVarC) * fG, z10);
        }
        return fG;
    }

    @Override // r.b.a
    public int b() {
        return this.f34945a;
    }

    @Override // r.b.a
    public i c(int i10) {
        int i11 = this.f34952h;
        for (int i12 = 0; i11 != -1 && i12 < this.f34945a; i12++) {
            if (i12 == i10) {
                return this.f34947c.f34962c[this.f34949e[i11]];
            }
            i11 = this.f34950f[i11];
        }
        return null;
    }

    @Override // r.b.a
    public final void clear() {
        int i10 = this.f34952h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            i iVar = this.f34947c.f34962c[this.f34949e[i10]];
            if (iVar != null) {
                iVar.b(this.f34946b);
            }
            i10 = this.f34950f[i10];
        }
        this.f34952h = -1;
        this.f34953i = -1;
        this.f34954j = false;
        this.f34945a = 0;
    }

    @Override // r.b.a
    public void d() {
        int i10 = this.f34952h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            float[] fArr = this.f34951g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f34950f[i10];
        }
    }

    @Override // r.b.a
    public float e(int i10) {
        int i11 = this.f34952h;
        for (int i12 = 0; i11 != -1 && i12 < this.f34945a; i12++) {
            if (i12 == i10) {
                return this.f34951g[i11];
            }
            i11 = this.f34950f[i11];
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // r.b.a
    public boolean f(i iVar) {
        int i10 = this.f34952h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            if (this.f34949e[i10] == iVar.f35019e) {
                return true;
            }
            i10 = this.f34950f[i10];
        }
        return false;
    }

    @Override // r.b.a
    public final float g(i iVar) {
        int i10 = this.f34952h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            if (this.f34949e[i10] == iVar.f35019e) {
                return this.f34951g[i10];
            }
            i10 = this.f34950f[i10];
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // r.b.a
    public final void h(i iVar, float f10) {
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            i(iVar, true);
            return;
        }
        int i10 = this.f34952h;
        if (i10 == -1) {
            this.f34952h = 0;
            this.f34951g[0] = f10;
            this.f34949e[0] = iVar.f35019e;
            this.f34950f[0] = -1;
            iVar.f35029o++;
            iVar.a(this.f34946b);
            this.f34945a++;
            if (this.f34954j) {
                return;
            }
            int i11 = this.f34953i + 1;
            this.f34953i = i11;
            int[] iArr = this.f34949e;
            if (i11 >= iArr.length) {
                this.f34954j = true;
                this.f34953i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f34945a; i13++) {
            int[] iArr2 = this.f34949e;
            int i14 = iArr2[i10];
            int i15 = iVar.f35019e;
            if (i14 == i15) {
                this.f34951g[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f34950f[i10];
        }
        int length = this.f34953i;
        int i16 = length + 1;
        if (this.f34954j) {
            int[] iArr3 = this.f34949e;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i16;
        }
        int[] iArr4 = this.f34949e;
        if (length >= iArr4.length && this.f34945a < iArr4.length) {
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f34949e;
                if (i17 >= iArr5.length) {
                    break;
                }
                if (iArr5[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr6 = this.f34949e;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i18 = this.f34948d * 2;
            this.f34948d = i18;
            this.f34954j = false;
            this.f34953i = length - 1;
            this.f34951g = Arrays.copyOf(this.f34951g, i18);
            this.f34949e = Arrays.copyOf(this.f34949e, this.f34948d);
            this.f34950f = Arrays.copyOf(this.f34950f, this.f34948d);
        }
        this.f34949e[length] = iVar.f35019e;
        this.f34951g[length] = f10;
        int[] iArr7 = this.f34950f;
        if (i12 != -1) {
            iArr7[length] = iArr7[i12];
            iArr7[i12] = length;
        } else {
            iArr7[length] = this.f34952h;
            this.f34952h = length;
        }
        iVar.f35029o++;
        iVar.a(this.f34946b);
        int i19 = this.f34945a + 1;
        this.f34945a = i19;
        if (!this.f34954j) {
            this.f34953i++;
        }
        int[] iArr8 = this.f34949e;
        if (i19 >= iArr8.length) {
            this.f34954j = true;
        }
        if (this.f34953i >= iArr8.length) {
            this.f34954j = true;
            this.f34953i = iArr8.length - 1;
        }
    }

    @Override // r.b.a
    public final float i(i iVar, boolean z10) {
        int i10 = this.f34952h;
        if (i10 == -1) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f34945a) {
            if (this.f34949e[i10] == iVar.f35019e) {
                if (i10 == this.f34952h) {
                    this.f34952h = this.f34950f[i10];
                } else {
                    int[] iArr = this.f34950f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.b(this.f34946b);
                }
                iVar.f35029o--;
                this.f34945a--;
                this.f34949e[i10] = -1;
                if (this.f34954j) {
                    this.f34953i = i10;
                }
                return this.f34951g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f34950f[i10];
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // r.b.a
    public void j(i iVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f34952h;
            if (i10 == -1) {
                this.f34952h = 0;
                this.f34951g[0] = f10;
                this.f34949e[0] = iVar.f35019e;
                this.f34950f[0] = -1;
                iVar.f35029o++;
                iVar.a(this.f34946b);
                this.f34945a++;
                if (this.f34954j) {
                    return;
                }
                int i11 = this.f34953i + 1;
                this.f34953i = i11;
                int[] iArr = this.f34949e;
                if (i11 >= iArr.length) {
                    this.f34954j = true;
                    this.f34953i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f34945a; i13++) {
                int[] iArr2 = this.f34949e;
                int i14 = iArr2[i10];
                int i15 = iVar.f35019e;
                if (i14 == i15) {
                    float[] fArr = this.f34951g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        if (i10 == this.f34952h) {
                            this.f34952h = this.f34950f[i10];
                        } else {
                            int[] iArr3 = this.f34950f;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.b(this.f34946b);
                        }
                        if (this.f34954j) {
                            this.f34953i = i10;
                        }
                        iVar.f35029o--;
                        this.f34945a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f34950f[i10];
            }
            int length = this.f34953i;
            int i16 = length + 1;
            if (this.f34954j) {
                int[] iArr4 = this.f34949e;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i16;
            }
            int[] iArr5 = this.f34949e;
            if (length >= iArr5.length && this.f34945a < iArr5.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr6 = this.f34949e;
                    if (i17 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr7 = this.f34949e;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i18 = this.f34948d * 2;
                this.f34948d = i18;
                this.f34954j = false;
                this.f34953i = length - 1;
                this.f34951g = Arrays.copyOf(this.f34951g, i18);
                this.f34949e = Arrays.copyOf(this.f34949e, this.f34948d);
                this.f34950f = Arrays.copyOf(this.f34950f, this.f34948d);
            }
            this.f34949e[length] = iVar.f35019e;
            this.f34951g[length] = f10;
            int[] iArr8 = this.f34950f;
            if (i12 != -1) {
                iArr8[length] = iArr8[i12];
                iArr8[i12] = length;
            } else {
                iArr8[length] = this.f34952h;
                this.f34952h = length;
            }
            iVar.f35029o++;
            iVar.a(this.f34946b);
            this.f34945a++;
            if (!this.f34954j) {
                this.f34953i++;
            }
            int i19 = this.f34953i;
            int[] iArr9 = this.f34949e;
            if (i19 >= iArr9.length) {
                this.f34954j = true;
                this.f34953i = iArr9.length - 1;
            }
        }
    }

    @Override // r.b.a
    public void k(float f10) {
        int i10 = this.f34952h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            float[] fArr = this.f34951g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f34950f[i10];
        }
    }

    public String toString() {
        int i10 = this.f34952h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f34945a; i11++) {
            StringBuilder sbA = defpackage.a.a(i.f.a(string, " -> "));
            sbA.append(this.f34951g[i10]);
            sbA.append(" : ");
            StringBuilder sbA2 = defpackage.a.a(sbA.toString());
            sbA2.append(this.f34947c.f34962c[this.f34949e[i10]]);
            string = sbA2.toString();
            i10 = this.f34950f[i10];
        }
        return string;
    }
}
