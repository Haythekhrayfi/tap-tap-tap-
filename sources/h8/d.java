package h8;

import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import fd.j0;
import y9.o7;
import y9.q7;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.d f30967b;

    public d(View view, v9.d dVar) {
        j0.i(view, "view");
        j0.i(dVar, "resolver");
        this.f30966a = view;
        this.f30967b = dVar;
    }

    @Override // h8.c
    public void a(Canvas canvas, Layout layout, int i10, int i11, int i12, int i13, q7 q7Var, o7 o7Var) {
        int paragraphDirection = layout.getParagraphDirection(i10);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i10) : layout.getLineRight(i10);
        int iB = b(layout, i10);
        int iC = c(layout, i10);
        DisplayMetrics displayMetrics = this.f30966a.getResources().getDisplayMetrics();
        j0.h(displayMetrics, "view.resources.displayMetrics");
        a aVar = new a(displayMetrics, q7Var, o7Var, canvas, this.f30967b);
        float f10 = i12;
        float f11 = iC;
        float f12 = (int) lineLeft;
        float f13 = iB;
        float[] fArr = new float[8];
        float[] fArr2 = aVar.f30958g;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        aVar.a(fArr, f10, f11, f12, f13);
        for (int i14 = i10 + 1; i14 < i11; i14++) {
            aVar.a(new float[8], (int) layout.getLineLeft(i14), c(layout, i14), (int) layout.getLineRight(i14), b(layout, i14));
        }
        float lineRight = paragraphDirection == -1 ? layout.getLineRight(i10) : layout.getLineLeft(i10);
        int iB2 = b(layout, i11);
        float f14 = (int) lineRight;
        float fC = c(layout, i11);
        float f15 = i13;
        float f16 = iB2;
        float[] fArr3 = new float[8];
        float[] fArr4 = aVar.f30958g;
        if (fArr4 != null) {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = fArr4[2];
            fArr3[3] = fArr4[3];
            fArr3[4] = fArr4[4];
            fArr3[5] = fArr4[5];
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
        }
        aVar.a(fArr3, f14, fC, f15, f16);
    }
}
