package u8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RtlHardcoded"})
public class h extends m9.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f36074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36076g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36081e;

        public a(int i10, int i11, int i12, int i13, int i14) {
            this.f36077a = i10;
            this.f36078b = i11;
            this.f36079c = i12;
            this.f36080d = i13;
            this.f36081e = i14;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f36087f;

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this.f36082a = i10;
            this.f36083b = i11;
            this.f36084c = i12;
            this.f36085d = i13;
            this.f36086e = i14;
            this.f36087f = f10;
        }

        public final int a() {
            return this.f36083b + this.f36084c + this.f36085d;
        }

        public final int b() {
            return a() / this.f36086e;
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x<List<a>> f36089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x<List<e>> f36090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x<List<e>> f36091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f f36092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f f36093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ h f36094g;

        public static final class a extends vc.l implements uc.a<List<? extends a>> {
            public a() {
                super(0);
            }

            @Override // uc.a
            public List<? extends a> invoke() {
                int i10;
                Integer numValueOf;
                d dVar = d.this;
                if (dVar.f36094g.getChildCount() == 0) {
                    return kc.w.f32009c;
                }
                int i11 = dVar.f36088a;
                ArrayList arrayList = new ArrayList(dVar.f36094g.getChildCount());
                int[] iArr = new int[i11];
                int[] iArr2 = new int[i11];
                h hVar = dVar.f36094g;
                int childCount = hVar.getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < childCount) {
                    i14++;
                    View childAt = hVar.getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        Integer numY = kc.j.y(iArr2);
                        int iIntValue = numY == null ? i12 : numY.intValue();
                        int iU = kc.j.u(iArr2, iIntValue);
                        int i15 = i13 + iIntValue;
                        bd.c cVarH = bd.e.h(i12, i11);
                        int i16 = cVarH.f3515c;
                        int i17 = cVarH.f3516d;
                        if (i16 <= i17) {
                            while (true) {
                                int i18 = i16 + 1;
                                iArr2[i16] = Math.max(i12, iArr2[i16] - iIntValue);
                                if (i16 == i17) {
                                    break;
                                }
                                i16 = i18;
                            }
                        }
                        m9.e.a aVar = m9.e.f33332c;
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar2 = (m9.d) layoutParams;
                        int iMin = Math.min(dVar2.f33328e, i11 - iU);
                        int i19 = dVar2.f33329f;
                        arrayList.add(new a(i14, iU, i15, iMin, i19));
                        int i20 = iU + iMin;
                        while (true) {
                            int i21 = iU;
                            if (i21 >= i20) {
                                break;
                            }
                            iU = i21 + 1;
                            if (iArr2[i21] > 0) {
                                Object obj = arrayList.get(iArr[i21]);
                                j0.h(obj, "cells[cellIndices[i]]");
                                a aVar2 = (a) obj;
                                int i22 = aVar2.f36078b;
                                int i23 = aVar2.f36080d + i22;
                                while (i22 < i23) {
                                    int i24 = iArr2[i22];
                                    iArr2[i22] = 0;
                                    i22++;
                                }
                                aVar2.f36081e = i15 - aVar2.f36079c;
                            }
                            iArr[i21] = i14;
                            iArr2[i21] = i19;
                        }
                        i13 = i15;
                        i12 = 0;
                    }
                }
                if (i11 == 0) {
                    numValueOf = null;
                    i10 = 0;
                } else {
                    i10 = 0;
                    int i25 = iArr2[0];
                    int iS = kc.j.s(iArr2);
                    if (iS != 0) {
                        int iMax = Math.max(1, i25);
                        if (1 <= iS) {
                            int i26 = 1;
                            while (true) {
                                int i27 = i26 + 1;
                                int i28 = iArr2[i26];
                                int iMax2 = Math.max(1, i28);
                                if (iMax > iMax2) {
                                    i25 = i28;
                                    iMax = iMax2;
                                }
                                if (i26 == iS) {
                                    break;
                                }
                                i26 = i27;
                            }
                        }
                    }
                    numValueOf = Integer.valueOf(i25);
                }
                int iIntValue2 = ((a) kc.t.x(arrayList)).f36079c + (numValueOf != null ? numValueOf.intValue() : 1);
                int size = arrayList.size();
                while (true) {
                    int i29 = i10;
                    if (i29 >= size) {
                        return arrayList;
                    }
                    i10 = i29 + 1;
                    a aVar3 = (a) arrayList.get(i29);
                    int i30 = aVar3.f36079c;
                    if (aVar3.f36081e + i30 > iIntValue2) {
                        aVar3.f36081e = iIntValue2 - i30;
                    }
                }
            }
        }

        public static final class b extends vc.l implements uc.a<List<? extends e>> {
            public b() {
                super(0);
            }

            @Override // uc.a
            public List<? extends e> invoke() {
                int i10;
                float f10;
                float f11;
                int i11;
                char c10;
                d dVar = d.this;
                int i12 = dVar.f36088a;
                f fVar = dVar.f36092e;
                List<a> listA = dVar.f36089b.a();
                ArrayList arrayList = new ArrayList(i12);
                int i13 = 0;
                while (i13 < i12) {
                    i13++;
                    arrayList.add(new e());
                }
                h hVar = dVar.f36094g;
                int size = listA.size();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    a aVar = listA.get(i14);
                    View childAt = hVar.getChildAt(aVar.f36077a);
                    j0.h(childAt, "child");
                    m9.e.a aVar2 = m9.e.f33332c;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    m9.d dVar2 = (m9.d) layoutParams;
                    b bVar = new b(aVar.f36078b, childAt.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) dVar2).leftMargin, ((ViewGroup.MarginLayoutParams) dVar2).rightMargin, aVar.f36080d, dVar2.f33327d);
                    int i16 = bVar.f36086e;
                    if (i16 == 1) {
                        ((e) arrayList.get(bVar.f36082a)).a(bVar.a(), bVar.f36087f);
                    } else {
                        int i17 = i16 - 1;
                        float f12 = bVar.f36087f / i16;
                        if (i17 >= 0) {
                            int i18 = 0;
                            while (true) {
                                int i19 = i18 + 1;
                                e.b((e) arrayList.get(bVar.f36082a + i18), 0, f12, 1);
                                if (i18 == i17) {
                                    break;
                                }
                                i18 = i19;
                            }
                        }
                    }
                    i14 = i15;
                }
                ArrayList arrayList2 = new ArrayList();
                h hVar2 = dVar.f36094g;
                int size2 = listA.size();
                int i20 = 0;
                while (i20 < size2) {
                    int i21 = i20 + 1;
                    a aVar3 = listA.get(i20);
                    View childAt2 = hVar2.getChildAt(aVar3.f36077a);
                    j0.h(childAt2, "child");
                    m9.e.a aVar4 = m9.e.f33332c;
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    m9.d dVar3 = (m9.d) layoutParams2;
                    b bVar2 = new b(aVar3.f36078b, childAt2.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, aVar3.f36080d, dVar3.f33327d);
                    if (bVar2.f36086e > 1) {
                        arrayList2.add(bVar2);
                    }
                    i20 = i21;
                }
                kc.p.k(arrayList2, g.f36103c);
                int size3 = arrayList2.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    b bVar3 = (b) arrayList2.get(i22);
                    int i24 = bVar3.f36082a;
                    int i25 = (bVar3.f36086e + i24) - 1;
                    int iA = bVar3.a();
                    if (i24 <= i25) {
                        int i26 = i24;
                        i10 = iA;
                        f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        i11 = 0;
                        while (true) {
                            int i27 = i26 + 1;
                            e eVar = (e) arrayList.get(i26);
                            iA -= eVar.f36099b;
                            if (eVar.c()) {
                                f11 += eVar.f36100c;
                            } else {
                                int i28 = eVar.f36099b;
                                if (i28 == 0) {
                                    i11++;
                                }
                                i10 -= i28;
                            }
                            if (i26 == i25) {
                                break;
                            }
                            i26 = i27;
                        }
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    } else {
                        i10 = iA;
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        i11 = 0;
                    }
                    if (f11 > f10) {
                        if (i24 <= i25) {
                            while (true) {
                                int i29 = i24 + 1;
                                e eVar2 = (e) arrayList.get(i24);
                                if (eVar2.c()) {
                                    e.b(eVar2, (int) Math.ceil((eVar2.f36100c / f11) * i10), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                                }
                                if (i24 == i25) {
                                    break;
                                }
                                i24 = i29;
                            }
                        }
                    } else if (iA > 0 && i24 <= i25) {
                        while (true) {
                            int i30 = i24 + 1;
                            e eVar3 = (e) arrayList.get(i24);
                            if (i11 <= 0) {
                                e.b(eVar3, (iA / bVar3.f36086e) + eVar3.f36099b, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                            } else if (eVar3.f36099b != 0 || eVar3.c()) {
                                c10 = 2;
                            } else {
                                c10 = 2;
                                e.b(eVar3, (iA / i11) + eVar3.f36099b, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                            }
                            if (i24 == i25) {
                                break;
                            }
                            i24 = i30;
                        }
                    }
                    i22 = i23;
                }
                dVar.a(arrayList, fVar);
                dVar.b(arrayList);
                return arrayList;
            }
        }

        public static final class c extends vc.l implements uc.a<List<? extends e>> {
            public c() {
                super(0);
            }

            @Override // uc.a
            public List<? extends e> invoke() {
                int i10;
                float f10;
                float f11;
                int i11;
                char c10;
                d dVar = d.this;
                int iF = dVar.f();
                f fVar = dVar.f36093f;
                List<a> listA = dVar.f36089b.a();
                ArrayList arrayList = new ArrayList(iF);
                int i12 = 0;
                while (i12 < iF) {
                    i12++;
                    arrayList.add(new e());
                }
                h hVar = dVar.f36094g;
                int size = listA.size();
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    a aVar = listA.get(i13);
                    View childAt = hVar.getChildAt(aVar.f36077a);
                    j0.h(childAt, "child");
                    m9.e.a aVar2 = m9.e.f33332c;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    m9.d dVar2 = (m9.d) layoutParams;
                    b bVar = new b(aVar.f36079c, childAt.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) dVar2).topMargin, ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin, aVar.f36081e, dVar2.f33326c);
                    int i15 = bVar.f36086e;
                    if (i15 == 1) {
                        ((e) arrayList.get(bVar.f36082a)).a(bVar.a(), bVar.f36087f);
                    } else {
                        int i16 = i15 - 1;
                        float f12 = bVar.f36087f / i15;
                        if (i16 >= 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                e.b((e) arrayList.get(bVar.f36082a + i17), 0, f12, 1);
                                if (i17 == i16) {
                                    break;
                                }
                                i17 = i18;
                            }
                        }
                    }
                    i13 = i14;
                }
                ArrayList arrayList2 = new ArrayList();
                h hVar2 = dVar.f36094g;
                int size2 = listA.size();
                int i19 = 0;
                while (i19 < size2) {
                    int i20 = i19 + 1;
                    a aVar3 = listA.get(i19);
                    View childAt2 = hVar2.getChildAt(aVar3.f36077a);
                    j0.h(childAt2, "child");
                    m9.e.a aVar4 = m9.e.f33332c;
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    m9.d dVar3 = (m9.d) layoutParams2;
                    b bVar2 = new b(aVar3.f36079c, childAt2.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) dVar3).topMargin, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, aVar3.f36081e, dVar3.f33326c);
                    if (bVar2.f36086e > 1) {
                        arrayList2.add(bVar2);
                    }
                    i19 = i20;
                }
                kc.p.k(arrayList2, g.f36103c);
                int size3 = arrayList2.size();
                int i21 = 0;
                while (i21 < size3) {
                    int i22 = i21 + 1;
                    b bVar3 = (b) arrayList2.get(i21);
                    int i23 = bVar3.f36082a;
                    int i24 = (bVar3.f36086e + i23) - 1;
                    int iA = bVar3.a();
                    if (i23 <= i24) {
                        int i25 = i23;
                        i10 = iA;
                        f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        i11 = 0;
                        while (true) {
                            int i26 = i25 + 1;
                            e eVar = (e) arrayList.get(i25);
                            iA -= eVar.f36099b;
                            if (eVar.c()) {
                                f11 += eVar.f36100c;
                            } else {
                                int i27 = eVar.f36099b;
                                if (i27 == 0) {
                                    i11++;
                                }
                                i10 -= i27;
                            }
                            if (i25 == i24) {
                                break;
                            }
                            i25 = i26;
                        }
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    } else {
                        i10 = iA;
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        i11 = 0;
                    }
                    if (f11 > f10) {
                        if (i23 <= i24) {
                            while (true) {
                                int i28 = i23 + 1;
                                e eVar2 = (e) arrayList.get(i23);
                                if (eVar2.c()) {
                                    e.b(eVar2, (int) Math.ceil((eVar2.f36100c / f11) * i10), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                                }
                                if (i23 == i24) {
                                    break;
                                }
                                i23 = i28;
                            }
                        }
                    } else if (iA > 0 && i23 <= i24) {
                        while (true) {
                            int i29 = i23 + 1;
                            e eVar3 = (e) arrayList.get(i23);
                            if (i11 <= 0) {
                                e.b(eVar3, (iA / bVar3.f36086e) + eVar3.f36099b, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                            } else if (eVar3.f36099b != 0 || eVar3.c()) {
                                c10 = 2;
                            } else {
                                c10 = 2;
                                e.b(eVar3, (iA / i11) + eVar3.f36099b, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                            }
                            if (i23 == i24) {
                                break;
                            }
                            i23 = i29;
                        }
                    }
                    i21 = i22;
                }
                dVar.a(arrayList, fVar);
                dVar.b(arrayList);
                return arrayList;
            }
        }

        public d(h hVar) {
            j0.i(hVar, "this$0");
            this.f36094g = hVar;
            this.f36088a = 1;
            this.f36089b = new x<>(new a());
            this.f36090c = new x<>(new b());
            this.f36091d = new x<>(new c());
            int i10 = 0;
            int i11 = 3;
            vc.g gVar = null;
            this.f36092e = new f(i10, i10, i11, gVar);
            this.f36093f = new f(i10, i10, i11, gVar);
        }

        public final void a(List<e> list, f fVar) {
            int size = list.size();
            int i10 = 0;
            float f10 = 0.0f;
            float fMax = 0.0f;
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                int i13 = i11 + 1;
                e eVar = list.get(i11);
                if (eVar.c()) {
                    float f11 = eVar.f36100c;
                    f10 += f11;
                    fMax = Math.max(fMax, eVar.f36099b / f11);
                } else {
                    i12 += eVar.f36099b;
                }
                i11 = i13;
            }
            int size2 = list.size();
            int i14 = 0;
            int iCeil = 0;
            while (i14 < size2) {
                int i15 = i14 + 1;
                e eVar2 = list.get(i14);
                iCeil += eVar2.c() ? (int) Math.ceil(eVar2.f36100c * fMax) : eVar2.f36099b;
                i14 = i15;
            }
            float fMax2 = Math.max(0, Math.max(fVar.f36101a, iCeil) - i12) / f10;
            int size3 = list.size();
            while (i10 < size3) {
                int i16 = i10 + 1;
                e eVar3 = list.get(i10);
                if (eVar3.c()) {
                    e.b(eVar3, (int) Math.ceil(eVar3.f36100c * fMax2), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 2);
                }
                i10 = i16;
            }
        }

        public final void b(List<e> list) {
            int size = list.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                int i12 = i10 + 1;
                e eVar = list.get(i10);
                eVar.f36098a = i11;
                i11 += eVar.f36099b;
                i10 = i12;
            }
        }

        public final int c(List<e> list) {
            if (list.isEmpty()) {
                return 0;
            }
            e eVar = (e) kc.t.x(list);
            return eVar.f36098a + eVar.f36099b;
        }

        public final List<a> d() {
            return this.f36089b.a();
        }

        public final List<e> e() {
            return this.f36090c.a();
        }

        public final int f() {
            List<a> listD = d();
            if (listD.isEmpty()) {
                return 0;
            }
            a aVar = (a) kc.t.x(listD);
            return aVar.f36081e + aVar.f36079c;
        }

        public final List<e> g() {
            return this.f36091d.a();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36100c;

        public static /* synthetic */ void b(e eVar, int i10, float f10, int i11) {
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            eVar.a(i10, f10);
        }

        public final void a(int i10, float f10) {
            this.f36099b = Math.max(this.f36099b, i10);
            this.f36100c = Math.max(this.f36100c, f10);
        }

        public final boolean c() {
            return this.f36100c > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36102b;

        /* JADX WARN: Illegal instructions before constructor call */
        public f() {
            int i10 = 0;
            this(i10, i10, 3, null);
        }

        public f(int i10, int i11) {
            this.f36101a = i10;
            this.f36102b = i11;
        }

        public /* synthetic */ f(int i10, int i11, int i12, vc.g gVar) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? FileUtil.BUF_SIZE : i11);
        }

        public final void a(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                this.f36101a = 0;
            } else if (mode == 0) {
                this.f36101a = 0;
                size = FileUtil.BUF_SIZE;
            } else if (mode != 1073741824) {
                return;
            } else {
                this.f36101a = size;
            }
            this.f36102b = size;
        }
    }

    public static final class g implements Comparator<b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f36103c = new g();

        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            j0.i(bVar3, "lhs");
            j0.i(bVar4, "rhs");
            if (bVar3.b() < bVar4.b()) {
                return 1;
            }
            return bVar3.b() > bVar4.b() ? -1 : 0;
        }
    }

    static {
        new c(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f36073d = 51;
        this.f36074e = new d(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o7.b.f33999d, i10, 0);
            j0.h(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ntainer, defStyleAttr, 0)");
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(1, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 51));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f36076g = true;
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    public final int getColumnCount() {
        return this.f36074e.f36088a;
    }

    public final int getGravity() {
        return this.f36073d;
    }

    public final int getRowCount() {
        return this.f36074e.f();
    }

    public final void i() {
        int i10 = this.f36075f;
        if (i10 != 0) {
            if (i10 != j()) {
                k();
                i();
                return;
            }
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            int i12 = i11 + 1;
            View childAt = getChildAt(i11);
            j0.h(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            m9.d dVar = (m9.d) layoutParams;
            if (dVar.f33328e < 0 || dVar.f33329f < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (dVar.f33327d < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || dVar.f33326c < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
            i11 = i12;
        }
        this.f36075f = j();
    }

    public final int j() {
        int childCount = getChildCount();
        int iHashCode = 223;
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                iHashCode = (iHashCode * 31) + ((m9.d) layoutParams).hashCode();
            }
            i10 = i11;
        }
        return iHashCode;
    }

    public final void k() {
        this.f36075f = 0;
        d dVar = this.f36074e;
        dVar.f36089b.f36165b = null;
        dVar.f36090c.f36165b = null;
        dVar.f36091d.f36165b = null;
    }

    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int i15) {
        int iA;
        int iA2;
        if (i12 == -1) {
            iA = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            m9.e.a aVar = m9.e.f33332c;
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            iA = aVar.a(i10, 0, i12, minimumWidth, ((m9.d) layoutParams).f33331h);
        }
        if (i13 == -1) {
            iA2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            m9.e.a aVar2 = m9.e.f33332c;
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            iA2 = aVar2.a(i11, 0, i13, minimumHeight, ((m9.d) layoutParams2).f33330g);
        }
        view.measure(iA, iA2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iA;
        int iA2;
        h hVar = this;
        SystemClock.elapsedRealtime();
        i();
        List<e> listE = hVar.f36074e.e();
        List<e> listG = hVar.f36074e.g();
        List<a> listD = hVar.f36074e.d();
        int i14 = hVar.f36073d & 7;
        d dVar = hVar.f36074e;
        x<List<e>> xVar = dVar.f36090c;
        int i15 = 0;
        int i16 = 1;
        int iC = xVar.f36165b != null ? dVar.c(xVar.a()) : 0;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (i14 != 1) {
            iA = i14 != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth) - iC;
        } else {
            iA = androidx.appcompat.widget.a.a(measuredWidth, iC, 2, getPaddingLeft());
        }
        int i17 = hVar.f36073d & 112;
        d dVar2 = hVar.f36074e;
        x<List<e>> xVar2 = dVar2.f36091d;
        int iC2 = xVar2.f36165b != null ? dVar2.c(xVar2.a()) : 0;
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (i17 != 16) {
            iA2 = i17 != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight) - iC2;
        } else {
            iA2 = androidx.appcompat.widget.a.a(measuredHeight, iC2, 2, getPaddingTop());
        }
        int childCount = getChildCount();
        while (i15 < childCount) {
            int i18 = i15 + 1;
            View childAt = hVar.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar3 = (m9.d) layoutParams;
                a aVar = listD.get(i15);
                int iA3 = listE.get(aVar.f36078b).f36098a + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin;
                int iA4 = listG.get(aVar.f36079c).f36098a + ((ViewGroup.MarginLayoutParams) dVar3).topMargin;
                e eVar = listE.get((aVar.f36078b + aVar.f36080d) - i16);
                int i19 = ((eVar.f36098a + eVar.f36099b) - iA3) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin;
                e eVar2 = listG.get((aVar.f36079c + aVar.f36081e) - i16);
                int i20 = ((eVar2.f36098a + eVar2.f36099b) - iA4) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int i21 = dVar3.f33324a & 7;
                if (i21 == 1) {
                    iA3 = androidx.appcompat.widget.a.a(i19, measuredWidth2, 2, iA3);
                } else if (i21 == 5) {
                    iA3 = (iA3 + i19) - measuredWidth2;
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = dVar3.f33324a & 112;
                if (i22 == 16) {
                    iA4 = androidx.appcompat.widget.a.a(i20, measuredHeight2, 2, iA4);
                } else if (i22 == 80) {
                    iA4 = (iA4 + i20) - measuredHeight2;
                }
                int i23 = iA3 + iA;
                int i24 = iA4 + iA2;
                childAt.layout(i23, i24, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + i24);
            }
            i16 = 1;
            hVar = this;
            i15 = i18;
        }
        SystemClock.elapsedRealtime();
        e9.c cVar = e9.c.f29122a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:30:0x019a  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        SystemClock.elapsedRealtime();
        i();
        d dVar = this.f36074e;
        dVar.f36090c.f36165b = null;
        dVar.f36091d.f36165b = null;
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - paddingHorizontal), View.MeasureSpec.getMode(i10));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11 - paddingVertical), View.MeasureSpec.getMode(i11));
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            i13 = 8;
            if (i14 >= childCount) {
                break;
            }
            int i15 = i14 + 1;
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                m9.e.a aVar = m9.e.f33332c;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar2 = (m9.d) layoutParams;
                int i16 = ((ViewGroup.MarginLayoutParams) dVar2).width;
                if (i16 == -1) {
                    i16 = 0;
                }
                int i17 = i16;
                int i18 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                if (i18 == -1) {
                    i18 = 0;
                }
                int i19 = i18;
                int minimumWidth = childAt.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                int iA = aVar.a(iMakeMeasureSpec, 0, i17, minimumWidth, ((m9.d) layoutParams2).f33331h);
                int minimumHeight = childAt.getMinimumHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                childAt.measure(iA, aVar.a(iMakeMeasureSpec2, 0, i19, minimumHeight, ((m9.d) layoutParams3).f33330g));
            }
            i14 = i15;
            childCount = childCount;
        }
        d dVar3 = this.f36074e;
        dVar3.f36092e.a(iMakeMeasureSpec);
        int iMax = Math.max(dVar3.f36092e.f36101a, Math.min(dVar3.c(dVar3.e()), dVar3.f36092e.f36102b));
        List<a> listD = this.f36074e.d();
        List<e> listE = this.f36074e.e();
        int childCount2 = getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20 + 1;
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != i13) {
                ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar4 = (m9.d) layoutParams4;
                if (((ViewGroup.MarginLayoutParams) dVar4).width == i12) {
                    a aVar2 = listD.get(i20);
                    e eVar = listE.get(aVar2.f36078b + aVar2.f36080d + i12);
                    l(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2, ((ViewGroup.MarginLayoutParams) dVar4).width, ((ViewGroup.MarginLayoutParams) dVar4).height, ((eVar.f36098a + eVar.f36099b) - listE.get(aVar2.f36078b).f36098a) - dVar4.a(), 0);
                }
            }
            i13 = 8;
            i12 = i12;
            i20 = i21;
            childCount2 = childCount2;
            listD = listD;
            listE = listE;
        }
        int i22 = i12;
        d dVar5 = this.f36074e;
        dVar5.f36093f.a(iMakeMeasureSpec2);
        int iMax2 = Math.max(dVar5.f36093f.f36101a, Math.min(dVar5.c(dVar5.g()), dVar5.f36093f.f36102b));
        List<a> listD2 = this.f36074e.d();
        List<e> listE2 = this.f36074e.e();
        List<e> listG = this.f36074e.g();
        int childCount3 = getChildCount();
        int i23 = 0;
        while (i23 < childCount3) {
            int i24 = i23 + 1;
            View childAt3 = getChildAt(i23);
            if (childAt3.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar6 = (m9.d) layoutParams5;
                if (((ViewGroup.MarginLayoutParams) dVar6).height == i22) {
                    a aVar3 = listD2.get(i23);
                    e eVar2 = listE2.get(aVar3.f36078b + aVar3.f36080d + i22);
                    int iA2 = ((eVar2.f36098a + eVar2.f36099b) - listE2.get(aVar3.f36078b).f36098a) - dVar6.a();
                    e eVar3 = listG.get(aVar3.f36079c + aVar3.f36081e + i22);
                    l(childAt3, iMakeMeasureSpec, iMakeMeasureSpec2, ((ViewGroup.MarginLayoutParams) dVar6).width, ((ViewGroup.MarginLayoutParams) dVar6).height, iA2, ((eVar3.f36098a + eVar3.f36099b) - listG.get(aVar3.f36079c).f36098a) - dVar6.b());
                }
            }
            i23 = i24;
            childCount3 = childCount3;
            listD2 = listD2;
            listE2 = listE2;
            listG = listG;
        }
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(iMax + paddingHorizontal, getSuggestedMinimumWidth()), i10, 0), ViewGroup.resolveSizeAndState(Math.max(iMax2 + paddingVertical, getSuggestedMinimumHeight()), i11, 0));
        SystemClock.elapsedRealtime();
        e9.c cVar = e9.c.f29122a;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        j0.i(view, "child");
        super.onViewAdded(view);
        k();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        j0.i(view, "child");
        super.onViewRemoved(view);
        k();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f36076g) {
            d dVar = this.f36074e;
            dVar.f36090c.f36165b = null;
            dVar.f36091d.f36165b = null;
        }
    }

    public final void setColumnCount(int i10) {
        d dVar = this.f36074e;
        Objects.requireNonNull(dVar);
        if (i10 > 0 && dVar.f36088a != i10) {
            dVar.f36088a = i10;
            dVar.f36089b.f36165b = null;
            dVar.f36090c.f36165b = null;
            dVar.f36091d.f36165b = null;
        }
        k();
        requestLayout();
    }

    public final void setGravity(int i10) {
        this.f36073d = i10;
        requestLayout();
    }
}
