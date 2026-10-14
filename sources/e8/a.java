package e8;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import java.util.Iterator;
import java.util.List;
import y9.v;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0250a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29065a;

        static {
            int[] iArr = new int[v.e.values().length];
            iArr[v.e.FADE.ordinal()] = 1;
            iArr[v.e.TRANSLATE.ordinal()] = 2;
            iArr[v.e.SCALE.ordinal()] = 3;
            iArr[v.e.SET.ordinal()] = 4;
            iArr[v.e.NATIVE.ordinal()] = 5;
            iArr[v.e.NO_ANIMATION.ordinal()] = 6;
            f29065a = iArr;
        }
    }

    public static final TransitionSet a(x7 x7Var, v9.d dVar) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new m(x7Var.f44180g.b(dVar), null, 2, null)).setInterpolator((TimeInterpolator) new q7.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [e8.m] */
    /* JADX WARN: Type inference failed for: r0v7, types: [e8.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    public static final Transition b(v vVar, x7.d dVar, boolean z10, v9.d dVar2) {
        ?? fade;
        Double dB;
        Double dB2;
        Transition duration;
        switch (C0250a.f29065a[vVar.f43392e.b(dVar2).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                v9.b<Double> bVar = z10 ? vVar.f43394g : vVar.f43389b;
                fade = new m(dVar, (bVar == null || (dB = bVar.b(dVar2)) == null) ? null : Float.valueOf((float) dB.doubleValue()));
                break;
            case 3:
                v9.b<Double> bVar2 = z10 ? vVar.f43394g : vVar.f43389b;
                float fDoubleValue = 1.0f;
                if (bVar2 != null && (dB2 = bVar2.b(dVar2)) != null) {
                    fDoubleValue = (float) dB2.doubleValue();
                }
                fade = new k(fDoubleValue);
                break;
            case 4:
                fade = new TransitionSet();
                List<v> list = vVar.f43391d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(b((v) it.next(), dVar, z10, dVar2));
                    }
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new jc.g();
        }
        if (fade == 0 || (duration = fade.setDuration(vVar.f43388a.b(dVar2).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(f8.b.b(vVar.f43390c.b(dVar2)));
    }
}
