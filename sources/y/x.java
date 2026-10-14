package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public static final float[][] G = {new float[]{0.5f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD}, new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] H = {new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -1.0f}, new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f}, new float[]{-1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD}, new float[]{1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD}, new float[]{-1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD}, new float[]{1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD}};
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f37913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f37922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f37923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f37926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f37927u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f37928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f37930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37931y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f37932z;

    public x(Context context, r rVar, XmlPullParser xmlPullParser) {
        this.f37907a = 0;
        this.f37908b = 0;
        this.f37909c = 0;
        this.f37910d = -1;
        this.f37911e = -1;
        this.f37912f = -1;
        this.f37913g = 0.5f;
        this.f37914h = 0.5f;
        this.f37915i = 0.5f;
        this.f37916j = 0.5f;
        this.f37917k = -1;
        this.f37918l = false;
        this.f37919m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37920n = 1.0f;
        this.f37921o = false;
        this.f37922p = new float[2];
        this.f37923q = new int[2];
        this.f37927u = 4.0f;
        this.f37928v = 1.2f;
        this.f37929w = true;
        this.f37930x = 1.0f;
        this.f37931y = 0;
        this.f37932z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f37926t = rVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44951r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.f37910d = typedArrayObtainStyledAttributes.getResourceId(index, this.f37910d);
            } else if (index == 17) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f37907a);
                this.f37907a = i11;
                float[][] fArr = G;
                this.f37914h = fArr[i11][0];
                this.f37913g = fArr[i11][1];
            } else if (index == 1) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f37908b);
                this.f37908b = i12;
                float[][] fArr2 = H;
                if (i12 < fArr2.length) {
                    this.f37919m = fArr2[i12][0];
                    this.f37920n = fArr2[i12][1];
                } else {
                    this.f37920n = Float.NaN;
                    this.f37919m = Float.NaN;
                    this.f37918l = true;
                }
            } else if (index == 6) {
                this.f37927u = typedArrayObtainStyledAttributes.getFloat(index, this.f37927u);
            } else if (index == 5) {
                this.f37928v = typedArrayObtainStyledAttributes.getFloat(index, this.f37928v);
            } else if (index == 7) {
                this.f37929w = typedArrayObtainStyledAttributes.getBoolean(index, this.f37929w);
            } else if (index == 2) {
                this.f37930x = typedArrayObtainStyledAttributes.getFloat(index, this.f37930x);
            } else if (index == 3) {
                this.f37932z = typedArrayObtainStyledAttributes.getFloat(index, this.f37932z);
            } else if (index == 18) {
                this.f37911e = typedArrayObtainStyledAttributes.getResourceId(index, this.f37911e);
            } else if (index == 9) {
                this.f37909c = typedArrayObtainStyledAttributes.getInt(index, this.f37909c);
            } else if (index == 8) {
                this.f37931y = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f37912f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f37917k = typedArrayObtainStyledAttributes.getResourceId(index, this.f37917k);
            } else if (index == 12) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 13) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 14) {
                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
            } else if (index == 15) {
                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
            } else if (index == 11) {
                this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
            } else if (index == 0) {
                this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f37912f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f37911e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public void c(boolean z10) {
        if (z10) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = G;
        int i10 = this.f37907a;
        this.f37914h = fArr5[i10][0];
        this.f37913g = fArr5[i10][1];
        int i11 = this.f37908b;
        float[][] fArr6 = H;
        if (i11 >= fArr6.length) {
            return;
        }
        this.f37919m = fArr6[i11][0];
        this.f37920n = fArr6[i11][1];
    }

    public String toString() {
        if (Float.isNaN(this.f37919m)) {
            return "rotation";
        }
        return this.f37919m + " , " + this.f37920n;
    }

    public x(r rVar, u uVar) {
        this.f37907a = 0;
        this.f37908b = 0;
        this.f37909c = 0;
        this.f37910d = -1;
        this.f37911e = -1;
        this.f37912f = -1;
        this.f37913g = 0.5f;
        this.f37914h = 0.5f;
        this.f37915i = 0.5f;
        this.f37916j = 0.5f;
        this.f37917k = -1;
        this.f37918l = false;
        this.f37919m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37920n = 1.0f;
        this.f37921o = false;
        this.f37922p = new float[2];
        this.f37923q = new int[2];
        this.f37927u = 4.0f;
        this.f37928v = 1.2f;
        this.f37929w = true;
        this.f37930x = 1.0f;
        this.f37931y = 0;
        this.f37932z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f37926t = rVar;
        this.f37910d = uVar.f37894a;
        this.f37907a = 0;
        float[][] fArr = G;
        this.f37914h = fArr[0][0];
        this.f37913g = fArr[0][1];
        this.f37908b = 0;
        float[][] fArr2 = H;
        if (fArr2.length > 0) {
            this.f37919m = fArr2[0][0];
            this.f37920n = fArr2[0][1];
        } else {
            this.f37920n = Float.NaN;
            this.f37919m = Float.NaN;
            this.f37918l = true;
        }
        this.f37927u = uVar.f37898e;
        this.f37928v = uVar.f37899f;
        this.f37929w = uVar.f37900g;
        this.f37930x = uVar.f37901h;
        this.f37932z = uVar.f37902i;
        this.f37911e = uVar.f37895b;
        this.f37909c = 0;
        this.f37931y = 0;
        this.f37912f = uVar.f37896c;
        this.f37917k = uVar.f37897d;
        this.E = 0;
        this.A = uVar.f37903j;
        this.B = uVar.f37904k;
        this.C = uVar.f37905l;
        this.D = uVar.f37906m;
        this.F = 0;
    }
}
