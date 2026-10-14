package y;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l implements Comparable<l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37711e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f37709c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37710d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f37712f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f37713g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37714h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37715i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37716j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37717k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37718l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37719m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37720n = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37721o = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37722p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37723q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37724r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f37725s = new LinkedHashMap<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, x.d> map, int i10) {
        String str;
        for (String str2 : map.keySet()) {
            x.d dVar = map.get(str2);
            Objects.requireNonNull(str2);
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals("rotationX")) {
                        b10 = 0;
                    }
                    break;
                case -1249320805:
                    if (str2.equals("rotationY")) {
                        b10 = 1;
                    }
                    break;
                case -1225497657:
                    if (str2.equals("translationX")) {
                        b10 = 2;
                    }
                    break;
                case -1225497656:
                    if (str2.equals("translationY")) {
                        b10 = 3;
                    }
                    break;
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        b10 = 4;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        b10 = 5;
                    }
                    break;
                case -908189618:
                    if (str2.equals("scaleX")) {
                        b10 = 6;
                    }
                    break;
                case -908189617:
                    if (str2.equals("scaleY")) {
                        b10 = 7;
                    }
                    break;
                case -760884510:
                    if (str2.equals("transformPivotX")) {
                        b10 = 8;
                    }
                    break;
                case -760884509:
                    if (str2.equals("transformPivotY")) {
                        b10 = 9;
                    }
                    break;
                case -40300674:
                    if (str2.equals("rotation")) {
                        b10 = 10;
                    }
                    break;
                case -4379043:
                    if (str2.equals("elevation")) {
                        b10 = 11;
                    }
                    break;
                case 37232917:
                    if (str2.equals("transitionPathRotate")) {
                        b10 = 12;
                    }
                    break;
                case 92909918:
                    if (str2.equals("alpha")) {
                        b10 = 13;
                    }
                    break;
            }
            float f10 = 1.0f;
            float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            switch (b10) {
                case 0:
                    if (!Float.isNaN(this.f37714h)) {
                        f11 = this.f37714h;
                    }
                    dVar.b(i10, f11);
                    break;
                case 1:
                    if (!Float.isNaN(this.f37715i)) {
                        f11 = this.f37715i;
                    }
                    dVar.b(i10, f11);
                    break;
                case 2:
                    if (!Float.isNaN(this.f37720n)) {
                        f11 = this.f37720n;
                    }
                    dVar.b(i10, f11);
                    break;
                case 3:
                    if (!Float.isNaN(this.f37721o)) {
                        f11 = this.f37721o;
                    }
                    dVar.b(i10, f11);
                    break;
                case 4:
                    if (!Float.isNaN(this.f37722p)) {
                        f11 = this.f37722p;
                    }
                    dVar.b(i10, f11);
                    break;
                case 5:
                    if (!Float.isNaN(this.f37724r)) {
                        f11 = this.f37724r;
                    }
                    dVar.b(i10, f11);
                    break;
                case 6:
                    if (!Float.isNaN(this.f37716j)) {
                        f10 = this.f37716j;
                    }
                    dVar.b(i10, f10);
                    break;
                case 7:
                    if (!Float.isNaN(this.f37717k)) {
                        f10 = this.f37717k;
                    }
                    dVar.b(i10, f10);
                    break;
                case 8:
                    if (!Float.isNaN(this.f37718l)) {
                        f11 = this.f37718l;
                    }
                    dVar.b(i10, f11);
                    break;
                case 9:
                    if (!Float.isNaN(this.f37719m)) {
                        f11 = this.f37719m;
                    }
                    dVar.b(i10, f11);
                    break;
                case 10:
                    if (!Float.isNaN(this.f37713g)) {
                        f11 = this.f37713g;
                    }
                    dVar.b(i10, f11);
                    break;
                case 11:
                    if (!Float.isNaN(this.f37712f)) {
                        f11 = this.f37712f;
                    }
                    dVar.b(i10, f11);
                    break;
                case 12:
                    if (!Float.isNaN(this.f37723q)) {
                        f11 = this.f37723q;
                    }
                    dVar.b(i10, f11);
                    break;
                case 13:
                    if (!Float.isNaN(this.f37709c)) {
                        f10 = this.f37709c;
                    }
                    dVar.b(i10, f10);
                    break;
                default:
                    if (str2.startsWith("CUSTOM")) {
                        String str3 = str2.split(",")[1];
                        if (this.f37725s.containsKey(str3)) {
                            androidx.constraintlayout.widget.a aVar = this.f37725s.get(str3);
                            if (dVar instanceof x.d.b) {
                                ((x.d.b) dVar).f37321f.append(i10, aVar);
                            } else {
                                str = str2 + " ViewSpline not a CustomSet frame = " + i10 + ", value" + aVar.a() + dVar;
                            }
                        }
                    } else {
                        str = "UNKNOWN spline " + str2;
                    }
                    Log.e("MotionPaths", str);
                    break;
            }
        }
    }

    public void b(View view) {
        this.f37711e = view.getVisibility();
        this.f37709c = view.getVisibility() != 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : view.getAlpha();
        this.f37712f = view.getElevation();
        this.f37713g = view.getRotation();
        this.f37714h = view.getRotationX();
        this.f37715i = view.getRotationY();
        this.f37716j = view.getScaleX();
        this.f37717k = view.getScaleY();
        this.f37718l = view.getPivotX();
        this.f37719m = view.getPivotY();
        this.f37720n = view.getTranslationX();
        this.f37721o = view.getTranslationY();
        this.f37722p = view.getTranslationZ();
    }

    public final boolean c(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        Objects.requireNonNull(lVar);
        return Float.compare(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    public void d(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        float f10;
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.c.a aVarH = cVar.h(i11);
        androidx.constraintlayout.widget.c.d dVar = aVarH.f1512c;
        int i12 = dVar.f1590c;
        this.f37710d = i12;
        int i13 = dVar.f1589b;
        this.f37711e = i13;
        this.f37709c = (i13 == 0 || i12 != 0) ? dVar.f1591d : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        androidx.constraintlayout.widget.c.e eVar = aVarH.f1515f;
        boolean z10 = eVar.f1606m;
        this.f37712f = eVar.f1607n;
        this.f37713g = eVar.f1595b;
        this.f37714h = eVar.f1596c;
        this.f37715i = eVar.f1597d;
        this.f37716j = eVar.f1598e;
        this.f37717k = eVar.f1599f;
        this.f37718l = eVar.f1600g;
        this.f37719m = eVar.f1601h;
        this.f37720n = eVar.f1603j;
        this.f37721o = eVar.f1604k;
        this.f37722p = eVar.f1605l;
        t.c.c(aVarH.f1513d.f1577d);
        this.f37723q = aVarH.f1513d.f1582i;
        this.f37724r = aVarH.f1512c.f1592e;
        for (String str : aVarH.f1516g.keySet()) {
            androidx.constraintlayout.widget.a aVar = aVarH.f1516g.get(str);
            if (aVar.c()) {
                this.f37725s.put(str, aVar);
            }
        }
        float f11 = 90.0f;
        if (i10 == 1) {
            f10 = this.f37713g;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    f10 = this.f37713g;
                } else if (i10 != 4) {
                    return;
                }
            }
            f10 = this.f37713g + 90.0f;
            this.f37713g = f10;
            if (f10 <= 180.0f) {
                return;
            } else {
                f11 = 360.0f;
            }
        }
        this.f37713g = f10 - f11;
    }

    public void e(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        b(view);
    }
}
