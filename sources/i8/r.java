package i8;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31424a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31426b;

        static {
            int[] iArr = new int[y9.o.e.values().length];
            iArr[y9.o.e.NONE.ordinal()] = 1;
            iArr[y9.o.e.BUTTON.ordinal()] = 2;
            iArr[y9.o.e.IMAGE.ordinal()] = 3;
            iArr[y9.o.e.TEXT.ordinal()] = 4;
            iArr[y9.o.e.EDIT_TEXT.ordinal()] = 5;
            iArr[y9.o.e.HEADER.ordinal()] = 6;
            iArr[y9.o.e.TAB_BAR.ordinal()] = 7;
            f31425a = iArr;
            int[] iArr2 = new int[y9.o.d.values().length];
            iArr2[y9.o.d.EXCLUDE.ordinal()] = 1;
            iArr2[y9.o.d.MERGE.ordinal()] = 2;
            iArr2[y9.o.d.DEFAULT.ordinal()] = 3;
            f31426b = iArr2;
        }
    }

    public static final class b extends vc.l implements uc.p<View, q0.c, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y9.o.e f31428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y9.o.e eVar) {
            super(2);
            this.f31428d = eVar;
        }

        @Override // uc.p
        public jc.w invoke(View view, q0.c cVar) {
            String str;
            q0.c cVar2 = cVar;
            if (cVar2 != null) {
                r rVar = r.this;
                y9.o.e eVar = this.f31428d;
                Objects.requireNonNull(rVar);
                switch (a.f31425a[eVar.ordinal()]) {
                    case 2:
                        str = "android.widget.Button";
                        break;
                    case 3:
                        str = "android.widget.ImageView";
                        break;
                    case 4:
                    case 6:
                        str = "android.widget.TextView";
                        break;
                    case 5:
                        str = "android.widget.EditText";
                        break;
                    case 7:
                        str = "android.widget.TabWidget";
                        break;
                    default:
                        str = "";
                        break;
                }
                cVar2.f34746a.setClassName(str);
                if (y9.o.e.HEADER == eVar) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        cVar2.f34746a.setHeading(true);
                    } else {
                        cVar2.l(2, true);
                    }
                }
            }
            return jc.w.f31842a;
        }
    }

    public r(boolean z10) {
        this.f31424a = z10;
    }

    public final void a(View view, y9.o.d dVar, k kVar, boolean z10) {
        int i10 = a.f31426b[dVar.ordinal()];
        if (i10 == 1) {
            view.setImportantForAccessibility(4);
            view.setFocusable(false);
        } else if (i10 == 2) {
            view.setImportantForAccessibility(1);
            if (z10) {
                view.setClickable(false);
                view.setLongClickable(false);
                view.setFocusable(false);
            } else {
                view.setFocusable(true);
            }
        } else if (i10 == 3) {
            view.setImportantForAccessibility(0);
            view.setFocusable(true);
        }
        kVar.f31363x.put(view, dVar);
    }

    public void b(View view, k kVar, y9.o.d dVar) {
        fd.j0.i(view, "view");
        fd.j0.i(kVar, "divView");
        fd.j0.i(dVar, "mode");
        if (this.f31424a) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            y9.o.d dVar2 = view2 != null ? kVar.f31363x.get(view2) : null;
            boolean z10 = false;
            if (dVar2 != null) {
                if (d(dVar2) < d(dVar)) {
                    dVar = dVar2;
                }
                if (dVar2 == dVar) {
                    z10 = true;
                }
            }
            a(view, dVar, kVar, z10);
        }
    }

    public void c(View view, y9.o.e eVar) {
        fd.j0.i(eVar, "type");
        if (this.f31424a) {
            p0.e0.q(view, (eVar == y9.o.e.LIST && (view instanceof k8.a)) ? new c((k8.a) view) : new i8.a(p0.e0.e(view), new b(eVar)));
        }
    }

    public final int d(y9.o.d dVar) {
        int i10 = a.f31426b[dVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new jc.g();
    }
}
