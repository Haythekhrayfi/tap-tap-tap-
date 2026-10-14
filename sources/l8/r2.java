package l8;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.e0 f32795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w7.d f32796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.e f32797d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32798a;

        static {
            int[] iArr = new int[y9.s3.i.values().length];
            iArr[y9.s3.i.SINGLE_LINE_TEXT.ordinal()] = 1;
            iArr[y9.s3.i.MULTI_LINE_TEXT.ordinal()] = 2;
            iArr[y9.s3.i.EMAIL.ordinal()] = 3;
            iArr[y9.s3.i.URI.ordinal()] = 4;
            iArr[y9.s3.i.NUMBER.ordinal()] = 5;
            iArr[y9.s3.i.PHONE.ordinal()] = 6;
            f32798a = iArr;
        }
    }

    public r2(v vVar, i8.e0 e0Var, w7.d dVar, q8.e eVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(e0Var, "typefaceResolver");
        fd.j0.i(dVar, "variableBinder");
        fd.j0.i(eVar, "errorCollectors");
        this.f32794a = vVar;
        this.f32795b = e0Var;
        this.f32796c = dVar;
        this.f32797d = eVar;
    }

    public final void a(o8.h hVar, Long l10, y9.n6 n6Var) {
        Integer numValueOf;
        if (l10 == null) {
            numValueOf = null;
        } else {
            DisplayMetrics displayMetrics = hVar.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            numValueOf = Integer.valueOf(b.c0(l10, displayMetrics, n6Var));
        }
        hVar.setFixedLineHeight(numValueOf);
        b.h(hVar, l10, n6Var);
    }
}
